package com.MasterTeam.Sprint2MasterTeam.controladores;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empresa;
import com.MasterTeam.Sprint2MasterTeam.servicios.EmpresaServicios;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpresaControlador {

    EmpresaServicios serviciosEmpre;

    public EmpresaControlador(EmpresaServicios serviciosEmpre){
        this.serviciosEmpre = serviciosEmpre;
    }

    //El sistema devuelve responses 200 en la ruta /enterprises con los siguientes verbos:
    //GET, POST

    //Metodo consultar todas las empresas
    @GetMapping("/enterprises")
    public List<Empresa> listaEmpresas(){
        return serviciosEmpre.getlistaEmpre();
    }

    //Metodo crear una Empresa
    @PostMapping("/enterprises")
    public Empresa crearEmpresa(@RequestBody Empresa e){
        return serviciosEmpre.crearEmpresa(e);
    }


    // El sistema devuelve responses 200 en la ruta /enterprises/[id] con los siguientes verbos:
    //GET, PATCH, DELETE

}
