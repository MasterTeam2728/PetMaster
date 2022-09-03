package com.MasterTeam.Sprint2MasterTeam.servicios;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empleado;
import com.MasterTeam.Sprint2MasterTeam.entidades.Empresa;

import java.util.ArrayList;
import java.util.List;

public class UsuarioServicios {

    Empleado empleado1;
    Empleado empleado2;
    List<Empleado> listaEmpleados;

    EmpresaServicios empresapertenece = new EmpresaServicios();

    //Constructor
    public UsuarioServicios (){
        Empresa emp1 = this.empresapertenece.empresa1;
        Empresa emp2 = this.empresapertenece.empresa2;
        this.empleado1 = new Empleado( "Jhon", "jcovenant@gmail.com", emp1,"Operativo");
        this.empleado2 = new Empleado( "Samuel", "Samyblood@gmail.com", emp2,"Administrador");
        this.listaEmpleados = new ArrayList<>();
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
    }

    //metodo para consultar todos los usuarios
    public List<Empleado> getListaEmpleados() {
        return this.listaEmpleados;
    }

    //metodo para consultar un usuario
    public Empleado getEmpleado1() {
        return this.empleado1;
    }
    public Empleado getEmpleado2() {
        return this.empleado2;
    }

}
