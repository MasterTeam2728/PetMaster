package com.MasterTeam.Sprint2MasterTeam.controladores;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empresa;
import com.MasterTeam.Sprint2MasterTeam.servicios.EmpresaServicios;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/enterprises/{id}")
    public Empresa LlamarEmpresa(@PathVariable Long id){return this.serviciosEmpre.getLlamarEmpresas(id);    }

    @PutMapping("/enterprises/{id}")
    public Empresa actualizarEmpresa(@PathVariable Long id, @RequestBody Empresa actEmpresa){
        return this.serviciosEmpre.actualizarE(id, actEmpresa);
    }

    @DeleteMapping("/enterprises/{id}")
    public Empresa eliminarEmpresa(@PathVariable(value = "id") Long id){
        return this.serviciosEmpre.eliminarE(id);
    }


}
