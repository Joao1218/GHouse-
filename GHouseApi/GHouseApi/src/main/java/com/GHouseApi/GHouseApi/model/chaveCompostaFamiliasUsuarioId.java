package com.GHouseApi.GHouseApi.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class chaveCompostaFamiliasUsuarioId implements Serializable {
    private UUID idUsuario;
    private UUID idFamilia;

    public chaveCompostaFamiliasUsuarioId() {}

    public chaveCompostaFamiliasUsuarioId(UUID idUsuario, UUID idFamilia) {
        this.idUsuario = idUsuario;
        this.idFamilia = idFamilia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof chaveCompostaFamiliasUsuarioId)) return false;
        chaveCompostaFamiliasUsuarioId that = (chaveCompostaFamiliasUsuarioId) o;
        return Objects.equals(idUsuario, that.idUsuario) &&
                Objects.equals(idFamilia, that.idFamilia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idFamilia);
    }
}
