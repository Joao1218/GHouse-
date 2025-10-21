package com.GHouseApi.GHouseApi.repository;

import com.GHouseApi.GHouseApi.model.inviteFamilyModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface inviteFamilyRepository extends JpaRepository<inviteFamilyModel, UUID> {

    @Override
    List<inviteFamilyModel> findAll();

    @Override
    <S extends inviteFamilyModel> S save(S entity);

    @Override
    void deleteById(UUID uuid);
}
