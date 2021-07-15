/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Repository;

import entity.LogModel;
import java.util.List;

/**
 *
 * @author Nigri
 */
public interface ILogRepository {

    void create(LogModel logModel);

    List<LogModel> getLogs();

}
