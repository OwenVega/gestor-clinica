/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.clinicav2;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author owenv
 */
public class UbigeoTabla extends javax.swing.JInternalFrame{
    
    public UbigeoTabla() {
        initComponents();
            
                cargarTabla();
                    txtBuscar.getDocument().addDocumentListener(new DocumentListener() {
                    public void insertUpdate(DocumentEvent e) {
                        if(rbNombre.isSelected()){
                            seleccionNombre();
                        }
                        if(rbUbigeo.isSelected()){
                            prueba();
                        }
                    }

                    public void removeUpdate(DocumentEvent e) {
                        if(rbNombre.isSelected()){
                            seleccionNombre();
                        }
                        if(rbUbigeo.isSelected()){
                            prueba();
                        }
                    }

                    public void changedUpdate(DocumentEvent e) {
                        if(rbNombre.isSelected()){
                            seleccionNombre();
                        }
                        if(rbUbigeo.isSelected()){
                            prueba();
                        }
                    }
                });
            
        
    }
    
    public String ubigeoSelec = "";
        private void prueba(){
            DefaultTableModel m = new DefaultTableModel();
            CConexion co = new CConexion();
            Connection conectado = co.establecerConexion();
            
            String buscar = txtBuscar.getText().trim();
            if(buscar != ""){
                try {
                    String sql = "SELECT * FROM UbiGeo WHERE Codigo LIKE '" + buscar + "%';";
                    PreparedStatement st = conectado.prepareStatement(sql);
                    ResultSet r1 = st.executeQuery();
                    
                    ResultSetMetaData md = r1.getMetaData();
                    int c = md.getColumnCount();
                    
                    String[] cn = new String[c];
                    for(int i = 1; i <= c; i++){
                        cn[i-1] = md.getColumnName(i);
                    }
                    
                    m.setColumnIdentifiers(cn);
                    m.setRowCount(0);
                    
                    while(r1.next()){
                        Object[] f = new Object[c];
                        for(int i = 1; i <= c; i++){
                            f[i-1] = r1.getObject(i);
                        }
                        m.addRow(f);
                    }
                    
                    tablaUbi.setModel(m);
                    
                    r1.close();
                    st.close();
        
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
                }
            }
}
        
        private void seleccionNombre(){
            DefaultTableModel m = new DefaultTableModel();
            CConexion co = new CConexion();
            Connection conectado = co.establecerConexion();
            
            String buscar = txtBuscar.getText().trim();
            if(buscar != ""){
                try {
                    String sql = "SELECT * FROM UbiGeo WHERE Nombre LIKE '" + buscar + "%';";
                    PreparedStatement st = conectado.prepareStatement(sql);
                    ResultSet r1 = st.executeQuery();
                    
                    ResultSetMetaData md = r1.getMetaData();
                    int c = md.getColumnCount();
                    
                    String[] cn = new String[c];
                    for(int i = 1; i <= c; i++){
                        cn[i-1] = md.getColumnName(i);
                    }
                    
                    m.setColumnIdentifiers(cn);
                    m.setRowCount(0);
                    
                    while(r1.next()){
                        Object[] f = new Object[c];
                        for(int i = 1; i <= c; i++){
                            f[i-1] = r1.getObject(i);
                        }
                        m.addRow(f);
                    }
                    
                    tablaUbi.setModel(m);
                    
                    r1.close();
                    st.close();
        
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
                }
            }
        }
    
    

    public void cargarTabla(){
        DefaultTableModel m = new DefaultTableModel();
        m.addColumn("UBIGEO");
        m.addColumn("NOMBRE");
        try{
            CConexion co = new CConexion();
            Connection conectado = co.establecerConexion();
            
            Statement st = conectado.createStatement();
            ResultSet r1 = st.executeQuery("select * from UbiGeo");
            
            while(r1.next()){
                Object[] f = new Object[2];
                f[0] = r1.getString(1);
                f[1] = r1.getString(2);
                m.addRow(f);
            }
            
            tablaUbi.setModel(m);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR "+ e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbNombre = new javax.swing.JRadioButton();
        rbUbigeo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUbi = new javax.swing.JTable();
        btnSeleccion = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        buttonGroup1.add(rbNombre);
        rbNombre.setText("Nombre");

        buttonGroup1.add(rbUbigeo);
        rbUbigeo.setText("Ubigeo");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Buscar");

        tablaUbi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Ubigeo", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(tablaUbi);

        btnSeleccion.setText("Seleccionar");
        btnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(162, Short.MAX_VALUE)
                                .addComponent(rbUbigeo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(rbNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSeleccion)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNombre)
                    .addComponent(rbUbigeo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccion)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionActionPerformed
        int cantidadRep = tablaUbi.getSelectedRow();
        //JOptionPane.showMessageDialog(null, ubigeoSeleccionado);
        
        try{
            CConexion co = new CConexion();
            Connection conectado = co.establecerConexion();
            
            Statement st = conectado.createStatement();
            if(rbNombre.isSelected()){
                ResultSet r1 = st.executeQuery("SELECT * FROM UbiGeo WHERE Nombre LIKE '" + txtBuscar.getText().trim() + "%';");
                int i=0;
                while(i<=cantidadRep){
                    r1.next();
                    i++;
                }
                ubigeoSelec = r1.getString(1);
                     
            }
            
            if(rbUbigeo.isSelected()){
                ResultSet r1 = st.executeQuery("SELECT * FROM UbiGeo WHERE Codigo LIKE '" + txtBuscar.getText().trim() + "%';");
                int i=0;
                while(i<=cantidadRep){
                    r1.next();
                    i++;
                }
                ubigeoSelec = r1.getString(1);
            
            }
            
            if(!rbUbigeo.isSelected() && !rbNombre.isSelected()){
                ResultSet r1 = st.executeQuery("SELECT * FROM UbiGeo" );
                int i=0;
                while(i<=cantidadRep){
                    r1.next();
                    i++;
                }
                ubigeoSelec = r1.getString(1);
            }
            VHRegistrarPaciente.setUbigeo(ubigeoSelec);
            
            JOptionPane.showMessageDialog(null, "SELECCIONADO");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "NO SELECCIONADO");
        }
    }//GEN-LAST:event_btnSeleccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbNombre;
    private javax.swing.JRadioButton rbUbigeo;
    private javax.swing.JTable tablaUbi;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
