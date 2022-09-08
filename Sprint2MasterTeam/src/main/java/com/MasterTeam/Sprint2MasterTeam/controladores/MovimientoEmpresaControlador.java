package com.MasterTeam.Sprint2MasterTeam.controladores;

import com.MasterTeam.Sprint2MasterTeam.servicios.MovimientoDineroServicios;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovimientoEmpresaControlador {

    MovimientoDineroServicios serviciosMov;

    public MovimientoEmpresaControlador(MovimientoDineroServicios serviciosMov) {
        this.serviciosMov = serviciosMov;
    }
    //El sistema devuelve reponses 200 en la ruta /enterprises/[id]/movements con los siguientes
    //verbos: GET, POST, PATCH, DELETE
}
