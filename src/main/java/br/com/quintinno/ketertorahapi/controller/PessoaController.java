package br.com.quintinno.ketertorahapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quintinno.ketertorahapi.entity.PessoaEntity;
import br.com.quintinno.ketertorahapi.service.PessoaService;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/v1")
    public PessoaEntity create(@RequestBody PessoaEntity pessoaEntity) {
        return this.pessoaService.create(pessoaEntity); 
    }

}
