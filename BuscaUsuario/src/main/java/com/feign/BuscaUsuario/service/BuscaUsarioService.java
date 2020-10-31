package com.feign.BuscaUsuario.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.feign.BuscaUsuario.client.BuscaUsario;
import com.feign.BuscaUsuario.model.Data;
import com.feign.BuscaUsuario.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

import java.net.URI;



@Service
public class BuscaUsarioService {

    @Autowired
    private BuscaUsario buscaUsario;

    @Value("${usuario.url}")
    private String url;

    public Data getUsuario(String nome, String header) {

        //URI determinedBasePathUri = URI.create("http://localhost:8085/usuario/");
        URI determinedBasePathUri = URI.create(url);
        String header2 = "teste2";
        Data data = buscaUsario.buscaPeloNome(determinedBasePathUri, nome, header, header2);

        System.out.println(data.getUsuario().getNome() + data.getUsuario().getSobrenome() + data.getUsuario().getEmail() );

        return data;
    }
}
