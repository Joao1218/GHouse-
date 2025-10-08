package com.GHouseApi.GHouseApi.repository;

import com.GHouseApi.GHouseApi.model.shoppModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface shoppRepository extends JpaRepository<shoppModel, UUID> {
}
