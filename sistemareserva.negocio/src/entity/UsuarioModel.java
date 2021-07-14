package entity;

import java.util.UUID;

public class UsuarioModel {
    private UUID id;
    private String Nome;
    private long Cpf;
    
    public UsuarioModel(String nome, long cpf){
    	setId();
        this.Nome = nome;
        this.Cpf = cpf;
    }

	public UUID getId() {
		return id;
	}

	public void setId() {
		this.id = UUID.randomUUID();
	}
}
