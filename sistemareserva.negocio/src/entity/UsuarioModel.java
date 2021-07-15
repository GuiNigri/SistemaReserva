package entity;

import java.util.UUID;

public class UsuarioModel {

    private UUID id;
    private String nome;
    private String cpf;
    private String senha;

    public UsuarioModel(String nome, String cpf, String senha) {
        setId();
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public UUID getId() {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID();
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getSenha() {
        return this.senha;
    }

    @Override
    public boolean equals(Object obj) {
        UsuarioModel outroUsuarioModel = (UsuarioModel) obj;
        return this.cpf.equals(outroUsuarioModel.getCpf());
    }

    @Override
    public int hashCode() {
        return this.cpf.charAt(0);
    }
}
