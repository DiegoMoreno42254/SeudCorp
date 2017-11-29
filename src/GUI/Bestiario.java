/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
/**
 * Importaciones de Librerias
 */
import Logic.Map;
import Logic.Personaje;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Mapa del campo de batalla
 *
 * @author Edgar andres Delgado Castellano
 * @author Diego Miguel Moreno Duran
 * @version 1.0
 * @since 28/11/17
 */
public class Bestiario extends javax.swing.JFrame {

    private Map map;

    /**
     * Se crea un nuevo campo de batalla grilla de una matriz de 8 x 8
     */
    public Bestiario() {
        initComponents();
    }

    private void dibujar() {

        /**
         * Dibujamos los componentes del campo de la batalla Filas 0 al 7
         */
        // Vamos a dibujar el tablero de batalla
        int[][] mapa = map.getMap();

        //pintamos la primera fila
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[0][0] + ".jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[0][1] + ".jpg")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[0][2] + ".jpg")));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[0][3] + ".jpg")));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[0][4] + ".jpg")));
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[0][5] + ".jpg")));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[0][6] + ".jpg")));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[0][7] + ".jpg")));

        //pintamos la segunda fila
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][0] + ".jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][1] + ".jpg")));
        jLabel11.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][2] + ".jpg")));
        jLabel12.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][3] + ".jpg")));
        jLabel13.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][4] + ".jpg")));
        jLabel14.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][5] + ".jpg")));
        jLabel15.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][6] + ".jpg")));
        jLabel16.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][7] + ".jpg")));

        //Pintamos la tercera fila
        jLabel17.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][0] + ".jpg")));
        jLabel18.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][1] + ".jpg")));
        jLabel19.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][2] + ".jpg")));
        jLabel20.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][3] + ".jpg")));
        jLabel21.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][4] + ".jpg")));
        jLabel22.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][5] + ".jpg")));
        jLabel23.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][6] + ".jpg")));
        jLabel24.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][7] + ".jpg")));

        //Pintamos la cuarta fila
        jLabel25.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][0] + ".jpg")));
        jLabel26.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][1] + ".jpg")));
        jLabel27.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][2] + ".jpg")));
        jLabel28.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][3] + ".jpg")));
        jLabel29.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][4] + ".jpg")));
        jLabel30.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][5] + ".jpg")));
        jLabel31.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][6] + ".jpg")));
        jLabel32.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][7] + ".jpg")));

        //Pintamos la quinta Fila
        jLabel33.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][0] + ".jpg")));
        jLabel34.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][1] + ".jpg")));
        jLabel35.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][2] + ".jpg")));
        jLabel36.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][3] + ".jpg")));
        jLabel37.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][4] + ".jpg")));
        jLabel38.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][5] + ".jpg")));
        jLabel39.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][6] + ".jpg")));
        jLabel40.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][7] + ".jpg")));

        //Pintamos la sexta fila
        jLabel41.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][0] + ".jpg")));
        jLabel42.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][1] + ".jpg")));
        jLabel43.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][2] + ".jpg")));
        jLabel44.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][3] + ".jpg")));
        jLabel45.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][4] + ".jpg")));
        jLabel46.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][5] + ".jpg")));
        jLabel47.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][6] + ".jpg")));
        jLabel48.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][7] + ".jpg")));

        //Pintamos la septima fila
        jLabel49.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][0] + ".jpg")));
        jLabel50.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][1] + ".jpg")));
        jLabel51.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][2] + ".jpg")));
        jLabel52.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][3] + ".jpg")));
        jLabel53.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][4] + ".jpg")));
        jLabel54.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][5] + ".jpg")));
        jLabel55.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][6] + ".jpg")));
        jLabel56.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][7] + ".jpg")));

        //Pintamos la ultima  fila
        jLabel57.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][0] + ".jpg")));
        jLabel58.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][1] + ".jpg")));
        jLabel59.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][2] + ".jpg")));
        jLabel60.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][3] + ".jpg")));
        jLabel61.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][4] + ".jpg")));
        jLabel62.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][5] + ".jpg")));
        jLabel63.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][6] + ".jpg")));
        jLabel64.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][7] + ".jpg")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(9, 9));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel5);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel6);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel7);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/10.jpg"))); // NOI18N
        getContentPane().add(jLabel8);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel9);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/8.jpg"))); // NOI18N
        getContentPane().add(jLabel10);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel11);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel12);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel13);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel14);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel15);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel16);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel17);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel18);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel19);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel20);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel21);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel22);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel23);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel24);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/6.jpg"))); // NOI18N
        getContentPane().add(jLabel25);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel26);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel27);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel28);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel29);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel30);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel31);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/9.jpg"))); // NOI18N
        getContentPane().add(jLabel32);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel33);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel34);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel35);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel36);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel37);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel38);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel39);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel40);

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel41);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/7.jpg"))); // NOI18N
        getContentPane().add(jLabel42);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel43);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel44);

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel45);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel46);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel47);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel48);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel49);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel50);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel51);

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel52);

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel53);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel54);

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel55);

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel56);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel57);

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel58);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel59);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel60);

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel61);

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel62);

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/5.jpg"))); // NOI18N
        getContentPane().add(jLabel63);

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/11.jpg"))); // NOI18N
        getContentPane().add(jLabel64);

        jButton1.setText("Regresar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        getContentPane().add(jPanel1);

        jButton3.setText("Ataque");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jPanel2.add(jLabel65);

        getContentPane().add(jPanel2);

        jButton5.setText("Ataque");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jPanel3.add(jLabel66);

        getContentPane().add(jPanel3);

        jButton7.setText("Ataque ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);
        jPanel4.add(jLabel67);

        getContentPane().add(jPanel4);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
    * determinamos el movimiento
    */
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        

        switch (evt.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                System.out.println("derecha");
                map.moveRight();
                dibujar();
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("izquierda");
                map.moveLeft();
                dibujar();
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("abajo");
                map.moveDown();
                dibujar();
                break;
            case KeyEvent.VK_UP:
                System.out.println("Arriba");
                map.moveUp();
                dibujar();
                break;
            default:
                break;
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed
/**
 * Boton para salir del campo de batalla sin pelear
 * @param evt Abandonar el campo de batalla y regresar al mapa
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose(); //desaparece el campo de batalla cual cobarde//

    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * Determinamos el boton para que empiece la batalla con un monstruo
 * @param evt Batalla por turnos
 */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /**
         * Batalla por turnos
         */

//aleatorio se utiliza para implementar el Random en los ataques, Salud para mostrar el estado actual del personaje//
        int aleatorio, salud;
        //determinamos si el personaje es heroe o jefe//
        boolean heroe = true, jefe = true;

        /**
         * declaracion de personajes
         */
        //declaramos los personajes, que son objetos//
        Personaje robocop = new Personaje();
        Personaje seud = new Personaje();
        Personaje hammerbro = new Personaje();
        Personaje hacker = new Personaje();

        //El ramdom es utilizado para ataques con numeros al azar igual o inferiores al asignado por el personaje//
        Random rand;
        rand = new Random(System.nanoTime());

        /**
         * definicion de los atributos iniciales de los personajes
         */
        //definimos los personajes y sus estadisticas iniciales//
        robocop.setFisico(10);
        robocop.setFuerza(20);
        robocop.setNivel(2);
        robocop.setNombre("Julio");
        robocop.setHp(2);
        robocop.setSalud(100);

        hacker.setFisico(15);
        hacker.setFuerza(10);
        hacker.setNivel(2);
        hacker.setNombre("Andres");
        hacker.setHp(2);
        hacker.setSalud(100);

        seud.setFisico(5);
        seud.setFuerza(60);
        seud.setNivel(5);
        seud.setNombre("Diego");
        seud.setHp(10);
        seud.setSalud(100);

        hammerbro.setFisico(10);
        hammerbro.setFuerza(40);
        hammerbro.setNivel(10);
        hammerbro.setNombre("Hammer Bro");
        hammerbro.setHp(10);
        hammerbro.setSalud(200);

        /**
         * descripcion de el nivel inicial de los personajes
         */
        // descripcion inicial de indices de vida//
        System.out.println(robocop.getNombre() + " tiene una vida de :  " + robocop.getSalud());
        System.out.println(hacker.getNombre() + " tiene una vida de :  " + hacker.getSalud());
        System.out.println(seud.getNombre() + " vida: " + seud.getSalud());
        System.out.println(hammerbro.getNombre() + " vida: " + hammerbro.getSalud());

        /**
         * batalla por turnos impelmentando el do-while
         */
        //implementamos el do while para los ataques por turnos//
        do {
            //ataque del heroe//
            /**
             * ataque del heroe 1
             */
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

            /**
             * Ataque del heroe 2
             */
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

            /**
             * Ataque del jefe y determinar el turno
             */
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
            /**
             * determina quien atacara el monstruo/jefe
             */
            //si aleatorio es 0//
            switch (aleatorio) {
                case 0:
                    //Heroe e1 recibe daño//
                    robocop.daño(salud);
                    break;
                case 1:
                    // si muestra 1//
                    //heroe 2 mustra daño//
                    seud.daño(salud);
                    break;
                case 2:
                    // si muestra 2//
                    //heroe 3 muestra daño//
                    hacker.daño(salud);
                    break;
                default:
                    
                    break;
            }
            System.out.println(robocop.getNombre() + " tiene una vida de :  " + robocop.getSalud());
            System.out.println(hacker.getNombre() + " tiene una vida de :  " + hacker.getSalud());
            System.out.println(seud.getNombre() + " vida: " + seud.getSalud());
            System.out.println(hammerbro.getNombre() + " vida: " + hammerbro.getSalud());
            System.out.println();

            /**
             * determinar quien gano la pelea
             */
            //Si los tres heores tiene nivel de salud 0//
            if (robocop.getSalud() <= 0 && seud.getSalud() <= 0 && hacker.getSalud() <= 0) {
                // mueren los heroes y se decalara la derrota//
                heroe = false;
                System.out.println("Derrota");
                System.out.println();
                JOptionPane.showMessageDialog(null, "!Los derroto el Monstruo!");
            } else if(hammerbro.getSalud()<=0){ // Si el jefe/ monstruo llega a 0//
                jefe = false;// Muere el jefe y se declara la victoria//
                System.out.println(" Victoria ");
                System.out.println();
                JOptionPane.showMessageDialog(null, "!Derrotaron al Monstruo!");
            }

            

        } while (heroe == true && jefe == true);// las acciones de turnos re repetiran mientras heores y viilanos sigan vivos//


    }//GEN-LAST:event_jButton3ActionPerformed
/**
 * Boton que se usa para atacar al otro villano
 * @param evt batalla por turnos
 */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        /**
         * Batalla por turnos
         */

//aleatorio se utiliza para implementar el Random en los ataques, Salud para mostrar el estado actual del personaje//
        int aleatorio, salud;
        //determinamos si el personaje es heroe o jefe//
        boolean heroe = true, jefe = true;

        /**
         * declaracion de personajes
         */
        //declaramos los personajes//
        Personaje robocop = new Personaje();
        Personaje seud = new Personaje();
        Personaje goomba = new Personaje();
        Personaje hacker = new Personaje();

        //El ramdom es utilizado para ataques con numeros al azar igual o inferiores al asignado por el personaje//
        Random rand;
        rand = new Random(System.nanoTime());

        /**
         * definicion de los atributos iniciales de los personajes
         */
        //definimos los personajes y sus estadisticas iniciales//
        robocop.setFisico(10);
        robocop.setFuerza(20);
        robocop.setNivel(2);
        robocop.setNombre("Julio");
        robocop.setHp(2);
        robocop.setSalud(100);

        hacker.setFisico(15);
        hacker.setFuerza(10);
        hacker.setNivel(2);
        hacker.setNombre("Andres");
        hacker.setHp(2);
        hacker.setSalud(100);

        seud.setFisico(5);
        seud.setFuerza(60);
        seud.setNivel(5);
        seud.setNombre("Diego");
        seud.setHp(10);
        seud.setSalud(100);

        goomba.setFisico(10);
        goomba.setFuerza(40);
        goomba.setNivel(10);
        goomba.setNombre("Goomba");
        goomba.setHp(10);
        goomba.setSalud(200);

        /**
         * descripcion de el nivel inicial de los personajes
         */
        // descripcion inicial de indices de vida//
        System.out.println(robocop.getNombre() + " tiene una vida de :  " + robocop.getSalud());
        System.out.println(hacker.getNombre() + " tiene una vida de :  " + hacker.getSalud());
        System.out.println(seud.getNombre() + " vida: " + seud.getSalud());
        System.out.println(goomba.getNombre() + " vida: " + goomba.getSalud());

        /**
         * batalla por turnos impelmentando el do-while
         */
        //implementamos el do while para los ataques por turnos//
        do {
            //ataque del heroe//
            /**
             * ataque del heroe 1
             */
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
            goomba.daño(salud);

            /**
             * Ataque del heroe 2
             */
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
            goomba.daño(salud);

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
            goomba.daño(salud);

            /**
             * Ataque del jefe y determinar el turno
             */
            //ataque del jefe//
            //turno del jefe//
            if (goomba.getSalud() > 0) {
                aleatorio = rand.nextInt(1);
                if (aleatorio == 0) {
                    //si aleatorio es igual a 0, implementara un ataque fisico//
                    salud = goomba.ataque_fisico();

                } else {

                    //si aleatorio es superior a 0, implementara un ataque especial//
                    salud = goomba.ataque_fuerza();

                }
            }

            // Mostramos los puntos realizados por ataque//
            System.out.println(goomba.getNombre() + " realizo un ataque de " + salud);
            System.out.println();

            //se utiliza aleatorio para sortear quien atacara el jefe/ monstruo//
            aleatorio = rand.nextInt(2);
            /**
             * determina quien atacara el monstruo/jefe
             */
            //si aleatorio es 0//
            switch (aleatorio) {
                case 0:
                    //Heroe e1 recibe daño//
                    robocop.daño(salud);
                    break;
                case 1:
                    // si muestra 1//
                    //heroe 2 mustra daño//
                    seud.daño(salud);
                    break;
                case 2:
                    // si muestra 2//
                    //heroe 3 muestra daño//
                    hacker.daño(salud);
                    break;
                default:
                    
                    break;
            }
            System.out.println(robocop.getNombre() + " tiene una vida de :  " + robocop.getSalud());
            System.out.println(hacker.getNombre() + " tiene una vida de :  " + hacker.getSalud());
            System.out.println(seud.getNombre() + " vida: " + seud.getSalud());
            System.out.println(goomba.getNombre() + " vida: " + goomba.getSalud());
            System.out.println();

            /**
             * determinar quien gano la pelea
             */
            //Si los tres heores tiene nivel de salud 0//
            if (robocop.getSalud() <= 0 && seud.getSalud() <= 0 && hacker.getSalud() <= 0) {
                // mueren los heroes y se decalara la derrota//
                heroe = false;
                System.out.println("Derrota");
                System.out.println();
                JOptionPane.showMessageDialog(null, "!Los derroto el Monstruo!");
            } else if (goomba.getSalud()<=0){ // Si el jefe/ monstruo llega a 0//
                jefe = false;// Muere el jefe y se declara la victoria//
                System.out.println(" Victoria ");
                System.out.println();
                JOptionPane.showMessageDialog(null, "!Derrotaron al Monstruo!");
            }

            

        } while (heroe == true && jefe == true);// las acciones de turnos re repetiran mientras heores y viilanos sigan vivos//


    }//GEN-LAST:event_jButton5ActionPerformed
/**
 * Batalla con el enemigo
 * @param evt Batalla por turnos
 */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        /**
         * Batalla por turnos
         */

//aleatorio se utiliza para implementar el Random en los ataques, Salud para mostrar el estado actual del personaje//
        int aleatorio, salud;
        //determinamos si el personaje es heroe o jefe//
        boolean heroe = true, jefe = true;

        /**
         * declaracion de personajes
         */
        //declaramos los personajes//
        Personaje robocop = new Personaje();
        Personaje seud = new Personaje();
        Personaje wizard = new Personaje();
        Personaje hacker = new Personaje();

        //El ramdom es utilizado para ataques con numeros al azar igual o inferiores al asignado por el personaje//
        Random rand;
        rand = new Random(System.nanoTime());

        /**
         * definicion de los atributos iniciales de los personajes
         */
        //definimos los personajes y sus estadisticas iniciales//
        robocop.setFisico(10);
        robocop.setFuerza(20);
        robocop.setNivel(2);
        robocop.setNombre("Julio");
        robocop.setHp(2);
        robocop.setSalud(100);

        hacker.setFisico(15);
        hacker.setFuerza(10);
        hacker.setNivel(2);
        hacker.setNombre("Andres");
        hacker.setHp(2);
        hacker.setSalud(100);

        seud.setFisico(5);
        seud.setFuerza(60);
        seud.setNivel(5);
        seud.setNombre("Diego");
        seud.setHp(10);
        seud.setSalud(100);

        wizard.setFisico(20);
        wizard.setFuerza(40);
        wizard.setNivel(10);
        wizard.setNombre("Mago");
        wizard.setHp(10);
        wizard.setSalud(2000);

        /**
         * descripcion de el nivel inicial de los personajes
         */
        // descripcion inicial de indices de vida//
        System.out.println(robocop.getNombre() + " tiene una vida de :  " + robocop.getSalud());
        System.out.println(hacker.getNombre() + " tiene una vida de :  " + hacker.getSalud());
        System.out.println(seud.getNombre() + " vida: " + seud.getSalud());
        System.out.println(wizard.getNombre() + " vida: " + wizard.getSalud());

        /**
         * batalla por turnos impelmentando el do-while
         */
        //implementamos el do while para los ataques por turnos//
        do {
            //ataque del heroe//
            /**
             * ataque del heroe 1
             */
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
            wizard.daño(salud);

            /**
             * Ataque del heroe 2
             */
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
            wizard.daño(salud);

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
            wizard.daño(salud);

            /**
             * Ataque del jefe y determinar el turno
             */
            //ataque del jefe//
            //turno del jefe//
            if (wizard.getSalud() > 0) {
                aleatorio = rand.nextInt(1);
                if (aleatorio == 0) {
                    //si aleatorio es igual a 0, implementara un ataque fisico//
                    salud = wizard.ataque_fisico();

                } else {

                    //si aleatorio es superior a 0, implementara un ataque especial//
                    salud = wizard.ataque_fuerza();

                }
            }

            // Mostramos los puntos realizados por ataque//
            System.out.println(wizard.getNombre() + " realizo un ataque de " + salud);
            System.out.println();

            //se utiliza aleatorio para sortear quien atacara el jefe/ monstruo//
            aleatorio = rand.nextInt(2);
            /**
             * determina quien atacara el monstruo/jefe
             */
            //si aleatorio es 0//
            switch (aleatorio) {
                case 0:
                    //Heroe e1 recibe daño//
                    robocop.daño(salud);
                    break;
                case 1:
                    // si muestra 1//
                    //heroe 2 mustra daño//
                    seud.daño(salud);
                    break;
                case 2:
                    // si muestra 2//
                    //heroe 3 muestra daño//
                    hacker.daño(salud);
                    break;
                default:
                    
                    break;
            }
            System.out.println(robocop.getNombre() + " tiene una vida de :  " + robocop.getSalud());
            System.out.println(hacker.getNombre() + " tiene una vida de :  " + hacker.getSalud());
            System.out.println(seud.getNombre() + " vida: " + seud.getSalud());
            System.out.println(wizard.getNombre() + " vida: " + wizard.getSalud());
            System.out.println();

            /**
             * determinar quien gano la pelea
             */
            //Si los tres heores tiene nivel de salud 0//
            if (robocop.getSalud() <= 0 && seud.getSalud() <= 0 && hacker.getSalud() <= 0) {
                // mueren los heroes y se decalara la derrota//
                heroe = false;
                System.out.println("Derrota");
                System.out.println();
                JOptionPane.showMessageDialog(null, "!Los derroto el Monstruo!");
            } else if (wizard.getSalud()<=0){ // Si el jefe/ monstruo llega a 0//
                jefe = false;// Muere el jefe y se declara la victoria//
                System.out.println(" Victoria ");
                System.out.println();
                JOptionPane.showMessageDialog(null, "!Derrotaron al Monstruo!");
            }

            

        } while (heroe == true && jefe == true);// las acciones de turnos re repetiran mientras heores y viilanos sigan vivos//
        /**
         * Salir del campo de batalla
         */

        dispose();// desaparece el campo de batalla//
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bestiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bestiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bestiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bestiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bestiario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
