package com.MasterTeam.Sprint2MasterTeam.controladores;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empleado;
import com.MasterTeam.Sprint2MasterTeam.servicios.EmpleadoServicios;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class EmpleadoControlador {

    EmpleadoServicios serviciosUsu;

    public EmpleadoControlador(EmpleadoServicios serviciosUsu){
        this.serviciosUsu = serviciosUsu;
    }

    //El sistema devuelve reponses 200 en la ruta /users con los siguientes verbos:
    //GET, POST

    //METODO CONSULTA DE USUARIOS
    /*@GetMapping("/users")
    public List<Empleado> listaUsuario(){
        return serviciosUsu.getlistaEmplea();
    }
     */

    // METODO CREAR UN USUARIO
    @PostMapping("/users")
    public RedirectView crearEmpleado(@ModelAttribute Empleado u, Model model){
        model.addAttribute(u);
        this.serviciosUsu.crearEmpleado(u);
        return new RedirectView("/users");
    }

    //El sistema devuelve responses 200 en la ruta /user/[id] con los siguientes verbos:
    //GET, PATCH, DELETE

    /*@GetMapping("/users/{id}")
    public Empleado LlamarUsuario(@PathVariable Long id){return this.serviciosUsu.getLlamarUsuarios(id);    }
     */

    @PutMapping("/users/{id}")
    public RedirectView actualizarEmpleado(@PathVariable Long id, Empleado actEmple){
    this.serviciosUsu.actualizarEmple(id, actEmple);
        return new RedirectView("/users");

    }

    @DeleteMapping("/user/{id}")
    public RedirectView eliminarUsuario(@PathVariable(value = "id") Long id){
        this.serviciosUsu.eliminarEmple(id);
        return new RedirectView("/users");
    }



}
