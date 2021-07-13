package Repository;

import java.util.ArrayList;
import java.util.List;

import Interfaces.Repository.IReservaRepository;
import entity.ReservaModel;
import exceptions.ReservaExceptions;
import java.util.UUID;

public class ReservaRepository implements IReservaRepository {

    private List<ReservaModel> _dbContext;

    public ReservaRepository() {
        _dbContext = new ArrayList<ReservaModel>();
    }

    @Override
    public void create(ReservaModel reservaModel) {
        _dbContext.add(reservaModel);

    }

    @Override
    public ReservaModel getByReservaId(UUID reservaId) throws ReservaExceptions {
        ReservaModel reservaModel = getReservaModelById(reservaId);
        if (reservaModel == null) {
            throw new ReservaExceptions("Essa Reserva não existe");
        }

        return reservaModel;

    }

    @Override
    public void cancelar(UUID reservaId) throws ReservaExceptions {
        ReservaModel reservaModel = getReservaModelById(reservaId);

        if (reservaModel == null) {
            throw new ReservaExceptions("Essa Reserva não existe");
        }
        _dbContext.remove(reservaModel);

    }

    @Override
    public List<ReservaModel> getReservasByUsuarioId(UUID usuarioId) {
        List<ReservaModel> reservas = new ArrayList<>();
        for (ReservaModel model : _dbContext) {
            if (model.getUsuarioId() == usuarioId) {
                reservas.add(model);
            }
        }

        return reservas;
    }

    private ReservaModel getReservaModelById(UUID reservaId) {
        for (ReservaModel model : _dbContext) {
            if (model.getId() == reservaId) {
                return model;
            }
        }

        return null;
    }

}
