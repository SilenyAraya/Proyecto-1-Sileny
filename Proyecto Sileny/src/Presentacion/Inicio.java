
package Presentacion;


public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InicioEleccion = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        radioBAdm = new javax.swing.JRadioButton();
        radioBUsu = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Elija la opcion opcion, segun sea su caso");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 310, 20));

        InicioEleccion.add(radioBAdm);
        radioBAdm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioBAdm.setText("Administrador");
        radioBAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBAdmActionPerformed(evt);
            }
        });
        getContentPane().add(radioBAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        InicioEleccion.add(radioBUsu);
        radioBUsu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioBUsu.setText("Usuario");
        radioBUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBUsuActionPerformed(evt);
            }
        });
        getContentPane().add(radioBUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inicio.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioBUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBUsuActionPerformed
        LoginUsu ventanaSecundaria= new LoginUsu();
        ventanaSecundaria.pack();
        ventanaSecundaria.setVisible(true);
    }//GEN-LAST:event_radioBUsuActionPerformed

    private void radioBAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBAdmActionPerformed
        LoginAdm ventanaSecundaria= new LoginAdm();
        ventanaSecundaria.pack();
        ventanaSecundaria.setVisible(true);
    }//GEN-LAST:event_radioBAdmActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup InicioEleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton radioBAdm;
    private javax.swing.JRadioButton radioBUsu;
    // End of variables declaration//GEN-END:variables
}