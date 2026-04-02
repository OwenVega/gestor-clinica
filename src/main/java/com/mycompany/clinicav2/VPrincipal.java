
package com.mycompany.clinicav2;

import javax.swing.plaf.DesktopPaneUI;

public class VPrincipal extends javax.swing.JFrame {
    VHRegistrarPaciente RP = null;
    VHNuevaAdmison NA = null;
    VHRegistrarCitas RC = null;
    VHRegistrarMedico RM = null;
    VHReporteFecha RF = null;
    VHInformacionPersonal IP = null;
    UbigeoTabla UT = null;
    public VPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        PacientesMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        AdmisionMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        HistoriaMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();
        TurnoCitaMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        ProfesionalMenu = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        ReporteMenu = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        Perfil = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        PacientesMenu.setMnemonic('f');
        PacientesMenu.setText("Pacientes");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Registrar paciente");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        PacientesMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Buscar paciente");
        PacientesMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Ver historial paciente");
        PacientesMenu.add(saveAsMenuItem);

        menuBar.add(PacientesMenu);

        AdmisionMenu.setMnemonic('e');
        AdmisionMenu.setText("Admisión");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Nueva admisión");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        AdmisionMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Consultar admisiones");
        AdmisionMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Altas medicas");
        AdmisionMenu.add(pasteMenuItem);

        menuBar.add(AdmisionMenu);

        HistoriaMenu.setMnemonic('h');
        HistoriaMenu.setText("Historia clínica");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Ver historias anteriores");
        HistoriaMenu.add(aboutMenuItem);

        menuBar.add(HistoriaMenu);

        TurnoCitaMenu.setText("Turnos/Citas");

        jMenuItem1.setText("Programar citas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        TurnoCitaMenu.add(jMenuItem1);

        jMenuItem2.setText("Consultar calendario");
        TurnoCitaMenu.add(jMenuItem2);

        jMenuItem3.setText("Reprogramar o cancelar cita");
        TurnoCitaMenu.add(jMenuItem3);

        menuBar.add(TurnoCitaMenu);

        ProfesionalMenu.setText("Profesionales de salud");

        jMenuItem4.setText("Registrar medico");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        ProfesionalMenu.add(jMenuItem4);

        jMenuItem5.setText("Listado medico");
        ProfesionalMenu.add(jMenuItem5);

        jMenuItem6.setText("Horarios disponibles");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        ProfesionalMenu.add(jMenuItem6);

        menuBar.add(ProfesionalMenu);

        ReporteMenu.setText("Reporte");

        jMenuItem7.setText("Por fecha");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        ReporteMenu.add(jMenuItem7);

        jMenuItem8.setText("Por profesional");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        ReporteMenu.add(jMenuItem8);

        jMenuItem9.setText("Por especialidad");
        ReporteMenu.add(jMenuItem9);

        jMenuItem10.setText("Por paciente");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        ReporteMenu.add(jMenuItem10);

        jMenuItem11.setText("jMenuItem11");
        ReporteMenu.add(jMenuItem11);

        menuBar.add(ReporteMenu);

        Perfil.setText("Perfil");

        jMenuItem12.setText("Ver informacion personal");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        Perfil.add(jMenuItem12);

        jMenuItem13.setText("Cerrar sesion");
        Perfil.add(jMenuItem13);

        menuBar.add(Perfil);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
            if(RP == null || RP.isClosed()){
                RP = new VHRegistrarPaciente();
                this.desktopPane.add(RP);
            }
            RP.setVisible(true);
    }//GEN-LAST:event_openMenuItemActionPerformed
    public void abrirUbigeo(){
            if(UT == null || UT.isClosed()){
                UT = new UbigeoTabla();
                this.desktopPane.add(UT);
            }
            UT.setVisible(true);
    }
    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        if(NA == null || NA.isClosed()){
            NA = new VHNuevaAdmison();
            this.desktopPane.add(NA);
        }
        NA.setVisible(true);
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(RC == null || RC.isClosed()){
            RC = new VHRegistrarCitas();
            this.desktopPane.add(RC);
        }
        RC.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(RM == null || RM.isClosed()){
            RM = new VHRegistrarMedico();
            this.desktopPane.add(RM);
        }
        RM.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if(RF == null || RF.isClosed()){
            RF = new VHReporteFecha();
            this.desktopPane.add(RF);
        }
        RF.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        if(IP == null || IP.isClosed()){
            IP = new VHInformacionPersonal();
            this.desktopPane.add(IP);
        }
        IP.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AdmisionMenu;
    private javax.swing.JMenu HistoriaMenu;
    private javax.swing.JMenu PacientesMenu;
    private javax.swing.JMenu Perfil;
    private javax.swing.JMenu ProfesionalMenu;
    private javax.swing.JMenu ReporteMenu;
    private javax.swing.JMenu TurnoCitaMenu;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
