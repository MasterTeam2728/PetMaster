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

    @ManyToOne(optional = false)
    private Empleado encargado;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nit",nullable = false)
    @JsonIgnoreProperties(value = "movimientos")
    private Empresa empresaMovimiento;

    public MovimientoDinero() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Empresa getEmpresaMovimiento() {
        return empresaMovimiento;
    }

    public void setEmpresaMovimiento(Empresa empresaMovimiento) {
        this.empresaMovimiento = empresaMovimiento;
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
