/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Repository;

import entity.RotaModel;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Nigri
 */
public interface IRotaRepository {
    List<RotaModel> getRotas();
    RotaModel getRotaById(UUID rotaId);
}
