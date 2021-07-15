/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interfaces.Services.IRotaService;
import ViewModel.RotaViewModel;
import entity.RotaModel;
import java.util.ArrayList;
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
    
    public List<RotaViewModel> getAll(){
        return modelToViewModel(_rotaService.getRotas());
    }
    
    private List<RotaViewModel> modelToViewModel(List<RotaModel> rotasModel){
        List<RotaViewModel> rotasViewModel = new ArrayList<>();
        
        for(RotaModel rotaModel : rotasModel){
            rotasViewModel.add(new RotaViewModel(rotaModel));
        }
        
        return rotasViewModel;
    }
}
