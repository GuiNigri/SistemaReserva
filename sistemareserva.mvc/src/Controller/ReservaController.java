package Controller;

import java.util.List;

import Interfaces.Services.IReservaService;
import Interfaces.Services.IRotaService;
import View.HomeView;
import ViewModel.ReservaRotaUsuarioAggregateViewModel;
import entity.ReservaModel;
import entity.RotaModel;
import exceptions.ReservaExceptions;
import java.util.ArrayList;
import java.util.UUID;

public class ReservaController {

    private IReservaService _reservaService;
    private IRotaService _rotaService;

    public ReservaController(IReservaService reservaService, IRotaService rotaService) {
        _reservaService = reservaService;
        _rotaService = rotaService;

    }

    public void createReserva(ReservaModel reservaModel) throws ReservaExceptions {
        _reservaService.create(reservaModel);
    }

    public void cancelarReserva(UUID id) throws ReservaExceptions {
        _reservaService.cancelar(id, HomeView.usuarioLogado.getId());
    }

    public List<ReservaRotaUsuarioAggregateViewModel> getReservasByUsuarioId(UUID usuarioId) {
        return modelToViewModel(_reservaService.getReservasByUsuarioId(usuarioId));
    }

    private List<ReservaRotaUsuarioAggregateViewModel> modelToViewModel(List<ReservaModel> reservasModel) {
        List<ReservaRotaUsuarioAggregateViewModel> reservaViewModel = new ArrayList<>();

        for (ReservaModel model : reservasModel) {
            
            RotaModel rotaModel = _rotaService.getRotaById(model.getRotaId());
            reservaViewModel.add(new ReservaRotaUsuarioAggregateViewModel(model.getId(), rotaModel.getOrigem(), rotaModel.getDestino(), rotaModel.getValor()));
        }
        
        return reservaViewModel;
    }
}
