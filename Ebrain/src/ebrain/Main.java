package ebrain;

import java.awt.HeadlessException;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.graphstream.graph.EdgeRejectedException;
import org.graphstream.graph.ElementNotFoundException;
import org.graphstream.graph.Graph;
import org.graphstream.graph.IdAlreadyInUseException;
import org.graphstream.graph.implementations.AdjacencyListGraph;
import org.graphstream.ui.view.Viewer;
import scala.collection.immutable.RedBlack;

public class Main extends javax.swing.JFrame {

    LinkedList<Perfil> perfiles = new LinkedList<>();
    LinkedList<String> palabras = new LinkedList<>();
    LinkedList<AdjacencyListGraph> mapas = new LinkedList<>();

    public Main() {
        initComponents();
        ListPalabras.setEditable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MEnuDAtos = new javax.swing.JDialog();
        PerfPalaBT = new javax.swing.JButton();
        EditarBT = new javax.swing.JButton();
        MapaGeneaBT = new javax.swing.JButton();
        JGeneaMaps = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListPal1 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        ListPal2 = new javax.swing.JList<>();
        BTConectar = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        CBMapas = new javax.swing.JComboBox<>();
        JEdit = new javax.swing.JDialog();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        NomTF1 = new javax.swing.JTextField();
        RazaCB1 = new javax.swing.JComboBox<>();
        GenCB1 = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        OBSTA1 = new javax.swing.JTextArea();
        AgrePErBT1 = new javax.swing.JButton();
        DateCh1 = new com.toedter.calendar.JDateChooser();
        CBEditPEr = new javax.swing.JComboBox<>();
        EliminarBT = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        TFPalabra1 = new javax.swing.JTextField();
        EditPalabra1 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        JLisEditPal = new javax.swing.JList<>();
        ELimPalabraBT = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        TFArbol1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        TFMapas1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        BTAddArbMap1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        JlistArbEdit = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        JlistMapasEdit = new javax.swing.JList<>();
        ELiminarArbBT = new javax.swing.JButton();
        EliminarMapasBT = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        JListConex = new javax.swing.JList<>();
        BTConectar1 = new javax.swing.JButton();
        jSlider2 = new javax.swing.JSlider();
        CBMapas1 = new javax.swing.JComboBox<>();
        EliminarConexBT = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        JPerfPal = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TFPalabra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TAPalabras = new javax.swing.JTextArea();
        AgregarPalabra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListPalabras = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        TFArbol = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TFMapas = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        BTAddArbMap = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        TAatboles = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TAmapas = new javax.swing.JTextArea();
        BTDatos = new javax.swing.JButton();

        PerfPalaBT.setText("Perfiles/ Palabras/Arboles/Mapas");
        PerfPalaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfPalaBTActionPerformed(evt);
            }
        });

        EditarBT.setText("Editar");
        EditarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBTActionPerformed(evt);
            }
        });

        MapaGeneaBT.setText("Mapas y Genealogías");
        MapaGeneaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapaGeneaBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MEnuDAtosLayout = new javax.swing.GroupLayout(MEnuDAtos.getContentPane());
        MEnuDAtos.getContentPane().setLayout(MEnuDAtosLayout);
        MEnuDAtosLayout.setHorizontalGroup(
            MEnuDAtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MEnuDAtosLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(MEnuDAtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PerfPalaBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditarBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MapaGeneaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );
        MEnuDAtosLayout.setVerticalGroup(
            MEnuDAtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MEnuDAtosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PerfPalaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(MapaGeneaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(EditarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Genealogía", jPanel4);

        jLabel8.setText("Palabra");

        jLabel9.setText("Palabra");

        jScrollPane4.setViewportView(ListPal1);

        jScrollPane5.setViewportView(ListPal2);

        BTConectar.setText("Conectar");
        BTConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTConectarActionPerformed(evt);
            }
        });

        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(5);
        jSlider1.setMinimum(1);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setToolTipText("");
        jSlider1.setValue(3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(101, 101, 101))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BTConectar)
                    .addComponent(jSlider1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(CBMapas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(CBMapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)))
                .addComponent(BTConectar)
                .addGap(23, 23, 23))
        );

        jTabbedPane2.addTab("Mapas", jPanel5);

        javax.swing.GroupLayout JGeneaMapsLayout = new javax.swing.GroupLayout(JGeneaMaps.getContentPane());
        JGeneaMaps.getContentPane().setLayout(JGeneaMapsLayout);
        JGeneaMapsLayout.setHorizontalGroup(
            JGeneaMapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JGeneaMapsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        JGeneaMapsLayout.setVerticalGroup(
            JGeneaMapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JGeneaMapsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jLabel10.setText("Nombre");

        jLabel17.setText("Raza");

        jLabel18.setText("Género");

        jLabel19.setText("Fecha de Nacimiento");

        jLabel20.setText("Observaciones");

        RazaCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caucasoide", "Congoide", "Capoide", "Mongoloide", "Australoide", " " }));

        GenCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        OBSTA1.setColumns(20);
        OBSTA1.setRows(5);
        jScrollPane8.setViewportView(OBSTA1);

        AgrePErBT1.setText("Editar");
        AgrePErBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgrePErBT1ActionPerformed(evt);
            }
        });

        CBEditPEr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEditPErActionPerformed(evt);
            }
        });

        EliminarBT.setText("Eliminar");
        EliminarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(AgrePErBT1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane8)
                                        .addComponent(NomTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(RazaCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GenCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateCh1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(CBEditPEr, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(EliminarBT)))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBEditPEr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(NomTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(RazaCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(GenCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(DateCh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(AgrePErBT1)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Perfiles", jPanel6);

        jLabel21.setText("Concepto");

        EditPalabra1.setText("Editar");
        EditPalabra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPalabra1ActionPerformed(evt);
            }
        });

        jScrollPane13.setViewportView(JLisEditPal);

        ELimPalabraBT.setText("Eliminar");
        ELimPalabraBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELimPalabraBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel21)
                        .addGap(34, 34, 34)
                        .addComponent(TFPalabra1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(EditPalabra1)))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ELimPalabraBT)
                .addGap(58, 58, 58))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(ELimPalabraBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFPalabra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(52, 52, 52)
                .addComponent(EditPalabra1)
                .addGap(85, 85, 85))
        );

        jTabbedPane3.addTab("Conceptos", jPanel7);

        jLabel24.setText("Mapas");

        BTAddArbMap1.setText("Agregar");
        BTAddArbMap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAddArbMap1ActionPerformed(evt);
            }
        });

        jLabel26.setText("Arboles");

        jScrollPane9.setViewportView(JlistArbEdit);

        jScrollPane10.setViewportView(JlistMapasEdit);

        ELiminarArbBT.setText("Eliminar");

        EliminarMapasBT.setText("Eliminar");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(BTAddArbMap1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(129, 129, 129)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ELiminarArbBT)
                                .addGap(66, 66, 66))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(141, 141, 141)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(EliminarMapasBT)
                                .addGap(61, 61, 61))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(TFArbol1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(TFMapas1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(ELiminarArbBT)))
                .addGap(20, 20, 20)
                .addComponent(TFArbol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EliminarMapasBT)
                        .addGap(129, 129, 129)))
                .addComponent(TFMapas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTAddArbMap1))
        );

        jTabbedPane3.addTab("Arboles y Mapas", jPanel8);

        jLabel22.setText("Conexiones");

        jScrollPane11.setViewportView(JListConex);

        BTConectar1.setText("Conectar");
        BTConectar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTConectar1ActionPerformed(evt);
            }
        });

        jSlider2.setMajorTickSpacing(1);
        jSlider2.setMaximum(5);
        jSlider2.setMinimum(1);
        jSlider2.setMinorTickSpacing(1);
        jSlider2.setPaintLabels(true);
        jSlider2.setToolTipText("");
        jSlider2.setValue(3);

        EliminarConexBT.setText("Eliminar");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CBMapas1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(12, 12, 12)))
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BTConectar1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(9, 9, 9)))
                .addGap(101, 182, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EliminarConexBT)
                .addGap(32, 32, 32))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(CBMapas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(EliminarConexBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(BTConectar1)
                .addGap(54, 54, 54))
        );

        jTabbedPane3.addTab("Mapas Conceptuales", jPanel9);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Genealogía", jPanel10);

        javax.swing.GroupLayout JEditLayout = new javax.swing.GroupLayout(JEdit.getContentPane());
        JEdit.getContentPane().setLayout(JEditLayout);
        JEditLayout.setHorizontalGroup(
            JEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        JEditLayout.setVerticalGroup(
            JEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgrePErBT)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(NomTF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RazaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateCh, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NomTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(RazaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(GenCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(DateCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AgrePErBT)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Perfiles", jPanel1);

        jLabel6.setText("Concepto");

        jLabel7.setText("Conceptos");

        TAPalabras.setColumns(20);
        TAPalabras.setRows(5);
        jScrollPane3.setViewportView(TAPalabras);

        AgregarPalabra.setText("Agregar");
        AgregarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarPalabraActionPerformed(evt);
            }
        });

        ListPalabras.setColumns(20);
        ListPalabras.setRows(5);
        jScrollPane2.setViewportView(ListPalabras);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(34, 34, 34)
                                .addComponent(TFPalabra)
                                .addGap(8, 8, 8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(AgregarPalabra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(65, 65, 65)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AgregarPalabra))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Conceptos", jPanel2);

        jLabel11.setText("Nombre");

        jLabel12.setText("Mapas");

        jLabel13.setText("Nombre");

        BTAddArbMap.setText("Agregar");
        BTAddArbMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAddArbMapActionPerformed(evt);
            }
        });

        TAatboles.setColumns(20);
        TAatboles.setRows(5);
        jScrollPane6.setViewportView(TAatboles);

        jLabel14.setText("Arboles");

        jLabel15.setText("Nombres");

        jLabel16.setText("Nombres");

        TAmapas.setColumns(20);
        TAmapas.setRows(5);
        jScrollPane7.setViewportView(TAmapas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(TFArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(153, 153, 153)
                                        .addComponent(BTAddArbMap)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(TFMapas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(9, 9, 9)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFArbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFMapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTAddArbMap))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Arboles y Mapas", jPanel3);

        javax.swing.GroupLayout JPerfPalLayout = new javax.swing.GroupLayout(JPerfPal.getContentPane());
        JPerfPal.getContentPane().setLayout(JPerfPalLayout);
        JPerfPalLayout.setHorizontalGroup(
            JPerfPalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPerfPalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        JPerfPalLayout.setVerticalGroup(
            JPerfPalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPerfPalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        MEnuDAtos.setLocationRelativeTo(null);
        MEnuDAtos.setVisible(true);
    }//GEN-LAST:event_BTDatosActionPerformed

    private void EditarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBTActionPerformed
        // TODO add your handling code here:
        NomTF1.setText("");
        RazaCB1.setSelectedIndex(0);
        GenCB1.setSelectedIndex(0);
        OBSTA1.setText("");
        DateCh1.setDate(new Date(System.currentTimeMillis()));
        DefaultComboBoxModel modMap = new DefaultComboBoxModel();
        DefaultListModel modelMap = new DefaultListModel();
        if (!mapas.isEmpty()) {

            for (int i = 0; i < mapas.size(); i++) {
                modMap.addElement(mapas.get(i));
                modelMap.addElement(mapas.get(i));
            }

        }
        JlistMapasEdit.setModel(modelMap);
        CBMapas1.setModel(modMap);
        DefaultComboBoxModel modPerf = new DefaultComboBoxModel();
        if (!perfiles.isEmpty()) {

            for (int i = 0; i < perfiles.size(); i++) {
                modPerf.addElement(perfiles.get(i));
            }

        }
        CBEditPEr.setModel(modPerf);
        DefaultListModel modPal = new DefaultListModel();
        if (!palabras.isEmpty()) {

            for (int i = 0; i < palabras.size(); i++) {
                modPal.addElement(palabras.get(i));
            }

        }
        JLisEditPal.setModel(modPal);
        JEdit.setModal(true);
        JEdit.pack();
        JEdit.setLocationRelativeTo(null);
        JEdit.setVisible(true);
    }//GEN-LAST:event_EditarBTActionPerformed

    private void AgrePErBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgrePErBTActionPerformed
        // TODO add your handling code here:
        String nombre = NomTF.getText(), raza = RazaCB.getSelectedItem().toString();
        String genero = GenCB.getSelectedItem().toString(), observaciones = OBSTA.getText();
        Date nacimiento = DateCh.getDate();
        Perfil nuevo = new Perfil(nombre, raza, genero, nacimiento, observaciones);
        if (!perfiles.contains(nuevo)) {
            perfiles.add(nuevo);
        } else {
            JOptionPane.showMessageDialog(null, "Ya existe este perfil!!!");
        }
        NomTF.setText("");
        RazaCB.setSelectedIndex(0);
        GenCB.setSelectedIndex(0);
        OBSTA.setText("");
        DateCh.setDate(new Date(System.currentTimeMillis()));
    }//GEN-LAST:event_AgrePErBTActionPerformed

    private void PerfPalaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfPalaBTActionPerformed
        // TODO add your handling code here:
        if (!palabras.isEmpty()) {
            ListPalabras.setText("");
            for (int i = 0; i < palabras.size(); i++) {
                ListPalabras.append(palabras.get(i) + "\n");
            }
        }
        JPerfPal.setModal(true);
        JPerfPal.pack();
        JPerfPal.setLocationRelativeTo(this);
        JPerfPal.setVisible(true);
    }//GEN-LAST:event_PerfPalaBTActionPerformed

    private void AgregarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarPalabraActionPerformed
        // TODO add your handling code here:
        if (TFPalabra.getText().equals("")) {
            for (String tmp : TAPalabras.getText().split("\\n")) {
                if (!palabras.contains(tmp)) {
                    palabras.add(tmp);
                    ListPalabras.append(tmp + "\n");
                }
            }
            TAPalabras.setText("");
        } else if (TAPalabras.getText().equals("")) {
            if (!palabras.contains(TFPalabra.getText())) {
                palabras.add(TFPalabra.getText());
                ListPalabras.append(TFPalabra.getText() + "\n");
            }
            TFPalabra.setText("");
        } else {
            if (!palabras.contains(TFPalabra.getText())) {
                palabras.add(TFPalabra.getText());
                ListPalabras.append(TFPalabra.getText() + "\n");
            }
            TFPalabra.setText("");
            for (String tmp : TAPalabras.getText().split("\\n")) {
                if (!palabras.contains(tmp)) {
                    palabras.add(tmp);
                    ListPalabras.append(tmp + "\n");
                }
            }
            TAPalabras.setText("");

        }
        System.out.println(palabras);
    }//GEN-LAST:event_AgregarPalabraActionPerformed

    private void MapaGeneaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapaGeneaBTActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo1 = new DefaultListModel();
        if (!palabras.isEmpty()) {
            for (int i = 0; i < palabras.size(); i++) {
                modelo1.addElement(palabras.get(i));
            }
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        if (!mapas.isEmpty()) {
            for (int i = 0; i < mapas.size(); i++) {
                model.addElement(mapas.get(i));
            }
        }
        ListPal1.setModel(modelo1);
        ListPal2.setModel(modelo1);
        CBMapas.setModel(model);
        JGeneaMaps.setModal(true);
        JGeneaMaps.pack();
        JGeneaMaps.setLocationRelativeTo(this);
        JGeneaMaps.setVisible(true);
    }//GEN-LAST:event_MapaGeneaBTActionPerformed

    private void BTConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConectarActionPerformed
        // TODO add your handling code here:
        try {
            String select1 = ListPal1.getSelectedValue();
            String select2 = ListPal2.getSelectedValue();
            if (!select1.equals(select2) && !(ListPal1.isSelectionEmpty() || ListPal2.isSelectionEmpty()) && CBMapas.getItemCount() != 0) {
                int pos = CBMapas.getSelectedIndex();
                String id = select1 + select2 + "-" + select2 + select1;
                int length = jSlider1.getValue();
                AdjacencyListGraph tmp = mapas.get(pos);
                tmp.addNode(select1);
                tmp.addNode(select2);
                if (tmp.addEdge(id, select1, select2, false) != null) {
                    tmp.getEdge(id).addAttribute("length", length);
                }
                Viewer view = tmp.display();
                view.setCloseFramePolicy(Viewer.CloseFramePolicy.CLOSE_VIEWER);

            } else {
                JOptionPane.showMessageDialog(null, "No pueden ser iguales!!!");
            }

            ListPal1.clearSelection();
            ListPal2.clearSelection();
            jSlider1.setValue(3);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BTConectarActionPerformed

    private void BTAddArbMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAddArbMapActionPerformed
        // TODO add your handling code here:
        if (TFArbol.getText().equals("") && TAmapas.getText().equals("") && TFMapas.getText().equals("")) {
            for (String tmp : TAatboles.getText().split("\\n")) {
                /*if (!arboles.contains(tmp)) {
                    arboles.add(tmp);
                }*/
            }
        } else if (TAatboles.getText().equals("") && TAmapas.getText().equals("") && TFMapas.getText().equals("")) {
            /*if (!arboles.contains(TFArbol.getText())) {
                arboles.add( nuevo arbol);
            }*/
        } else if (TFMapas.getText().equals("") && TFArbol.getText().equals("") && TAatboles.getText().equals("")) {
            for (String tmp : TAmapas.getText().split("\\n")) {
                AdjacencyListGraph tmps = new AdjacencyListGraph(tmp, false, true);
                if (!mapas.contains(tmps)) {
                    mapas.add(tmps);
                }
            }
        } else if (TAmapas.getText().equals("") && TFArbol.getText().equals("") && TAatboles.getText().equals("")) {
            AdjacencyListGraph tmps = new AdjacencyListGraph(TFMapas.getText(), false, true);
            if (!mapas.contains(tmps)) {
                mapas.add(tmps);
            }
        } else if (TAmapas.getText().equals("") && TFMapas.getText().equals("")) {
            /*if (!arboles.contains(este arbol) {
                arboles.add(este arbol);
            }
            TFPalabra.setText("");
            for (String tmp : TAPalabras.getText().split("\\n")) {
                nuevo arbol tmps
                if (!arboles.contains(tmps)) {
                    arboles.add(tmps);
                }
            }*/
        } else if (TFArbol.getText().equals("") && TAatboles.getText().equals("")) {
            for (String tmp : TAmapas.getText().split("\\n")) {
                AdjacencyListGraph tmps = new AdjacencyListGraph(tmp, false, true);
                if (!mapas.contains(tmps)) {
                    mapas.add(tmps);
                }
            }
            AdjacencyListGraph tmps = new AdjacencyListGraph(TFMapas.getText(), false, true);
            if (!mapas.contains(tmps)) {
                mapas.add(tmps);
            }
        } else {
            /*if (!arboles.contains(este arbol) {
                arboles.add(este arbol);
            }
            TFPalabra.setText("");
            for (String tmp : TAPalabras.getText().split("\\n")) {
                nuevo arbol tmps
                if (!arboles.contains(tmps)) {
                    arboles.add(tmps);
                }
            }*/
            for (String tmp : TAmapas.getText().split("\\n")) {
                AdjacencyListGraph tmps = new AdjacencyListGraph(tmp, false, true);
                if (!mapas.contains(tmps)) {
                    mapas.add(tmps);
                }
            }
            AdjacencyListGraph tmps = new AdjacencyListGraph(TFMapas.getText(), false, true);
            if (!mapas.contains(tmps)) {
                mapas.add(tmps);
            }
        }
        TAatboles.setText("");
        TAmapas.setText("");
        TFMapas.setText("");
        TFArbol.setText("");
    }//GEN-LAST:event_BTAddArbMapActionPerformed

    private void AgrePErBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgrePErBT1ActionPerformed
        // TODO add your handling code here:
        String nombre = NomTF1.getText(), raza = RazaCB1.getSelectedItem().toString();
        String genero = GenCB1.getSelectedItem().toString(), observaciones = OBSTA1.getText();
        Date nacimiento = DateCh1.getDate();
        int pos = CBEditPEr.getSelectedIndex();
        if (pos > -1) {
            Perfil actual = perfiles.get(pos);
            actual.setNombre(nombre);
            actual.setFechaN(nacimiento);
            actual.setGenero(genero);
            actual.setObservaciones(observaciones);
            actual.setRaza(raza);
        }
        NomTF1.setText("");
        RazaCB1.setSelectedIndex(0);
        GenCB1.setSelectedIndex(0);
        OBSTA1.setText("");
        DateCh1.setDate(new Date(System.currentTimeMillis()));
    }//GEN-LAST:event_AgrePErBT1ActionPerformed

    private void EditPalabra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPalabra1ActionPerformed
        // TODO add your handling code here:
        if (JLisEditPal.getSelectedIndex() > -1) {
            palabras.set(JLisEditPal.getSelectedIndex(), TFPalabra1.getText());

        }
        DefaultListModel modPal = new DefaultListModel();
        if (!palabras.isEmpty()) {
            for (int i = 0; i < palabras.size(); i++) {
                modPal.addElement(palabras.get(i));
            }
        }
        JLisEditPal.setModel(modPal);
        TFPalabra1.setText("");
    }//GEN-LAST:event_EditPalabra1ActionPerformed

    private void BTAddArbMap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAddArbMap1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTAddArbMap1ActionPerformed

    private void BTConectar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTConectar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTConectar1ActionPerformed

    private void CBEditPErActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEditPErActionPerformed
        // TODO add your handling code here:
        int pos = CBEditPEr.getSelectedIndex();
        Perfil actual = perfiles.get(pos);
        NomTF1.setText(actual.getNombre());
        RazaCB1.setSelectedItem(actual.getRaza());
        GenCB1.setSelectedItem(actual.getGenero());
        DateCh1.setDate(new Date(actual.getFechaN().getTime()));
        OBSTA1.setText(actual.getObservaciones());
    }//GEN-LAST:event_CBEditPErActionPerformed

    private void EliminarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBTActionPerformed
        // TODO add your handling code here:
        try {
            System.out.println(perfiles.remove((Perfil) CBEditPEr.getSelectedItem()));
            DefaultComboBoxModel modPerf = new DefaultComboBoxModel();
            if (!perfiles.isEmpty()) {

                for (int i = 0; i < perfiles.size(); i++) {
                    modPerf.addElement(perfiles.get(i));
                }

            }
            CBEditPEr.setModel(modPerf);
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_EliminarBTActionPerformed

    private void ELimPalabraBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELimPalabraBTActionPerformed
        // TODO add your handling code here:
        if (JLisEditPal.getSelectedIndex() > -1) {
            palabras.remove(JLisEditPal.getSelectedIndex());
        }
        DefaultListModel modPal = new DefaultListModel();
        if (!palabras.isEmpty()) {
            for (int i = 0; i < palabras.size(); i++) {
                modPal.addElement(palabras.get(i));
            }
        }
        JLisEditPal.setModel(modPal);
        TFPalabra1.setText("");
    }//GEN-LAST:event_ELimPalabraBTActionPerformed

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
    private javax.swing.JButton AgrePErBT1;
    private javax.swing.JButton AgregarPalabra;
    private javax.swing.JButton BTAddArbMap;
    private javax.swing.JButton BTAddArbMap1;
    private javax.swing.JButton BTConectar;
    private javax.swing.JButton BTConectar1;
    private javax.swing.JButton BTDatos;
    private javax.swing.JComboBox<String> CBEditPEr;
    private javax.swing.JComboBox<String> CBMapas;
    private javax.swing.JComboBox<String> CBMapas1;
    private com.toedter.calendar.JDateChooser DateCh;
    private com.toedter.calendar.JDateChooser DateCh1;
    private javax.swing.JButton ELimPalabraBT;
    private javax.swing.JButton ELiminarArbBT;
    private javax.swing.JButton EditPalabra1;
    private javax.swing.JButton EditarBT;
    private javax.swing.JButton EliminarBT;
    private javax.swing.JButton EliminarConexBT;
    private javax.swing.JButton EliminarMapasBT;
    private javax.swing.JComboBox<String> GenCB;
    private javax.swing.JComboBox<String> GenCB1;
    private javax.swing.JDialog JEdit;
    private javax.swing.JDialog JGeneaMaps;
    private javax.swing.JList<String> JLisEditPal;
    private javax.swing.JList<String> JListConex;
    private javax.swing.JDialog JPerfPal;
    private javax.swing.JList<String> JlistArbEdit;
    private javax.swing.JList<String> JlistMapasEdit;
    private javax.swing.JList<String> ListPal1;
    private javax.swing.JList<String> ListPal2;
    private javax.swing.JTextArea ListPalabras;
    private javax.swing.JDialog MEnuDAtos;
    private javax.swing.JButton MapaGeneaBT;
    private javax.swing.JTextField NomTF;
    private javax.swing.JTextField NomTF1;
    private javax.swing.JTextArea OBSTA;
    private javax.swing.JTextArea OBSTA1;
    private javax.swing.JButton PerfPalaBT;
    private javax.swing.JComboBox<String> RazaCB;
    private javax.swing.JComboBox<String> RazaCB1;
    private javax.swing.JTextArea TAPalabras;
    private javax.swing.JTextArea TAatboles;
    private javax.swing.JTextArea TAmapas;
    private javax.swing.JTextField TFArbol;
    private javax.swing.JTextField TFArbol1;
    private javax.swing.JTextField TFMapas;
    private javax.swing.JTextField TFMapas1;
    private javax.swing.JTextField TFPalabra;
    private javax.swing.JTextField TFPalabra1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    // End of variables declaration//GEN-END:variables
}
