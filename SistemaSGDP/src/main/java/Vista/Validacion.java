package Vista;

import Controlador.*;
import javax.swing.table.DefaultTableModel;
import Modelo.*;
import javax.swing.JOptionPane;


public class Validacion extends javax.swing.JFrame {
    controlador_documentacion dos =new controlador_documentacion();
    controlador_cliente ci = new controlador_cliente();
    controlador_usuario cu = new controlador_usuario();
    controlador_detallecrediticio Dt=new controlador_detallecrediticio();
    int idUsuario;
    int Resena=0;
    public Validacion() {
        initComponents();
    }
    
    Validacion(int idUsuario) {
        this.idUsuario = idUsuario;
        initComponents();
        clistado();
        Dlistado();
        ComboElegir.setEnabled(false);
    }
    
    void ulistado (){
        DefaultTableModel dt = (DefaultTableModel)tabla2.getModel();
        dt.setRowCount(0);
        for(modelo_usuario x:cu.ULista()){
            Object v[] = {x.getContraseña(), x.getId_usuario(), x.getTipo(), x.getUsuario()};
            dt.addRow(v);
    }
        
    }
    void clistado (){
        DefaultTableModel dt = (DefaultTableModel)tabla1.getModel();
        dt.setRowCount(0);
        for(modelo_cliente x:ci.CliLista()){
            Object v[] = {x.getCip(), x.getNombre(), x.getApellido()};
            dt.addRow(v);
        }
        
    }
    void Dlistado (){
        DefaultTableModel dt = (DefaultTableModel)tabla2.getModel();
        dt.setRowCount(0);
        for(modelo_documentacion x:dos.DLista()){
            Object v[] = {x.getIdDocumentacion(),x.getIipoDocumentacion(),x.getUbicacion(),x.getCip()};
            dt.addRow(v);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        ComboElegir = new javax.swing.JComboBox<>();
        btnRespuestaCredito = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtidDocumentacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CIP", "Nombres", "Apellidos"
            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idDocumentacion", "TipoDocumentacion", "Ubicacion", "Cip", "------------"
            }
        ));
        tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla2);

        ComboElegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Aprobado", "Desaprobado" }));

        btnRespuestaCredito.setBackground(new java.awt.Color(0, 204, 204));
        btnRespuestaCredito.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnRespuestaCredito.setForeground(new java.awt.Color(255, 255, 255));
        btnRespuestaCredito.setText("RESPUESTA");
        btnRespuestaCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespuestaCreditoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PANEL DE VALIDACION CREDITICIA");

        jButton2.setText("X");

        jLabel2.setText("Reseña:");

        jLabel3.setText("IdDocumentacion:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(196, 196, 196)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(ComboElegir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRespuestaCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(txtidDocumentacion))))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ComboElegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidDocumentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRespuestaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addComponent(jLabel2))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRespuestaCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespuestaCreditoActionPerformed
        modelo_detallecrediticio mc = new modelo_detallecrediticio();
        if(ComboElegir.getSelectedIndex()== 1){
            Resena=1;
            try {
            //Obtener los datos de las cajas de texto
            mc.setReseña(Resena);   
            mc.setIdUsuario(idUsuario);         
            mc.setIdDocumentacion(Integer.parseInt(txtidDocumentacion.getText()));
            mc.setFechaNow();            
            //Ejecutar el ingreso desde el controlador cliente
            Dt.ingresoDet(mc);
            } catch (Exception e) {
            System.out.println("Error > "+ e.toString());
            }
        }else if(ComboElegir.getSelectedIndex()== 2){
            Resena=2;
            try {
            //Obtener los datos de las cajas de texto
            mc.setReseña(Resena);   
            mc.setIdUsuario(idUsuario);         
            mc.setIdDocumentacion(Integer.parseInt(txtidDocumentacion.getText()));
            mc.setFechaNow();            
            //Ejecutar el ingreso desde el controlador cliente
            Dt.ingresoDet(mc);
            } catch (Exception e) {
            System.out.println("Error > "+ e.toString());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Necesitas elegir el estado del documento");
        }
    }//GEN-LAST:event_btnRespuestaCreditoActionPerformed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        int f=tabla1.getSelectedRow();
        String cod=tabla1.getValueAt(f, 0).toString();
        verD(cod);
    }//GEN-LAST:event_tabla1MouseClicked

    private void tabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla2MouseClicked
        int fila=tabla2.getSelectedRow();//fila seleccionada
        txtidDocumentacion.setText(tabla2.getValueAt(fila, 0).toString());
        ComboElegir.setEnabled(true);
    }//GEN-LAST:event_tabla2MouseClicked
    void verD(String cod){
        DefaultTableModel dt=(DefaultTableModel)tabla2.getModel();
            dt.setRowCount(0);
            double sm=0;
            for(modelo_documentacion x:ci.filtrarArt(cod)){
                Object v[]={x.getIdDocumentacion(),x.getIipoDocumentacion(),x.getUbicacion(),x.getCip()};
                dt.addRow(v);
            }
    }
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
            java.util.logging.Logger.getLogger(Validacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Validacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Validacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Validacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Validacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboElegir;
    private javax.swing.JButton btnRespuestaCredito;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField txtidDocumentacion;
    // End of variables declaration//GEN-END:variables
}
