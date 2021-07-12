package Interfaces.Services;

import entity.ReservaModel;

public interface IReservaService {

    void create(ReservaModel reservaModel);
    void cancelar(int reservaId);
    ReservaModel getByReservaId(int reservaId);
    
}
