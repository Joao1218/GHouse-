package com.GHouseApi.GHouseApi.model;

import com.GHouseApi.GHouseApi.enums.paymentsEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "pagamentos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class paymentsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID idUsuario;
    private UUID idConta;
    private UUID idFamilia;
    private LocalDate dataPagamento;
    private String comprovantePagamento;
    private paymentsEnum status;

}
