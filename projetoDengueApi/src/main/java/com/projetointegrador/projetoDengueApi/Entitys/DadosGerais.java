package com.projetointegrador.projetoDengueApi.Entitys;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
public class DadosGerais {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String cartaoSUS;
    private String agravoDoenca;
    private String dataNotificacao;
    private String municipioNotificacao;
    //contructor vazio
    public DadosGerais(){
    }
    //constructor completo
    public DadosGerais(Long id, String nome, String cartaoSUS, String agravoDoenca, String dataNotificacao, String municipioNotificacao) {
        this.id = id;
        this.nome = nome;
        this.cartaoSUS = cartaoSUS;
        this.agravoDoenca = agravoDoenca;
        this.dataNotificacao = dataNotificacao;
        this.municipioNotificacao = municipioNotificacao;
    }
    //constructor sem id
    public DadosGerais(String nome, String cartaoSUS, String agravoDoenca, String dataNotificacao, String municipioNotificacao) {
        this.nome = nome;
        this.cartaoSUS = cartaoSUS;
        this.agravoDoenca = agravoDoenca;
        this.dataNotificacao = dataNotificacao;
        this.municipioNotificacao = municipioNotificacao;
    }
    //Getters Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCartaoSUS() {
        return cartaoSUS;
    }

    public void setCartaoSUS(String cartaoSUS) {
        this.cartaoSUS = cartaoSUS;
    }

    public String getAgravoDoenca() {
        return agravoDoenca;
    }

    public void setAgravoDoenca(String agravoDoenca) {
        this.agravoDoenca = agravoDoenca;
    }

    public String getDataNotificacao() {
        return dataNotificacao;
    }

    public void setDataNotificacao(String dataNotificacao) {
        this.dataNotificacao = dataNotificacao;
    }

    public String getMunicipioNotificacao() {
        return municipioNotificacao;
    }

    public void setMunicipioNotificacao(String municipioNotificacao) {
        this.municipioNotificacao = municipioNotificacao;
    }
}
