package com.GHouseApi.GHouseApi.service;

import com.GHouseApi.GHouseApi.dto.usuarios.userLoginRequestDTO;
import com.GHouseApi.GHouseApi.dto.usuarios.userRequestDTO;
import com.GHouseApi.GHouseApi.dto.usuarios.userResponseDTO;
import com.GHouseApi.GHouseApi.mappers.userMapper;
import com.GHouseApi.GHouseApi.model.userModel;
import com.GHouseApi.GHouseApi.repository.userRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class userService {

    private final userRepository repository;
    private final userMapper mapper;

    public userResponseDTO salvarUsuario(userRequestDTO userModel) throws Exception{
        userModel usuario = repository.save(mapper.dtoEmModel(userModel));
        return mapper.modelEmDto(usuario);
    }

    public String loginUsuario(String email, String password){
        userModel usuario = repository.findByEmail(email);

        if (usuario == null) {
            return "Email ou senha estão incorretos";
        }

        if (!usuario.getPassword().equals(password)) {
            return "Email ou senha estão incorretos";
        }

        return usuario.getId();
    }

    public List<userResponseDTO> listarUsuarios(){
        return repository.
                findAll().
                stream().
                map(mapper::modelEmDto).
                toList();
    }

    public userResponseDTO BuscarUsuario(UUID id){
        userModel usuario = repository.findById(id.toString()).
                orElseThrow(() -> new EntityNotFoundException("Usuario não encontrado"));
        return  mapper.modelEmDto(usuario);
    }

    public void atualizarInformações(UUID id, String nome, String email) throws Exception{
        Optional<userModel> optionalUsuario = repository.findById(id.toString());

        if(optionalUsuario.isPresent()) {
            userModel usuario = optionalUsuario.get();
            usuario.setNome(nome);
            usuario.setEmail(email);
            repository.save(usuario);
        } else {
            throw new Exception("Usuario não encontrado");
        }
    }

    public void deletarUsuario(UUID id){
        repository.deleteById(id.toString());
    }
}
