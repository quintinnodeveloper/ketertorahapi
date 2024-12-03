package br.com.quintinno.ketertorahapi.enumeration;

public enum TipoSanguineoEnumeration {

    A_POSITIVO(1, "A+"),
    A_NEGATIVO(2, "A-"),
    B_POSITIVO(3, "B+"),
    AB_POSITIVO(4, "AB+"),
    AB_NEGATIVO_OU_B_NEGATIVO(5, "AB-/B-"),
    O_POSITIVO(6, "O+"),
    O_NEGATIVO(7, "O-");

    private Integer code;
    private String descricao;
    
    private TipoSanguineoEnumeration(Integer code, String descricao) {
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
