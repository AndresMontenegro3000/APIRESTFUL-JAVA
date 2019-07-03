
package VISTA;

import CONTROLADOR.ControladorAreas;
import MODELO.ModeloActivos;
import MODELO.ModeloAreas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmAreas extends javax.swing.JFrame {

    
    public FrmAreas() {
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
        TxtArea.setEnabled(false);
        TxtCiudad.setEnabled(false);
        
        BtnAgregar.setEnabled(true);
        BtnModificar.setEnabled(true);
        BtnGuardar.setEnabled(false);
        BtnCancelar.setEnabled(false);
        BtnBuscar.setEnabled(true);
        BtnMenuprincipal.setEnabled(true);
    }
    
    //FUNCION PARA HABILITAR CAJAS DE TEXTO Y BOTONES
    void Habilitar_Objetos()
    {        
        TxtId.setEnabled(false);
        TxtArea.setEnabled(true);
        TxtCiudad.setEnabled(true);
        
        if (accion == "Agregar")
        {
            TxtId.setText("");
            TxtArea.setText("");
            TxtCiudad.setText("");
        }        
        
        BtnAgregar.setEnabled(false);
        BtnModificar.setEnabled(false);
        BtnGuardar.setEnabled(true);
        BtnCancelar.setEnabled(true);
        BtnBuscar.setEnabled(false);
        BtnMenuprincipal.setEnabled(false);
    }
    
    void Mostrar(String buscar)
    {
        try 
        {
            DefaultTableModel modelo;
            //INSTANCIO MI CLASE LOGICAAREAS
            MODELO.ModeloAreas Funcion = new ModeloAreas();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtArea = new javax.swing.JTextField();
        BtnAgregar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TxtCiudad = new javax.swing.JTextField();
        BtnMenuprincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado Áreas"));

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ÁREAS");

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Activo"));

        jLabel3.setText("Id");

        jLabel4.setText("Área");

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

        jLabel10.setText("Ciudad");

        BtnMenuprincipal.setText("MENÚ PRINCIPAL");
        BtnMenuprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuprincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtCiudad)
                    .addComponent(TxtArea)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 198, Short.MAX_VALUE)))
                .addGap(92, 92, 92))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(BtnMenuprincipal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgregar)
                    .addComponent(BtnModificar)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(BtnMenuprincipal)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed

        Mostrar(TxtBuscar.getText());

    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void TablaListadoActivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaListadoActivosMouseClicked

        //CARGAR REGISTROS EN LOS CAMPOS
        int Fila = TablaListadoActivos.rowAtPoint(evt.getPoint());  //OBTERNER LA FILA DONDE HE DADO CLIC
        //CARGANDO CAMPOS
        TxtId.setText(TablaListadoActivos.getValueAt(Fila, 0).toString());
        TxtArea.setText(TablaListadoActivos.getValueAt(Fila, 1).toString());
        TxtCiudad.setText(TablaListadoActivos.getValueAt(Fila, 2).toString());

    }//GEN-LAST:event_TablaListadoActivosMouseClicked

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
        if (TxtArea.getText().length()== 0)
        {
            JOptionPane.showConfirmDialog(null, "Debe digitar el área", "Validación de campos obligatorios. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            TxtArea.requestFocus();
        }
        else if (TxtCiudad.getText().length()== 0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe digitar la ciudad", "Validación de campos obligatorios. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            TxtCiudad.requestFocus();
        }
        else
        {
            //INSTANCIANDO LA CLASE CONTROLADOR AREAS
            CONTROLADOR.ControladorAreas DTS = new ControladorAreas();
            MODELO.ModeloAreas FUNCION = new ModeloAreas();
            //ENVIANDO DATOS AL MÉTODO SET
            DTS.setArea(TxtArea.getText());
            DTS.setCiudad(TxtCiudad.getText());

            //FUNCION PARA INSERTAR ACTIVOS
            if (accion.equals("Agregar"))
            {
                if (FUNCION.InsertarAreas(DTS))
                {
                    //CONFIRMACIÓN DEL RESGISTRO
                    JOptionPane.showConfirmDialog(rootPane, "El área ha sido registrada exitosamente.", "Guardando registro. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    //LLAMANDO A AL FUNCIÓN DE MOSTRAR
                    Mostrar(""); //SE PASA UN PARAMETRO VACIO PARA QUE MUESTRE TODOS LOS REGISTROS
                }
            }

            //FUNCIÓN PARA MODIFICAR ACTIVOS
            if(accion.equals("Modificar"))
            {
                //ENVIANDO PARAMETRO A LA FUNCIÓN MODIFICAR
                DTS.setId(Integer.parseInt(TxtId.getText()));
                if (FUNCION.ModificarAreas(DTS))
                {   //CONFIRMACIÓN DEL RESGISTRO
                    JOptionPane.showConfirmDialog(rootPane, "El área ha sido modificada exitosamente.", "Guardando registro. Respuesta No. 400", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
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

    private void BtnMenuprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuprincipalActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_BtnMenuprincipalActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAreas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnMenuprincipal;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JLabel Label_TotalRegistro;
    private javax.swing.JTable TablaListadoActivos;
    private javax.swing.JTextField TxtArea;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCiudad;
    private javax.swing.JTextField TxtId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
