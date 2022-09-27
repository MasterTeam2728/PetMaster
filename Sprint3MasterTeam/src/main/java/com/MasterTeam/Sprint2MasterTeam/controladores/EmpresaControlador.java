package com.MasterTeam.Sprint2MasterTeam.controladores;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empresa;
import com.MasterTeam.Sprint2MasterTeam.servicios.EmpresaServicios;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

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
    /*@GetMapping("/enterprises")
    public List<Empresa> listaEmpresas(){
        return serviciosEmpre.getlistaEmpresas();
    }
     */

    //Metodo crear una Empresa
    @PostMapping("/enterprises")
    public RedirectView crearEmpresa(@ModelAttribute Empresa ep, Model model){
        model.addAttribute(ep);
        this.serviciosEmpre.crearEmpresa(ep);
        return new RedirectView("/enterprises");
    }


    // El sistema devuelve responses 200 en la ruta /enterprises/[id] con los siguientes verbos:
    //GET, PATCH, DELETE
    /*@GetMapping("/enterprises/{id}")
    public Empresa LlamarEmpresa(@PathVariable Long id){return this.serviciosEmpre.getLlamarEmpresas(id);    }
     */

    @PutMapping("/enterprises/{id}")
    public RedirectView actualizarEmpresa(@PathVariable Long id, Empresa actEmpresa){
        this.serviciosEmpre.actualizarE(id, actEmpresa);
        return new RedirectView("/enterprises");
    }

    @DeleteMapping("/enterprises/{id}")
    public RedirectView eliminarEmpresa(@PathVariable(value = "id") Long id){
        this.serviciosEmpre.eliminarE(id);
        return new RedirectView("/enterprises");
    }

}
