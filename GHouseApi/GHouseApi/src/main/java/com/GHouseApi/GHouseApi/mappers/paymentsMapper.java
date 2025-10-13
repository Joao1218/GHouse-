package com.GHouseApi.GHouseApi.mappers;

import com.GHouseApi.GHouseApi.dto.paymentsDTO;
import com.GHouseApi.GHouseApi.model.paymentsModel;

public class paymentsMapper {

    public static paymentsModel dtoEmModel(paymentsDTO paymentsDTO){
        return new paymentsModel(null, null, null, null, paymentsDTO.dataPagamento(), paymentsDTO.fotoComprovante(), paymentsDTO.status());
    }

    public static paymentsDTO modelEmDto(paymentsModel paymentsModel){
        return new paymentsDTO(paymentsModel.getComprovantePagamento(), paymentsModel.getDataPagamento(), paymentsModel.getStatus());
    }
}
