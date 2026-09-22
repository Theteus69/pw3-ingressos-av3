package br.com.etechoracio.ingresso.repository;

import br.com.etechoracio.ingresso.entity.Sala;
import br.com.etechoracio.ingresso.entity.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface SalaRepository extends JpaRepository
        <Sala, Long>{
    @Query("SELECT sa FROM Sala sa join fetch sa.sessao WHERE s.sessao.id = :idSessao")
    List<Sala> findByIdSessao(Long idSessao);

}
