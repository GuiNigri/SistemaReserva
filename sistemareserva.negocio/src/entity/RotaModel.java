package entity;

import java.util.UUID;

public class RotaModel {
    private UUID id;
    private String destino;
    private String origem;
    private double valor;
    
    public RotaModel(String destino, String origem, double valor){
        setId();
        this.destino = destino;
        this.origem = origem;
        this.valor = valor;
    }
    
    private void setId(){
        this.id = UUID.randomUUID();
    }
    
    public UUID getID(){
        return this.id;
    }
    
    public String getDestino(){
        return this.destino;
    }
    
    public String getOrigem(){
        return this.origem;
    }
    
    public double getValor(){
        return this.valor;
    }
}
