package com.GHouseApi.GHouseApi.repository;

import com.GHouseApi.GHouseApi.model.accountsModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface accountsRepository extends JpaRepository<accountsModel, UUID> {
}
