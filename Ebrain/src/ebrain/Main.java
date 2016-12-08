/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebrain;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.layout.HierarchicalLayout;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author Juan O'Hara
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    LinkedList<Perfil> perfiles = new LinkedList<>();

    public Main() {
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

        MEnuDAtos = new javax.swing.JDialog();
        PerfBT = new javax.swing.JButton();
        GeneaBT = new javax.swing.JButton();
        PalabraBT = new javax.swing.JButton();
        MapaBT = new javax.swing.JButton();
        JPerfiles = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NomTF = new javax.swing.JTextField();
        RazaCB = new javax.swing.JComboBox<>();
        GenCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        OBSTA = new javax.swing.JTextArea();
        AgrePErBT = new javax.swing.JButton();
        DateCh = new com.toedter.calendar.JDateChooser();
        JGenea = new javax.swing.JDialog();
        JPalabras = new javax.swing.JDialog();
        JMapa = new javax.swing.JDialog();
        BTDatos = new javax.swing.JButton();

        PerfBT.setText("Perfiles");
        PerfBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfBTActionPerformed(evt);
            }
        });

        GeneaBT.setText("Genealogía");
        GeneaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneaBTActionPerformed(evt);
            }
        });

        PalabraBT.setText("Palabras");

        MapaBT.setText("Mapas Conceptuales");

        javax.swing.GroupLayout MEnuDAtosLayout = new javax.swing.GroupLayout(MEnuDAtos.getContentPane());
        MEnuDAtos.getContentPane().setLayout(MEnuDAtosLayout);
        MEnuDAtosLayout.setHorizontalGroup(
            MEnuDAtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MEnuDAtosLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(MEnuDAtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PerfBT, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PalabraBT))
                .addGap(28, 28, 28)
                .addGroup(MEnuDAtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GeneaBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MapaBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(81, 81, 81))
        );
        MEnuDAtosLayout.setVerticalGroup(
            MEnuDAtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEnuDAtosLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(MEnuDAtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PerfBT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GeneaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(MEnuDAtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MapaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PalabraBT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        jLabel1.setText("Nombre");

        jLabel2.setText("Raza");

        jLabel3.setText("Género");

        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setText("Observaciones");

        RazaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caucasoide", "Congoide", "Capoide", "Mongoloide", "Australoide", " " }));

        GenCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        OBSTA.setColumns(20);
        OBSTA.setRows(5);
        jScrollPane1.setViewportView(OBSTA);

        AgrePErBT.setText("Agregar");
        AgrePErBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgrePErBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPerfilesLayout = new javax.swing.GroupLayout(JPerfiles.getContentPane());
        JPerfiles.getContentPane().setLayout(JPerfilesLayout);
        JPerfilesLayout.setHorizontalGroup(
            JPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPerfilesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(JPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(JPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgrePErBT)
                    .addGroup(JPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(NomTF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RazaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateCh, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        JPerfilesLayout.setVerticalGroup(
            JPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPerfilesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(JPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NomTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(JPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(RazaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(JPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(GenCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(JPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(DateCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(JPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPerfilesLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JPerfilesLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(AgrePErBT)))
                .addContainerGap())
        );

        javax.swing.GroupLayout JGeneaLayout = new javax.swing.GroupLayout(JGenea.getContentPane());
        JGenea.getContentPane().setLayout(JGeneaLayout);
        JGeneaLayout.setHorizontalGroup(
            JGeneaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JGeneaLayout.setVerticalGroup(
            JGeneaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPalabrasLayout = new javax.swing.GroupLayout(JPalabras.getContentPane());
        JPalabras.getContentPane().setLayout(JPalabrasLayout);
        JPalabrasLayout.setHorizontalGroup(
            JPalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JPalabrasLayout.setVerticalGroup(
            JPalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JMapaLayout = new javax.swing.GroupLayout(JMapa.getContentPane());
        JMapa.getContentPane().setLayout(JMapaLayout);
        JMapaLayout.setHorizontalGroup(
            JMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JMapaLayout.setVerticalGroup(
            JMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));

        BTDatos.setText("Datos");
        BTDatos.setMaximumSize(new java.awt.Dimension(74, 23));
        BTDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(BTDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(BTDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTDatosActionPerformed
        // TODO add your handling code here:
        MEnuDAtos.setModal(true);
        MEnuDAtos.pack();
        MEnuDAtos.setLocationRelativeTo(this);
        MEnuDAtos.setVisible(true);
    }//GEN-LAST:event_BTDatosActionPerformed

    private void GeneaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneaBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneaBTActionPerformed

    private void AgrePErBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgrePErBTActionPerformed
        // TODO add your handling code here:
        String nombre = NomTF.getText(), raza = RazaCB.getSelectedItem().toString();
        String genero = GenCB.getSelectedItem().toString(), observaciones = OBSTA.getText();
        Date nacimiento = DateCh.getDate();
        System.out.println(nombre + "-" + raza + "-" + genero + "-" + nacimiento);
        System.out.println(observaciones);
        Perfil nuevo = new Perfil(nombre, raza, genero, nacimiento, observaciones);
        perfiles.add(nuevo);
        NomTF.setText("");
        RazaCB.setSelectedIndex(0);
        GenCB.setSelectedIndex(0);
        OBSTA.setText("");
        DateCh.setDate(new Date(System.currentTimeMillis()));
    }//GEN-LAST:event_AgrePErBTActionPerformed

    private void PerfBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfBTActionPerformed
        // TODO add your handling code here:
        JPerfiles.setModal(true);
        JPerfiles.pack();
        JPerfiles.setLocationRelativeTo(this);
        JPerfiles.setVisible(true);
    }//GEN-LAST:event_PerfBTActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgrePErBT;
    private javax.swing.JButton BTDatos;
    private com.toedter.calendar.JDateChooser DateCh;
    private javax.swing.JComboBox<String> GenCB;
    private javax.swing.JButton GeneaBT;
    private javax.swing.JDialog JGenea;
    private javax.swing.JDialog JMapa;
    private javax.swing.JDialog JPalabras;
    private javax.swing.JDialog JPerfiles;
    private javax.swing.JDialog MEnuDAtos;
    private javax.swing.JButton MapaBT;
    private javax.swing.JTextField NomTF;
    private javax.swing.JTextArea OBSTA;
    private javax.swing.JButton PalabraBT;
    private javax.swing.JButton PerfBT;
    private javax.swing.JComboBox<String> RazaCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}