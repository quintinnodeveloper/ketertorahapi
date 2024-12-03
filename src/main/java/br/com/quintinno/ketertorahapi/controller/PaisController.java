package br.com.quintinno.ketertorahapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quintinno.ketertorahapi.entity.PaisEntity;
import br.com.quintinno.ketertorahapi.service.PaisService;

@RestController
@RequestMapping("/api/pais")
@CrossOrigin("*")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping("/v1")
    public List<PaisEntity> readAll() {
        return this.paisService.readAll();
    }
    
}
