package com.GHouseApi.GHouseApi.repository;

import com.GHouseApi.GHouseApi.dto.usuarios.userLoginRequestDTO;
import com.GHouseApi.GHouseApi.dto.usuarios.userResponseDTO;
import com.GHouseApi.GHouseApi.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userRepository extends JpaRepository<userModel, String> {

    userModel findByEmail(String email);
}
