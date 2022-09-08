package com.MasterTeam.Sprint2MasterTeam.servicios;

import com.MasterTeam.Sprint2MasterTeam.repositorios.EmpresaRepositorio;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServicios {

    private EmpresaRepositorio repositorioEmpre;

    public EmpresaServicios(EmpresaRepositorio repositorioEmpre){
        this.repositorioEmpre = repositorioEmpre;
    }

    //metodo para consultar todas las empresas
    //metodo para consultar una empresa
    //metodo para crear una empresa
    //metodo para editar una empresa
    //metodo para eliminar una empresa


}
