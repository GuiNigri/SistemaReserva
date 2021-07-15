/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemareserva.services;

import Interfaces.Repository.ILogRepository;
import Interfaces.Repository.IUsuarioRepository;
import Interfaces.Services.IUsuarioService;
import entity.LogModel;
import entity.UsuarioModel;
import exceptions.UsuarioExceptions;
import java.sql.Timestamp;

/**
 *
 * @author Nigri
 */
public class UsuarioService implements IUsuarioService {

    private IUsuarioRepository _usuarioRepository;
    private ILogRepository _logRepository;

    public UsuarioService(IUsuarioRepository usuarioRepository, ILogRepository logRepository) {
        _usuarioRepository = usuarioRepository;
        _logRepository = logRepository;
    }

    @Override
    public UsuarioModel logar(String cpf, String senha) throws UsuarioExceptions {
        if (cpf.equals("") || senha.equals("")) {
            throw new UsuarioExceptions("Todos os campos precisam estar preenchidos");
        }
        
        UsuarioModel usuarioModel = _usuarioRepository.logar(cpf, senha);
        
        _logRepository.create(new LogModel(new Timestamp(System.currentTimeMillis()), usuarioModel.getId(), "Logar", usuarioModel.getCpf()));
        
        return usuarioModel;
    }

    @Override
    public void cadastrar(UsuarioModel usuarioModel) throws UsuarioExceptions {
        if (usuarioModel.getNome().equals("") || usuarioModel.getCpf().equals("") || usuarioModel.getSenha().equals("")) {
            throw new UsuarioExceptions("Todos os campos precisam estar preenchidos");
        }
        
        if(usuarioModel.getCpf().length() != 11){
            throw new UsuarioExceptions("Erro no CPF");
        }

        _usuarioRepository.cadastrar(usuarioModel);
        
        _logRepository.create(new LogModel(new Timestamp(System.currentTimeMillis()), usuarioModel.getId(), "Cadastrar Usuario", usuarioModel.getCpf()));

    }

}
