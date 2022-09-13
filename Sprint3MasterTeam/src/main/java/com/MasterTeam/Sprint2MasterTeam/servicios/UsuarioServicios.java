package com.MasterTeam.Sprint2MasterTeam.servicios;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empleado;
import com.MasterTeam.Sprint2MasterTeam.entidades.Empresa;
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
    public Empleado getLlamarUsuarios(Long id){
        return this.repositorioUsu.findById(id).orElseThrow();
    }

    //metodo para editar un usuario
    public Empleado actualizarU(Long id, Empleado p){
        Empleado usuarioActual = repositorioUsu.findById(id).orElseThrow();
        usuarioActual.setNombre(p.getNombre());
        usuarioActual.setCorreo(p.getCorreo());
        usuarioActual.setEmpresaEmpleado(p.getEmpresaEmpleado());
        usuarioActual.setRol(p.getRol());
        return this.repositorioUsu.save(usuarioActual);
    }
    //metodo para eliminar un usuario
    public Empleado eliminarU(Long id){
        Empleado usuarioActual = repositorioUsu.findById(id).orElseThrow(); //pero esta, muestra lo que se borró
        this.repositorioUsu.deleteById(id);  //solo con esta línea funciona
        //crearPaciente(pacienteActual);
        return usuarioActual;
    }

}
