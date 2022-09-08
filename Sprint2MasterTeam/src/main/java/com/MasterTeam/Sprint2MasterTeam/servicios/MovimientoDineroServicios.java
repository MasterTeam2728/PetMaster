package com.MasterTeam.Sprint2MasterTeam.servicios;

import com.MasterTeam.Sprint2MasterTeam.repositorios.MovimientoDineroRepositorio;
import org.springframework.stereotype.Service;

@Service
public class MovimientoDineroServicios {

    private MovimientoDineroRepositorio repositorioMov;

    public MovimientoDineroServicios(MovimientoDineroRepositorio repositorioMov){
        this.repositorioMov = repositorioMov;
    }

}
