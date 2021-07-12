package Interfaces.Repository;

import entity.ReservaModel;
import exceptions.ReservaExceptions;

public interface IReservaRepository {
    void create(ReservaModel reservaModel);
    void cancelar(int reservaId) throws ReservaExceptions;
    ReservaModel getByReservaId(int reservaId) throws ReservaExceptions;
}
