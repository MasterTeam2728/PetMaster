package com.MasterTeam.Sprint2MasterTeam.servicios;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empresa;

import java.util.ArrayList;
import java.util.List;

public class EmpresaServicios {

    Empresa empresa1;
    Empresa empresa2;
    List<Empresa> listaEmpresas;

    //Constructor
    public EmpresaServicios(){
        this.empresa1 = new Empresa( "PetBogota", "kra 18 # 25 - 14", "3187264257", 900735825);
        this.empresa2 = new Empresa( "PetMedellin", "kra 68 # 109 - 14", "3505790767", 900915825);
        this.listaEmpresas = new ArrayList<>();
        listaEmpresas.add(empresa1);
        listaEmpresas.add(empresa2);
    }

    //metodo para consultar todas las empresas
    public List<Empresa> getListaEmpresas() {
        return this.listaEmpresas;
    }

    //metodo para consultar una empresa
    public Empresa getEmpresa1() {
        return this.empresa1;
    }
    public Empresa getEmpresa2() {
        return this.empresa2;
    }

    //metodo para crear una empresa
    //metodo para editar una empresa
    //metodo para eliminar una empresa


}
