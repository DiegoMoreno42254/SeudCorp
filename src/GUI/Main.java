/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.Map;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;

/**
 * Mapa del juego
 *
 * @author Edgar andres Delgado Castellano
 * @author Diego Miguel Moreno Duran
 * @version 1.0
 * @since 28/11/17
 */
public class Main extends javax.swing.JFrame {

    private Map map;

    /**
     * Creamos un Jframe para el mapa del juego Grilla de una matriz 10 x 10
     */
    public Main() {
        map = new Map();
        initComponents();
    }

    /**
     * Dibujamos los objetos en la grilla del juego Fila 0 al 9
     */
    private void dibujar() {
        int[][] mapa = map.getMap();

        //pintamos la primera fila
        jLabel103.setIcon(new ImageIcon(getClass().getResource("/Resources/"
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
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[0][8] + ".jpg")));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[0][9] + ".jpg")));

        //pintamos la segunda fila
        jLabel11.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][0] + ".jpg")));
        jLabel12.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][1] + ".jpg")));
        jLabel13.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][2] + ".jpg")));
        jLabel14.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][3] + ".jpg")));
        jLabel15.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][4] + ".jpg")));
        jLabel16.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][5] + ".jpg")));
        jLabel17.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][6] + ".jpg")));
        jLabel18.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][7] + ".jpg")));
        jLabel19.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][8] + ".jpg")));
        jLabel20.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][9] + ".jpg")));

        //Pintamos la tercera fila
        jLabel21.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][0] + ".jpg")));
        jLabel22.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][1] + ".jpg")));
        jLabel23.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][2] + ".jpg")));
        jLabel24.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][3] + ".jpg")));
        jLabel25.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][4] + ".jpg")));
        jLabel26.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][5] + ".jpg")));
        jLabel27.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][6] + ".jpg")));
        jLabel28.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][7] + ".jpg")));
        jLabel29.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[1][8] + ".jpg")));
        jLabel30.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[2][9] + ".jpg")));

        //Pintamos la cuarta fila
        jLabel31.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][0] + ".jpg")));
        jLabel32.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][1] + ".jpg")));
        jLabel33.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][2] + ".jpg")));
        jLabel34.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][3] + ".jpg")));
        jLabel35.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][4] + ".jpg")));
        jLabel36.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][5] + ".jpg")));
        jLabel37.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][6] + ".jpg")));
        jLabel38.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][7] + ".jpg")));
        jLabel39.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][8] + ".jpg")));
        jLabel40.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[3][9] + ".jpg")));

        //Pintamos la quinta Fila
        jLabel41.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][0] + ".jpg")));
        jLabel42.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][1] + ".jpg")));
        jLabel43.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][2] + ".jpg")));
        jLabel44.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][3] + ".jpg")));
        jLabel45.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][4] + ".jpg")));
        jLabel46.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][5] + ".jpg")));
        jLabel47.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][6] + ".jpg")));
        jLabel48.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][7] + ".jpg")));
        jLabel49.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][8] + ".jpg")));
        jLabel50.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[4][9] + ".jpg")));

        //Pintamos la sexta fila
        jLabel51.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][0] + ".jpg")));
        jLabel52.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][1] + ".jpg")));
        jLabel53.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][2] + ".jpg")));
        jLabel54.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][3] + ".jpg")));
        jLabel55.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][4] + ".jpg")));
        jLabel56.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][5] + ".jpg")));
        jLabel57.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][6] + ".jpg")));
        jLabel58.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][7] + ".jpg")));
        jLabel59.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][8] + ".jpg")));
        jLabel60.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[5][9] + ".jpg")));

        //Pintamos la septima fila
        jLabel61.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][0] + ".jpg")));
        jLabel63.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][1] + ".jpg")));
        jLabel64.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][2] + ".jpg")));
        jLabel66.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][3] + ".jpg")));
        jLabel67.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][4] + ".jpg")));
        jLabel68.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][5] + ".jpg")));
        jLabel69.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][6] + ".jpg")));
        jLabel70.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][7] + ".jpg")));
        jLabel71.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][8] + ".jpg")));
        jLabel72.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[6][9] + ".jpg")));

        //Pintamos la octava fila
        jLabel73.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][0] + ".jpg")));
        jLabel74.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][1] + ".jpg")));
        jLabel75.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][2] + ".jpg")));
        jLabel76.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][3] + ".jpg")));
        jLabel77.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][4] + ".jpg")));
        jLabel78.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][5] + ".jpg")));
        jLabel79.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][6] + ".jpg")));
        jLabel80.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][7] + ".jpg")));
        jLabel81.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][8] + ".jpg")));
        jLabel82.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[7][9] + ".jpg")));

        //Pintamos la novena fila
        jLabel83.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[8][0] + ".jpg")));
        jLabel84.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[8][1] + ".jpg")));
        jLabel85.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[8][2] + ".jpg")));
        jLabel86.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[8][3] + ".jpg")));
        jLabel87.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[8][4] + ".jpg")));
        jLabel88.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[8][5] + ".jpg")));
        jLabel89.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[8][6] + ".jpg")));
        jLabel90.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[8][7] + ".jpg")));
        jLabel91.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[8][8] + ".jpg")));
        jLabel92.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[8][9] + ".jpg")));

        //Pintamos la decima y ultima fila
        jLabel93.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[9][0] + ".jpg")));
        jLabel94.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[9][1] + ".jpg")));
        jLabel95.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[9][2] + ".jpg")));
        jLabel96.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[9][3] + ".jpg")));
        jLabel97.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[9][4] + ".jpg")));
        jLabel98.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[9][5] + ".jpg")));
        jLabel99.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[9][6] + ".jpg")));
        jLabel100.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[9][7] + ".jpg")));
        jLabel101.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[9][8] + ".jpg")));
        jLabel102.setIcon(new ImageIcon(getClass().getResource("/Resources/"
                + mapa[9][9] + ".jpg")));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel62 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
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
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();

        jLabel62.setText("jLabel62");

        jLabel65.setText("jLabel65");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(10, 10));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/1.jpg"))); // NOI18N
        jLabel103.setToolTipText("");
        jLabel103.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel103KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel103);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(40, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 14));
        getContentPane().add(jLabel2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel3.setMinimumSize(new java.awt.Dimension(40, 14));
        jLabel3.setPreferredSize(new java.awt.Dimension(40, 14));
        getContentPane().add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel4.setMinimumSize(new java.awt.Dimension(40, 14));
        jLabel4.setPreferredSize(new java.awt.Dimension(40, 14));
        getContentPane().add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/3.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel5.setMinimumSize(new java.awt.Dimension(40, 14));
        jLabel5.setPreferredSize(new java.awt.Dimension(40, 14));
        getContentPane().add(jLabel5);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel6.setMinimumSize(new java.awt.Dimension(40, 14));
        jLabel6.setPreferredSize(new java.awt.Dimension(40, 14));
        getContentPane().add(jLabel6);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel7.setMinimumSize(new java.awt.Dimension(40, 14));
        jLabel7.setPreferredSize(new java.awt.Dimension(40, 14));
        getContentPane().add(jLabel7);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel8.setMinimumSize(new java.awt.Dimension(40, 14));
        jLabel8.setPreferredSize(new java.awt.Dimension(40, 14));
        getContentPane().add(jLabel8);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel9.setMinimumSize(new java.awt.Dimension(40, 14));
        jLabel9.setPreferredSize(new java.awt.Dimension(40, 14));
        getContentPane().add(jLabel9);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/2.jpg"))); // NOI18N
        getContentPane().add(jLabel10);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel11);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel12);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel13);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel14);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel15);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel16);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel17);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel18);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel19);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel20);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel21);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel22);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel23);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel24);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel25);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel26);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel27);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel28);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel29);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel30);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel31);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/3.jpg"))); // NOI18N
        getContentPane().add(jLabel32);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel33);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel34);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel35);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel36);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel37);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel38);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel39);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel40);

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel41);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel42);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel43);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel44);

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/2.jpg"))); // NOI18N
        getContentPane().add(jLabel45);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel46);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel47);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel48);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/2.jpg"))); // NOI18N
        getContentPane().add(jLabel49);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel50);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel51);

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel52);

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel53);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel54);

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel55);

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel56);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel57);

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel58);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel59);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel60);

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel61);

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel63);

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel64);

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel66);

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel67);

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel68);

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel69);

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel70);

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel71);

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel72);

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel73);

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel74);

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel75);

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel76);

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel77);

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel78);

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel79);

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel80);

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel81);

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel82);

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel83);

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel84);

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel85);

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel86);

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel87);

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel88);

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel89);

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel90);

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel91);

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/4.jpg"))); // NOI18N
        getContentPane().add(jLabel92);

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel93);

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/2.jpg"))); // NOI18N
        getContentPane().add(jLabel94);

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/3.jpg"))); // NOI18N
        getContentPane().add(jLabel95);

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel96);

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel97);

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel98);

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel99);

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel100);

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/0.jpg"))); // NOI18N
        getContentPane().add(jLabel101);

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/2.jpg"))); // NOI18N
        getContentPane().add(jLabel102);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel103KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel103KeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_jLabel103KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
//Dibujamos los controles que utilizaremos para mover

        /**
         * Metodos para hacer mover el personaje
         */
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
        }        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
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
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    // End of variables declaration//GEN-END:variables
}
