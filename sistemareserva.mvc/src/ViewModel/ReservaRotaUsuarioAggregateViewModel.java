/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModel;

import java.util.UUID;

/**
 *
 * @author Nigri
 */
public class ReservaRotaUsuarioAggregateViewModel {

    private UUID id;
    private String origem;
    private String destino;
    private String valor;

    public ReservaRotaUsuarioAggregateViewModel(UUID id, String origem, String destino, double valor) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.valor = Formatter.currency(valor);
    }
    
    public UUID getId(){
        return this.id;
    }
    
    public String getOrigem(){
        return this.origem;
    }
    
    public String getDestino(){
        return this.destino;
    }
    
    public String getValor(){
        return this.valor;
    }
}
