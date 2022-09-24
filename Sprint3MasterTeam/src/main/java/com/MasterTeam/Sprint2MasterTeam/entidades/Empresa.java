package com.MasterTeam.Sprint2MasterTeam.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="empresa")
public class Empresa {

    @Id
    private Long nit;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @OneToMany(mappedBy = "empresas")
    @JsonIgnoreProperties(value = "empresas") //se lo agregué para no ver ese ciclo infinito en Json
    private Set<MovimientoDinero> movimientos;

    public Empresa() {
    }

     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public Set<MovimientoDinero> getMovimientos(){
        return movimientos;
    }
    public void setMovimientos(Set<MovimientoDinero> movimientos) {
        this.movimientos = movimientos;
    }
}
