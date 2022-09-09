package com.MasterTeam.Sprint2MasterTeam.servicios;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empleado;
import com.MasterTeam.Sprint2MasterTeam.repositorios.UsuarioRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicios {

    private UsuarioRepositorio repositorioUsu;

    public UsuarioServicios(UsuarioRepositorio repositorioUsu) {
        this.repositorioUsu = repositorioUsu;
    }

    //metodo para consultar todos los usuarios
    public List<Empleado> getlistaEmplea(){
        return repositorioUsu.findAll();
    }
    
    //metodo para crear un usuario
    public Empleado crearEmpleado(Empleado nuevoEmpleado){
        return repositorioUsu.save(nuevoEmpleado);
    }

    //metodo para consultar un usuario
    //metodo para editar un usuario
    //metodo para eliminar un usuario


}
