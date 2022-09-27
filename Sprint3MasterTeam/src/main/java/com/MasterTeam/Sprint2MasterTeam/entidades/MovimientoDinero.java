package com.MasterTeam.Sprint2MasterTeam.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="movimientoDinero")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "monto")
    private double monto;

    @Column(name = "concepto")
    private String concepto;

    @ManyToOne(optional = true)
    private Empleado encargado;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nit",nullable = false)
    @JsonIgnoreProperties(value = "movimientos")
    private Empresa empresas;

    public MovimientoDinero() {
    }

    public Empresa getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresa empresas) {
        this.empresas = empresas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getEncargado() {
        return encargado;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }


}
