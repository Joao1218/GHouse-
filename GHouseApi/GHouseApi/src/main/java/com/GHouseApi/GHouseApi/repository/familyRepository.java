package com.GHouseApi.GHouseApi.repository;

import com.GHouseApi.GHouseApi.model.familyModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface familyRepository extends JpaRepository<familyModel, UUID> {
    @Override
    <S extends familyModel> S save(S entity);

    @Override
    void deleteById(UUID uuid);

    @Override
    List<familyModel> findAllById(Iterable<UUID> uuids);

    @Override
    Optional<familyModel> findById(UUID uuid);
}
