package entity;

public class ReservaModel {
	
	private int id;
	private int rotaId;
	private int usuarioId;

	public ReservaModel(int id, int rotaId, int usuarioId) {
		this.id = id;
		this.rotaId = rotaId;
		this.usuarioId = usuarioId;
	}

	public int getRotaId() {
		return this.rotaId;
	}

	public int getUsuarioId() {
		return this.usuarioId;
	}

	public int getId() {
		return this.id;
	}
}
