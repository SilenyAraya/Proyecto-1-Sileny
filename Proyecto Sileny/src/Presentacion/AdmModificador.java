
package Presentacion;

import Negocio.MusicaAdm;
import Negocio.PeliculasAdm;


public class AdmModificador extends javax.swing.JFrame {

    /**
     * Creates new form Modificador
     */
    public AdmModificador() {
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

        ModificarAdm = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMus = new javax.swing.JRadioButton();
        btnPel = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Menu Modificador ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 170, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECCIONE LA OPCION QUE DESEA EJECUTAR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 380, 20));

        ModificarAdm.add(btnMus);
        btnMus.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnMus.setForeground(new java.awt.Color(255, 255, 255));
        btnMus.setText("Musica");
        btnMus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusActionPerformed(evt);
            }
        });
        getContentPane().add(btnMus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        ModificarAdm.add(btnPel);
        btnPel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnPel.setForeground(new java.awt.Color(255, 255, 255));
        btnPel.setText("Peliculas");
        btnPel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelActionPerformed(evt);
            }
        });
        getContentPane().add(btnPel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inicio.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusActionPerformed
        //Code to bring up the window MusicaAdm
        MusicaAdm ventanaSecundaria = new MusicaAdm();
        ventanaSecundaria.pack();
        ventanaSecundaria.setVisible(true);
    }//GEN-LAST:event_btnMusActionPerformed

    private void btnPelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelActionPerformed
        //Code to bring up the window PeliculasAdm
        PeliculasAdm ventanaSecundaria = new PeliculasAdm();
        ventanaSecundaria.pack();
        ventanaSecundaria.setVisible(true);
    }//GEN-LAST:event_btnPelActionPerformed

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
            java.util.logging.Logger.getLogger(AdmModificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmModificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmModificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmModificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmModificador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ModificarAdm;
    private javax.swing.JRadioButton btnMus;
    private javax.swing.JRadioButton btnPel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}