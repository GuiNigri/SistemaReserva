package Interfaces.Services;

import java.util.List;

import entity.ReservaModel;
import exceptions.ReservaExceptions;
import java.util.UUID;

public interface IReservaService {

    void create(ReservaModel reservaModel);
    void cancelar(UUID reservaId) throws ReservaExceptions;
    ReservaModel getByReservaId(UUID reservaId) throws ReservaExceptions;
    List<ReservaModel> getReservasByUsuarioId(UUID usuarioId);
    
}
