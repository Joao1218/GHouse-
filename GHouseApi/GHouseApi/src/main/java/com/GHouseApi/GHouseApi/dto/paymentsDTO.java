package com.GHouseApi.GHouseApi.dto;

import java.time.LocalDate;
import java.util.UUID;

public record paymentsDTO(String fotoComprovante, LocalDate dataPagamento, String status, UUID idConta, UUID idUser) {
}
