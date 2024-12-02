package br.com.quintinno.ketertorahapi.enumeration;

public enum TipoSanguineoEnumeration {

    TIPO_SANGUINEO_1 (1, "A+"),
    TIPO_SANGUINEO_2 (2, "A-"),
    TIPO_SANGUINEO_3 (3, "B+"),
    TIPO_SANGUINEO_4 (4, "AB+"),
    TIPO_SANGUINEO_5 (5, "AB-/B-"),
    TIPO_SANGUINEO_6 (6, "O+"),
    TIPO_SANGUINEO_7 (7, "O-");

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
