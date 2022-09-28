package com.MasterTeam.Sprint2MasterTeam.servicios;

import com.MasterTeam.Sprint2MasterTeam.entidades.Usuario;
import com.MasterTeam.Sprint2MasterTeam.repositorios.UsuarioRepositorio;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UsuarioServicios {

    private UsuarioRepositorio repositorioUs;

    //cosntructor
    public UsuarioServicios(UsuarioRepositorio repositorioUs) {
        this.repositorioUs = repositorioUs;
    }

    public UsuarioRepositorio getRepositorioUs() {
        return repositorioUs;
    }

    public void setRepositorioUs(UsuarioRepositorio repositorioUs) {
        this.repositorioUs = repositorioUs;
    }

    //métodos funcionales


    //función que busca al usuario
    public Usuario buscarPorEmail(String email){
        return this.repositorioUs.findByEmail(email);
    }

    //función que guarda a un nuevo usuario
    public Usuario crearUsuario(Usuario nuevoUsuario){
        return this.repositorioUs.save(nuevoUsuario);
    }

    public Usuario getOrCreateUsuario(Map<String, Object> DatosUsuario){
        String email = (String) DatosUsuario.get("email");
        Usuario usuario = buscarPorEmail(email);
        //validamos si el usuario exite o no
        if (usuario == null){
            String alias = (String) DatosUsuario.get("nickname");
            String imagen = (String) DatosUsuario.get("picture");
            String auth0Id = (String) DatosUsuario.get("sub");

            Usuario nuevoUsuario = new Usuario(email=email, imagen=imagen, auth0Id=auth0Id);
            return crearUsuario(nuevoUsuario);
        }
        return usuario;
    }

}
