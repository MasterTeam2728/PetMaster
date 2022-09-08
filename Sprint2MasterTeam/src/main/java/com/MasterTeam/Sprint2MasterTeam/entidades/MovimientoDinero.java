package com.MasterTeam.Sprint2MasterTeam.entidades;

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

    @Transient
    private Empleado encargado;

    public MovimientoDinero() {
    }

    public MovimientoDinero(double monto, String concepto, Empleado encargado) {
        this.monto = monto;
        this.concepto = concepto;
        this.encargado = encargado;
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

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "monto=" + monto +
                ", concepto='" + concepto + '\'' +
                ", usuario='" + encargado + '\'' +
                '}';
    }
}
