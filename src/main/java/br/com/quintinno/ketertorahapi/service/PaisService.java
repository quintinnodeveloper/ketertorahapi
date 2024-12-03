package br.com.quintinno.ketertorahapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.quintinno.ketertorahapi.entity.PaisEntity;
import br.com.quintinno.ketertorahapi.repository.PaisRespostory;

@Service
public class PaisService {

    @Autowired
    private PaisRespostory paisRespostory;

    public List<PaisEntity> readAll() {
        return this.paisRespostory.findAll(Sort.by(Sort.Direction.ASC, "code"));
    }
    
}
