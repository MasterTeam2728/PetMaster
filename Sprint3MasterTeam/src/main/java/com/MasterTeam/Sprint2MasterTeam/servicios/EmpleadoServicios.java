package com.MasterTeam.Sprint2MasterTeam.servicios;


import com.MasterTeam.Sprint2MasterTeam.entidades.Empleado;
import com.MasterTeam.Sprint2MasterTeam.repositorios.EmpleadoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServicios {

    private EmpleadoRepositorio repositorioEmple;

    public EmpleadoServicios(EmpleadoRepositorio repositorioEmple) {
        this.repositorioEmple = repositorioEmple;
    }

    //metodo para consultar todos los usuarios
    public List<Empleado> getlistaEmplea(){
        return this.repositorioEmple.findAll();
    }
    
    //metodo para crear un usuario
    public Empleado crearEmpleado(Empleado nuevoEmpleado){
        return this.repositorioEmple.save(nuevoEmpleado);
    }

    //metodo para consultar un usuario
    public Empleado getLlamarEmpleado(Long id){
        return this.repositorioEmple.findById(id).orElseThrow();
    }

    //metodo para editar un usuario
    public Empleado actualizarEmple(Long id, Empleado e){
        Empleado empleadoActual = repositorioEmple.findById(id).orElseThrow();
        empleadoActual.setNombre(e.getNombre());
        empleadoActual.setCorreo(e.getCorreo());
        empleadoActual.setRol(e.getRol());
        empleadoActual.setEmpresaEmpleado(e.getEmpresaEmpleado());
        return this.repositorioEmple.save(empleadoActual);
    }
    //metodo para eliminar un usuario
    public Empleado eliminarEmple(Long id){
        Empleado empleadoActual = repositorioEmple.findById(id).orElseThrow(); //pero esta, muestra lo que se borró
        this.repositorioEmple.deleteById(id);  //solo con esta línea funciona
        //crearPaciente(pacienteActual);
        return empleadoActual;
    }

}
