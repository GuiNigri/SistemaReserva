/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Interfaces.Repository.IUsuarioRepository;
import entity.ReservaModel;
import entity.UsuarioModel;
import exceptions.UsuarioExceptions;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nigri
 */
public class UsuarioRepository implements IUsuarioRepository{
        private List<UsuarioModel> _dbContext;

    public UsuarioRepository() {
        _dbContext = new ArrayList<UsuarioModel>();
    }
    
    @Override
    public UsuarioModel logar(String cpf, String senha) throws UsuarioExceptions{
        for(UsuarioModel model : _dbContext){
            if(model.getCpf().equals(cpf) && model.getSenha().equals(senha)){
                return model;
            }
        }
        
        throw new UsuarioExceptions("Usuario ou senha incorretos");
    }

    @Override
    public void cadastrar(UsuarioModel usuarioModel) throws UsuarioExceptions{
        _dbContext.add(usuarioModel);
    }
    
}
