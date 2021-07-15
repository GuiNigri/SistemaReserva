/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Timestamp;
import java.util.UUID;

/**
 *
 * @author Nigri
 */
public class LogModel {

    private Timestamp timestamp;
    private UUID usuarioId;
    private String acao;
    private String valor;

    public LogModel(Timestamp timestamp, UUID usuarioId, String acao, String valor) {
        this.timestamp = timestamp;
        this.usuarioId = usuarioId;
        this.acao = acao;
        this.valor = valor;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public UUID getUsuarioId() {
        return this.usuarioId;
    }

    public String getAcao() {
        return this.acao;
    }

    public String getValor() {
        return this.valor;
    }
}
