

package Vista;

import Controlador.controlador_documentacion;
import Controlador.controlador_cliente;
import Controlador.controlador_ingresodocumentacion;
import Modelo.modelo_documentacion;
import Modelo.modelo_cliente;
import Modelo.modelo_ingresodocumentacion;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Vista_RegistroDocumentario extends javax.swing.JFrame {

    controlador_documentacion ctd= new controlador_documentacion();
    controlador_ingresodocumentacion cting_doc = new controlador_ingresodocumentacion();
    //modelo_ingresodocumentacion mingDoc = new modelo_ingresodocumentacion();
    //controlador_cliente ctc =new controlador_cliente();
    //JFileChooser j =new JFileChooser();
    String ruta_archivo="";
    
    int id=-1;
    int idUsuario;
    public Vista_RegistroDocumentario() {
        initComponents();
        mostrarDocum();
        inabilitar();
        
    }
    public Vista_RegistroDocumentario(int idUsuario) {
        initComponents();
        mostrarDocum();
        inabilitar();
        
        this.idUsuario = idUsuario;
    }
    void inabilitar(){
        txtIdDoc.setVisible(false);
        txtCip_cli.setVisible(false);
        btnSeleccionar.setEnabled(false);
        cbTipoDoc.setEnabled(false);
        btnRegistrar.setEnabled(false);
        //btnCancelar.setEnabled(true);
        btnModificar.setEnabled(false);
        
    }
    void habilitar(){
        txtIdDoc.setVisible(false);
        txtCip_cli.setVisible(false);
        cbTipoDoc.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnRegistrar.setEnabled(true);
        btnSeleccionar.setEnabled(true);
        //btnModificar.setEnabled(true);
        cbTipoDoc.setSelectedIndex(0);
        ruta_archivo="";
        
    }
    void mostrarDocum(){
        
            DefaultTableModel dt= (DefaultTableModel)tablaDocum.getModel();
            dt.setRowCount(0);
            for (modelo_documentacion x: ctd.DLista()) {
            Object v[]={x.getIdDocumentacion(),x.getIipoDocumentacion(),x.getUbicacion(),x.getCip()};
            dt.addRow(v);
            //asignarle el valor de la ultima row el IdDocumento
            txtIdDoc.setText(""+x.getIdDocumentacion());
        }     
    }
   
    private void MostrarClientes(){
        controlador_cliente ctc =new controlador_cliente();
        modelo_cliente mc = new modelo_cliente();
        mc.setCip(Integer.parseInt(txtCip.getText()));        
        for(modelo_cliente modCli: ctc.BuscarCliente(mc)){
            txtCip.setText(Integer.toString(modCli.getCip()));
            txtDni.setText(modCli.getDni());
            txtApellidos.setText(modCli.getApellido());
            txtNombres.setText(modCli.getNombre());
            txtGrado.setText(modCli.getGrado());                        
        }
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        panelCliente = new javax.swing.JPanel();
        lblTitulo_gral = new javax.swing.JLabel();
        lblTitulo_Datos = new javax.swing.JLabel();
        lblCip = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblGrado = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtGrado = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtCip_cli = new javax.swing.JTextField();
        txtCip = new javax.swing.JTextField();
        panelDocumento = new javax.swing.JPanel();
        lblTipo_docum = new javax.swing.JLabel();
        cbTipoDoc = new javax.swing.JComboBox<>();
        txtIdDoc = new javax.swing.JTextField();
        lblUbica_docum = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDocum = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        lblTitulo_Docum = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 30, 30));

        panelCliente.setBackground(new java.awt.Color(0, 153, 153));
        panelCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTitulo_gral.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        lblTitulo_gral.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo_gral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo_gral.setText("Registro de Documentación");
        lblTitulo_gral.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblTitulo_gral.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblTitulo_Datos.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblTitulo_Datos.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo_Datos.setText("DATOS DEL ADMINISTRADO");

        lblCip.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCip.setForeground(new java.awt.Color(255, 255, 255));
        lblCip.setText("CIP:");

        lblDni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDni.setForeground(new java.awt.Color(255, 255, 255));
        lblDni.setText("DNI:");

        lblApellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellidos:");

        lblNombres.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres.setText("Nombres:");

        lblGrado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblGrado.setForeground(new java.awt.Color(255, 255, 255));
        lblGrado.setText("Grado:");

        txtDni.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtDni.setToolTipText("");

        txtApellidos.setToolTipText("");
        txtApellidos.setEnabled(false);

        txtNombres.setEnabled(false);

        txtGrado.setEnabled(false);

        btnBuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(lblTitulo_gral, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblTitulo_Datos))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCip)
                                    .addComponent(lblDni)))
                            .addComponent(lblGrado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombres, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblApellidos, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                .addComponent(txtApellidos)
                                .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(txtCip))
                                .addGap(23, 23, 23)
                                .addComponent(txtCip_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(btnBuscar))))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTitulo_gral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitulo_Datos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCip)
                    .addComponent(btnBuscar)
                    .addComponent(txtCip_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCip, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidos))
                .addGap(3, 3, 3)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrado))
                .addGap(26, 26, 26))
        );

        jPanel2.add(panelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 24, -1, 270));

        panelDocumento.setBackground(new java.awt.Color(0, 153, 153));
        panelDocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTipo_docum.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblTipo_docum.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo_docum.setText("Tipo de Documento:");

        cbTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Copia DNI", "Copia CIP", "Numero de Cuenta", "Comprobantes de Pago", "Historial Crediticio Actualizado", "Minuta", "Acta de Matrimonio", "Copia DNI Conyugue", "Reporte INFOCORP" }));
        cbTipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoDocActionPerformed(evt);
            }
        });

        lblUbica_docum.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUbica_docum.setForeground(new java.awt.Color(255, 255, 255));
        lblUbica_docum.setText("Ubicacion de documento");

        btnSeleccionar.setText("Seleccionar Documento");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevo.setFont(new java.awt.Font("Futura Bk BT", 1, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrar.setFont(new java.awt.Font("Futura Bk BT", 1, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Futura Bk BT", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tablaDocum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IdDocumentación", "Tipo de Documento", "Documento", "CIP"
            }
        ));
        tablaDocum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDocumMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDocum);

        btnModificar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDocumentoLayout = new javax.swing.GroupLayout(panelDocumento);
        panelDocumento.setLayout(panelDocumentoLayout);
        panelDocumentoLayout.setHorizontalGroup(
            panelDocumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocumentoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelDocumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTipo_docum)
                    .addComponent(lblUbica_docum))
                .addGap(26, 26, 26)
                .addGroup(panelDocumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDocumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(54, 54, 54))
            .addGroup(panelDocumentoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
        );
        panelDocumentoLayout.setVerticalGroup(
            panelDocumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDocumentoLayout.createSequentialGroup()
                .addGroup(panelDocumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDocumentoLayout.createSequentialGroup()
                        .addComponent(txtIdDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDocumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipo_docum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDocumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUbica_docum)
                            .addComponent(btnSeleccionar)))
                    .addGroup(panelDocumentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDocumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnModificar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrar)))
                .addGroup(panelDocumentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDocumentoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDocumentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(17, 17, 17))))
        );

        jPanel2.add(panelDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 630, 240));

        lblTitulo_Docum.setBackground(new java.awt.Color(0, 153, 153));
        lblTitulo_Docum.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo_Docum.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo_Docum.setText("DOCUMENTACIÓN A PRESENTAR");
        lblTitulo_Docum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTitulo_Docum.setOpaque(true);
        jPanel2.add(lblTitulo_Docum, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, 30));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 960, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitar();
        btnSeleccionar.setText("Seleccionar Documento");
        btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        JFileChooser j =new JFileChooser();
        FileNameExtensionFilter fi= new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        if (se==0){
            this.btnSeleccionar.setText(""+j.getSelectedFile().getName());
            ruta_archivo =j.getSelectedFile().getAbsolutePath();
        }
        else{
            
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void cbTipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoDocActionPerformed
        cbTipoDoc.transferFocus();
    }//GEN-LAST:event_cbTipoDocActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        Secundario sec = new Secundario();
        sec.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
               
        if(cbTipoDoc.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Tipo de documento ");
        }else if(ruta_archivo.trim().length()==0 ){
            JOptionPane.showMessageDialog(null, "Seleccione el documento a registrar");
            }else if(txtCip.getText().trim().length()==0 ){
                JOptionPane.showMessageDialog(null, "Seleccione el Cip del Cliente"); 
            }else{
                File ruta = new File(ruta_archivo);
                
                modelo_documentacion mdoc = new modelo_documentacion();
                mdoc.setIipoDocumentacion(cbTipoDoc.getSelectedIndex());
                mdoc.setCip(Integer.parseInt(txtCip.getText()));
                try {
                    byte[] pdf = new byte[(int) ruta.length()];
                    InputStream input = new FileInputStream(ruta);
                    input.read(pdf);
                    mdoc.setUbicacion(pdf);
                } catch (IOException ex) {
                    mdoc.setUbicacion(null);
                    //System.out.println("Error al agregar archivo pdf "+ex.getMessage());
                }
                //txtIdDoc.setText(Integer.toString(mdoc.getIdDocumentacion()));
                ctd.insertarDoc(mdoc);           
                mostrarDocum();
                inabilitar();
                //Registrando la tabla ingresodocumentacion                
                modelo_ingresodocumentacion mingDoc = new modelo_ingresodocumentacion();
                mingDoc.setIdDocumentacion(Integer.parseInt(txtIdDoc.getText()));
                mingDoc.setIdUsuario(idUsuario);
                mingDoc.fechaInDoc();
                cting_doc.ingresoDoc(mingDoc);
                System.out.println(mingDoc.toString());
                JOptionPane.showMessageDialog(null, "Documento registrado");
            }  
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cipbd,ciptxt;
        ciptxt=txtCip.getText();
        cipbd=txtCip_cli.getText();
        if("".equals(txtCip.getText())){            
            JOptionPane.showMessageDialog(null, "Debe ingresar el Cip del cliente");
        //falta que comparar solo clientes registrados
        }else{
            MostrarClientes();
        }          
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tablaDocumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDocumMouseClicked
        int fila=tablaDocum.getSelectedRow();
        txtIdDoc.setText(tablaDocum.getValueAt(fila,0).toString());
        cbTipoDoc.setSelectedIndex((int)tablaDocum.getValueAt(fila,1));
        btnSeleccionar.setText(tablaDocum.getValueAt(fila,2).toString());
        txtCip.setText(tablaDocum.getValueAt(fila,3).toString());
        
        btnModificar.setEnabled(true);
        btnRegistrar.setEnabled(false);
        txtDni.setText("");
        txtApellidos.setText("");
        txtNombres.setText("");
        txtGrado.setText("");
        cbTipoDoc.setEnabled(true);
        btnSeleccionar.setEnabled(true);
    }//GEN-LAST:event_tablaDocumMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(cbTipoDoc.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Tipo de documento ");
        }else if(ruta_archivo.trim().length()==0 ){
            JOptionPane.showMessageDialog(null, "Seleccione el documento a registrar");
            }else if(txtCip.getText().trim().length()==0 ){
                JOptionPane.showMessageDialog(null, "Seleccione el Cip del Cliente"); 
            }else{
                File ruta = new File(ruta_archivo);
                modelo_documentacion mdoc = new modelo_documentacion();
                mdoc.setIdDocumentacion(Integer.parseInt(txtIdDoc.getText()));
                mdoc.setIipoDocumentacion(cbTipoDoc.getSelectedIndex());
                mdoc.setCip(Integer.parseInt(txtCip.getText()));
                try {
                    byte[] pdf = new byte[(int) ruta.length()];
                    InputStream input = new FileInputStream(ruta);
                    input.read(pdf);
                    mdoc.setUbicacion(pdf);
                } catch (IOException ex) {
                    mdoc.setUbicacion(null);
                    //System.out.println("Error al agregar archivo pdf "+ex.getMessage());
                }            
                ctd.actualizarDoc(mdoc);
                mostrarDocum();
                inabilitar();
                JOptionPane.showMessageDialog(null, "Las modificaciones fueron guardados");
            }
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_RegistroDocumentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_RegistroDocumentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_RegistroDocumentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_RegistroDocumentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_RegistroDocumentario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cbTipoDoc;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCip;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTipo_docum;
    private javax.swing.JLabel lblTitulo_Datos;
    private javax.swing.JLabel lblTitulo_Docum;
    private javax.swing.JLabel lblTitulo_gral;
    private javax.swing.JLabel lblUbica_docum;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelDocumento;
    private javax.swing.JTable tablaDocum;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCip;
    private javax.swing.JTextField txtCip_cli;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtIdDoc;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

}
