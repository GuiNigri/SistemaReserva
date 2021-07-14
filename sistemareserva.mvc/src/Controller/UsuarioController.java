/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interfaces.Services.IUsuarioService;
import entity.UsuarioModel;
import exceptions.UsuarioExceptions;

/**
 *
 * @author Nigri
 */
public class UsuarioController{

    private IUsuarioService _usuarioService;
    
    public UsuarioController(IUsuarioService usuarioService){
        _usuarioService = usuarioService;
    }

    public boolean logar(String cpf, String senha) throws UsuarioExceptions{
        return _usuarioService.logar(cpf, senha);
    }


    public void cadastrar(UsuarioModel usuarioModel) throws UsuarioExceptions{
        _usuarioService.cadastrar(usuarioModel);
    }
    
}
