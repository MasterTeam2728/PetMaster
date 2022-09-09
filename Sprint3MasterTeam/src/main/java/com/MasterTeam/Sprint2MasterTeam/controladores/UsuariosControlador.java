package com.MasterTeam.Sprint2MasterTeam.controladores;

import com.MasterTeam.Sprint2MasterTeam.servicios.UsuarioServicios;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Usuario> listaUsuario(){
        return serviciosUsu.getlistaUsu();
    }

    // METODO CONSULTA DE UN USUARIO
    @PostMapping("/users")
    public Usuario crearUsuario(@RequestBody Usuario u){
        return serviciosUsu.crearUsuario(u);
    }
    //El sistema devuelve responses 200 en la ruta /user/[id] con los siguientes verbos:
    //GET, PATCH, DELETE

}
