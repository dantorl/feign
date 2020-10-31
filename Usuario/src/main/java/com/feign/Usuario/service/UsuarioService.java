package com.feign.Usuario.service;

import com.feign.Usuario.model.Data;
import com.feign.Usuario.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public Data getUsuario(String nome) {

        Usuario usuario = new Usuario();
        Data data =new Data();

        if (nome.equals("daniel")){
            usuario.setNome(nome);
            usuario.setEmail("teste@teste");
            usuario.setSobrenome("Torquato");
        } else{
            usuario.setNome("nao encontrado");
            usuario.setEmail("@");
            usuario.setSobrenome("nao encontrado");
        }

        data.setUsuario(usuario);
        return data;
    }
}
