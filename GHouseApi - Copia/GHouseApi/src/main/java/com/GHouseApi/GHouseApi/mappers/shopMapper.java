package com.GHouseApi.GHouseApi.mappers;

import com.GHouseApi.GHouseApi.dto.shoppDTO;
import com.GHouseApi.GHouseApi.model.shoppModel;

public class shopMapper {

    public static shoppModel dtoEmShopp(shoppDTO shoppDTO){
        return new shoppModel(null, null, null, shoppDTO.dataCompra(), shoppDTO.valorTotal());
    }

    public static shoppDTO shoppEmDto(shoppModel shoppModel){
        return new shoppDTO(shoppModel.getDataCompra(), shoppModel.getValorTotal());
    }
}
