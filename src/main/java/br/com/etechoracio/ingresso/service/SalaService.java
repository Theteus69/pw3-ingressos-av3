package br.com.etechoracio.ingresso.service;


import br.com.etechoracio.ingresso.dto.SalaResponseDTO;
import br.com.etechoracio.ingresso.entity.Sessao;
import br.com.etechoracio.ingresso.mapper.SalaMapper;
import br.com.etechoracio.ingresso.repository.SalaRepository;
import br.com.etechoracio.ingresso.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    @Autowired
    private SalaMapper salaMapper;

    public List<SalaResponseDTO> findAll() {
        var result = salaRepository.findByDataExclusãoIsNull();
        return salaMapper.toSalaDTOList(result);

    }

    public  Optional<SalaResponseDTO> findById(Long Id) {
        var result = salaRepository.findByIdAndDataExclusaoIsNull(Id);
        if(result.isPresent()){
            var sala = result.get();

            var dto = salaMapper.toSalaDTO(sala);

            return Optional.of(dto);
        }

        return Optional.empty();
    }
}
