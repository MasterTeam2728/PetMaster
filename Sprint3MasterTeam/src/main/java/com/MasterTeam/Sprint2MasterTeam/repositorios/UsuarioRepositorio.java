package com.MasterTeam.Sprint2MasterTeam.repositorios;


import com.MasterTeam.Sprint2MasterTeam.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}
