package com.GHouseApi.GHouseApi.mappers;

import com.GHouseApi.GHouseApi.dto.productsShoppDTO;
import com.GHouseApi.GHouseApi.model.productsShopModel;

public class productShoppMapper {
    public static productsShopModel dtoEmModel(productsShoppDTO productsShoppDTO){
        return new productsShopModel(null, null, productsShoppDTO.idProduto(), productsShoppDTO.quantidade(), productsShoppDTO.precoUnitario(), productsShoppDTO.subTotal());
    }

    public static productsShoppDTO modelEmdto(productsShopModel productsShopModel){
        return new productsShoppDTO(productsShopModel.getQuantidade(), productsShopModel.getPrecoUnitario(), productsShopModel.getSubtotal(), productsShopModel.getIdProduto());
    }
}
