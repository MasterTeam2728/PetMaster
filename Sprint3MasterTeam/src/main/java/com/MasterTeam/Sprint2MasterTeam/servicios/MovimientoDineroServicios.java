package com.MasterTeam.Sprint2MasterTeam.servicios;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empresa;
import com.MasterTeam.Sprint2MasterTeam.entidades.MovimientoDinero;
import com.MasterTeam.Sprint2MasterTeam.repositorios.MovimientoDineroRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoDineroServicios {

    private MovimientoDineroRepositorio repositorioMov;

    public MovimientoDineroServicios(MovimientoDineroRepositorio repositorioMov){
        this.repositorioMov = repositorioMov;
    }
    //metodo para consultar todas los movimientos de dinero
    public MovimientoDinero getLlamarMovimientos(Long id){
        return this.repositorioMov.findById(id).orElseThrow();
    }

    //metodo para crear un movimiento de dinero
    public MovimientoDinero crearMovimientoDinero(MovimientoDinero nuevoMovDinero){
        return this.repositorioMov.save(nuevoMovDinero);
    }

    public List<MovimientoDinero> getlistmovimientos(){return this.repositorioMov.findAll();
    }

    /*public MovimientoDinero eliminarMovimientoDinero(MovimientoDinero eliminarMovDinero) {
        return this.repositorioMov.save(eliminarMovDinero);
    }*/

}
