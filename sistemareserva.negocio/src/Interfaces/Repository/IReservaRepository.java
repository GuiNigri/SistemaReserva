package Interfaces.Repository;

import java.util.List;

import entity.ReservaModel;
import exceptions.ReservaExceptions;
import java.util.UUID;

public interface IReservaRepository {
    void create(ReservaModel reservaModel);
    void cancelar(UUID reservaId) throws ReservaExceptions;
    List<ReservaModel> getReservasByUsuarioId(UUID usuarioId);
    ReservaModel getByReservaId(UUID reservaId) throws ReservaExceptions;
}
