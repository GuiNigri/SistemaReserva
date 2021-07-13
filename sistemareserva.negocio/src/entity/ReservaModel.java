package entity;

import java.util.UUID;

public class ReservaModel {

    private UUID id;
    private UUID rotaId;
    private UUID usuarioId;

    public ReservaModel(UUID rotaId, UUID usuarioId) {
        this.id = UUID.randomUUID();
        this.rotaId = rotaId;
        this.usuarioId = usuarioId;
    }

    public UUID getRotaId() {
        return this.rotaId;
    }

    public UUID getUsuarioId() {
        return this.usuarioId;
    }

    public UUID getId() {
        return this.id;
    }
}
