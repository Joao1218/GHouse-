package com.GHouseApi.GHouseApi.repository;

import com.GHouseApi.GHouseApi.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface userRepository extends JpaRepository<userModel, UUID> {
    @Override
    List<userModel> findAll();

    @Override
    Optional<userModel> findById(UUID uuid);

    @Override
    <S extends userModel> S save(S entity);

    @Override
    void deleteAllById(Iterable<? extends UUID> uuids);
}
