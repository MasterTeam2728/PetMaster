package com.MasterTeam.Sprint2MasterTeam.servicios;

import com.MasterTeam.Sprint2MasterTeam.repositorios.UsuarioRepositorio;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicios {

    private UsuarioRepositorio repositorioUsu;

    public UsuarioServicios(UsuarioRepositorio repositorioUsu){
        this.repositorioUsu = repositorioUsu;
    }

    //metodo para consultar todos los usuarios
    //metodo para consultar un usuario
    //metodo para crear un usuario
    //metodo para editar un usuario
    //metodo para eliminar un usuario


}
