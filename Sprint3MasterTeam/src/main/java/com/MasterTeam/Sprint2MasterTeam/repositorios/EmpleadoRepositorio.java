package com.MasterTeam.Sprint2MasterTeam.repositorios;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {
}
