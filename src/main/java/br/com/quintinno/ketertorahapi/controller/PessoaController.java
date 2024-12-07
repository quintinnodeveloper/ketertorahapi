package br.com.quintinno.ketertorahapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.quintinno.ketertorahapi.entity.PessoaEntity;
import br.com.quintinno.ketertorahapi.enumeration.TipoCorEnumeration;
import br.com.quintinno.ketertorahapi.enumeration.TipoEstadoCivilEnumeration;
import br.com.quintinno.ketertorahapi.enumeration.TipoGeneroEnumeration;
import br.com.quintinno.ketertorahapi.enumeration.TipoPessoaEnumeration;
import br.com.quintinno.ketertorahapi.enumeration.TipoSanguineoEnumeration;
import br.com.quintinno.ketertorahapi.service.PessoaService;

@RestController
@RequestMapping("/api/pessoa")
@CrossOrigin("*")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/v1")
    public PessoaEntity create(@RequestBody PessoaEntity pessoaEntity) {
        return this.pessoaService.create(pessoaEntity); 
    }

    @GetMapping("/v1")
    public ResponseEntity<Page<PessoaEntity>> readAll(
        @RequestParam(defaultValue = "0") Integer numeroPagina, @RequestParam(defaultValue = "10") Integer tamanhoPagina) {
        Page<PessoaEntity> pessoaEntityList = this.pessoaService.readAll(numeroPagina, tamanhoPagina);
        return ResponseEntity.ok(pessoaEntityList);
    }

    @GetMapping("/tipo-cor/v1")
    public List<TipoCorEnumeration> getCorEnumeration() {
        return this.pessoaService.getTipoCorEnumeration();
    }

    @GetMapping("/tipo-estado-civil/v1")
    public List<TipoEstadoCivilEnumeration> getTipoEstadoCivilEnumeration() {
        return this.pessoaService.getTipoEstadoCivilEnumeration();
    }

    @GetMapping("/tipo-sanguineo/v1")
    public TipoSanguineoEnumeration[] getTipoSanguineoEnumeration() {
        return this.pessoaService.getTipoSanguineoEnumeration();
    }

    @GetMapping("/tipo-pessoa/v1")
    public TipoPessoaEnumeration[] getTipoPessoaEnumeration() {
        return this.pessoaService.getTipoPessoaEnumeration();
    }

    @GetMapping("/tipo-genero/v1")
    public TipoGeneroEnumeration[] getGeneroEnumeration() {
        return this.pessoaService.getTipoGeneroEnumeration();
    }

}
