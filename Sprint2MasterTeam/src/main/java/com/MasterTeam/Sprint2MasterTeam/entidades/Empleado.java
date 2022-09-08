package com.MasterTeam.Sprint2MasterTeam.entidades;

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class Empleado {
    //Nicolas Ortiz coding
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="correo")
    private String correo;

    @Column(name="rol")
    private String rol;

    @Transient
    private Empresa empresaEmpleado;

    public Empleado() {
    }

    public Empleado(String nombre, String correo, Empresa empresaEmpleado, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresaEmpleado = empresaEmpleado;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(Empresa empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", empresaEmpleado='" + empresaEmpleado + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
