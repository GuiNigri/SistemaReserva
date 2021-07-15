/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interfaces.Services.ILogService;
import entity.LogModel;
import java.util.List;

/**
 *
 * @author Nigri
 */
public class LogController {

    private ILogService _ILogService;

    public LogController(ILogService logService) {
        _ILogService = logService;
    }
    
    public List<LogModel> getAll(){
        return _ILogService.getLogs();
    }
}
