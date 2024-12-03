package br.com.quintinno.ketertorahapi.enumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TipoCorEnumeration {

    BRANCA(1, "Branca"),
    PRETA(2, "Preta"),
    PARDA(3, "Parda"),
    AMARELA(4, "Amarela"),
    INDIGENA(5, "Indígena"),
    NAO_DECLARADA(6, "Não Declarada");

    private Integer code;
    private String descricao;
    
    private TipoCorEnumeration(Integer code, String descricao) {
        this.code = code;
        this.descricao = descricao;
    }

    public static List<TipoCorEnumeration> getTipoCorEnumeration() {
        return Arrays.asList(TipoCorEnumeration.values());
    }

    public Integer getCode() {
        return code;
    }

    public String getDescricao() {
        return descricao;
    }

}
