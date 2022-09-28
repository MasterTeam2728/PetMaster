package com.MasterTeam.Sprint2MasterTeam.servicios;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empresa;
import com.MasterTeam.Sprint2MasterTeam.repositorios.EmpresaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServicios {

    private EmpresaRepositorio repositorioEmpre;

    public EmpresaServicios(EmpresaRepositorio repositorioEmpre){
        this.repositorioEmpre = repositorioEmpre;
    }

    //metodo para consultar todas las empresas
    public List<Empresa> getlistaEmpresas() {
        return this.repositorioEmpre.findAll();
    }

    //metodo para consultar una empresa
    public Empresa getLlamarEmpresas(Long id){
        return this.repositorioEmpre.findById(id).orElseThrow();
    }


    //metodo para crear una empresa
    public Empresa crearEmpresa(Empresa nuevaEmpresa){
        return repositorioEmpre.save(nuevaEmpresa);
    }


    //metodo para editar una empresa
    public Empresa actualizarE(Long id, Empresa emp){
        Empresa empresaActual = repositorioEmpre.findById(id).orElseThrow();
        empresaActual.setNombreEmpresa(emp.getNombreEmpresa());
        empresaActual.setDireccion(emp.getDireccion());
        empresaActual.setTelefono(emp.getTelefono());
        //empresaActual.setNit(emp.getNit());
        return this.repositorioEmpre.save(empresaActual);
    }

    //metodo para eliminar una empresa
    public Empresa eliminarE(Long id){
        Empresa empresaActual = repositorioEmpre.findById(id).orElseThrow(); //pero esta, muestra lo que se borró
        this.repositorioEmpre.deleteById(id);  //solo con esta línea funciona
        //crearPaciente(pacienteActual);
        return empresaActual;
    }



}
