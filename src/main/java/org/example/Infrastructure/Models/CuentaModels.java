package org.example.Infrastructure.Models;
import java.util.Date;
public class CuentaModels {
    public int Id;
    public int IdCliente;
    public String NroCuenta;
    public Date FechaAlta;
    public String TipoCuenta ;
    public String Estado;
    public double Saldo;
    public double nroContrato;
    public double CostoMantenimiento;
    public String PromedioAcreditacion;
    public String Moneda;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNroCuenta() {
        return NroCuenta;
    }

    public void setNroCuenta(String NroCuenta) {
        this.NroCuenta = NroCuenta;
    }

    public Date getFechaAlta() {
        return FechaAlta;
    }

    public void setFechaAlta(Date FechaAlta) {
        this.FechaAlta = FechaAlta;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getNroContrato() {
        return nroContrato;
    }

    public void setNroContrato(double nroContrato) {
        this.nroContrato = nroContrato;
    }

    public double getCostoMantenimiento() {
        return CostoMantenimiento;
    }

    public void setCostoMantenimiento(double CostoMantenimiento) {
        this.CostoMantenimiento = CostoMantenimiento;
    }

    public String getPromedioAcreditacion() {
        return PromedioAcreditacion;
    }

    public void setPromedioAcreditacion(String PromedioAcreditacion) {
        this.PromedioAcreditacion = PromedioAcreditacion;
    }

    public String getMoneda() {
        return Moneda;
    }

    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }


}
