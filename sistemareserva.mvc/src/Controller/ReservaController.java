package Controller;

import java.util.List;

import Interfaces.Services.IReservaService;
import entity.ReservaModel;
import exceptions.ReservaExceptions;
import java.util.UUID;

public class ReservaController {

    private IReservaService _reservaService;

    public ReservaController(IReservaService reservaService) {
        _reservaService = reservaService;
    }

    public void createReserva(ReservaModel reservaModel) {
        _reservaService.create(reservaModel);
    }

    public String cancelarReserva(UUID id) {
        try {
            _reservaService.cancelar(id);
            return "Cancelado com sucesso";
        } catch (ReservaExceptions ex) {
            return ex.getMessage();
        }

    }

    public List<ReservaModel> getReservasByUsuarioId(UUID usuarioId) {
        return _reservaService.getReservasByUsuarioId(usuarioId);
    }
}
