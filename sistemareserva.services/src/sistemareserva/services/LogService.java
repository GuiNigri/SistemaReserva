/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemareserva.services;

import Interfaces.Repository.ILogRepository;
import Interfaces.Services.ILogService;
import entity.LogModel;
import java.util.List;

/**
 *
 * @author Nigri
 */
public class LogService implements ILogService{

    private ILogRepository _logRepository;

    public LogService(ILogRepository logRepository) {
        _logRepository = logRepository;
    }

    @Override
    public void create(LogModel logModel) {
        _logRepository.create(logModel);
    }

    @Override
    public List<LogModel> getLogs() {
        return _logRepository.getLogs();
    }
}
