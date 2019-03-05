package contabilidad.bar;
/**
 *
 * @author Kevin
 */

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import jxl.*;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Principal extends javax.swing.JFrame {
    String archivo = EscogerPath();
    int cantidadProductos=contarProductos();
    String fecha = obtenerFecha();
    int cantidadFechas = contarFechas();
    double dineroCobrado =0.0;
    double montoAnteriorFiado =0.0;

    public Principal() {
        initComponents();
        this.RefrescarInventario();
        this.RefrescarProductos();
        this.cargarTablaFiado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jTabbedPane = new javax.swing.JTabbedPane();
        INVENTARIO = new javax.swing.JPanel();
        PanelInventario = new javax.swing.JScrollPane();
        TablaInventario = new javax.swing.JTable();
        BtNuevoProducto = new javax.swing.JButton();
        BtEditarProducto = new javax.swing.JButton();
        BtIngresarStock = new javax.swing.JButton();
        BtIRefrescar = new javax.swing.JButton();
        CUADRE = new javax.swing.JPanel();
        BtCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaFiados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LbVentaEfectivo = new javax.swing.JLabel();
        LbVentaFiado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Txt50Ctvs = new javax.swing.JTextField();
        Txt1DolarMoneda = new javax.swing.JTextField();
        Txt25Ctvs = new javax.swing.JTextField();
        Txt10Ctvs = new javax.swing.JTextField();
        Txt1Ctv = new javax.swing.JTextField();
        Txt5Ctvs = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Txt1DolarBillete = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Txt5Dolares = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Txt10Dolares = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Txt20Dolares = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Txt50Dolares = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        LbTotalDineroExiste = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        LbDescuadre = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        LbFecha = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        LbTotalVenta = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        LbMontoTotalFiado = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        BtGuardarDatos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        LbCobroFiado = new javax.swing.JLabel();
        LbSueltos = new javax.swing.JLabel();
        BtSueltos = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneMouseClicked(evt);
            }
        });
        jTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPaneStateChanged(evt);
            }
        });

        INVENTARIO.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                INVENTARIOAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        TablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        TablaInventario.setAutoscrolls(false);
        PanelInventario.setViewportView(TablaInventario);

        BtNuevoProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtNuevoProducto.setText("Nuevo Producto");
        BtNuevoProducto.setToolTipText("");
        BtNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtNuevoProductoActionPerformed(evt);
            }
        });

        BtEditarProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtEditarProducto.setText("Editar Producto");
        BtEditarProducto.setToolTipText("");
        BtEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditarProductoActionPerformed(evt);
            }
        });

        BtIngresarStock.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtIngresarStock.setText("Actualizar Stock");
        BtIngresarStock.setToolTipText("");
        BtIngresarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIngresarStockActionPerformed(evt);
            }
        });

        BtIRefrescar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtIRefrescar.setText("Refrescar Tabla");
        BtIRefrescar.setToolTipText("");
        BtIRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout INVENTARIOLayout = new javax.swing.GroupLayout(INVENTARIO);
        INVENTARIO.setLayout(INVENTARIOLayout);
        INVENTARIOLayout.setHorizontalGroup(
            INVENTARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INVENTARIOLayout.createSequentialGroup()
                .addComponent(PanelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(INVENTARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtEditarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtIngresarStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtNuevoProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtIRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        INVENTARIOLayout.setVerticalGroup(
            INVENTARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addGroup(INVENTARIOLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(BtIRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtIngresarStock, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(BtNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(BtEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jTabbedPane.addTab("INVENTARIO", INVENTARIO);

        CUADRE.setPreferredSize(new java.awt.Dimension(930, 500));
        CUADRE.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CUADREAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        BtCalcular.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtCalcular.setText("CALCULAR");
        BtCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCalcularActionPerformed(evt);
            }
        });

        TablaFiados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaFiados);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DINERO CALCULADO");

        jLabel2.setText("EFECTIVO: ");

        jLabel3.setText("FIADO:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DINERO EXISTENTE");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("BILLETES");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("MONEDAS");

        jLabel9.setText("1 DOLAR: ");

        jLabel10.setText("50 CENTAVOS: ");

        jLabel11.setText("25 CENTAVOS: ");

        jLabel12.setText("10 CENTAVOS: ");

        jLabel13.setText("5 CENTAVOS: ");

        jLabel14.setText("1 CENTAVO: ");

        Txt50Ctvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt50CtvsActionPerformed(evt);
            }
        });

        Txt1DolarMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1DolarMonedaActionPerformed(evt);
            }
        });

        Txt25Ctvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt25CtvsActionPerformed(evt);
            }
        });

        Txt10Ctvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt10CtvsActionPerformed(evt);
            }
        });

        Txt1Ctv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1CtvActionPerformed(evt);
            }
        });

        Txt5Ctvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5CtvsActionPerformed(evt);
            }
        });

        jLabel15.setText("1 DOLAR: ");

        Txt1DolarBillete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1DolarBilleteActionPerformed(evt);
            }
        });

        jLabel16.setText("5 DOLARES: ");

        Txt5Dolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5DolaresActionPerformed(evt);
            }
        });

        jLabel17.setText("10 DOLARES:");

        Txt10Dolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt10DolaresActionPerformed(evt);
            }
        });

        jLabel18.setText("20 DOLARES: ");

        Txt20Dolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt20DolaresActionPerformed(evt);
            }
        });

        jLabel19.setText("50 DOLARES: ");

        Txt50Dolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt50DolaresActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("TOTAL:");

        LbTotalDineroExiste.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel21.setText("$");

        LbDescuadre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LbDescuadre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel22.setText("SUELTOS: ");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("$");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("DESCUADRE");

        jLabel25.setText("COBRO FIADOS:");

        jLabel26.setText("$");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("FECHA:");

        LbFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("TOTAL:");

        LbTotalVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel29.setText("Monto Fiado:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("$");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("$");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("$");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("$");

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaProductos);

        BtGuardarDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtGuardarDatos.setText("Guardar Datos");
        BtGuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtGuardarDatosActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        LbCobroFiado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LbSueltos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        BtSueltos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtSueltos.setText("SUELTOS");
        BtSueltos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSueltosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CUADRELayout = new javax.swing.GroupLayout(CUADRE);
        CUADRE.setLayout(CUADRELayout);
        CUADRELayout.setHorizontalGroup(
            CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CUADRELayout.createSequentialGroup()
                .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CUADRELayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CUADRELayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(6, 6, 6)
                                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LbVentaEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LbVentaFiado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LbTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(LbSueltos, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                .addComponent(LbCobroFiado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(6, 6, 6)
                                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel31)))
                                    .addGroup(CUADRELayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(BtCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CUADRELayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtSueltos)
                                .addGap(34, 34, 34)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel8))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel9)
                                .addGap(10, 10, 10)
                                .addComponent(Txt1DolarMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel10)
                                .addGap(10, 10, 10)
                                .addComponent(Txt50Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel11)
                                .addGap(10, 10, 10)
                                .addComponent(Txt25Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel12)
                                .addGap(10, 10, 10)
                                .addComponent(Txt10Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel13)
                                .addGap(10, 10, 10)
                                .addComponent(Txt5Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel14)
                                .addGap(10, 10, 10)
                                .addComponent(Txt1Ctv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel7))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel15)
                                .addGap(10, 10, 10)
                                .addComponent(Txt1DolarBillete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel16)
                                .addGap(10, 10, 10)
                                .addComponent(Txt5Dolares, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel17)
                                .addGap(10, 10, 10)
                                .addComponent(Txt10Dolares, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel18)
                                .addGap(10, 10, 10)
                                .addComponent(Txt20Dolares, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel19)
                                .addGap(10, 10, 10)
                                .addComponent(Txt50Dolares, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel20)
                                .addGap(6, 6, 6)
                                .addComponent(LbTotalDineroExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel32))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(BtGuardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CUADRELayout.createSequentialGroup()
                        .addGap(486, 486, 486)
                        .addComponent(jLabel29)
                        .addGap(10, 10, 10)
                        .addComponent(LbMontoTotalFiado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel21))
                    .addGroup(CUADRELayout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(jLabel27)
                        .addGap(9, 9, 9)
                        .addComponent(LbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CUADRELayout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addComponent(LbDescuadre, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CUADRELayout.createSequentialGroup()
                        .addGap(517, 517, 517)
                        .addComponent(jLabel24))
                    .addGroup(CUADRELayout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CUADRELayout.createSequentialGroup()
                        .addGap(497, 497, 497)
                        .addComponent(jLabel1)))
                .addGap(5, 5, 5))
        );
        CUADRELayout.setVerticalGroup(
            CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(CUADRELayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CUADRELayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(LbVentaEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(LbVentaFiado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel28)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbSueltos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel25)
                            .addComponent(LbCobroFiado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbDescuadre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(LbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbMontoTotalFiado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel21))))
                        .addGap(18, 18, 18)
                        .addComponent(BtSueltos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CUADRELayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel9))
                            .addComponent(Txt1DolarMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel10))
                            .addComponent(Txt50Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel11))
                            .addComponent(Txt25Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel12))
                            .addComponent(Txt10Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel13))
                            .addComponent(Txt5Ctvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel14))
                            .addComponent(Txt1Ctv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addGap(11, 11, 11)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel15))
                            .addComponent(Txt1DolarBillete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel16))
                            .addComponent(Txt5Dolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel17))
                            .addComponent(Txt10Dolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel18))
                            .addComponent(Txt20Dolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel19))
                            .addComponent(Txt50Dolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbTotalDineroExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CUADRELayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(CUADRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel32))))
                        .addGap(6, 6, 6)
                        .addComponent(BtGuardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane.addTab("CUADRE", CUADRE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneMouseClicked

    }//GEN-LAST:event_jTabbedPaneMouseClicked

    private void INVENTARIOAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_INVENTARIOAncestorAdded
    }//GEN-LAST:event_INVENTARIOAncestorAdded

    private void BtCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCalcularActionPerformed
        double ventaEfectivo;
        double ventaTotal = 0;
        double ventaFiado = 0;
        double cobroFiado = 0;
        double precio =0;
        double dineroExistente = 0;
        double descuadre = 0;
        double montoTotalFiado =0;
        double montoAnteriorFiado =0;
        double cantidadVendido =0;
        double stockAnterior = 0;
        double stockActual = 0;
        DefaultTableModel modeloProductos = (DefaultTableModel) this.TablaProductos.getModel();
        DefaultTableModel modeloInventario = (DefaultTableModel) this.TablaInventario.getModel();
        DefaultTableModel modeloFiados = (DefaultTableModel) this.TablaFiados.getModel();
        //CALCULAR TOTAL DE FIADOS Y COBROS
        try{
            for (int k = 0; k < 50; k++) {
                ventaFiado+=Double.valueOf(String.valueOf(modeloFiados.getValueAt(k, 0)));
                cobroFiado+=Double.valueOf(String.valueOf(modeloFiados.getValueAt(k, 1)));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Porfavor ingresar valores numericos fiados/cobros", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        ventaFiado = Math.rint(ventaFiado*100)/100;
        cobroFiado = Math.rint(cobroFiado*100)/100;
        this.LbVentaFiado.setText(String.valueOf(ventaFiado));
        this.LbCobroFiado.setText(String.valueOf(cobroFiado));
        
        //CALCULAR TOTAL VENDIDO
        try{
            for (int k = 0; k <= this.cantidadProductos; k++) {
                stockAnterior = Double.valueOf(String.valueOf(modeloInventario.getValueAt(k, 6)));
                stockAnterior = Math.rint(stockAnterior*10)/10;
                stockActual = Double.valueOf(String.valueOf(modeloProductos.getValueAt(k, 2)));
                stockActual = Math.rint(stockActual*10)/10;
                cantidadVendido = stockAnterior -stockActual;
                cantidadVendido = Math.rint(cantidadVendido*10)/10;
                if (cantidadVendido<0){
                    JOptionPane.showMessageDialog(null,"La resta es menor a 0: "+String.valueOf(modeloProductos.getValueAt(k, 0)), "ERROR DE STOCK", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    modeloProductos.setValueAt(String.valueOf(cantidadVendido), k, 3);
                    precio = Double.valueOf(String.valueOf(modeloProductos.getValueAt(k, 1)));
                    ventaTotal += cantidadVendido*precio;
                }  
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Porfavor ingresar cantidades numericas en stock", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        ventaEfectivo = ventaTotal - ventaFiado;
        ventaEfectivo = Math.rint(ventaEfectivo*100)/100;
        ventaTotal = Math.rint(ventaTotal*100)/100;
        this.LbVentaEfectivo.setText(String.valueOf(ventaEfectivo));
        this.LbTotalVenta.setText(String.valueOf(ventaTotal));
        
        //CONTAR DINERO EXISTENTE
        try{
            dineroExistente = Double.valueOf(this.Txt1DolarMoneda.getText())  + (0.5*Double.valueOf(this.Txt50Ctvs.getText()))   +
                     (0.25*Double.valueOf(this.Txt25Ctvs.getText())) + (0.1*Double.valueOf(this.Txt10Ctvs.getText()))   +
                     (0.05*Double.valueOf(this.Txt5Ctvs.getText()))  + (0.01*Double.valueOf(this.Txt1Ctv.getText()))    +
                     Double.valueOf(this.Txt1DolarBillete.getText()) + (5*Double.valueOf(this.Txt5Dolares.getText()))   +
                     (10*Double.valueOf(this.Txt10Dolares.getText()))+ (20*Double.valueOf(this.Txt20Dolares.getText())) +
                     (50*Double.valueOf(this.Txt50Dolares.getText()));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Porfavor ingresar cantidades numericas en dinero existente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        dineroExistente = Math.rint(dineroExistente*100)/100;
        this.LbTotalDineroExiste.setText(String.valueOf(dineroExistente));
        
        //CALCULAR MONTO TOTAL FIADO Y DESCUADRE
        montoTotalFiado = this.montoAnteriorFiado - cobroFiado + ventaFiado;
        montoTotalFiado = Math.rint(montoTotalFiado*100)/100;
        this.LbMontoTotalFiado.setText(String.valueOf(montoTotalFiado));
        descuadre = dineroExistente-ventaEfectivo - 25 - cobroFiado;
        descuadre = Math.rint(descuadre*100)/100;
        this.LbDescuadre.setText(String.valueOf(descuadre));
        

    }//GEN-LAST:event_BtCalcularActionPerformed

    private void Txt50CtvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt50CtvsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt50CtvsActionPerformed

    private void Txt1DolarMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1DolarMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1DolarMonedaActionPerformed

    private void Txt25CtvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt25CtvsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt25CtvsActionPerformed

    private void Txt10CtvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt10CtvsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt10CtvsActionPerformed

    private void Txt1CtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1CtvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1CtvActionPerformed

    private void Txt5CtvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5CtvsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5CtvsActionPerformed

    private void Txt1DolarBilleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1DolarBilleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1DolarBilleteActionPerformed

    private void Txt5DolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5DolaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5DolaresActionPerformed

    private void Txt10DolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt10DolaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt10DolaresActionPerformed

    private void Txt20DolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt20DolaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt20DolaresActionPerformed

    private void Txt50DolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt50DolaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt50DolaresActionPerformed

    private void BtNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNuevoProductoActionPerformed
        this.cantidadProductos=contarProductos();
        NuevoProducto ventana= new NuevoProducto();
        ventana.cantidadProd=this.cantidadProductos;
        ventana.archivo = this.archivo;
        ventana.setVisible(true);
    }//GEN-LAST:event_BtNuevoProductoActionPerformed

    private void BtEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarProductoActionPerformed
        this.cantidadProductos=contarProductos();
        EditarProducto ventana= new EditarProducto();
        ventana.cantidadProd=this.cantidadProductos;
        ventana.archivo = this.archivo;
        ventana.CargarProductos();
        ventana.setVisible(true);
    }//GEN-LAST:event_BtEditarProductoActionPerformed

    private void BtIngresarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIngresarStockActionPerformed
        double stockAnterior;
        double stockIngreso;
        double stockBaja;
        double stockActual;
        this.cantidadProductos=contarProductos();
        DefaultTableModel modeloInventario = (DefaultTableModel) this.TablaInventario.getModel();
        try{
            for (int k = 0; k <= this.cantidadProductos; k++) {
                stockAnterior = Double.valueOf(String.valueOf(modeloInventario.getValueAt(k, 3)));
                stockIngreso = Double.valueOf(String.valueOf(modeloInventario.getValueAt(k, 4)));
                stockBaja = Double.valueOf(String.valueOf(modeloInventario.getValueAt(k, 5)));
                stockActual = stockAnterior+stockIngreso-stockBaja;
                stockActual = Math.rint(stockActual*10)/10;
                modeloInventario.setValueAt(String.valueOf(stockActual), k, 6);
            }
            JOptionPane.showMessageDialog(null,"Datos actualizados correctamente", "ACTUALIZACION CORRECTA", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Porfavor ingresar valores numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_BtIngresarStockActionPerformed

    private void jTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneStateChanged

    }//GEN-LAST:event_jTabbedPaneStateChanged

    private void CUADREAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CUADREAncestorAdded
        this.LbFecha.setText(this.fecha);
    }//GEN-LAST:event_CUADREAncestorAdded

    private void BtGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtGuardarDatosActionPerformed
        String hoja;
        String stockFinal;
        //GUARDAR STOCK
        DefaultTableModel modeloProductos = (DefaultTableModel) this.TablaProductos.getModel();
        hoja = "INVENTARIO";
        for (int k = 0; k <= this.cantidadProductos; k++) {
            stockFinal = String.valueOf(modeloProductos.getValueAt(k, 2));
            EscribirStrExcel(this.archivo, hoja,k+2,3,stockFinal);
        }
        //GRABAR DATOS EN EXCEL
        hoja = "CUADRE";
        EscribirStrExcel(this.archivo, hoja,this.cantidadFechas+1,0,this.fecha);
        EscribirStrExcel(this.archivo, hoja,this.cantidadFechas+1,1,this.LbVentaEfectivo.getText());
        EscribirStrExcel(this.archivo, hoja,this.cantidadFechas+1,2,this.LbVentaFiado.getText());
        EscribirStrExcel(this.archivo, hoja,this.cantidadFechas+1,3,this.LbTotalVenta.getText());
        EscribirStrExcel(this.archivo, hoja,this.cantidadFechas+1,4,this.LbTotalDineroExiste.getText());
        EscribirStrExcel(this.archivo, hoja,this.cantidadFechas+1,5,this.LbDescuadre.getText());
        EscribirStrExcel(this.archivo, hoja,this.cantidadFechas+1,6,this.LbCobroFiado.getText());
        EscribirStrExcel(this.archivo, hoja,this.cantidadFechas+1,7,this.LbMontoTotalFiado.getText());
        JOptionPane.showMessageDialog(null,"Valores almacenados exitosamente", "GUARDADO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BtGuardarDatosActionPerformed

    private void BtIRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIRefrescarActionPerformed
        this.cantidadProductos=contarProductos();
        this.RefrescarInventario();
        this.RefrescarProductos();
    }//GEN-LAST:event_BtIRefrescarActionPerformed

    private void BtSueltosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSueltosActionPerformed
        Sueltos ventana= new Sueltos();
        int tot100 = Integer.valueOf(this.Txt1DolarMoneda.getText());
        int tot50 = Integer.valueOf(this.Txt50Ctvs.getText());
        int tot25 =Integer.valueOf(this.Txt25Ctvs.getText());
        int tot10 = Integer.valueOf(this.Txt10Ctvs.getText());
        int tot5 = Integer.valueOf(this.Txt5Ctvs.getText());
        int tot1 = Integer.valueOf(this.Txt1Ctv.getText());
        int[] val = {tot100,tot50,tot25,tot10,tot5,tot1};
        ventana.valores=val;
        ventana.setVisible(true);
    }//GEN-LAST:event_BtSueltosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCalcular;
    private javax.swing.JButton BtEditarProducto;
    private javax.swing.JButton BtGuardarDatos;
    private javax.swing.JButton BtIRefrescar;
    private javax.swing.JButton BtIngresarStock;
    private javax.swing.JButton BtNuevoProducto;
    private javax.swing.JButton BtSueltos;
    private javax.swing.JPanel CUADRE;
    private javax.swing.JPanel INVENTARIO;
    private javax.swing.JLabel LbCobroFiado;
    private javax.swing.JLabel LbDescuadre;
    private javax.swing.JLabel LbFecha;
    private javax.swing.JLabel LbMontoTotalFiado;
    private javax.swing.JLabel LbSueltos;
    private javax.swing.JLabel LbTotalDineroExiste;
    private javax.swing.JLabel LbTotalVenta;
    private javax.swing.JLabel LbVentaEfectivo;
    private javax.swing.JLabel LbVentaFiado;
    private javax.swing.JScrollPane PanelInventario;
    private javax.swing.JTable TablaFiados;
    private javax.swing.JTable TablaInventario;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JTextField Txt10Ctvs;
    private javax.swing.JTextField Txt10Dolares;
    private javax.swing.JTextField Txt1Ctv;
    private javax.swing.JTextField Txt1DolarBillete;
    private javax.swing.JTextField Txt1DolarMoneda;
    private javax.swing.JTextField Txt20Dolares;
    private javax.swing.JTextField Txt25Ctvs;
    private javax.swing.JTextField Txt50Ctvs;
    private javax.swing.JTextField Txt50Dolares;
    private javax.swing.JTextField Txt5Ctvs;
    private javax.swing.JTextField Txt5Dolares;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane;
    // End of variables declaration//GEN-END:variables

    
    //FUNCION ESCRIBIR EXCEL   
    public void EscribirStrExcel(String archivo, String hoja, int fila, int columna, String valor){
        try{
            Workbook target_workbook = Workbook.getWorkbook(new File(archivo));
            WritableWorkbook workbook = Workbook.createWorkbook(new File(archivo), target_workbook);
            target_workbook.close();
            WritableSheet sheet = workbook.getSheet(hoja);
            jxl.write.Label label = new jxl.write.Label(columna, fila, valor);
            sheet.addCell(label);
            workbook.write();
            workbook.close();
        }

        catch(Exception e){
            System.out.println("writeExcel ->"+e);
        }
    }

    //FUNCION PARA CONTAR PRODUCTOS
    public int contarProductos(){
        int conteo=3;
        String hoja = "INVENTARIO";
        String valor = "0";
        int columna = 0;
        try{
            Workbook workbook = Workbook.getWorkbook(new File(archivo));
            Sheet sheet = workbook.getSheet(hoja);
            while (valor.equals("") == false){
                Cell cell = sheet.getCell(columna,conteo);
                valor = cell.getContents();
                conteo+=1;
            }
            conteo-=4;
            workbook.close();
        }        
        catch(Exception e){
            System.out.println("readExcel ->"+e);
        }
        return conteo;    
    }
    
    //FUNCION PARA OBTENER FECHA ACTUAL
    public String obtenerFecha(){
        Calendar fech = new GregorianCalendar();
        int año = fech.get(Calendar.YEAR);
        int mes = 1+fech.get(Calendar.MONTH);
        int dia = fech.get(Calendar.DAY_OF_MONTH);
        String fecha = String.valueOf(dia)+"/"+String.valueOf(mes)+"/"+String.valueOf(año);
        return fecha;
    }
    
    //FUNCION PARA CONTAR FECHAS
    public int contarFechas(){
        int conteo=0;
        String hoja = "CUADRE";
        try{
            Workbook workbook = Workbook.getWorkbook(new File(archivo));
            Sheet sheet = workbook.getSheet(hoja);
            Cell cell = sheet.getCell(0,conteo);
            String valor = cell.getContents();
            while (true ){
                if (valor.equals("") == true ){
                    conteo-=1;
                    workbook.close();
                    return conteo;
                }
                else if (valor.equals(this.fecha) == true){
                    conteo-=1;
                    workbook.close();
                    return conteo;
                }
                conteo+=1;
                cell = sheet.getCell(0,conteo);
                valor = cell.getContents();
            }
            
        }        
        catch(Exception e){
            System.out.println("readExcel ->"+e);
        }     
    return 0;
    }

    //FUNCION REFRESCAR TABLA INVENTARIO
    public void RefrescarInventario(){
        String hoja = "INVENTARIO";
        String cod, des, pre, sto;
        ModeloTablaInventario modelo = new ModeloTablaInventario();
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock Anterior");
        modelo.addColumn("Ingreso");
        modelo.addColumn("Baja");
        modelo.addColumn("Stock Actual");
        Cell cell;
        try{
            Workbook workbook = Workbook.getWorkbook(new File(this.archivo));
            Sheet sheet = workbook.getSheet(hoja);
            for (int k = 2; k <= this.cantidadProductos+2; k++) {
                cell = sheet.getCell(0,k);
                cod = cell.getContents();
                cell = sheet.getCell(1,k);
                des = cell.getContents();
                cell = sheet.getCell(2,k);
                pre = cell.getContents();
                cell = sheet.getCell(3,k);
                sto = cell.getContents();
                modelo.addRow(new Object[]{cod,des,pre,sto,"0","0",sto});
            }
            workbook.close();
        }
        catch(Exception e){
            System.out.println("readExcel ->"+e);
        }
        
        modelo.isCellEditable(0, 1);
        this.TablaInventario.setModel(modelo);
        TableColumnModel modeloColumna = this.TablaInventario.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(60);
        modeloColumna.getColumn(1).setPreferredWidth(180);
        modeloColumna.getColumn(2).setPreferredWidth(50);
        modeloColumna.getColumn(3).setPreferredWidth(90);
        modeloColumna.getColumn(4).setPreferredWidth(60);
        modeloColumna.getColumn(5).setPreferredWidth(40);
    }
    
    //FUNCION REFRESCAR TABLA PRODUCTOS
    public void RefrescarProductos(){
        String hoja = "INVENTARIO";
        String des="", pre="";
        Cell cell;
        ModeloTablaProductos modelo = new ModeloTablaProductos();
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Venta");
        try{
            Workbook workbook = Workbook.getWorkbook(new File(archivo));
            Sheet sheet = workbook.getSheet(hoja);
            for (int k = 2; k <= this.cantidadProductos+2; k++) {
                cell = sheet.getCell(1,k);
                des = cell.getContents();
                cell = sheet.getCell(2,k);
                pre = cell.getContents();
                modelo.addRow(new Object[]{des,pre,"0","0"});
            }
            workbook.close();
        }
        catch(Exception e){
                System.out.println("readExcel ->"+e);
        }
        this.TablaProductos.setModel(modelo);
        TableColumnModel modeloColumna = this.TablaProductos.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(250);
        if (this.cantidadFechas>0){
            hoja = "CUADRE";
            String montoAnt="";
            try{
                Workbook workbook = Workbook.getWorkbook(new File(archivo));
                Sheet sheet = workbook.getSheet(hoja);
                cell = sheet.getCell(7,this.cantidadFechas);
                montoAnt = cell.getContents();
                Double mont = Double.valueOf(montoAnt);
                this.montoAnteriorFiado = mont;
                this.LbMontoTotalFiado.setText(montoAnt);
            }
            catch(Exception e){
                System.out.println("readExcel ->"+e);
            }
        }
        else{
            this.LbMontoTotalFiado.setText("0");
        }
        this.Txt1DolarMoneda.setText("0");
        this.Txt50Ctvs.setText("0");
        this.Txt10Ctvs.setText("0");
        this.Txt25Ctvs.setText("0");
        this.Txt5Ctvs.setText("0");
        this.Txt1Ctv.setText("0");
        this.Txt1DolarBillete.setText("0");
        this.Txt5Dolares.setText("0");
        this.Txt10Dolares.setText("0");
        this.Txt20Dolares.setText("0");
        this.Txt50Dolares.setText("0");
        this.LbCobroFiado.setText("0");
        this.LbSueltos.setText("25");
    }

    //FUNCION REFRESCAR TABLA FIADOS
    public void cargarTablaFiado(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Fiados");
        modelo.addColumn("Cobros");
        for (int k = 0; k <= 50; k++) {
            modelo.addRow(new Object[]{"0","0"});
        }      
        modelo.isCellEditable(0, 1);
        this.TablaFiados.setModel(modelo);
    }
    
    
    //FUNCION VALIDACION PRECIO
    public int validar(String prec, String cant){
        try{
            double preci = Double.valueOf(prec);
            double canti = Integer.valueOf(cant);
            return 1;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Porfavor ingresar precio y cantidad numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    //ESCOGER PATH
    public String EscogerPath(){
        JFileChooser fc=new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.xls", "xls");
        fc.setFileFilter(filtro);
        int seleccion=fc.showOpenDialog(this);
        if(seleccion==JFileChooser.APPROVE_OPTION){
            String path = fc.getSelectedFile().getAbsolutePath();
            return path;
        }
        return "";
    }
}
