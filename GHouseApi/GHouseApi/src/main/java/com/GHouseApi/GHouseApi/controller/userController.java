package com.GHouseApi.GHouseApi.controller;

import com.GHouseApi.GHouseApi.dto.usuarios.userLoginRequestDTO;
import com.GHouseApi.GHouseApi.dto.usuarios.userPutRequestDTO;
import com.GHouseApi.GHouseApi.dto.usuarios.userRequestDTO;
import com.GHouseApi.GHouseApi.dto.usuarios.userResponseDTO;
import com.GHouseApi.GHouseApi.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/usuarios")
public class userController {
    @Autowired
    private userService service;

    @PostMapping("register")
    public ResponseEntity<userResponseDTO> registrarUsuario(@RequestBody userRequestDTO usuario) throws Exception {
        userResponseDTO dadosUsuario = service.salvarUsuario(usuario);
        URI uri = URI.create("/usuarios/" + dadosUsuario.id());
        return ResponseEntity.created(uri).body(dadosUsuario);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUsuario(@RequestBody userLoginRequestDTO login) {
        String id = service.loginUsuario(login.email(), login.password());

        if (id == null || id.equals("Email ou senha estão incorretos")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email ou senha estão incorretos");
        }

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id)
                .toUri();

        return ResponseEntity.created(uri).body(id);
    }

    @GetMapping
    public ResponseEntity<List<userResponseDTO>> listarUsuarios(){
        List<userResponseDTO> usuarios = service.listarUsuarios();
        return ResponseEntity.ok().body(usuarios);
    }

    @GetMapping("{id}")
    public ResponseEntity<userResponseDTO> buscarUsuario(@PathVariable String id){
        userResponseDTO usuario = service.BuscarUsuario(UUID.fromString(id));
        return ResponseEntity.ok().body(usuario);
    }

    @GetMapping("/me/{id}")
    public ResponseEntity<userResponseDTO> meusDados(@PathVariable String id){
        userResponseDTO usuario = service.BuscarUsuario(UUID.fromString(id));
        return ResponseEntity.ok().body(usuario);
    }

    @PutMapping("{id}")
    public ResponseEntity<String> atualizarUsuario(@PathVariable String id, @RequestBody userPutRequestDTO dto) throws Exception {
        service.atualizarInformações(UUID.fromString(id),dto.nome(), dto.email());
        return ResponseEntity.ok().body("Usuario atualizado com sucesso");
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> apagarUsuario(@PathVariable String id){
        service.deletarUsuario(UUID.fromString(id));
        return ResponseEntity.ok().body("Usuario deletado com sucesso");
    }
}
