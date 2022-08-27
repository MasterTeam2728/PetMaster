package com.MasterTeam.Sprint2MasterTeam;

public class MovimientoDinero {
    private double montoMovimiento;
    private double monto;
    private String conceptoMovimiento;
    private String usuarioMovimiento;

    public MovimientoDinero(double montoMovimiento, double monto, String conceptoMovimiento, String usuarioMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.monto = monto;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuarioMovimiento = usuarioMovimiento;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getUsuarioMovimiento() {
        return usuarioMovimiento;
    }

    public void setUsuarioMovimiento(String usuarioMovimiento) {
        this.usuarioMovimiento = usuarioMovimiento;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "montoMovimiento=" + montoMovimiento +
                ", monto=" + monto +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", usuarioMovimiento='" + usuarioMovimiento + '\'' +
                '}';
    }
}
