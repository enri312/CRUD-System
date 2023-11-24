package org.example;

//import org.example.Infrastructure.Models.PersonaModels;
//import org.example.Service.Contactos.PersonaService;
import org.example.Presentation.Contactos.MenuJF;

public class Main {

    public static void main(String[] args) {
//        PersonaService personaService = new PersonaService("postgres", "12345", "localhos", "15432", "postgres");
//        PersonaModels persona = new PersonaModels();
//        persona.Nombre = "Juan";
//        persona.Apellido = "Perez";
//        personaService.RegistrarPersona(persona);

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new MenuJF().setVisible(true);
        }
    });
    }
}
