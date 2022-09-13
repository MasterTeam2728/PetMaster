package com.MasterTeam.Sprint2MasterTeam.controladores;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empleado;
import com.MasterTeam.Sprint2MasterTeam.entidades.Empresa;
import com.MasterTeam.Sprint2MasterTeam.servicios.UsuarioServicios;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuariosControlador {

    UsuarioServicios serviciosUsu;

    public UsuariosControlador(UsuarioServicios serviciosUsu){
        this.serviciosUsu = serviciosUsu;
    }

    //El sistema devuelve reponses 200 en la ruta /users con los siguientes verbos:
    //GET, POST

    //METODO CONSULTA DE USUARIOS
    @GetMapping("/users")
    public List<Empleado> listaUsuario(){
        return serviciosUsu.getlistaEmplea();
    }

    // METODO CREAR UN USUARIO
    @PostMapping("/users")
    public Empleado crearUsuario(@RequestBody Empleado u){
        return serviciosUsu.crearEmpleado(u);
    }

    //El sistema devuelve responses 200 en la ruta /user/[id] con los siguientes verbos:
    //GET, PATCH, DELETE

    @GetMapping("/users/{id}")
    public Empleado LlamarUsuario(@PathVariable Long id){return this.serviciosUsu.getLlamarUsuarios(id);    }

    @PutMapping("/users/{id}")
    public Empleado actualizarUsuario(@PathVariable Long id, @RequestBody Empleado actUsuario){
        return this.serviciosUsu.actualizarU(id, actUsuario);
    }

    @DeleteMapping("/users/{id}")
    public Empleado eliminarUsuario(@PathVariable(value = "id") Long id){
        return this.serviciosUsu.eliminarU(id);
    }



}
