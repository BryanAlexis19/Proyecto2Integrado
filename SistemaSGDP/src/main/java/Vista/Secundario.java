/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author user
 */
public class Secundario extends javax.swing.JFrame {
    int idUsuario;
    /**
     * Creates new form Secundario
     */
    public Secundario() {
        initComponents();
    }
    
    public Secundario(int idUsuario) {
        this.idUsuario = idUsuario;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnVerRegistro = new javax.swing.JButton();
        btnRegistroDocumentacion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRegistroC = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, -1));

        btnVerRegistro.setBackground(new java.awt.Color(0, 204, 204));
        btnVerRegistro.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnVerRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnVerRegistro.setText("Ver registro de clientes");
        btnVerRegistro.setBorder(null);
        btnVerRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 210, 50));

        btnRegistroDocumentacion.setBackground(new java.awt.Color(0, 204, 204));
        btnRegistroDocumentacion.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnRegistroDocumentacion.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroDocumentacion.setText("Registro de documentación");
        btnRegistroDocumentacion.setBorder(null);
        btnRegistroDocumentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroDocumentacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistroDocumentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 210, 50));

        jLabel3.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ELIJA LA FUNCIÓN A REALIZAR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        btnRegistroC.setBackground(new java.awt.Color(0, 204, 204));
        btnRegistroC.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnRegistroC.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroC.setText("Registro Cliente");
        btnRegistroC.setToolTipText("");
        btnRegistroC.setBorder(null);
        btnRegistroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroCActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 210, 50));

        btnCerrar.setBackground(new java.awt.Color(204, 204, 204));
        btnCerrar.setFont(new java.awt.Font("Futura Bk BT", 1, 14)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/salir.png"))); // NOI18N
        btnCerrar.setText("Cerrar sesión");
        btnCerrar.setToolTipText("");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCerrar.setIconTextGap(0);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 180, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 350, 20));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Salida.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 30, 30));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setToolTipText("");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 500, 350));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
                 Ingreso q = new Ingreso();
                 q.setVisible(true);
                 this.dispose();  
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRegistroCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroCActionPerformed
                 
                //Mandarle al registre de clientes el id del usuario
                 RegistroDeClientes q = new RegistroDeClientes(idUsuario);
                 q.setVisible(true);
                 this.setVisible(false);
    }//GEN-LAST:event_btnRegistroCActionPerformed

    private void btnVerRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegistroActionPerformed
                 VerClientes q = new VerClientes(idUsuario);
                 q.setVisible(true);
                 this.dispose();  
    }//GEN-LAST:event_btnVerRegistroActionPerformed

    private void btnRegistroDocumentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDocumentacionActionPerformed
                 Vista_RegistroDocumentario q = new Vista_RegistroDocumentario(idUsuario);
                 q.setVisible(true);
                 this.dispose();  
    }//GEN-LAST:event_btnRegistroDocumentacionActionPerformed

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
            java.util.logging.Logger.getLogger(Secundario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Secundario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Secundario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Secundario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Secundario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRegistroC;
    private javax.swing.JButton btnRegistroDocumentacion;
    private javax.swing.JButton btnVerRegistro;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
