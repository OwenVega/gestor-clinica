/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.clinicav2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author owenv
 */
public class VHNuevaAdmison extends javax.swing.JInternalFrame {

    /**
     * Creates new form VHNuevaAdmison
     */
    private static VHNuevaAdmison rpC;
    public VHNuevaAdmison() {
        initComponents();
        txtNombre.enable(false);
        txtNumHistoria.enable(false);
        txtMotivo1.enable(false);
        rpC = this;
        txtDocumento.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                prueba();
            }

            public void removeUpdate(DocumentEvent e) {
                prueba();
            }

            public void changedUpdate(DocumentEvent e) {
                prueba();
            }
        });

        cmbEspecialidad.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
                // Obtener el país seleccionado
                
                String medico = (String) cmbEspecialidad.getSelectedItem().toString();
                actualizarmedico(medico);
            }
        });
        
    }
    
    private void actualizarmedico(String med){
        String tipoMed = cmbEspecialidad.getSelectedItem().toString();
        cmbMedico.removeAllItems();
        try{
            CConexion co = new CConexion();
            Connection conectado = co.establecerConexion();
            String sql = "select nombre_completo from profesionales p inner join usuarios u ";
            sql = sql + "ON p.id_usuario = u.id_usuario where p.especialidad = '"+tipoMed+"'";
            Statement st1 = conectado.createStatement();
            ResultSet rs1 = st1.executeQuery(sql);
            while(rs1.next()){
                String nomMed =rs1.getString(1);
                cmbMedico.addItem(nomMed);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR "+e.getMessage());
        }
    }
    
    public String getEspecialidad() {
        return (String) cmbEspecialidad.getSelectedItem();
    }
    public static void setMotivo(String txt){
            if(rpC !=null){
            javax.swing.SwingUtilities.invokeLater(() ->{
                rpC.txtMotivo1.setText(txt);
            });
        }
    }
    
    private void prueba(){
        if(txtDocumento.getText().length()==8){
            CConexion co = new CConexion();
            Connection conectado = co.establecerConexion();

            String documento = txtDocumento.getText().trim();
            try {
                String sql = "SELECT u.nombre_completo, h.id_historia " +
                             "FROM pacientes AS p " +
                             "INNER JOIN historias_clinicas AS h ON p.id_paciente = h.id_paciente " +
                             "INNER JOIN usuarios AS u ON u.id_usuario = p.id_paciente " +
                             "WHERE p.numero_documento = '" + documento + "'";

                Statement st1 = conectado.createStatement();
                ResultSet rs1 = st1.executeQuery(sql);

                if (rs1.next()) {
                    String nombreBD = rs1.getString(1);
                    String idHistoBD = rs1.getString(2);
                    txtNombre.setText(nombreBD);
                    txtNumHistoria.setText(idHistoBD);
                }
                rs1.close();
                st1.close();
                conectado.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
            }
        }else{
            txtNombre.setText("NO ENCONTRADO");
            txtNumHistoria.setText("NO ENCONTRADO");
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoAdmision = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumHistoria = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        cmbEspecialidad = new javax.swing.JComboBox<>();
        cmbSeguro = new javax.swing.JComboBox<>();
        rbAmbulatoria = new javax.swing.JRadioButton();
        rbUrgencia = new javax.swing.JRadioButton();
        rbInternacion = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        cmbMedico = new javax.swing.JComboBox<>();
        txtMotivo1 = new javax.swing.JTextField();
        btnSelec = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Nueva Admisión");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Datos del paciente");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("NUEVA ADMISIÓN");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Documento");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("historia clínica");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Datos de ingreso");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Motivo de admisión");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Área médica");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Tipo de admisión ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Seguro");

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Nombre");

        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });

        cmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cardiología", "Traumatología", "Pediatría", "Ginecología", "Neurología", "Cirugía General", "Medicina Interna", "Urgencias", "Dermatología", "Oftalmología" }));

        cmbSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seguro Social", "Particular", "SIS (Seguro Integral de Salud – Perú)", "EsSalud", "SURA", "Mapfre", "Sanitas", "Red de Salud Pública", "Mutual Médica", "Sin Seguro" }));
        cmbSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSeguroActionPerformed(evt);
            }
        });

        GrupoAdmision.add(rbAmbulatoria);
        rbAmbulatoria.setText("Ambulatoria");

        GrupoAdmision.add(rbUrgencia);
        rbUrgencia.setText("Urgencia");

        GrupoAdmision.add(rbInternacion);
        rbInternacion.setText("Internacion");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Medico");

        cmbMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));

        btnSelec.setText("Seleccionar");
        btnSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbAmbulatoria)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(rbInternacion)
                        .addGap(18, 18, 18)
                        .addComponent(rbUrgencia)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(65, 65, 65)))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(75, 75, 75)
                                        .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(txtMotivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSelec))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cmbMedico, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbSeguro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 29, Short.MAX_VALUE)))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAmbulatoria)
                    .addComponent(rbInternacion)
                    .addComponent(rbUrgencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMotivo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSelec))
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(cmbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        CConexion co = new CConexion();
        Connection conectado = co.establecerConexion();
        String tipoAdmin = "";
        if(rbAmbulatoria.isSelected()){tipoAdmin = "Ambulatoria";}
        if(rbInternacion.isSelected()){tipoAdmin = "Internación";}
        if(rbUrgencia.isSelected()){tipoAdmin = "Urgencia";}
        
        
        String documeto = txtDocumento.getText();
        String motivo = txtMotivo1.getText();
        String AreaM = cmbEspecialidad.getSelectedItem().toString();
        String Seguro = cmbSeguro.getSelectedItem().toString();
        String nomMed = cmbMedico.getSelectedItem().toString();      

        try{
            String sql = "EXEC sp_insertar_admision ?, ?, ?, ?, ?, ?;";
            PreparedStatement st1 = conectado.prepareStatement(sql);
            st1.setString(1, documeto);
            st1.setString(2, AreaM);
            st1.setString(3, tipoAdmin);
            st1.setString(4, motivo);
            st1.setString(5, Seguro);
            st1.setString(6, nomMed);
            st1.executeUpdate();
            JOptionPane.showMessageDialog(null, "ADMISION EXITOSA");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSeguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSeguroActionPerformed

    private void btnSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecActionPerformed
        Motivo m = new Motivo(this);
        
        JDesktopPane dp = getDesktopPane();
        if(dp != null){
            dp.add(m);

        }
        m.setLocation(300,350);
        m.setVisible(true);
        
    }//GEN-LAST:event_btnSelecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoAdmision;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSelec;
    private javax.swing.JComboBox<String> cmbEspecialidad;
    private javax.swing.JComboBox<String> cmbMedico;
    private javax.swing.JComboBox<String> cmbSeguro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbAmbulatoria;
    private javax.swing.JRadioButton rbInternacion;
    private javax.swing.JRadioButton rbUrgencia;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtMotivo1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumHistoria;
    // End of variables declaration//GEN-END:variables
}
