package com.MasterTeam.Sprint2MasterTeam.controladores;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empresa;
import com.MasterTeam.Sprint2MasterTeam.entidades.MovimientoDinero;
import com.MasterTeam.Sprint2MasterTeam.servicios.MovimientoDineroServicios;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoEmpresaControlador {

    MovimientoDineroServicios serviciosMov;

    public MovimientoEmpresaControlador(MovimientoDineroServicios serviciosMov) {
        this.serviciosMov = serviciosMov;
    }
    //El sistema devuelve reponses 200 en la ruta /enterprises/[id]/movements con los siguientes
    //verbos: GET, POST, PATCH, DELETE

    @GetMapping("/enterprises/{id}/movements")
    public MovimientoDinero llamarMovimientoDinero(@PathVariable Long id) {
        return this.serviciosMov.getLlamarMovimientos(id);
    }

    //Metodo crear un movimiento de dinero
    @PostMapping("/enterprises/{id}/movements")
    public MovimientoDinero crearMovimientoDinero(@RequestBody MovimientoDinero Mov) {
        return this.serviciosMov.crearMovimientoDinero(Mov);
    }

    /*@DeleteMapping("/enterprises/{id}/movements")
    public MovimientoDinero eliminarMovimientoDinero(MovimientoDinero DeleteMov){
        return this.serviciosMov.eliminarMovimientoDinero(DeleteMov);
    }
     */


}