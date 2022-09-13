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
    public List<Empresa> getlistaEmpre(){
        return repositorioEmpre.findAll();
    }

    //metodo para crear una empresa
    public Empresa crearEmpresa(Empresa nuevaEmpresa){
        return repositorioEmpre.save(nuevaEmpresa);
    }

    //metodo para consultar una empresa
    public Empresa getLlamarEmpresas(Long id){
        return this.repositorioEmpre.findById(id).orElseThrow();
    }

    //metodo para editar una empresa
    public Empresa actualizarE(Long id, Empresa p){
        Empresa empresaActual = repositorioEmpre.findById(id).orElseThrow();
        empresaActual.setNombre(p.getNombre());
        empresaActual.setDireccion(p.getDireccion());
        empresaActual.setTelefono(p.getTelefono());
        empresaActual.setNit(p.getNit());
        //pacienteActual.setDocumentoIdentidad(p.getDocumentoIdentidad());
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
