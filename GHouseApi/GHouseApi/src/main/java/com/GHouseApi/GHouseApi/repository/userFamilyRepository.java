package com.GHouseApi.GHouseApi.repository;

import com.GHouseApi.GHouseApi.model.userFamilyModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface userFamilyRepository extends JpaRepository<userFamilyModel, UUID> {
    @Override
    List<userFamilyModel> findAllById(Iterable<UUID> uuids);

    @Override
    void deleteById(UUID uuid);
}
