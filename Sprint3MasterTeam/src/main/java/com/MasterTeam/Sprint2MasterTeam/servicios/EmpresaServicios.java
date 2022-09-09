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
    //metodo para editar una empresa
    //metodo para eliminar una empresa


}
