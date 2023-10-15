package br.gov.sp.etec.gestaofesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.etec.gestaofesta.model.Logiin;

@Repository
public interface LoginRepository extends JpaRepository <Logiin, Long> {

	Logiin findByEmail(String email);
    
	
}
