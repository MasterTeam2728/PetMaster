package com.MasterTeam.Sprint2MasterTeam.repositorios;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepositorio extends JpaRepository<Empresa, Long> {
}
