package Controller;

import Interfaces.Services.IReservaService;
import entity.ReservaModel;

public class ReservaController {

	private IReservaService _reservaService;
	
	public ReservaController(IReservaService reservaService) {
		_reservaService = reservaService;
	}
	
	public void createReserva(ReservaModel reservaModel) {
		_reservaService.create(reservaModel);
	}
}
