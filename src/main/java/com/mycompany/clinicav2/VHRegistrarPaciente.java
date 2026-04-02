/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.clinicav2;

import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.DesktopPaneUI;
/**
 *
 * @author owenv
 */
public class VHRegistrarPaciente extends javax.swing.JInternalFrame {
    UbigeoTabla ut = new UbigeoTabla();
    
    
    private static VHRegistrarPaciente rpI;
    public VHRegistrarPaciente() {
        rpI = this;
        initComponents();
        txtUbigeo.enable(false);
        txtDocumento.enable(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroupDocumento = new javax.swing.ButtonGroup();
        rbGroupNacionalidad = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelDoc = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        cmbGenero = new javax.swing.JComboBox<>();
        jdt = new com.toedter.calendar.JDateChooser();
        btnUbigeo = new javax.swing.JButton();
        txtUbigeo = new javax.swing.JTextField();
        rbTipDocDNI = new javax.swing.JRadioButton();
        rbTipDocCar = new javax.swing.JRadioButton();
        rbPeruano = new javax.swing.JRadioButton();
        rbExtranjero = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Registrar paciente");

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DEL PACIENTE");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Fecha de nacimiento");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Género");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Teléfono");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Nacionalidad");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre del paciente");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Tipo de documento");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Dirección");

        labelDoc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDoc.setText("Documento");

        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Correo electrónico");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(204, 255, 255), null, null));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Femenino" }));

        btnUbigeo.setText("Seleccion");
        btnUbigeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbigeoActionPerformed(evt);
            }
        });

        txtUbigeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbigeoActionPerformed(evt);
            }
        });

        rbGroupDocumento.add(rbTipDocDNI);
        rbTipDocDNI.setText("DNI");
        rbTipDocDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTipDocDNIActionPerformed(evt);
            }
        });

        rbGroupDocumento.add(rbTipDocCar);
        rbTipDocCar.setText("Carnet de extranjeria");
        rbTipDocCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTipDocCarActionPerformed(evt);
            }
        });

        rbGroupNacionalidad.add(rbPeruano);
        rbPeruano.setText("Peruano");

        rbGroupNacionalidad.add(rbExtranjero);
        rbExtranjero.setText("Extranjero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCorreo)
                                    .addComponent(jdt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(106, 106, 106)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addGap(68, 68, 68)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rbPeruano)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rbExtranjero))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnUbigeo))))))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelDoc)
                                            .addComponent(txtDocumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbTipDocDNI)
                                        .addGap(32, 32, 32)
                                        .addComponent(rbTipDocCar)))
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(231, 231, 231))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbTipDocDNI)
                            .addComponent(rbTipDocCar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelDoc)
                        .addGap(18, 18, 18)
                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rbPeruano)
                            .addComponent(rbExtranjero))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUbigeo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void setUbigeo(String txt){
        if(rpI !=null){
            javax.swing.SwingUtilities.invokeLater(() ->{
                rpI.txtUbigeo.setText(txt);
            });
        }
    }
    
    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed


    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtNombre.getText();
        String correo = txtCorreo.getText();
        //String tipDocumento = cmbTipDoc.getSelectedItem().toString();
        String rbDocumento = "";
        if(rbTipDocDNI.isSelected()){
            rbDocumento=rbTipDocDNI.getText();
        }
        if(rbTipDocCar.isSelected()){
            rbDocumento=rbTipDocCar.getText();
        }
        
        String tipoDoc = labelDoc.getText();
        String numDoc =txtDocumento.getText();
        
        //JOptionPane.showMessageDialog(null,labelDoc.getText());
//        String documento = txtDocumento.getText();
           java.util.Date fecha = jdt.getDate();
            Calendar c = Calendar.getInstance();
            c.setTime(fecha);
            int dia = c.get(Calendar.DAY_OF_MONTH);
           int mes = c.get(Calendar.MONTH) + 1;
           int año = c.get(Calendar.YEAR);
        String fechanacimiento = año + "-" + mes + "-" + dia;
        String genero = cmbGenero.getSelectedItem().toString();
        String nacionalidad = "";
        if(rbPeruano.isSelected()){
            nacionalidad = "Peruano";
        }
        if(rbExtranjero.isSelected()){
            nacionalidad = "Extranjero";
        }
        String telefono = txtTelefono.getText();
        String direccion = txtUbigeo.getText();
        
        try{
            CConexion co = new CConexion();
            Connection conectado = co.establecerConexion();
            
            String sql = "EXEC sp_registrar_paciente ?, ?, ?, ?, ?, ?, ?, ?, ?;";
            
            PreparedStatement ps1 =conectado.prepareStatement(sql);
            ps1.setString(1, nombre);
            ps1.setString(2, correo);
            ps1.setString(3, tipoDoc);
            ps1.setString(4, numDoc);
            ps1.setString(5, fechanacimiento);
            ps1.setString(6, genero);
            ps1.setString(7, nacionalidad);
            ps1.setString(8, telefono);
            ps1.setString(9, direccion);
            
            int fila = ps1.executeUpdate();
            JOptionPane.showMessageDialog(null, "PACIENTE AGREGADO");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error " + e.getMessage());
        }
//        //String genero = cmbGenero.getSelectedItem().toString();
//        String nacionalidad = cmbNacionalidad.getSelectedItem().toString();
//        //String direccion = txtDireccion.getText();
//        String telefono = txtTelefono.getText();
//        String correo = txtCorreo.getText();
//        String sqlusuario="";
//        String sqlpaciente="";
//        Validaciones v = new Validaciones();
//        if(v.ValNombre(nombre) && v.ValDNI(documento) && v.Correo(correo) && v.Telefono(telefono)){
//            CConexion co = new CConexion();
//            Connection conectado = co.establecerConexion();
//            
//            sqlusuario = "INSERT INTO usuarios VALUES (?,?,?,?,?,'Paciente','Activo')";
//            
//            sqlpaciente = "INSERT INTO pacientes VALUES(?,?,?,?,?)";
//            
//            
//            String verificarDocumento ="EXEC sp_pacientes_documento '" + documento +"';";
//            String verificarCorreo ="EXEC sp_usuarios_correo '" +correo+"';";
//            try{
//                Statement sv1 = conectado.createStatement();
//                ResultSet rv1 = sv1.executeQuery(verificarDocumento);
//                rv1.next();
//                int nDoc = rv1.getInt(1);
//                Statement sv2 = conectado.createStatement();
//                ResultSet rv2 = sv2.executeQuery(verificarCorreo);
//                rv2.next();
//                int nCorreo = rv2.getInt(1);
//                
//                
//                if(nDoc == 0 && nCorreo == 0){
//                     try{
//                
//                    PreparedStatement st1 = conectado.prepareStatement(sqlusuario);
//                    PreparedStatement st2 = conectado.prepareStatement(sqlpaciente);
//                    st1.setString(1, nombre);
//                    st1.setString(2,correo);
//                    st1.setString(3,documento);
//                    st1.setString(4,telefono);
//                    //st1.setString(5,direccion);
//
//                    //st2.setString(1, tipDocumento);
//                    st2.setString(2, documento);
//                    st2.setString(3, fechanacimiento);
//                    //st2.setString(4, genero);
//                    st2.setString(5, nacionalidad);
//
//                    int filaUsuario =st1.executeUpdate();
//                    int filaPaciente = st2.executeUpdate();
//                    JOptionPane.showMessageDialog(null, "PACIENTE AGREGADO");
//                    
//                    }catch(Exception e){
//                        JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
//                    }   
//                }else{
//                    JOptionPane.showMessageDialog(null, "USUARIO EXISTENTE");
//                }
//                }catch(Exception e){
//                    JOptionPane.showMessageDialog(null, e.getMessage());
//                }
//        }
//        else{
//        JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS");
//        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnUbigeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbigeoActionPerformed
        UbigeoTabla ubigeo = new UbigeoTabla();
        
        JDesktopPane dp = getDesktopPane();
        if(dp != null){
            dp.add(ubigeo);

        }
        ubigeo.setLocation(300,350);
        ubigeo.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_btnUbigeoActionPerformed

    private void txtUbigeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbigeoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbigeoActionPerformed

    private void rbTipDocDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTipDocDNIActionPerformed
            labelDoc.setText("DNI");
            txtDocumento.enable(true);
            txtDocumento.setBackground(Color.WHITE);
    }//GEN-LAST:event_rbTipDocDNIActionPerformed

    private void rbTipDocCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTipDocCarActionPerformed
            labelDoc.setText("Carnet");
            txtDocumento.enable(true);
            txtDocumento.setBackground(Color.WHITE);
    }//GEN-LAST:event_rbTipDocCarActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnUbigeo;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JDateChooser jdt;
    private javax.swing.JLabel labelDoc;
    private javax.swing.JRadioButton rbExtranjero;
    private javax.swing.ButtonGroup rbGroupDocumento;
    private javax.swing.ButtonGroup rbGroupNacionalidad;
    private javax.swing.JRadioButton rbPeruano;
    private javax.swing.JRadioButton rbTipDocCar;
    private javax.swing.JRadioButton rbTipDocDNI;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUbigeo;
    // End of variables declaration//GEN-END:variables
}
