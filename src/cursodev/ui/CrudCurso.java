/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursodev.ui;

import cursodev.controllers.CursoController;
import cursodev.objects.Curso;

/**
 *
 * @author Administrador
 */
public class CrudCurso extends javax.swing.JInternalFrame {

    /**
     * Creates new form CrudCurso
     */
    CursoController cursoController;
    public CrudCurso() {
        initComponents();
        cursoController = new CursoController();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfNombreCurso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jtfDuracion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jtfNombreCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreCursoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del Curso");

        jbGuardar.setText("GUARDAR CURSO");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jtfDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDuracionActionPerformed(evt);
            }
        });

        jLabel2.setText("Duracion del Curso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbGuardar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jtfNombreCurso))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGuardar)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNombreCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreCursoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        Curso curso = new Curso(jtfNombreCurso.getText());
        curso.setDuracion(Integer.valueOf(jtfDuracion.getText()));
        this.cursoController.insertObject(curso);
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtfDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDuracionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JTextField jtfDuracion;
    private javax.swing.JTextField jtfNombreCurso;
    // End of variables declaration//GEN-END:variables
}
