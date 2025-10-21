package com.GHouseApi.GHouseApi.mappers;

import com.GHouseApi.GHouseApi.dto.productsDTO;
import com.GHouseApi.GHouseApi.model.productsModel;

public class productsMapper {
    public static productsModel dtoEmModel(productsDTO productsDTO){
        return new productsModel(null, productsDTO.nome(), productsDTO.descricao(), productsDTO.categoria(), productsDTO.preco(),null);
    }

    public static productsDTO modelEmDto(productsModel productsModel){
        return new productsDTO(productsModel.getNome(), productsModel.getDescricao(), productsModel.getCategoria(), productsModel.getPreco());
    }
}
