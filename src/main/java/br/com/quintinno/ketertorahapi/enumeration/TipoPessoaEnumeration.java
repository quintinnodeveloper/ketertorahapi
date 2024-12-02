package br.com.quintinno.ketertorahapi.enumeration;

public enum TipoPessoaEnumeration {

    PESSOA_FISICA (1, "Pessoa Física", "PF"),
    PESSOA_JURIDICA (2, "Pessoa Jurídica", "PJ");

    private Integer code;
    private String desricao;
    private String sigla;

    private TipoPessoaEnumeration(Integer code, String desricao, String sigla) {
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
