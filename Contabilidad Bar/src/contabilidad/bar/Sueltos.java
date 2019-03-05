package contabilidad.bar;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Sueltos extends javax.swing.JFrame {

    int[] valores = {0,0,0,0,0,0};
    public Sueltos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Txt1DolarMoneda = new javax.swing.JTextField();
        Txt50Ctvs = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Txt25Ctvs = new javax.swing.JTextField();
        Txt10Ctvs = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Txt5Ctvs = new javax.swing.JTextField();
        Txt1Ctv = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        LbTotalSueltos = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        LbTotal1Dolar = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        LbTotal50Ctvs = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        LbTotal25Ctvs = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        LbTotal10Ctvs = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        LbTotal5Ctvs = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        LbTotal1Ctv = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("MONEDAS");

        jLabel9.setText("1 DOLAR: ");

        Txt1DolarMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1DolarMonedaActionPerformed(evt);
            }
        });
        Txt1DolarMoneda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt1DolarMonedaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt1DolarMonedaKeyTyped(evt);
            }
        });

        Txt50Ctvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt50CtvsActionPerformed(evt);
            }
        });
        Txt50Ctvs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt50CtvsKeyTyped(evt);
            }
        });

        jLabel10.setText("50 CENTAVOS: ");

        jLabel11.setText("25 CENTAVOS: ");

        Txt25Ctvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt25CtvsActionPerformed(evt);
            }
        });
        Txt25Ctvs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt25CtvsKeyTyped(evt);
            }
        });

        Txt10Ctvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt10CtvsActionPerformed(evt);
            }
        });
        Txt10Ctvs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt10CtvsKeyTyped(evt);
            }
        });

        jLabel12.setText("10 CENTAVOS: ");

        jLabel13.setText("5 CENTAVOS: ");

        Txt5Ctvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5CtvsActionPerformed(evt);
            }
        });
        Txt5Ctvs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt5CtvsKeyTyped(evt);
            }
        });

        Txt1Ctv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1CtvActionPerformed(evt);
            }
        });
        Txt1Ctv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt1CtvKeyTyped(evt);
            }
        });

        jLabel14.setText("1 CENTAVO: ");

        jButton2.setText("CERRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("TOTAL:");

        LbTotalSueltos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("$");

        LbTotal1Dolar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("$");

        LbTotal50Ctvs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("$");

        LbTotal25Ctvs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("$");

        LbTotal10Ctvs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setText("$");

        LbTotal5Ctvs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setText("$");

        LbTotal1Ctv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(6, 6, 6)
                        .addComponent(LbTotalSueltos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel30))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(10, 10, 10)
                            .addComponent(Txt50Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LbTotal50Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jLabel32))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(10, 10, 10)
                            .addComponent(Txt25Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LbTotal25Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jLabel33))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(10, 10, 10)
                            .addComponent(Txt10Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LbTotal10Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jLabel34))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel13)
                            .addGap(10, 10, 10)
                            .addComponent(Txt5Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LbTotal5Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jLabel35))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel9)
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Txt1DolarMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(LbTotal1Dolar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel31))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel14)
                            .addGap(10, 10, 10)
                            .addComponent(Txt1Ctv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LbTotal1Ctv, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jLabel36))))
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(LbTotal1Dolar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt1DolarMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(Txt50Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbTotal50Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(Txt25Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbTotal25Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(Txt10Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbTotal10Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13)
                    .addComponent(Txt5Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbTotal5Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel14)
                    .addComponent(Txt1Ctv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbTotal1Ctv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel28)
                    .addComponent(LbTotalSueltos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt1DolarMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1DolarMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1DolarMonedaActionPerformed

    private void Txt50CtvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt50CtvsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt50CtvsActionPerformed

    private void Txt25CtvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt25CtvsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt25CtvsActionPerformed

    private void Txt10CtvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt10CtvsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt10CtvsActionPerformed

    private void Txt5CtvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5CtvsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5CtvsActionPerformed

    private void Txt1CtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1CtvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1CtvActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Txt1DolarMonedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt1DolarMonedaKeyPressed
        
    }//GEN-LAST:event_Txt1DolarMonedaKeyPressed

    private void Txt1DolarMonedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt1DolarMonedaKeyTyped
        this.calcular();
    }//GEN-LAST:event_Txt1DolarMonedaKeyTyped

    private void Txt50CtvsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt50CtvsKeyTyped
        this.calcular();
    }//GEN-LAST:event_Txt50CtvsKeyTyped

    private void Txt25CtvsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt25CtvsKeyTyped
        this.calcular();
    }//GEN-LAST:event_Txt25CtvsKeyTyped

    private void Txt10CtvsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt10CtvsKeyTyped
        this.calcular();
    }//GEN-LAST:event_Txt10CtvsKeyTyped

    private void Txt5CtvsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt5CtvsKeyTyped
        this.calcular();
    }//GEN-LAST:event_Txt5CtvsKeyTyped

    private void Txt1CtvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt1CtvKeyTyped
        this.calcular();
    }//GEN-LAST:event_Txt1CtvKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                this.cargarValores();
        this.calcular();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Sueltos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sueltos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sueltos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sueltos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sueltos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbTotal10Ctvs;
    private javax.swing.JLabel LbTotal1Ctv;
    private javax.swing.JLabel LbTotal1Dolar;
    private javax.swing.JLabel LbTotal25Ctvs;
    private javax.swing.JLabel LbTotal50Ctvs;
    private javax.swing.JLabel LbTotal5Ctvs;
    private javax.swing.JLabel LbTotalSueltos;
    private javax.swing.JTextField Txt10Ctvs;
    private javax.swing.JTextField Txt1Ctv;
    private javax.swing.JTextField Txt1DolarMoneda;
    private javax.swing.JTextField Txt25Ctvs;
    private javax.swing.JTextField Txt50Ctvs;
    private javax.swing.JTextField Txt5Ctvs;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    public void cargarValores(){
        this.Txt1DolarMoneda.setText(String.valueOf(this.valores[0]));
        this.Txt50Ctvs.setText(String.valueOf(this.valores[1]));
        this.Txt25Ctvs.setText(String.valueOf(this.valores[2]));
        this.Txt10Ctvs.setText(String.valueOf(this.valores[3]));
        this.Txt5Ctvs.setText(String.valueOf(this.valores[4]));
        this.Txt1Ctv.setText(String.valueOf(this.valores[5]));
    }
    public void calcular(){
        try{
            Double total100 = Double.valueOf(this.Txt1DolarMoneda.getText());
            Double total50 = (0.5*Double.valueOf(this.Txt50Ctvs.getText()));
            Double total25 =(0.25*Double.valueOf(this.Txt25Ctvs.getText()));
            Double total10 =(0.1*Double.valueOf(this.Txt10Ctvs.getText()));
            Double total5 =(0.05*Double.valueOf(this.Txt5Ctvs.getText()));
            Double total1 =(0.01*Double.valueOf(this.Txt1Ctv.getText()));
            Double total = total100+total50+total25+total10+total5+total1;
            total100= Math.rint(total100*100)/100;
            total50= Math.rint(total50*100)/100;
            total25= Math.rint(total25*100)/100;
            total10= Math.rint(total10*100)/100;
            total5= Math.rint(total5*100)/100;
            total1= Math.rint(total1*100)/100;
            total= Math.rint(total*100)/100;
            this.LbTotal1Dolar.setText(String.valueOf(total100));
            this.LbTotal50Ctvs.setText(String.valueOf(total50));
            this.LbTotal25Ctvs.setText(String.valueOf(total25));
            this.LbTotal10Ctvs.setText(String.valueOf(total10));
            this.LbTotal5Ctvs.setText(String.valueOf(total5));
            this.LbTotal1Ctv.setText(String.valueOf(total1));
            this.LbTotalSueltos.setText(String.valueOf(total));
        }
        catch(Exception e){
        }

    }



}

