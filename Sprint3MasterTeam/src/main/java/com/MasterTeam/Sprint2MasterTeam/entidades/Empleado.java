package com.MasterTeam.Sprint2MasterTeam.entidades;

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class Empleado {
    //Nicolas Ortiz coding
    @Id
    private long documentoIdentidad;

    @Column(name="nombre")
    private String nombre;

    @Column(name="correo")
    private String correo;

    @Column(name="rol")
    private String rol;

    @ManyToOne(optional = false)
    @JoinColumn(name = "nit")
    private Empresa empresaEmpleado;

    //Constructor Vacio
    public Empleado() {
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

    public long getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(long documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
}
