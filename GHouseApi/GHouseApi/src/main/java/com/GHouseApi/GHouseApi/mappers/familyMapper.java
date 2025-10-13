package com.GHouseApi.GHouseApi.mappers;

import com.GHouseApi.GHouseApi.dto.familyDTO;
import com.GHouseApi.GHouseApi.model.familyModel;

public class familyMapper {
    public static familyModel dtoEmModel(familyDTO familyDTO){
        return new familyModel(null, familyDTO.nome(), null);
    }

    public static familyDTO modelEmDto(familyModel familyModel){
        return new familyDTO(familyModel.getNome());
    }
}
