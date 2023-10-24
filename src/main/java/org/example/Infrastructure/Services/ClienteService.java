package org.example.Infrastructure.Services;

import org.example.Infrastructure.Models.ClienteModels;

import java.util.List;

public class ClienteService {
    ClienteService clienteDB;
    public ClienteService(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        clienteDB = new ClienteService(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCliente(ClienteModels cliente){
        return clienteDB.registrarCliente(cliente);

    }
    public String ModificarCliente(ClienteModels idCliente){
        return clienteDB.ModificarCliente(idCliente);
    }


    public List<ClienteService> ConsultarCliente(ClienteModels idCliente){
        return  clienteDB.ConsultarCliente(idCliente);
    }

    public String EliminarCliente(ClienteModels idCliente){
        return clienteDB.EliminarCliente(idCliente);
    }


}