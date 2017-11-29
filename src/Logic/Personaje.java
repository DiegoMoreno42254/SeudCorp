/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Random;

/**
 * Logica de los personajes
 *
 * @author Edgar andres Delgado Castellano
 * @author Diego Miguel Moreno Duran
 * @version 1.0
 * @since 28/11/17
 */


public class Personaje {
    
    /**
     * Declaracion de los atributos de los personajes
     */

    //declaramos los atributos del personaje//
    /**
     * Estblecemos los atributos
     */
    private int salud, fisico, fuerza, hp, nivel; //Definimos la salud, ataques fisico y especial, nivel y puntos de golpe //
    private String Nombre;
    
    /**
     * Usamos la libreria Random para establecer las formas de ataque en la batalla por turnos
     */  
    
    private final Random rand = new Random(2);
    /**
     * Se definen los getter y los setter
     */

    //definimos los setter y getter//
    /**
     * @return Obtiene la salud del personaje
     */
    public int getSalud() {
        return salud;
    }

    /**
     * @param salud Fijamos la salud del personaje
     */
    public void setSalud(int salud) {
        this.salud = salud;
    }

    /**
     * @return obtenber El ataque fisico
     */
    public int getFisico() {
        return fisico;
    }

    /**
     * @param fisico Fijamos el ataque fisico del personaje
     */
    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    /**
     * @return los puntos de golpe de la vida
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp fijamos los puntos de golpe del personaje
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @return obtener el nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel fijamos el nivel del personaje
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return Nombre del personaje
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre Fijamos el nombre del personaje
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return obtenemos el ataque especial
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * @param fuerza Fijamos el ataque especial
     */
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    
    /**
     * Determianos el ataque fisico
     * @return Indice de ataque propiciado por el personaje
     */
    //ataques de los jugadores//
    //metodo para  ejecutar el ataque fisico//
    public int ataque_fisico() {
        int aleatorio = rand.nextInt(2);

        return nivel * fisico * aleatorio;
    }
    
    
    /**
     * Determinamos el ataque especial de los personajes
     * @return Indice de ataque especial propiciado por el persionaje
     */
    //Metodo para ejecutar el ataque especial//
    public int ataque_fuerza() {
        if (hp > 0) {
            hp--;
            return nivel * fuerza;
        } else {
            return 0;
        }
    }
    
    /**
     * Se obtiene el daño
     * @param salud Daño recibido al / los afectados
     */

    //daño obtenido//
    public void daño(int salud) {
        this.salud -= salud;

    }
}
