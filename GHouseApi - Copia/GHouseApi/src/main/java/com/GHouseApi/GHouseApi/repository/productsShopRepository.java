package com.GHouseApi.GHouseApi.repository;

import com.GHouseApi.GHouseApi.model.productsShopModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface productsShopRepository extends JpaRepository<productsShopModel, UUID> {
}
