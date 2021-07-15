package sistemareserva.services;

import Interfaces.Repository.ILogRepository;
import java.util.List;

import Interfaces.Repository.IReservaRepository;
import Interfaces.Services.IReservaService;
import entity.LogModel;
import entity.ReservaModel;
import exceptions.ReservaExceptions;
import java.sql.Timestamp;
import java.util.UUID;

public class ReservaService implements IReservaService {

    private IReservaRepository _reservaRepository;
    private ILogRepository _logRepository;

    public ReservaService(IReservaRepository reservaRepository, ILogRepository logRepository) {
        _reservaRepository = reservaRepository;
        _logRepository = logRepository;
    }

    @Override
    public void create(ReservaModel reservaModel) {

        _reservaRepository.create(reservaModel);
        _logRepository.create(new LogModel(new Timestamp(System.currentTimeMillis()), reservaModel.getUsuarioId(), "Criar Reserva", reservaModel.getId().toString()));

    }

    @Override
    public ReservaModel getByReservaId(UUID reservaId) throws ReservaExceptions {
        return _reservaRepository.getByReservaId(reservaId);

    }

    @Override
    public void cancelar(UUID reservaId, UUID usuarioId) throws ReservaExceptions {
        _reservaRepository.cancelar(reservaId);
        _logRepository.create(new LogModel(new Timestamp(System.currentTimeMillis()), usuarioId, "Cancelar Reserva", reservaId.toString()));

    }

    @Override
    public List<ReservaModel> getReservasByUsuarioId(UUID usuarioId) {
        return _reservaRepository.getReservasByUsuarioId(usuarioId);
    }

}
