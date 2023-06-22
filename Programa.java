package br.com.devsgeeknerd.zoologico.classes;

import br.com.devsgeeknerd.zoologico.classes.Animal;

public class Programa {
    public static void main(String[] args) {
        Animal cachorro = new Animal();
        cachorro.setNome("Toto");
        cachorro.setIdade(2);
        cachorro.setEspecie("cachorro");

        System.out.println("Ola, seu animal é " + cachorro.getEspecie() + ", o nome do " + " animal é "
                + cachorro.getNome() + " e ele tem " + cachorro.getIdade() + " anos.");

        if (cachorro.ehAdulto()) {
            System.out.println("Animal adulto");
        } else {
            System.out.println("Animal não é adulto");
        }
    }
}
