package br.com.etechoracio.ingresso.mapper;

import br.com.etechoracio.ingresso.dto.SalaResponseDTO;
import br.com.etechoracio.ingresso.dto.SessaoSalaResponseDTO;
import br.com.etechoracio.ingresso.entity.Sala;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",
                    uses = SalaMapper.class)
public interface SalaMapper {

        List<SalaResponseDTO> toSalaDTOList(List<Sala> entities);

        SalaResponseDTO toSalaDTO(Sala entity);
}
