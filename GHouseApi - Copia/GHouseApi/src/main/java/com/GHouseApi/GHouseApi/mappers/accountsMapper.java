package com.GHouseApi.GHouseApi.mappers;

import com.GHouseApi.GHouseApi.dto.accountsDTO;
import com.GHouseApi.GHouseApi.model.accountsModel;

public class accountsMapper {
    public static accountsModel dtoEmModel(accountsDTO accountsDTO){
        return new accountsModel(null,accountsDTO.nome(), accountsDTO.descricao(),accountsDTO.foto(), accountsDTO.status(),accountsDTO.dataVencimento(),accountsDTO.codigoBarra(),null);
    }

    public static accountsDTO modelEmDto(accountsModel accountsModel){
        return new accountsDTO(accountsModel.getNome(),accountsModel.getDescricao(),accountsModel.getFoto(),accountsModel.getStatus(),accountsModel.getDataVencimento(),accountsModel.getNumeroCodigoDeBarras());
    }
}
