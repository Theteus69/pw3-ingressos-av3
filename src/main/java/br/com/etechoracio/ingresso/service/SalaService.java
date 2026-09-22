package br.com.etechoracio.ingresso.service;


import br.com.etechoracio.ingresso.dto.SalaResponseDTO;
import br.com.etechoracio.ingresso.entity.Sessao;
import br.com.etechoracio.ingresso.mapper.SalaMapper;
import br.com.etechoracio.ingresso.repository.SalaRepository;
import br.com.etechoracio.ingresso.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    @Autowired
    private SalaMapper salaMapper;

    @Autowired
    private  SessaoRepository sessaoRepository;

    public List<SalaResponseDTO> findByIdSessao() {
        var result = salaRepository.findByIdSessao();
        return salaMapper.toSalaDTOList(result);

    }
}
