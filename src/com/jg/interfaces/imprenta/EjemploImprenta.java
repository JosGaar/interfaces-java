package com.jg.interfaces.imprenta;

import com.jg.interfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("Resumen laboral...", new Persona("John", "Daeh"), "Ing. en Sistemas");
        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Angular");

        Libro libro = new Libro(
                new Persona("Erich", "Gamma"),"Patrones de diseños: Elem. Reusables POO",
                Genero.PROGRAMACION);

        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe("Estudio sobre microservicios",
                new Persona("Martin", "Fowler"),
                new Persona("James", "Gosling"));

        Imprimible.imprimir(cv);
        Imprimible.imprimir(informe);
        Imprimible.imprimir(libro);

        Imprimible objImp = new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto generico de una clase anonima.";
            }
        };
        Imprimible.imprimir(objImp);

        System.out.println(Imprimible.TEXTO_DEFECTO);
    }


}
