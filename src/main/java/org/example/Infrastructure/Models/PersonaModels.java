package org.example.Infrastructure.Models;
import java.util.Date;
public class PersonaModels {


    public int Id;
    public int IdCiudad;
    public String Nombre;
    public String Apellido;
    public String TipoDocumento;
    public String NroDocumento;
    public String Direccion;
    public String Celular;
    public String Email;
    public String Estado;
    
    public PersonaModels(int Id, int IdCiudad, String Nombre, String Apellido, String TipoDocumento, String NroDocumento, String Direccion, String Celular, String Email, String estado) {
        this.Id = Id;
        this.IdCiudad = IdCiudad;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.TipoDocumento = TipoDocumento;
        this.NroDocumento = NroDocumento;    
        this.Direccion = Direccion;
        this.Celular = Celular;
        this.Email = Email;
        this.Estado = estado;
    }

    public int getId_persona() {
        return Id;
    }

    public void setId_persona(int id_persona) {
        this.Id = id_persona;
    }

    public int getId_ciudad() {
        return IdCiudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.IdCiudad = id_ciudad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public String getNroDocumento() {
        return NroDocumento;
    }

    public void setNroDocumento(String NroDocumento) {
        this.NroDocumento = NroDocumento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }
}
