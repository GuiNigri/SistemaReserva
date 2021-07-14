/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interfaces.Services.IRotaService;
import entity.RotaModel;
import java.util.List;

/**
 *
 * @author Nigri
 */
public class RotaController {
    
    private IRotaService _rotaService;
    
    public RotaController(IRotaService rotaService){
        _rotaService = rotaService;
    }
    
    public List<RotaModel> getAll(){
        return _rotaService.getRotas();
    }
}
