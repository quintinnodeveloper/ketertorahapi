package br.com.quintinno.ketertorahapi.enumeration;

public enum TipoGeneroEnumeration {

    MASCULINO (1, "Masculino", "M"),
    FEMININO (2, "Feminino", "F");

    private Integer code;
    private String desricao;
    private String sigla;

    private TipoGeneroEnumeration(Integer code, String desricao, String sigla) {
        this.code = code;
        this.desricao = desricao;
        this.sigla = sigla;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesricao() {
        return desricao;
    }

    public String getSigla() {
        return sigla;
    }

}
