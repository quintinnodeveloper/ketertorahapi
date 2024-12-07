package br.com.quintinno.ketertorahapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.quintinno.ketertorahapi.entity.PessoaEntity;
import br.com.quintinno.ketertorahapi.enumeration.TipoCorEnumeration;
import br.com.quintinno.ketertorahapi.enumeration.TipoEstadoCivilEnumeration;
import br.com.quintinno.ketertorahapi.enumeration.TipoGeneroEnumeration;
import br.com.quintinno.ketertorahapi.enumeration.TipoPessoaEnumeration;
import br.com.quintinno.ketertorahapi.enumeration.TipoSanguineoEnumeration;
import br.com.quintinno.ketertorahapi.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaEntity create(PessoaEntity pessoaEntity) {
        return this.pessoaRepository.save(pessoaEntity);
    }

    public Page<PessoaEntity> readAll(Integer numeroPagina, Integer tamanhoPagina) {
        Pageable pageable = PageRequest.of(numeroPagina, tamanhoPagina);
        return this.pessoaRepository.findAll(pageable);
    }

    public List<TipoCorEnumeration> getTipoCorEnumeration() {
        return TipoCorEnumeration.getTipoCorEnumeration();
    }

    public List<TipoEstadoCivilEnumeration> getTipoEstadoCivilEnumeration() {
        return TipoEstadoCivilEnumeration.getTipoEstadoCivilEnumeration();
    }

    public TipoSanguineoEnumeration[] getTipoSanguineoEnumeration() {
        return TipoSanguineoEnumeration.values();
    }

    public TipoPessoaEnumeration[] getTipoPessoaEnumeration() {
        return TipoPessoaEnumeration.values();
    }

    public TipoGeneroEnumeration[] getTipoGeneroEnumeration() {
        return TipoGeneroEnumeration.values();
    }

}
