package org.example.Infrastructure.Models;
import java.util.Date;
public class MovimientoModels {
    public int IdMovimiento;
    public int IdCuenta;
    public Date FechaMovimiento;
    public String TipoMovimento;
    public double SaldoAnterior ;
    public double SaldoActual;
    public double MontoMovimiento;
    public double CuentaOrigen;
    public double CuentaDestino;
    public double Canal;

    public int getIdMovimiento() {
        return IdMovimiento;
    }

    public void setIdMovimiento(int IdMovimiento) {
        this.IdMovimiento = IdMovimiento;
    }

    public int getIdCuenta() {
        return IdCuenta;
    }

    public void setIdCuenta(int IdCuenta) {
        this.IdCuenta = IdCuenta;
    }

    public Date getFechaMovimiento() {
        return FechaMovimiento;
    }

    public void setFechaMovimiento(Date FechaMovimiento) {
        this.FechaMovimiento = FechaMovimiento;
    }

    public String getTipoMovimento() {
        return TipoMovimento;
    }

    public void setTipoMovimento(String TipoMovimento) {
        this.TipoMovimento = TipoMovimento;
    }

    public double getSaldoAnterior() {
        return SaldoAnterior;
    }

    public void setSaldoAnterior(double SaldoAnterior) {
        this.SaldoAnterior = SaldoAnterior;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public double getMontoMovimiento() {
        return MontoMovimiento;
    }

    public void setMontoMovimiento(double MontoMovimiento) {
        this.MontoMovimiento = MontoMovimiento;
    }

    public double getCuentaOrigen() {
        return CuentaOrigen;
    }

    public void setCuentaOrigen(double CuentaOrigen) {
        this.CuentaOrigen = CuentaOrigen;
    }

    public double getCuentaDestino() {
        return CuentaDestino;
    }

    public void setCuentaDestino(double CuentaDestino) {
        this.CuentaDestino = CuentaDestino;
    }

    public double getCanal() {
        return Canal;
    }

    public void setCanal(double Canal) {
        this.Canal = Canal;
    }

}
