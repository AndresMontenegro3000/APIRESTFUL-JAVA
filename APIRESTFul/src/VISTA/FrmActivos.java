package VISTA;

import CONTROLADOR.ControladorActivos;
import MODELO.ModeloActivos;
import com.sun.org.apache.xml.internal.serialize.TextSerializer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmActivos extends javax.swing.JFrame {

    public FrmActivos() {
        initComponents();
        //INICIALIZANDO FUNCIONES
        Mostrar("");
        Inhabilitar_Objetos();
    }
    
    //--------------------------------
    
    private String accion = "Agregar";
    
    //NECESITO EL ID PARA REALIZAR LAS MODIFICACIONES, PERO NO QUIERO QUE SE MUESTRE ESTA COLUMNA
    void Ocultar_Columnas()
    {
        TablaListadoActivos.getColumnModel().getColumn(0).setMaxWidth(0);
        TablaListadoActivos.getColumnModel().getColumn(0).setMinWidth(0);
        TablaListadoActivos.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    //FUNCION PARA INHABILITAR CAJAS DE TEXTO Y BOTONES
    void Inhabilitar_Objetos()
    {        
        TxtId.setEnabled(false);
        TxtActivo.setEnabled(false);
        TextAreadescripcion.setEnabled(false);
        ComboBoxTipo.setEnabled(false);
        TxtSerial.setEnabled(false);
        TxtNumeroInventario.setEnabled(false);
        TxtPeso.setEnabled(false);
        TxtAlto.setEnabled(false);
        TxtAncho.setEnabled(false);
        TxtLargo.setEnabled(false);
        TxtValorCompra.setEnabled(false);
        TxtFechaCompra.setEnabled(false);
        TxtFechaBaja.setEnabled(false);
        ComboBoxEstadoActual.setEnabled(false);
        TxtColor.setEnabled(false);
        
        BtnAgregar.setEnabled(true);
        BtnModificar.setEnabled(true);
        BtnGuardar.setEnabled(false);
        BtnCancelar.setEnabled(false);
        BtnBuscar.setEnabled(true);
        BtnMenuPrincipal.setEnabled(true);
    }
    
    //FUNCION PARA HABILITAR CAJAS DE TEXTO Y BOTONES
    void Habilitar_Objetos()
    {        
        TxtId.setEnabled(false);
        TxtActivo.setEnabled(true);
        TextAreadescripcion.setEnabled(true);
        ComboBoxTipo.setEnabled(true);
        TxtSerial.setEnabled(true);
        TxtNumeroInventario.setEnabled(true);
        TxtPeso.setEnabled(true);
        TxtAlto.setEnabled(true);
        TxtAncho.setEnabled(true);
        TxtLargo.setEnabled(true);
        TxtValorCompra.setEnabled(true);
        TxtFechaCompra.setEnabled(true);
        TxtFechaBaja.setEnabled(true);
        ComboBoxEstadoActual.setEnabled(true);
        TxtColor.setEnabled(true);
        
        if (accion == "Agregar")
        {
            TxtId.setText("");
            TxtActivo.setText("");
            TextAreadescripcion.setText("");
            TxtSerial.setText("");
            TxtNumeroInventario.setText("");
            TxtPeso.setText("");
            TxtAlto.setText("");
            TxtAncho.setText("");
            TxtLargo.setText("");
            TxtValorCompra.setText("");
            TxtFechaCompra.setText("");
            TxtFechaBaja.setText("");
            TxtColor.setText("");
        }        
        
        BtnAgregar.setEnabled(false);
        BtnModificar.setEnabled(false);
        BtnGuardar.setEnabled(true);
        BtnCancelar.setEnabled(true);
        BtnBuscar.setEnabled(false);
        BtnMenuPrincipal.setEnabled(false);
    }
    
    void Mostrar(String buscar)
    {
        try 
        {
            DefaultTableModel modelo;
            //INSTANCIO MI CLASE LOGICAACTIVOS
            MODELO.ModeloActivos Funcion = new ModeloActivos();
            //CARGO LA FUNCION MOSTRAR
            modelo = Funcion.Mostrar(buscar);
            //ENVIAR DATOS
            TablaListadoActivos.setModel(modelo);
            //CARGO LA VARIABLE QUE CUENTA EL NÚMERO DE REGISTROS
            Label_TotalRegistro.setText(Integer.toString(Funcion.TotalRegistros));
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    
    //--------------------------------

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtBuscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaListadoActivos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Label_TotalRegistro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtActivo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        TxtValorCompra = new javax.swing.JTextField();
        BtnAgregar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreadescripcion = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        TxtFechaCompra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtSerial = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtNumeroInventario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtPeso = new javax.swing.JTextField();
        TxtAlto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtAncho = new javax.swing.JTextField();
        TxtLargo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TxtFechaBaja = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ComboBoxEstadoActual = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        TxtColor = new javax.swing.JTextField();
        BtnMenuPrincipal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado Activos"));

        jLabel2.setText("Buscar");
        jLabel2.setToolTipText("");

        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        TablaListadoActivos.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        TablaListadoActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaListadoActivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaListadoActivosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaListadoActivos);

        jLabel7.setText("Total Registros");

        Label_TotalRegistro.setText("---");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(Label_TotalRegistro)
                        .addGap(67, 67, 67))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar)
                    .addComponent(jLabel7)
                    .addComponent(Label_TotalRegistro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Activo"));

        jLabel3.setText("Id");

        jLabel4.setText("Activo");

        jLabel5.setText("Tipo");

        ComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fijo", "Circulante", "Diferido" }));

        jLabel6.setText("Valor Compra");

        BtnAgregar.setText("AGREGAR");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnGuardar.setText("GUARDAR");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("CANCELAR");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        jLabel8.setText("Descripción");

        TextAreadescripcion.setColumns(20);
        TextAreadescripcion.setRows(5);
        jScrollPane2.setViewportView(TextAreadescripcion);

        jLabel9.setText("Fecha Compra");

        jLabel10.setText("Serial");

        jLabel11.setText("No. Inventario");

        jLabel12.setText("Peso");

        jLabel13.setText("Alto");

        jLabel14.setText("Ancho");

        jLabel15.setText("Largo");

        jLabel16.setText("Fecha Baja");

        jLabel17.setText("Estado Actual");

        ComboBoxEstadoActual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Dado de Baja", "En Reparación", "Disponible", "Asignado" }));

        jLabel18.setText("Color");

        BtnMenuPrincipal.setText("MENÚ PRINCIPAL");
        BtnMenuPrincipal.setToolTipText("");
        BtnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnAgregar)
                .addGap(18, 18, 18)
                .addComponent(BtnModificar)
                .addGap(18, 18, 18)
                .addComponent(BtnGuardar)
                .addGap(18, 18, 18)
                .addComponent(BtnCancelar)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtSerial)
                    .addComponent(jScrollPane2)
                    .addComponent(ComboBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtActivo)
                    .addComponent(ComboBoxEstadoActual, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtColor)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TxtFechaBaja)
                                .addComponent(TxtFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtNumeroInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TxtAlto)
                                        .addComponent(TxtAncho)
                                        .addComponent(TxtLargo)
                                        .addComponent(TxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TxtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(92, 92, 92))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnMenuPrincipal)
                .addGap(154, 154, 154))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNumeroInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtFechaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxEstadoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgregar)
                    .addComponent(BtnModificar)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnCancelar))
                .addGap(31, 31, 31)
                .addComponent(BtnMenuPrincipal)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ACTIVOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        
        Habilitar_Objetos();
        accion = "Agregar"; 
        
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        
        accion = "Modificar"; 
        Habilitar_Objetos();        
        
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        
        //VALIDACION DE CAMPOS VACIOS
        if (TxtActivo.getText().length()== 0)
        {
            JOptionPane.showConfirmDialog(null, "Debe digitar el nombre del activo", "Validación de campos obligatorios. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            TxtActivo.requestFocus();
        }
        else if (TxtSerial.getText().length()== 0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe digitar el serial", "Validación de campos obligatorios. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            TxtSerial.requestFocus();
        }
        else if (TxtNumeroInventario.getText().length()== 0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe digitar el número de inventario interno", "Validación de campos obligatorios. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            TxtNumeroInventario.requestFocus();
        }
        else if (TxtPeso.getText().length()== 0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe digitar el peso", "Validación de campos obligatorios. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            TxtPeso.requestFocus();
        }
        else if (TxtAlto.getText().length()== 0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe digitar el alto", "Validación de campos obligatorios. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            TxtAlto.requestFocus();
        }
        else if (TxtAncho.getText().length()== 0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe digitar el ancho", "Validación de campos obligatorios. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            TxtAncho.requestFocus();
        }
        else if (TxtLargo.getText().length()== 0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe digitar el largo", "Validación de campos obligatorios. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            TxtLargo.requestFocus();
        }
        else if (TxtValorCompra.getText().length()== 0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe digitar el valor de compra", "Validación de campos obligatorios. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            TxtValorCompra.requestFocus();
        }
        else if (TxtFechaCompra.getText().length()== 0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe digitar la fecha de compra", "Validación de campos obligatorios. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            TxtFechaCompra.requestFocus();
        }
        else if (TxtFechaBaja.getText().length()== 0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe digitar la fecha de baja", "Validación de campos obligatorios. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            TxtFechaBaja.requestFocus();
        }
        else if (TxtColor.getText().length()== 0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe digitar el color", "Validación de campos obligatorios. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            TxtColor.requestFocus();
        }
        else 
        {
            //INSTANCIANDO LA CLASE CONTROLADOR ACTIVOS
            CONTROLADOR.ControladorActivos DTS = new ControladorActivos();
            MODELO.ModeloActivos FUNCION = new ModeloActivos();
            //ENVIANDO DATOS AL MÉTODO SET
            DTS.setNombre(TxtActivo.getText());
            DTS.setDescripcion(TextAreadescripcion.getText());
            //PARA AGREGAR EL TEXTO DE UN COMBO BOX SE DEBE SELECCIONAR EL INDICE, LUEGO PASARLO AL METODO SET
            int SeleccionTipo = ComboBoxTipo.getSelectedIndex();
            DTS.setTipo((String) ComboBoxTipo.getItemAt(SeleccionTipo));
            DTS.setSerial(TxtSerial.getText());
            DTS.setNumeroInventario(TxtNumeroInventario.getText());
            DTS.setPeso(Double.parseDouble(TxtPeso.getText()));
            DTS.setAlto(Double.parseDouble(TxtAlto.getText()));
            DTS.setAncho(Double.parseDouble(TxtAncho.getText()));
            DTS.setLargo(Double.parseDouble(TxtLargo.getText()));
            DTS.setValorCompra(Double.parseDouble(TxtValorCompra.getText()));
            DTS.setFechaCompra(TxtFechaCompra.getText());
            DTS.setFechaBaja(TxtFechaBaja.getText());
            //PARA AGREGAR EL TEXTO DE UN COMBO BOX SE DEBE SELECCIONAR EL INDICE, LUEGO PASARLO AL METODO SET
            int SeleccionEstado = ComboBoxEstadoActual.getSelectedIndex();
            DTS.setEstadoActual((String) ComboBoxEstadoActual.getItemAt(SeleccionEstado));
            DTS.setColor(TxtColor.getText());
            
            //FUNCION PARA INSERTAR ACTIVOS
            if (accion.equals("Agregar"))
            {
                if (FUNCION.InsertarActivos(DTS))
                {
                    //CONFIRMACIÓN DEL RESGISTRO
                    JOptionPane.showConfirmDialog(rootPane, "El activo ha sido registrado exitosamente.", "Guardando registro. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    //LLAMANDO A AL FUNCIÓN DE MOSTRAR
                    Mostrar(""); //SE PASA UN PARAMETRO VACIO PARA QUE MUESTRE TODOS LOS REGISTROS
                }
            }
            
            //FUNCIÓN PARA MODIFICAR ACTIVOS
            if(accion.equals("Modificar"))
            {
                //ENVIANDO PARAMETRO A LA FUNCIÓN MODIFICAR
                DTS.setId(Integer.parseInt(TxtId.getText()));
                if (FUNCION.ModificarActivos(DTS))
                {   //CONFIRMACIÓN DEL RESGISTRO
                    JOptionPane.showConfirmDialog(rootPane, "El activo ha sido modificado exitosamente.", "Guardando registro. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    //LLAMANDO A AL FUNCIÓN DE MOSTRAR
                    Mostrar(""); //SE PASA UN PARAMETRO VACIO PARA QUE MUESTRE TODOS LOS REGISTROS
                }
            }
            
            //INHABILITO LOS OBJETOS
            Inhabilitar_Objetos();
            accion = "Agregar"; 
            
        }
        
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        
        //INHABILITO LOS OBJETOS
        Inhabilitar_Objetos();
        accion = "Agregar"; 
        //LLAMANDO A AL FUNCIÓN DE MOSTRAR
         Mostrar(""); //SE PASA UN PARAMETRO VACIO PARA QUE MUESTRE TODOS LOS REGISTROS
        
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        
        Mostrar(TxtBuscar.getText());
        
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void TablaListadoActivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaListadoActivosMouseClicked
        
        //CARGAR REGISTROS EN LOS CAMPOS
        int Fila = TablaListadoActivos.rowAtPoint(evt.getPoint());  //OBTERNER LA FILA DONDE HE DADO CLIC
        //CARGANDO CAMPOS
        TxtId.setText(TablaListadoActivos.getValueAt(Fila, 0).toString());
        TxtActivo.setText(TablaListadoActivos.getValueAt(Fila, 1).toString());
        TextAreadescripcion.setText(TablaListadoActivos.getValueAt(Fila, 2).toString());
        ComboBoxTipo.setSelectedItem(TablaListadoActivos.getValueAt(Fila, 3).toString());
        TxtSerial.setText(TablaListadoActivos.getValueAt(Fila, 4).toString());
        TxtNumeroInventario.setText(TablaListadoActivos.getValueAt(Fila, 5).toString());
        TxtPeso.setText(TablaListadoActivos.getValueAt(Fila, 6).toString());
        TxtAlto.setText(TablaListadoActivos.getValueAt(Fila, 7).toString());
        TxtAncho.setText(TablaListadoActivos.getValueAt(Fila, 8).toString());
        TxtLargo.setText(TablaListadoActivos.getValueAt(Fila, 9).toString());
        TxtValorCompra.setText(TablaListadoActivos.getValueAt(Fila, 10).toString());
        TxtFechaCompra.setText(TablaListadoActivos.getValueAt(Fila, 11).toString());
        TxtFechaBaja.setText(TablaListadoActivos.getValueAt(Fila, 12).toString());
        ComboBoxEstadoActual.setSelectedItem(TablaListadoActivos.getValueAt(Fila, 13).toString());
        TxtColor.setText(TablaListadoActivos.getValueAt(Fila, 14).toString());
        
    }//GEN-LAST:event_TablaListadoActivosMouseClicked

    private void BtnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuPrincipalActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_BtnMenuPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(FrmActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmActivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmActivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnMenuPrincipal;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JComboBox<String> ComboBoxEstadoActual;
    private javax.swing.JComboBox<String> ComboBoxTipo;
    private javax.swing.JLabel Label_TotalRegistro;
    private javax.swing.JTable TablaListadoActivos;
    private javax.swing.JTextArea TextAreadescripcion;
    private javax.swing.JTextField TxtActivo;
    private javax.swing.JTextField TxtAlto;
    private javax.swing.JTextField TxtAncho;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtColor;
    private javax.swing.JTextField TxtFechaBaja;
    private javax.swing.JTextField TxtFechaCompra;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtLargo;
    private javax.swing.JTextField TxtNumeroInventario;
    private javax.swing.JTextField TxtPeso;
    private javax.swing.JTextField TxtSerial;
    private javax.swing.JTextField TxtValorCompra;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
