package org.example.Infrastructure.Services;

import org.example.Infrastructure.Models.MovimientoModels;

import java.util.List;

public class MovimientoService {
    MovimientoService movimientoDB;
    public MovimientoService(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        movimientoDB = new MovimientoService(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String RegistrarMovimiento(MovimientoModels movimiento){
        return movimientoDB.RegistrarMovimiento(movimiento);

    }
    public String ModificarMovimiento(MovimientoModels movimiento){
        return movimientoDB.ModificarMovimiento(movimiento);
    }

    public List<MovimientoService> ConsultarMovimiento(int idMovimiento){
        return  movimientoDB.ConsultarMovimiento(idMovimiento);
    }

    public String EliminarMovimiento(MovimientoModels idMovimiento){
        return movimientoDB.EliminarMovimiento(idMovimiento);
    }

}