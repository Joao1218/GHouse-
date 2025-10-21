package com.GHouseApi.GHouseApi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "usuarios_familia")
@IdClass(chaveCompostaFamiliasUsuarioId.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class userFamilyModel {


    @Id
    @Column(name = "id_usuario", nullable = false)
    private UUID idUsuario;

    @Id
    @Column(name = "id_familia", nullable = false)
    private UUID idFamilia;

    // Relacionamento com Usuario
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private userModel usuario;

    // Relacionamento com Familia
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_familia", insertable = false, updatable = false)
    private familyModel familia;


    // Classe interna para chave composta
    public static class UsuarioFamiliaId implements Serializable {
        private UUID idUsuario;
        private UUID idFamilia;

        public UsuarioFamiliaId() {}

        public UsuarioFamiliaId(UUID idUsuario, UUID idFamilia) {
            this.idUsuario = idUsuario;
            this.idFamilia = idFamilia;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof UsuarioFamiliaId)) return false;
            UsuarioFamiliaId that = (UsuarioFamiliaId) o;
            return idUsuario.equals(that.idUsuario) && idFamilia.equals(that.idFamilia);
        }

        @Override
        public int hashCode() {
            return idUsuario.hashCode() ^ idFamilia.hashCode();
        }
    }
}
