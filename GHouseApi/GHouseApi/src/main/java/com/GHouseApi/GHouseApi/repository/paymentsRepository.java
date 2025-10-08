package com.GHouseApi.GHouseApi.repository;

import com.GHouseApi.GHouseApi.model.paymentsModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface paymentsRepository extends JpaRepository<paymentsModel, UUID> {
}
