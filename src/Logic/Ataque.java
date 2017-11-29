/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Random;

/**
 * Metodo principal para la batalla por turnos
 *
 * @author Edgar andres Delgado Castellano
 * @author Diego Miguel Moreno Duran
 * @version 1.0
 * @since 28/11/17
 */
public class Ataque {

    //metodo principal alterno utilizado en caso de que en el juego no se implemente correctamente la batalla//
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //aleatorio se utiliza para implementar el Random en los ataques, Salud para mostrar el estado actual del personaje//
        int aleatorio, salud;
        //determinamos si el personaje es heroe o jefe//
        boolean heroe = true, jefe = true;

        //declaramos los personajes//
        Personaje robocop = new Personaje();
        Personaje seud = new Personaje();
        Personaje hammerbro = new Personaje();
        Personaje hacker = new Personaje();

        //El ramdom es utilizado para ataques con numeros al azar igual o inferiores al asignado por el personaje//
        Random rand;
        rand = new Random(System.nanoTime());

        //definimos los personajes y sus estadisticas iniciales//
        robocop.setFisico(10);
        robocop.setFuerza(20);
        robocop.setNivel(2);
        robocop.setNombre("Robocop");
        robocop.setHp(2);
        robocop.setSalud(100);

        hacker.setFisico(15);
        hacker.setFuerza(10);
        hacker.setNivel(2);
        hacker.setNombre("Hakcer");
        hacker.setHp(2);
        hacker.setSalud(100);

        seud.setFisico(5);
        seud.setFuerza(60);
        seud.setNivel(5);
        seud.setNombre("Seud");
        seud.setHp(10);
        seud.setSalud(100);

        hammerbro.setFisico(10);
        hammerbro.setFuerza(40);
        hammerbro.setNivel(10);
        hammerbro.setNombre("Hammer Bro");
        hammerbro.setHp(10);
        hammerbro.setSalud(200);

        // descripcion inicial de indices de vida//
        System.out.println(robocop.getNombre() + " tiene una vida de :  " + robocop.getSalud());
        System.out.println(hacker.getNombre() + " tiene una vida de :  " + hacker.getSalud());
        System.out.println(seud.getNombre() + " vida: " + seud.getSalud());
        System.out.println(hammerbro.getNombre() + " vida: " + hammerbro.getSalud());

        //implementamos el do while para los ataques por turnos//
        do {
            //ataque del heroe//
            aleatorio = rand.nextInt(1);
            if (aleatorio == 0) {
                salud = robocop.ataque_fisico();

            } else {
                salud = robocop.ataque_fuerza();

            }
            // Mostramos los puntos realizados por ataque//
            System.out.println(robocop.getNombre() + " realizo un ataque de " + salud);
            System.out.println();
            //daño obtenido//
            hammerbro.daño(salud);

            //ataque del heroe//
            aleatorio = rand.nextInt(1);
            if (aleatorio == 0) {
                salud = seud.ataque_fisico();

            } else {
                salud = seud.ataque_fuerza();

            }

            // Mostramos los puntos realizados por ataque//
            System.out.println(seud.getNombre() + " realizo un ataque de " + salud);
            System.out.println();

            //daño obtenido//
            hammerbro.daño(salud);

            aleatorio = rand.nextInt(1);
            if (aleatorio == 0) {
                salud = hacker.ataque_fisico();

            } else {
                salud = hacker.ataque_fuerza();

            }
            // Mostramos los puntos realizados por ataque//
            System.out.println(hacker.getNombre() + " realizo un ataque de " + salud);
            System.out.println();
            //daño obtenido//
            hammerbro.daño(salud);

            //ataque del jefe//
            //turno del jefe//
            if (hammerbro.getSalud() > 0) {
                aleatorio = rand.nextInt(1);
                if (aleatorio == 0) {
                    //si aleatorio es igual a 0, implementara un ataque fisico//
                    salud = hammerbro.ataque_fisico();

                } else {

                    //si aleatorio es superior a 0, implementara un ataque especial//
                    salud = hammerbro.ataque_fuerza();

                }
            }

            // Mostramos los puntos realizados por ataque//
            System.out.println(hammerbro.getNombre() + " realizo un ataque de " + salud);
            System.out.println();

            //se utiliza aleatorio para sortear quien atacara el jefe/ monstruo//
            aleatorio = rand.nextInt(2);

            //si aleatorio es 0//
            if (aleatorio == 0) {
                //Heroe 1 recibe daño//
                robocop.daño(salud);

            } else if (aleatorio == 1) { // si muestra 1//
                //heroe 2 mustra daño//
                seud.daño(salud);

            } else { // si muestra 2//
                //heroe 3 muestra daño//
                hacker.daño(salud);
            }

            //Si los tres heores tiene nivel de salud 0//
            if (robocop.getSalud() <= 0 && seud.getSalud() <= 0 && hacker.getSalud() <= 0) {
                // mueren los heroes y se decalara la derrota//
                heroe = false;
                System.out.println("Derrota");
                System.out.println();
            } else { // Si el jefe/ monstruo llega a 0//
                jefe = false;// Muere el jefe y se declara la victoria//
                System.out.println(" Victoria ");
                System.out.println();
            }

            System.out.println(robocop.getNombre() + " tiene una vida de :  " + robocop.getSalud());
            System.out.println(hacker.getNombre() + " tiene una vida de :  " + hacker.getSalud());
            System.out.println(seud.getNombre() + " vida: " + seud.getSalud());
            System.out.println(hammerbro.getNombre() + " vida: " + hammerbro.getSalud());
            System.out.println();

        } while (heroe == true && jefe == true);// las acciones de turnos re repetiran mientras heores y viilanos sigan vivos//
    }
}
