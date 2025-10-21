package com.GHouseApi.GHouseApi.repository;

import com.GHouseApi.GHouseApi.model.productsModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface productsRepository extends JpaRepository<productsModel, UUID> {
}
