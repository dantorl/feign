package com.feign.BuscaUsuario.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
    @JsonProperty("Data")
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Data() {
    }
}
