package com.MasterTeam.Sprint2MasterTeam.controladores;

import com.MasterTeam.Sprint2MasterTeam.servicios.UsuarioServicios;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosControlador {

    UsuarioServicios serviciosUsu;

    public UsuariosControlador(UsuarioServicios serviciosUsu){
        this.serviciosUsu = serviciosUsu;
    }

    //El sistema devuelve reponses 200 en la ruta /users con los siguientes verbos:
    //GET, POST

    //El sistema devuelve responses 200 en la ruta /user/[id] con los siguientes verbos:
    //GET, PATCH, DELETE

}
