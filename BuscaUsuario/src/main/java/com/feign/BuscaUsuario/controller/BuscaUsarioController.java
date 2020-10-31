package com.feign.BuscaUsuario.controller;

import com.feign.BuscaUsuario.model.Data;
import com.feign.BuscaUsuario.model.Usuario;
import com.feign.BuscaUsuario.service.BuscaUsarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class BuscaUsarioController {

    @Autowired
    private BuscaUsarioService buscaUsarioService;

    @GetMapping("usuario/{nome}")
    public Data getUsuario(@PathVariable String nome,
                           @RequestHeader("header") String header){

        return buscaUsarioService.getUsuario(nome, header);
    }
}
