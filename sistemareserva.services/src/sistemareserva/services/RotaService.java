/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemareserva.services;

import Interfaces.Repository.IRotaRepository;
import Interfaces.Services.IRotaService;
import entity.RotaModel;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Nigri
 */
public class RotaService implements IRotaService{

    private IRotaRepository _rotaRepository;
    
    public RotaService(IRotaRepository rotaRepository){
        _rotaRepository = rotaRepository;
    }
    
    @Override
    public List<RotaModel> getRotas() {
        return _rotaRepository.getRotas();
    }

    @Override
    public RotaModel getRotaById(UUID rotaId) {
        return _rotaRepository.getRotaById(rotaId);
    }
    
}
