/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatema3;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class practica2 extends javax.swing.JFrame {

    /**
     * Creates new form practica2
     */
    public practica2() {
        initComponents();

        jToggleButton1.setEnabled(false);
        jToggleButton2.setEnabled(false);
        jToggleButton3.setEnabled(false);
        jToggleButton4.setEnabled(false);
        jToggleButton5.setEnabled(false);
        jToggleButton6.setEnabled(false);
        jToggleButton7.setEnabled(false);
        jToggleButton8.setEnabled(false);
        jToggleButton9.setEnabled(false);
        jToggleButton10.setEnabled(false);
        jToggleButton11.setEnabled(false);
        jToggleButton12.setEnabled(false);
        jToggleButton13.setEnabled(false);
        jToggleButton14.setEnabled(false);
        jToggleButton15.setEnabled(false);
        jToggleButton16.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelImagen1 = new javax.swing.JLabel();
        jLabelImagen2 = new javax.swing.JLabel();
        jLabelImagen3 = new javax.swing.JLabel();
        jLabelImagen4 = new javax.swing.JLabel();
        jLabelImagen6 = new javax.swing.JLabel();
        jLabelImagen5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabelAciertos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N
        jLabelImagen1.setText("jLabel5");

        jLabelImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N
        jLabelImagen2.setText("jLabel1");

        jLabelImagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N
        jLabelImagen3.setText("jLabel2");

        jLabelImagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N
        jLabelImagen4.setText("jLabel3");

        jLabelImagen6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N
        jLabelImagen6.setText("jLabel3");

        jLabelImagen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N
        jLabelImagen5.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabelImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabelImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabelImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabelImagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabelImagen5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelImagen6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelImagen1)
                    .addComponent(jLabelImagen2)
                    .addComponent(jLabelImagen3)
                    .addComponent(jLabelImagen4)
                    .addComponent(jLabelImagen6)
                    .addComponent(jLabelImagen5))
                .addContainerGap())
        );

        jButton1.setText("Empezar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Recordar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Comprobar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabelAciertos.setText("jLabel1");

        jLabel2.setText("Aciertos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabelAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jToggleButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String secuencia = "";
        Random generadorNum = new Random();
        for (int i = 0; i < 16; i++) {
            char letra = (char) (generadorNum.nextInt(16) + 'A');;
            secuencia += letra;
        }

        jToggleButton1.setEnabled(true);
        jToggleButton2.setEnabled(true);
        jToggleButton3.setEnabled(true);
        jToggleButton4.setEnabled(true);
        jToggleButton5.setEnabled(true);
        jToggleButton6.setEnabled(true);
        jToggleButton7.setEnabled(true);
        jToggleButton8.setEnabled(true);
        jToggleButton9.setEnabled(true);
        jToggleButton10.setEnabled(true);
        jToggleButton11.setEnabled(true);
        jToggleButton12.setEnabled(true);
        jToggleButton13.setEnabled(true);
        jToggleButton14.setEnabled(true);
        jToggleButton15.setEnabled(true);
        jToggleButton16.setEnabled(true);

        try {
            jToggleButton1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(0) + ".png"))));
            jToggleButton2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(1) + ".png"))));
            jToggleButton3.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(2) + ".png"))));
            jToggleButton4.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(3) + ".png"))));
            jToggleButton5.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(4) + ".png"))));
            jToggleButton6.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(5) + ".png"))));
            jToggleButton7.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(6) + ".png"))));
            jToggleButton8.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(7) + ".png"))));
            jToggleButton9.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(8) + ".png"))));
            jToggleButton10.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(9) + ".png"))));
            jToggleButton11.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(10) + ".png"))));
            jToggleButton12.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(11) + ".png"))));
            jToggleButton13.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(12) + ".png"))));
            jToggleButton14.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(13) + ".png"))));
            jToggleButton15.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(14) + ".png"))));
            jToggleButton16.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secuencia.charAt(15) + ".png"))));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Vuelve intentarlo\n" + e.getMessage());
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String secJ = "";
        Random generadorNum = new Random();
        for (int i = 0; i < 4; i++) {
            char letra = (char) (generadorNum.nextInt(16) + 'A');
            secJ += letra;
        }

        jToggleButton1.setEnabled(false);
        jToggleButton2.setEnabled(false);
        jToggleButton3.setEnabled(false);
        jToggleButton4.setEnabled(false);
        jToggleButton5.setEnabled(false);
        jToggleButton6.setEnabled(false);
        jToggleButton7.setEnabled(false);
        jToggleButton8.setEnabled(false);
        jToggleButton9.setEnabled(false);
        jToggleButton10.setEnabled(false);
        jToggleButton11.setEnabled(false);
        jToggleButton12.setEnabled(false);
        jToggleButton13.setEnabled(false);
        jToggleButton14.setEnabled(false);
        jToggleButton15.setEnabled(false);
        jToggleButton16.setEnabled(false);

        jToggleButton1.setSelected(false);
        jToggleButton2.setSelected(false);
        jToggleButton3.setSelected(false);
        jToggleButton4.setSelected(false);
        jToggleButton5.setSelected(false);
        jToggleButton6.setSelected(false);
        jToggleButton7.setSelected(false);
        jToggleButton8.setSelected(false);
        jToggleButton9.setSelected(false);
        jToggleButton10.setSelected(false);
        jToggleButton11.setSelected(false);
        jToggleButton12.setSelected(false);
        jToggleButton13.setSelected(false);
        jToggleButton14.setSelected(false);
        jToggleButton15.setSelected(false);
        jToggleButton16.setSelected(false);

        try {
            jLabelImagen1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secJ.charAt(0) + ".png"))));
            jLabelImagen2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secJ.charAt(1) + ".png"))));
            jLabelImagen3.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secJ.charAt(2) + ".png"))));
            jLabelImagen4.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/" + secJ.charAt(3) + ".png"))));

            jToggleButton1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton3.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton4.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton5.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton6.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton7.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton8.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton9.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton10.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton11.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton12.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton13.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton14.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton15.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
            jToggleButton16.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/Z.png"))));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Prueba otra vez \n" + e.getMessage());
            System.exit(0);
        }
        jToggleButton1.setEnabled(true);
        jToggleButton2.setEnabled(true);
        jToggleButton3.setEnabled(true);
        jToggleButton4.setEnabled(true);
        jToggleButton5.setEnabled(true);
        jToggleButton6.setEnabled(true);
        jToggleButton7.setEnabled(true);
        jToggleButton8.setEnabled(true);
        jToggleButton9.setEnabled(true);
        jToggleButton10.setEnabled(true);
        jToggleButton11.setEnabled(true);
        jToggleButton12.setEnabled(true);
        jToggleButton13.setEnabled(true);
        jToggleButton14.setEnabled(true);
        jToggleButton15.setEnabled(true);
        jToggleButton16.setEnabled(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
            //si aciertas se debe de quedar seleccionados para no confundir
            //una vez acertado se reinicia 
       
    
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(practica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(practica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(practica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(practica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new practica2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAciertos;
    private javax.swing.JLabel jLabelImagen1;
    private javax.swing.JLabel jLabelImagen2;
    private javax.swing.JLabel jLabelImagen3;
    private javax.swing.JLabel jLabelImagen4;
    private javax.swing.JLabel jLabelImagen5;
    private javax.swing.JLabel jLabelImagen6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}
