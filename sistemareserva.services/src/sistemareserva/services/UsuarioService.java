/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemareserva.services;

import Interfaces.Repository.IUsuarioRepository;
import Interfaces.Services.IUsuarioService;
import entity.UsuarioModel;
import exceptions.UsuarioExceptions;

/**
 *
 * @author Nigri
 */
public class UsuarioService implements IUsuarioService {

    private IUsuarioRepository _usuarioRepository;

    public UsuarioService(IUsuarioRepository usuarioRepository) {
        _usuarioRepository = usuarioRepository;
    }

    @Override
    public UsuarioModel logar(String cpf, String senha) throws UsuarioExceptions {
        if (cpf.equals("") || senha.equals("")) {
            throw new UsuarioExceptions("Todos os campos precisam estar preenchidos");
        }
        
        return _usuarioRepository.logar(cpf, senha);
    }

    @Override
    public void cadastrar(UsuarioModel usuarioModel) throws UsuarioExceptions {
        if (usuarioModel.getNome().equals("") || usuarioModel.getCpf().equals("") || usuarioModel.getSenha().equals("")) {
            throw new UsuarioExceptions("Todos os campos precisam estar preenchidos");
        }

        _usuarioRepository.cadastrar(usuarioModel);

    }

}
