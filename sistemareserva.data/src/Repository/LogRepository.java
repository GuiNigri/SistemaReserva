/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Interfaces.Repository.ILogRepository;
import entity.LogModel;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Nigri
 */
public class LogRepository implements ILogRepository{
    private List<LogModel> _dbContext;
    
    public LogRepository(){
        _dbContext = new LinkedList<>();
    }
    
    @Override
    public void create(LogModel logModel){
        _dbContext.add(logModel);
    }
    
    @Override
    public List<LogModel> getLogs(){
        return _dbContext;
    }
}
