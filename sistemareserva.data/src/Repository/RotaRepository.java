/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Interfaces.Repository.IRotaRepository;
import entity.RotaModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nigri
 */
public class RotaRepository implements IRotaRepository{

    private List<RotaModel> _dbContext;
    
    public RotaRepository(){
        _dbContext = new ArrayList<RotaModel>();
        
        _dbContext.add(new RotaModel("Rio de Janeiro", "Sao Paulo", 500));
        _dbContext.add(new RotaModel("Natal", "Rio de Janeiro", 1500));
        _dbContext.add(new RotaModel("Sao Paulo", "New York", 5000));
        _dbContext.add(new RotaModel("Chigago", "Los Angeles", 2500));
    }
    
    @Override
    public List<RotaModel> getRotas() {
        return _dbContext;
    }
    
    
}
