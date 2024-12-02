package br.com.quintinno.ketertorahapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.quintinno.ketertorahapi.entity.PessoaEntity;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {}
