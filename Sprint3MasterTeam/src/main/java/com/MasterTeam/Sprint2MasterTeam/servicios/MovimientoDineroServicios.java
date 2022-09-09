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
    public List<MovimientoDinero> getRepositorioMov(){
        return this.repositorioMov.findAll();
    }

    //metodo para crear un movimiento de dinero
    public MovimientoDinero crearMovimientoDinero(MovimientoDinero nuevaMovDinero){
        return this.repositorioMov.save(nuevaMovDinero);
    }
    public MovimientoDinero eliminarMovimientoDinero(MovimientoDinero eliminarMovDinero) {
        return this.repositorioMov.save(eliminarMovDinero);
    }

}
