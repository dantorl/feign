package com.feign.BuscaUsuario.client;

import com.feign.BuscaUsuario.model.Data;
import com.feign.BuscaUsuario.model.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.net.URI;


@FeignClient(name = "usuario", url = "https://this-is-a-placeholder.com")
public interface BuscaUsario {

    @GetMapping("nome/{nome}")
    Data buscaPeloNome(URI baseUrl, @PathVariable String nome, @RequestHeader ("header") String header, @RequestHeader ("header2") String header2);

}
