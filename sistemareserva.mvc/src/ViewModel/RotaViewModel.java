/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModel;

import entity.RotaModel;
import java.util.UUID;

/**
 *
 * @author Nigri
 */
public class RotaViewModel {

    private UUID id;
    private String destino;
    private String origem;
    private String valor;

    public RotaViewModel(RotaModel rotaModel) {
        this.id = rotaModel.getID();
        this.destino = rotaModel.getDestino();
        this.origem = rotaModel.getOrigem();;
        this.valor = Formatter.currency(rotaModel.getValor());
    }

    public UUID getID() {
        return this.id;
    }

    public String getDestino() {
        return this.destino;
    }

    public String getOrigem() {
        return this.origem;
    }

    public String getValor() {
        return this.valor;
    }
}
