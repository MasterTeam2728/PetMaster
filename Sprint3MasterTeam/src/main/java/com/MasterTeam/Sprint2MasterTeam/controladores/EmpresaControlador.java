package com.MasterTeam.Sprint2MasterTeam.controladores;

import com.MasterTeam.Sprint2MasterTeam.servicios.EmpresaServicios;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaControlador {

    EmpresaServicios serviciosEmpre;

    public EmpresaControlador(EmpresaServicios serviciosEmpre){
        this.serviciosEmpre = serviciosEmpre;
    }
    //El sistema devuelve responses 200 en la ruta /enterprises con los siguientes verbos:
    //GET, POST


    // El sistema devuelve responses 200 en la ruta /enterprises/[id] con los siguientes verbos:
    //GET, PATCH, DELETE

}
