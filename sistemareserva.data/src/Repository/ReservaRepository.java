package Repository;

import java.util.ArrayList;
import java.util.List;

import Interfaces.Repository.IReservaRepository;
import entity.ReservaModel;
import exceptions.ReservaExceptions;

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
	public ReservaModel getByReservaId(int reservaId) {
		return getReservaModelById(reservaId);
	}

	@Override
	public void cancelar(int reservaId) throws ReservaExceptions {
		ReservaModel reservaModel = getReservaModelById(reservaId);
		
		if(reservaModel == null) {
			throw new ReservaExceptions("Essa Reserva não existe");
		}
		_dbContext.remove(reservaModel);
		
	}
	
	private ReservaModel getReservaModelById(int reservaId) {
		for (ReservaModel model : _dbContext) {
			if (model.getId() == reservaId) {
				return model;
			}
		}
		
		return null;
	}

}
