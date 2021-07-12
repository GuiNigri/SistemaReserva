package sistemareserva.services;

import Interfaces.Repository.IReservaRepository;
import Interfaces.Services.IReservaService;
import entity.ReservaModel;

public class ReservaService implements IReservaService{

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
	public ReservaModel getByReservaId(int reservaId) {
		return _reservaRepository.getByReservaId(reservaId);
	}

	@Override
	public void cancelar(int reservaId) {
		_reservaRepository.cancelar(reservaId);
		
	}

}
