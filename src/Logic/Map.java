/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import GUI.Bestiario;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * Logica del mapa del juego
 *
 * @author Edgar andres Delgado Castellano
 * @author Diego Miguel Moreno Duran
 * @version 1.0
 * @since 28/11/17
 */
/**
 * Definimos las ubicaciones de los objetos en el mapa// //El mapa es de una
 * matriz de 10*10//
 *
 * @author SALAAL
 */
//Definimos las ubicaciones de los objetos en el mapa//
//El mapa es de una matriz de 10*10//
public class Map {

    /**
     * definicion de los componentes del juego Camino
     */

    public final int CAMINO = 0;
    /**
     * Heroe
     */
    public final int HEROE = 1;
    /**
     * Boss
     */
    public final int JEFE = 2;
    /**
     * Item
     */
    public final int TESORO = 3;
    /**
     * Muro
     */
    public final int MURO = 4;
    /**
     * Fondo
     */
    public final int FONDO = 9999;
    private final int[][] map = new int[10][10];
    
    
    /**
     * Correcciones y asignacion de objetos en el mapa de juego
     */
    public Map() {
        /**
         * Correcciones de las ubiaciones para el mapa
         */
        for (int[] map1 : map) {
            for (int j = 0; j < map1.length; j++) {
                map1[j] = 0;
            }
        }

        //Correcciones de las ubiaciones para el mapa//
        map[3][2] = 0;
        map[0][0] = 1;
        map[0][4] = 3;
        map[3][1] = 3;
        map[3][2] = 0;
        map[0][9] = 2;
        map[4][4] = 2;
        map[4][8] = 2;
        map[9][1] = 2;
        map[2][0] = 4;
        map[3][0] = 4;
        map[4][0] = 4;
        map[5][0] = 4;
        map[4][2] = 4;
        map[4][6] = 4;
        map[5][8] = 4;
        map[5][4] = 4;
        map[6][9] = 4;
        map[6][9] = 0;
        map[8][0] = 0;
        map [9] [1] = 3;
        map[9][9] = 2;

        for (int i = 0; i < map.length - 1; i++) {
            map[1][i] = 4;
        }

        for (int i = 1; i < map[2].length; i++) {
            map[2][i] = 0;
        }

        for (int i = 2; i < map[2].length; i++) {
            map[3][i] = 4;
        }

        for (int i = 0; i < map.length - 1; i++) {
            map[6][i] = 4;
        }

        for (int i = 9; i < map[7].length; i++) {
            map[7][i] = 4;
        }
        for (int i = 8; i < map[6].length; i++) {
            map[6][i] = 0;
        }

        for (int i = 1; i < map[8].length; i++) {
            map[8][i] = 4;
        }
    }

    /**
     * Creamos el camino que Los heroes tienen que recorrer
     *
     * @return La posicion del heroe
     */
    //Creamos el camino que Los heroes tienen que recorrer//

    public int[] encontrarHeroe() {
        int[] retorno = new int[4];
        for (int i = 0; i < getMap().length; i++) {
            for (int j = 0; j < getMap()[i].length; j++) {
                if (getMap()[i][j] == HEROE) {
                    retorno[0] = i;
                    retorno[1] = j;
                }
            }
        }
        return retorno;
    }

    /**
     * Establecer las direecciones con el teclado Derecha
     *
     * @return movilidad de los heroes
     */
    //Mover hacia la derecha//
    public boolean moveRight() {
        int[] posHeroe = encontrarHeroe();
        try {
            switch (getMap()[posHeroe[0]][posHeroe[1] + 1]) {
                case CAMINO:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0]][posHeroe[1] + 1] = 1;
                    return true;
                //En caso de encontrarnos con un jefe
                case JEFE:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0]][posHeroe[1] + 1] = 1;
                    //generamos un nuevo campo de batalla//
                    Bestiario jFrame = new Bestiario();
                    jFrame.setVisible(true);

                    return true;

                //cuando encontramos un cofre de tesoro
                case TESORO:
                    collectTresure();
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0]][posHeroe[1] + 1] = 1;

                    JOptionPane.showMessageDialog(null, "¡Encontraste una gema!");

                    return true;
                //Si nos topamos con un muro, debemos informar que no puede pasar//
                case MURO:
                    System.out.print("Muro");
                    return false;
                default:
                    break;

            }

        } catch (Exception e) {
            //cuando este llegue al final del pasillo//
            System.out.println("Llego al final del pasillo");
            return false;
        }
        return false;
    }

    /**
     * Mover a la izquierda
     */
    //Mover a la izquierda//
    public boolean moveLeft() {
        int[] posHeroe = encontrarHeroe();
        try {
            switch (getMap()[posHeroe[0]][posHeroe[1] - 1]) {
                case CAMINO:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0]][posHeroe[1] - 1] = 1;

                    return true;
                //En caso de encontrarnos con un jefe//
                case JEFE:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0]][posHeroe[1] - 1] = 1;
                    // Generara un capo de batalla//
                    Bestiario jFrame = new Bestiario();
                    jFrame.setVisible(true);
                //cuando encontramos un cofre de tesoro//
                case TESORO:
                    collectTresure();
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0]][posHeroe[1] - 1] = 1;
                    JOptionPane.showMessageDialog(null, "¡Encontraste una gema!");
                    return true;
                //Si nos topamos con un muro//
                case MURO:
                    System.out.print("Muro");
                    return false;
                default:
                    break;

            }
        } catch (Exception e) {
            System.out.println("Llego al final del pasillo");
            return false;
        }
        return false;
    }

    /**
     * Mover hacia arriba
     */
    //Mover hacia arriba//
    public boolean moveUp() {
        int[] posHeroe = encontrarHeroe();
        try {
            switch (getMap()[posHeroe[0] - 1][posHeroe[1]]) {
                case CAMINO:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0] - 1][posHeroe[1]] = 1;
                    return true;
                //En caso de encontrarnos con un jefe//
                case JEFE:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0] - 1][posHeroe[1]] = 1;
                    //Generara un campo de batalla//
                    Bestiario jFrame = new Bestiario();
                    jFrame.setVisible(true);
                    return true;
                //cuando encontramos un cofre de tesoro//
                case TESORO:
                    collectTresure();
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0] - 1][posHeroe[1]] = 1;
                    JOptionPane.showMessageDialog(null, "¡Encontraste una gema!");
                    return true;
                //Si nos topamos con un muro
                case MURO:
                    System.out.print("Muro");
                    return false;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Llego al final del pasillo");
            return false;
        }
        return false;
    }

    /**
     * Mover hacia abajo
     */
    //Mover hacia abajo//

    public boolean moveDown() {
        int[] posHeroe = encontrarHeroe();
        try {
            switch (getMap()[posHeroe[0] + 1][posHeroe[1]]) {
                case CAMINO:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0] + 1][posHeroe[1]] = 1;
                    return true;
                //En caso de encontrarnos con un jefe//
                case JEFE:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0] + 1][posHeroe[1]] = 1;
                    //Se genera un nuevo campo de batalla//
                    Bestiario jFrame = new Bestiario();
                    jFrame.setVisible(true);
                    return true;
                //cuando encontramos un cofre de tesoro//
                case TESORO:
                    collectTresure();
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0] + 1][posHeroe[1]] = 1;
                    JOptionPane.showMessageDialog(null, "¡Encontraste una gema!");
                    return true;
                //Si nos topamos con un muro//
                case MURO:
                    System.out.print("Muro");
                    return false;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Llego al final del pasillo");
            return false;
        }
        return false;
    }

    /**
     * Verficacion
     */
    //verificamos//
    public void verificar() {
        for (int[] map1 : getMap()) {
            System.out.println(Arrays.toString(map1));
        }
    }

    //Si el cofre se encuentra vacio//
    /**
     * determinar iten
     */
    private void collectTresure() {

        System.out.println("No hay nada todavía");
    }

    /**
     * Se muestra el mapa de juego listo para su uso
     * @return Se retorna el mapa
     */
    public int[][] getMap() {
        return map;
    }
}
