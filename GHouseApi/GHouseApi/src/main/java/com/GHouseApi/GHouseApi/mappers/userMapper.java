package com.GHouseApi.GHouseApi.mappers;

import com.GHouseApi.GHouseApi.dto.usuarios.userRequestDTO;
import com.GHouseApi.GHouseApi.dto.usuarios.userResponseDTO;
import com.GHouseApi.GHouseApi.enums.userEnum;
import com.GHouseApi.GHouseApi.model.userModel;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class userMapper {
    public userResponseDTO modelEmDto(userModel model){
        return new userResponseDTO(model.getId(),model.getNome(), model.getEmail(), model.getPassword());
    }
    public userModel dtoEmModel(userRequestDTO dto){
        return new userModel(null, dto.nome(), dto.email(), userEnum.USER, dto.password(), null);
    }
}
