package com.feign.Usuario.controller;

import com.feign.Usuario.model.Data;
import com.feign.Usuario.model.Usuario;
import com.feign.Usuario.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    UsuarioService usuarioService = new UsuarioService();
    @GetMapping("usuario/nome/{nome}")
    public Data getUsuarioByName(@PathVariable String nome,
                                 @RequestHeader("header") String header,
                                 @RequestHeader("header2") String header2){
        return usuarioService.getUsuario(nome);
    }
}
