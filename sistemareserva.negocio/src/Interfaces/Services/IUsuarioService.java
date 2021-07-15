/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Services;

import entity.UsuarioModel;
import exceptions.UsuarioExceptions;

/**
 *
 * @author Nigri
 */
public interface IUsuarioService {
    UsuarioModel logar(String cpf, String senha) throws UsuarioExceptions;
    void cadastrar(UsuarioModel usuarioModel) throws UsuarioExceptions;
}
