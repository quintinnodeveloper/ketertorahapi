package br.com.quintinno.ketertorahapi.entity;

import java.time.LocalDate;

import br.com.quintinno.ketertorahapi.enumeration.TipoCorEnumeration;
import br.com.quintinno.ketertorahapi.enumeration.TipoEstadoCivilEnumeration;
import br.com.quintinno.ketertorahapi.enumeration.TipoPessoaEnumeration;
import br.com.quintinno.ketertorahapi.enumeration.TipoSanguineoEnumeration;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PESSOA")
public class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE", nullable = false)
    private Long code;

    @ManyToOne
    @JoinColumn(name = "ID_PAIS")
    private PaisEntity paisEntity;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_PESSOA", nullable = false)
    private TipoPessoaEnumeration tipoPessoaEnumeration;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_COR")
    private TipoCorEnumeration tipoCorEnumeration;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_SANGUINEO")
    private TipoSanguineoEnumeration tipoSanguineoEnumeration;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_ESTADO_CIVIL")
    private TipoEstadoCivilEnumeration tipoEstadoCivilEnumeration;

    @Column(name = "NOME_COMPLETO", length = 200, unique = true, nullable = false)
    private String nomeCompleto;

    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNascimento;

    @Column(name = "ATIVO", nullable = false)
    private Boolean ativo;

    public PessoaEntity() { }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public PaisEntity getPaisEntity() {
        return paisEntity;
    }

    public void setPaisEntity(PaisEntity paisEntity) {
        this.paisEntity = paisEntity;
    }

    public TipoPessoaEnumeration getTipoPessoaEnumeration() {
        return tipoPessoaEnumeration;
    }

    public void setTipoPessoaEnumeration(TipoPessoaEnumeration tipoPessoaEnumeration) {
        this.tipoPessoaEnumeration = tipoPessoaEnumeration;
    }

    public TipoCorEnumeration getTipoCorEnumeration() {
        return tipoCorEnumeration;
    }

    public void setTipoCorEnumeration(TipoCorEnumeration tipoCorEnumeration) {
        this.tipoCorEnumeration = tipoCorEnumeration;
    }

    public TipoSanguineoEnumeration getTipoSanguineoEnumeration() {
        return tipoSanguineoEnumeration;
    }

    public void setTipoSanguineoEnumeration(TipoSanguineoEnumeration tipoSanguineoEnumeration) {
        this.tipoSanguineoEnumeration = tipoSanguineoEnumeration;
    }

    public TipoEstadoCivilEnumeration getTipoEstadoCivilEnumeration() {
        return tipoEstadoCivilEnumeration;
    }

    public void setTipoEstadoCivilEnumeration(TipoEstadoCivilEnumeration tipoEstadoCivilEnumeration) {
        this.tipoEstadoCivilEnumeration = tipoEstadoCivilEnumeration;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

}
