package com.GHouseApi.GHouseApi.dto;

import com.GHouseApi.GHouseApi.model.familyModel;

import java.util.Set;

public record userDTO(String nome, String emails, Set<familyModel> familias) {
}
