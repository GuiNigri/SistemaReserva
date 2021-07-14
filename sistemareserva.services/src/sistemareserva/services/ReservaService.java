package sistemareserva.services;

import java.util.List;

import Interfaces.Repository.IReservaRepository;
import Interfaces.Services.IReservaService;
import entity.ReservaModel;
import exceptions.ReservaExceptions;
import java.util.UUID;

public class ReservaService implements IReservaService {

    private IReservaRepository _reservaRepository;

    public ReservaService(IReservaRepository reservaRepository) {
        _reservaRepository = reservaRepository;
    }

    @Override
    public void create(ReservaModel reservaModel) {
        System.out.println("service");
        _reservaRepository.create(reservaModel);

    }

    @Override
    public ReservaModel getByReservaId(UUID reservaId) throws ReservaExceptions {
        return _reservaRepository.getByReservaId(reservaId);

    }

    @Override
    public void cancelar(UUID reservaId) throws ReservaExceptions {
        _reservaRepository.cancelar(reservaId);

    }

    @Override
    public List<ReservaModel> getReservasByUsuarioId(UUID usuarioId) {
        return _reservaRepository.getReservasByUsuarioId(usuarioId);
    }

}
