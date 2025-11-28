package vista;

/**
 * Clase principal de la interfaz gráfica del sistema de pedidos.
 * 
 * <p>Esta ventana contiene las pestañas y componentes para los distintos tipos
 * de usuarios: Cliente, Repartidor y Administrador. Permite registrar usuarios,
 * iniciar sesión, realizar pedidos y gestionarlos según el rol.</p>
 * 
 * <p>El código del método {@code initComponents()} es generado automáticamente
 * por el editor de formularios de NetBeans y no debe modificarse manualmente.</p>
 * 
 * @author TuNombre
 */

public class Vista extends javax.swing.JFrame {

    /**
   * Crea una nueva instancia de la interfaz principal e inicializa todos los
   * componentes gráficos.
   */
    public Vista() {
        initComponents();
    }
/**
   * Inicializa los componentes de la interfaz.
   *
   * <p><b>Nota:</b> Este método se genera automáticamente por el
   * editor de formularios de NetBeans. No debe modificarse a mano.</p>
   */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pestaña = new javax.swing.JTabbedPane();
        panelinicio = new javax.swing.JPanel();
        panelusuario = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbusuario = new javax.swing.JComboBox<>();
        btncrear = new javax.swing.JButton();
        panelingresar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtnombreingresar = new javax.swing.JTextField();
        txtidingresar = new javax.swing.JTextField();
        cbusuarioingresar = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btningresar = new javax.swing.JButton();
        panelrepartidor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablarepartidor = new javax.swing.JTable();
        btnactualizar = new javax.swing.JButton();
        btnmostrarpedidosrepartidor = new javax.swing.JButton();
        paneladministrador = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablamostrarusuarios = new javax.swing.JTable();
        btnmostrarusuarios = new javax.swing.JButton();
        btnmostrarpedidos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablamostrarpedidos = new javax.swing.JTable();
        panelcliente = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btncomprar = new javax.swing.JButton();
        cbcontenido = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelinicio.setBackground(new java.awt.Color(255, 255, 255));

        panelusuario.setBackground(new java.awt.Color(255, 255, 255));
        panelusuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 102, 102))); // NOI18N
        panelusuario.setForeground(new java.awt.Color(60, 63, 65));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre:");

        txtnombre.setBackground(new java.awt.Color(255, 255, 255));
        txtnombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(0, 0, 0));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Identificación:");

        txtid.setBackground(new java.awt.Color(255, 255, 255));
        txtid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtid.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo de usuario:");

        cbusuario.setBackground(new java.awt.Color(255, 255, 255));
        cbusuario.setForeground(new java.awt.Color(0, 0, 0));
        cbusuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Cliente" }));

        btncrear.setBackground(new java.awt.Color(255, 255, 255));
        btncrear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btncrear.setForeground(new java.awt.Color(0, 0, 0));
        btncrear.setText("Crear");

        javax.swing.GroupLayout panelusuarioLayout = new javax.swing.GroupLayout(panelusuario);
        panelusuario.setLayout(panelusuarioLayout);
        panelusuarioLayout.setHorizontalGroup(
            panelusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelusuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelusuarioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addComponent(cbusuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelusuarioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelusuarioLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btncrear, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelusuarioLayout.setVerticalGroup(
            panelusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelusuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panelusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panelusuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btncrear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelingresar.setBackground(new java.awt.Color(255, 255, 255));
        panelingresar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 102, 102))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo de usuario:");

        txtnombreingresar.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreingresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtnombreingresar.setForeground(new java.awt.Color(0, 0, 0));
        txtnombreingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreingresarActionPerformed(evt);
            }
        });

        txtidingresar.setBackground(new java.awt.Color(255, 255, 255));
        txtidingresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtidingresar.setForeground(new java.awt.Color(0, 0, 0));

        cbusuarioingresar.setBackground(new java.awt.Color(255, 255, 255));
        cbusuarioingresar.setForeground(new java.awt.Color(0, 0, 0));
        cbusuarioingresar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Cliente", "Repartidor", "Administrador" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Identificación:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre:");

        btningresar.setBackground(new java.awt.Color(255, 255, 255));
        btningresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btningresar.setForeground(new java.awt.Color(0, 0, 0));
        btningresar.setText("Ingresar");

        javax.swing.GroupLayout panelingresarLayout = new javax.swing.GroupLayout(panelingresar);
        panelingresar.setLayout(panelingresarLayout);
        panelingresarLayout.setHorizontalGroup(
            panelingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelingresarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btningresar)
                    .addGroup(panelingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelingresarLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(cbusuarioingresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelingresarLayout.createSequentialGroup()
                            .addGroup(panelingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtnombreingresar)
                                .addComponent(txtidingresar)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panelingresarLayout.setVerticalGroup(
            panelingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelingresarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtnombreingresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtidingresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panelingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbusuarioingresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(38, 38, 38)
                .addComponent(btningresar)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelinicioLayout = new javax.swing.GroupLayout(panelinicio);
        panelinicio.setLayout(panelinicioLayout);
        panelinicioLayout.setHorizontalGroup(
            panelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(panelingresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panelinicioLayout.setVerticalGroup(
            panelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinicioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        pestaña.addTab("Inicio", panelinicio);

        panelrepartidor.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Repartidor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 102, 102))); // NOI18N

        tablarepartidor.setBackground(new java.awt.Color(255, 255, 255));
        tablarepartidor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablarepartidor.setForeground(new java.awt.Color(0, 0, 0));
        tablarepartidor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cliente", "Dirección", "Contenido"
            }
        ));
        jScrollPane1.setViewportView(tablarepartidor);

        btnactualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnactualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnactualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btnmostrarpedidosrepartidor.setBackground(new java.awt.Color(255, 204, 255));
        btnmostrarpedidosrepartidor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnmostrarpedidosrepartidor.setForeground(new java.awt.Color(0, 0, 0));
        btnmostrarpedidosrepartidor.setText("Mostrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnmostrarpedidosrepartidor)
                        .addGap(85, 85, 85)
                        .addComponent(btnactualizar)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactualizar)
                    .addComponent(btnmostrarpedidosrepartidor))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelrepartidorLayout = new javax.swing.GroupLayout(panelrepartidor);
        panelrepartidor.setLayout(panelrepartidorLayout);
        panelrepartidorLayout.setHorizontalGroup(
            panelrepartidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelrepartidorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        panelrepartidorLayout.setVerticalGroup(
            panelrepartidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelrepartidorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pestaña.addTab("Repartidor", panelrepartidor);

        paneladministrador.setBackground(new java.awt.Color(255, 255, 255));

        tablamostrarusuarios.setBackground(new java.awt.Color(255, 255, 255));
        tablamostrarusuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablamostrarusuarios.setForeground(new java.awt.Color(0, 0, 0));
        tablamostrarusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Tipo", "Dirección", "Teléfono"
            }
        ));
        jScrollPane2.setViewportView(tablamostrarusuarios);

        btnmostrarusuarios.setBackground(new java.awt.Color(255, 255, 255));
        btnmostrarusuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnmostrarusuarios.setForeground(new java.awt.Color(0, 0, 0));
        btnmostrarusuarios.setText("Mostrar Usuarios");
        btnmostrarusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarusuariosActionPerformed(evt);
            }
        });

        btnmostrarpedidos.setBackground(new java.awt.Color(255, 255, 255));
        btnmostrarpedidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnmostrarpedidos.setForeground(new java.awt.Color(0, 0, 0));
        btnmostrarpedidos.setText("Mostrar Pedidos");

        tablamostrarpedidos.setBackground(new java.awt.Color(255, 255, 255));
        tablamostrarpedidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablamostrarpedidos.setForeground(new java.awt.Color(0, 0, 0));
        tablamostrarpedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cliente", "Contenido"
            }
        ));
        jScrollPane3.setViewportView(tablamostrarpedidos);

        javax.swing.GroupLayout paneladministradorLayout = new javax.swing.GroupLayout(paneladministrador);
        paneladministrador.setLayout(paneladministradorLayout);
        paneladministradorLayout.setHorizontalGroup(
            paneladministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneladministradorLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(paneladministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneladministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmostrarpedidos)
                    .addComponent(btnmostrarusuarios))
                .addGap(15, 15, 15))
        );
        paneladministradorLayout.setVerticalGroup(
            paneladministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneladministradorLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(paneladministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmostrarusuarios))
                .addGap(56, 56, 56)
                .addGroup(paneladministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmostrarpedidos))
                .addGap(0, 63, Short.MAX_VALUE))
        );

        pestaña.addTab("Administrador", paneladministrador);

        panelcliente.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 102, 102))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Contenido del paquete:");

        btncomprar.setBackground(new java.awt.Color(255, 255, 255));
        btncomprar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btncomprar.setForeground(new java.awt.Color(0, 0, 0));
        btncomprar.setText("Comprar");

        cbcontenido.setBackground(new java.awt.Color(255, 255, 255));
        cbcontenido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbcontenido.setForeground(new java.awt.Color(0, 0, 0));
        cbcontenido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contenido", "iPhone 17 pro max 2 TB", "iPhone 17 pro max 1 TB", "iPhone 11", "1 kilo de dog chow", "1 kilo de oh my cats", " " }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Dirección:");

        txtdireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtdireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtdireccion.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Teléfono:");

        txttelefono.setBackground(new java.awt.Color(255, 255, 255));
        txttelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txttelefono.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbcontenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(7, 7, 7)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btncomprar)
                                .addComponent(txttelefono)))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbcontenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btncomprar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelclienteLayout = new javax.swing.GroupLayout(panelcliente);
        panelcliente.setLayout(panelclienteLayout);
        panelclienteLayout.setHorizontalGroup(
            panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelclienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );
        panelclienteLayout.setVerticalGroup(
            panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelclienteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        pestaña.addTab("Cliente", panelcliente);

        getContentPane().add(pestaña, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtnombreingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreingresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreingresarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnmostrarusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarusuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmostrarusuariosActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnactualizar;
    public javax.swing.JButton btncomprar;
    public javax.swing.JButton btncrear;
    public javax.swing.JButton btningresar;
    public javax.swing.JButton btnmostrarpedidos;
    public javax.swing.JButton btnmostrarpedidosrepartidor;
    public javax.swing.JButton btnmostrarusuarios;
    public javax.swing.JComboBox<String> cbcontenido;
    public javax.swing.JComboBox<String> cbusuario;
    public javax.swing.JComboBox<String> cbusuarioingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JPanel paneladministrador;
    public javax.swing.JPanel panelcliente;
    private javax.swing.JPanel panelingresar;
    public javax.swing.JPanel panelinicio;
    public javax.swing.JPanel panelrepartidor;
    private javax.swing.JPanel panelusuario;
    public javax.swing.JTabbedPane pestaña;
    public javax.swing.JTable tablamostrarpedidos;
    public javax.swing.JTable tablamostrarusuarios;
    public javax.swing.JTable tablarepartidor;
    public javax.swing.JTextField txtdireccion;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtidingresar;
    public javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txtnombreingresar;
    public javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
