package com.GHouseApi.GHouseApi.model;

import com.GHouseApi.GHouseApi.enums.paymentsEnum;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "pagamentos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@EntityListeners(AuditingEntityListener.class)
public class paymentsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID idUsuario;
    private UUID idConta;
    private UUID idFamilia;

    @CreatedDate
    private LocalDate dataPagamento;

    @LastModifiedDate
    private String comprovantePagamento;
    private paymentsEnum status;

}
