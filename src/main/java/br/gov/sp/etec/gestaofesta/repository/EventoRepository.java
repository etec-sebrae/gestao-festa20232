package br.gov.sp.etec.gestaofesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.etec.gestaofesta.model.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long>{

}
