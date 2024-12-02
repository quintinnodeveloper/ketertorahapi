package br.com.quintinno.ketertorahapi.enumeration;

public enum TipoEstadoCivilEnumeration {

    SOLTEIRO(1, "Solteiro(a)"),
    CASADO(2, "Casado(a)"),
    DIVORCIADO(3, "Divorciado(a)"),
    VIUVO(4, "Viúvo(a)"),
    UNIAO_ESTAVEL(5, "União Estável"),
    SEPARADO_JUDICIALMENTE(6, "Separado(a) Judicialmente");

    private Integer code;
    private String descricao;
    
    private TipoEstadoCivilEnumeration(Integer code, String descricao) {
        this.code = code;
        this.descricao = descricao;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescricao() {
        return descricao;
    }

}