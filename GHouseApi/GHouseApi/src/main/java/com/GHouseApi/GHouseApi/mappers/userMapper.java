package com.GHouseApi.GHouseApi.mappers;

import com.GHouseApi.GHouseApi.dto.userDTO;
import com.GHouseApi.GHouseApi.model.userModel;

public class userMapper {

    public static userModel dtoEmUsuario(userDTO userDTO){
        return new userModel(null, userDTO.nome(), userDTO.emails(), null, null, userDTO.familias());
    }

    public static userDTO userEmDTO(userModel userModel){
        return new userDTO(userModel.getNome(), userModel.getEmail(), userModel.getFamilias());
    }
}
