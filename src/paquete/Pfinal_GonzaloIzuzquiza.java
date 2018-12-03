package paquete;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Gonzalo Izuzquiza
 */
public class Pfinal_GonzaloIzuzquiza extends javax.swing.JFrame {

    File fichero = null;
    DOM gesDom = new DOM();
    SAX gesSax = new SAX();
    XPATH gesXpath = new XPATH();
    JAXB gesJaxb = new JAXB();

    public Pfinal_GonzaloIzuzquiza() {
        initComponents();
        this.getContentPane().setBackground(Color.RED); // damos color al fondo del jFrame
        this.setLocationRelativeTo(null); // con esto hacemos que la pnatalla se abra en el centro de la pantalla
        setSize(850, 730);//con esto damo un tamñano pasando dos parametros, siendo ancho y alto, a la pantalla
    }

    private File abrirDocumento() {

        int rv;
        JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(false);
        fc.setDialogType(JFileChooser.OPEN_DIALOG);
        rv = fc.showOpenDialog(this);
        if (rv == JFileChooser.APPROVE_OPTION) {
            fichero = fc.getSelectedFile();
            cargado.setText("Archivo cargado correctamente");
        }
        return fichero;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrar = new javax.swing.JButton();
        abrir = new javax.swing.JButton();
        cargado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        equipo = new javax.swing.JLabel();
        en_contra = new javax.swing.JLabel();
        a_favor = new javax.swing.JLabel();
        estadio = new javax.swing.JLabel();
        presi = new javax.swing.JLabel();
        thebest = new javax.swing.JLabel();
        coach = new javax.swing.JLabel();
        €€ = new javax.swing.JLabel();
        pichichi = new javax.swing.JLabel();
        capi = new javax.swing.JLabel();
        ultimo_fichaje = new javax.swing.JLabel();
        estadio_texto = new javax.swing.JTextField();
        a_favor_texto = new javax.swing.JTextField();
        nuevo_texto = new javax.swing.JLabel();
        en_contra_texto = new javax.swing.JTextField();
        equipo_texto = new javax.swing.JTextField();
        presi_texto = new javax.swing.JTextField();
        thebest_texto = new javax.swing.JTextField();
        coach_texto = new javax.swing.JTextField();
        €€_texto = new javax.swing.JTextField();
        pichichi_texto = new javax.swing.JTextField();
        capi_texto = new javax.swing.JTextField();
        ultimo_fichaje_texto = new javax.swing.JTextField();
        annadir_boton = new javax.swing.JButton();
        guardar_boton = new javax.swing.JButton();
        annadido_texto = new javax.swing.JLabel();
        todoo = new javax.swing.JTextField();
        mejores = new javax.swing.JTextField();
        mejores_$$ = new javax.swing.JTextField();
        golllll = new javax.swing.JTextField();
        cap = new javax.swing.JTextField();
        menu = new javax.swing.JMenuBar();
        consultaas_menu = new javax.swing.JMenu();
        todos_los_datos = new javax.swing.JMenuItem();
        best = new javax.swing.JMenuItem();
        mejores_€€ = new javax.swing.JMenuItem();
        gol = new javax.swing.JMenuItem();
        c = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mostrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mostrar.setText("MOSTRAR");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        abrir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        abrir.setText("ABRIR");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });

        cargado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cargado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        equipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        equipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equipo.setText("Nombre del equipo");

        en_contra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        en_contra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        en_contra.setText("Goles en contra");

        a_favor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        a_favor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a_favor.setText("Goles a favor");

        estadio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        estadio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadio.setText("Estadio");

        presi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        presi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        presi.setText("Presidente");

        thebest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        thebest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thebest.setText("Mejor jugador de la hisotria");

        coach.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coach.setText("Entrenador");

        €€.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        €€.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        €€.setText("Jugador mejor pagado");

        pichichi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pichichi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pichichi.setText("Máximo goleador");

        capi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        capi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        capi.setText("Capitán");

        ultimo_fichaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ultimo_fichaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ultimo_fichaje.setText("Último fichaje");

        nuevo_texto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nuevo_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevo_texto.setText("INSERTA UN NUEVO EQUIPO");

        annadir_boton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        annadir_boton.setText("AÑADIR");
        annadir_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annadir_botonActionPerformed(evt);
            }
        });

        guardar_boton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        guardar_boton.setText("GUARDAR");
        guardar_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_botonActionPerformed(evt);
            }
        });

        annadido_texto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        todoo.setAlignmentX(0.0F);
        todoo.setBorder(null);
        todoo.setMaximumSize(new java.awt.Dimension(0, 0));
        todoo.setMinimumSize(new java.awt.Dimension(0, 0));

        mejores.setAlignmentX(0.0F);
        mejores.setBorder(null);
        mejores.setMaximumSize(new java.awt.Dimension(0, 0));
        mejores.setMinimumSize(new java.awt.Dimension(0, 0));

        mejores_$$.setAlignmentX(0.0F);
        mejores_$$.setBorder(null);
        mejores_$$.setMaximumSize(new java.awt.Dimension(0, 0));
        mejores_$$.setMinimumSize(new java.awt.Dimension(0, 0));

        golllll.setAlignmentX(0.0F);
        golllll.setBorder(null);
        golllll.setMaximumSize(new java.awt.Dimension(0, 0));
        golllll.setMinimumSize(new java.awt.Dimension(0, 0));

        cap.setAlignmentX(0.0F);
        cap.setBorder(null);
        cap.setMaximumSize(new java.awt.Dimension(0, 0));
        cap.setMinimumSize(new java.awt.Dimension(0, 0));

        consultaas_menu.setText("Consultas");

        todos_los_datos.setText("Todos los datos");
        todos_los_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todos_los_datosActionPerformed(evt);
            }
        });
        consultaas_menu.add(todos_los_datos);

        best.setText("Mejores jugadores");
        best.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestActionPerformed(evt);
            }
        });
        consultaas_menu.add(best);

        mejores_€€.setText("Mejores pagados");
        mejores_€€.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mejores_€€ActionPerformed(evt);
            }
        });
        consultaas_menu.add(mejores_€€);

        gol.setText("Máximos goleadores");
        gol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golActionPerformed(evt);
            }
        });
        consultaas_menu.add(gol);

        c.setText("Capitanes");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        consultaas_menu.add(c);

        menu.add(consultaas_menu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cargado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(abrir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(annadido_texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(todoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(thebest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(coach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(€€, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pichichi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(capi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ultimo_fichaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(presi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(capi_texto)
                                    .addComponent(pichichi_texto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(€€_texto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(coach_texto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(presi_texto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(thebest_texto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ultimo_fichaje_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevo_texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(annadir_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(guardar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(equipo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(en_contra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(a_favor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(estadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(a_favor_texto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(en_contra_texto, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(equipo_texto, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(estadio_texto))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(459, Short.MAX_VALUE)
                    .addComponent(mejores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(341, 341, 341)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(469, Short.MAX_VALUE)
                    .addComponent(mejores_$$, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(331, 331, 331)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(479, Short.MAX_VALUE)
                    .addComponent(golllll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(321, 321, 321)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(489, Short.MAX_VALUE)
                    .addComponent(cap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(311, 311, 311)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(todoo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cargado, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(annadido_texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadio_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a_favor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_favor_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(en_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(en_contra_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estadio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equipo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(presi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(presi_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(thebest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(€€, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pichichi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(capi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ultimo_fichaje, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(thebest_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coach_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(€€_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pichichi_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(capi_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ultimo_fichaje_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(annadir_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(mejores, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(654, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(mejores_$$, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(644, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(golllll, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(634, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(cap, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(624, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        abrirDocumento();
        gesSax.abrir_XML_SAX(fichero); // le pasamos la ruta al reader para que lo lea
        gesJaxb.abrir_XML_JAXB(fichero);
        texto.setText(gesSax.recorrerSAX()); //nos muestra el contenido del documento 
    }//GEN-LAST:event_abrirActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        texto.setText(gesSax.recorrerSAX()); //nos muestra el contenido del documento 
    }//GEN-LAST:event_mostrarActionPerformed

    private void annadir_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annadir_botonActionPerformed
        gesDom.abrir_XML_DOM(fichero);
        gesDom.recorrerDOMyMostrarlo();
        gesDom.annadirDOM(estadio_texto.getText(), a_favor_texto.getText(), en_contra_texto.getText(), equipo_texto.getText(),
                presi_texto.getText(), thebest_texto.getText(), coach_texto.getText(), €€_texto.getText(), pichichi_texto.getText(),
                capi_texto.getText(), ultimo_fichaje_texto.getText());
        annadido_texto.setText("Añadido correctamente");
        gesDom.guardarDOMcomoFILE(fichero);
        texto.setText(gesSax.recorrerSAX());
    }//GEN-LAST:event_annadir_botonActionPerformed

    private void guardar_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_botonActionPerformed
        gesJaxb.recorrerJAXByMostrar();
        gesJaxb.guardarJaxb(fichero);
        JOptionPane.showMessageDialog(null, "Guardado correctamene, en la carpeta del proyecto");
    }//GEN-LAST:event_guardar_botonActionPerformed

    private void todos_los_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todos_los_datosActionPerformed
        todoo.setText("/Futbol/Equipo");
        gesXpath.EjecutaXPath(fichero, todoo.getText());
        texto.setText(gesXpath.salida);
    }//GEN-LAST:event_todos_los_datosActionPerformed

    private void bestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestActionPerformed
        mejores.setText("/Futbol/Equipo/Mejor_jugador_de_la_historia");
        gesXpath.EjecutaXPath(fichero, mejores.getText());
        texto.setText(gesXpath.salida);
    }//GEN-LAST:event_bestActionPerformed

    private void mejores_€€ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mejores_€€ActionPerformed
        mejores_$$.setText("/Futbol/Equipo/Jugador_mejor_pagado");
        gesXpath.EjecutaXPath(fichero, mejores_$$.getText());
        texto.setText(gesXpath.salida);
    }//GEN-LAST:event_mejores_€€ActionPerformed

    private void golActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golActionPerformed
        golllll.setText("/Futbol/Equipo/Maximo_goleador");
        gesXpath.EjecutaXPath(fichero, golllll.getText());
        texto.setText(gesXpath.salida);
    }//GEN-LAST:event_golActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        cap.setText("/Futbol/Equipo/Capitan");
        gesXpath.EjecutaXPath(fichero, cap.getText());
        texto.setText(gesXpath.salida);
    }//GEN-LAST:event_cActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pfinal_GonzaloIzuzquiza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a_favor;
    private javax.swing.JTextField a_favor_texto;
    private javax.swing.JButton abrir;
    private javax.swing.JLabel annadido_texto;
    private javax.swing.JButton annadir_boton;
    private javax.swing.JMenuItem best;
    private javax.swing.JMenuItem c;
    private javax.swing.JTextField cap;
    private javax.swing.JLabel capi;
    private javax.swing.JTextField capi_texto;
    private javax.swing.JLabel cargado;
    private javax.swing.JLabel coach;
    private javax.swing.JTextField coach_texto;
    private javax.swing.JMenu consultaas_menu;
    private javax.swing.JLabel en_contra;
    private javax.swing.JTextField en_contra_texto;
    private javax.swing.JLabel equipo;
    private javax.swing.JTextField equipo_texto;
    private javax.swing.JLabel estadio;
    private javax.swing.JTextField estadio_texto;
    private javax.swing.JMenuItem gol;
    private javax.swing.JTextField golllll;
    private javax.swing.JButton guardar_boton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mejores;
    private javax.swing.JTextField mejores_$$;
    private javax.swing.JMenuItem mejores_€€;
    private javax.swing.JMenuBar menu;
    private javax.swing.JButton mostrar;
    private javax.swing.JLabel nuevo_texto;
    private javax.swing.JLabel pichichi;
    private javax.swing.JTextField pichichi_texto;
    private javax.swing.JLabel presi;
    private javax.swing.JTextField presi_texto;
    private javax.swing.JTextArea texto;
    private javax.swing.JLabel thebest;
    private javax.swing.JTextField thebest_texto;
    private javax.swing.JTextField todoo;
    private javax.swing.JMenuItem todos_los_datos;
    private javax.swing.JLabel ultimo_fichaje;
    private javax.swing.JTextField ultimo_fichaje_texto;
    private javax.swing.JLabel €€;
    private javax.swing.JTextField €€_texto;
    // End of variables declaration//GEN-END:variables

}
