/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Services;

import entity.RotaModel;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Nigri
 */
public interface IRotaService {
    List<RotaModel> getRotas();
    RotaModel getRotaById(UUID rotaId);
}
