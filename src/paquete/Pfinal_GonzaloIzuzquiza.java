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

    DOM gesDom = new DOM();
    SAX gesSax = new SAX();
    XPATH gesXpath = new XPATH();
    File fichero = null;

    public Pfinal_GonzaloIzuzquiza() {
        initComponents();
        this.getContentPane().setBackground(Color.RED); // damos color al fondo del jFrame
        this.setLocationRelativeTo(null); // con esto hacemos que la pnatalla se abra en el centro de la pantalla
        setSize(900, 880);//con esto damo un tamñano pasando dos parametros, siendo ancho y alto, a la pantalla
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(cargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nuevo_texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(estadio_texto)
                                    .addComponent(equipo_texto, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(annadir_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(guardar_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                            .addComponent(capi_texto, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(pichichi_texto, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(€€_texto, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(coach_texto, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(presi_texto, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(thebest_texto, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ultimo_fichaje_texto)))
                                    .addComponent(annadido_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cargado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equipo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(estadio_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(annadir_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(annadido_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        abrirDocumento();
        gesSax.abrir_XML_SAX(fichero); // le pasamos la ruta al reader para que lo lea
        texto.setText(gesSax.recorrerSAX()); //nos muestra el contenido del documento 
    }//GEN-LAST:event_abrirActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        texto.setText(gesSax.recorrerSAX()); //nos muestra el contenido del documento 
    }//GEN-LAST:event_mostrarActionPerformed

    private void annadir_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annadir_botonActionPerformed
        gesDom.abrir_XML_DOM(fichero);
        gesDom.recorrerDOMyMostrarlo();
        //texto.setText("");
        gesDom.annadirDOM(estadio_texto.getText(), a_favor_texto.getText(), en_contra_texto.getText(), equipo_texto.getText(),
                presi_texto.getText(), thebest_texto.getText(), coach_texto.getText(), €€_texto.getText(), pichichi_texto.getText(),
                capi_texto.getText(), ultimo_fichaje_texto.getText());
        annadido_texto.setText("Añadido correctamente");
        gesDom.guardarDOMcomoFILE(fichero);
        texto.setText(gesSax.recorrerSAX());
    }//GEN-LAST:event_annadir_botonActionPerformed

    private void guardar_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_botonActionPerformed

    }//GEN-LAST:event_guardar_botonActionPerformed

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
    private javax.swing.JLabel capi;
    private javax.swing.JTextField capi_texto;
    private javax.swing.JLabel cargado;
    private javax.swing.JLabel coach;
    private javax.swing.JTextField coach_texto;
    private javax.swing.JLabel en_contra;
    private javax.swing.JTextField en_contra_texto;
    private javax.swing.JLabel equipo;
    private javax.swing.JTextField equipo_texto;
    private javax.swing.JLabel estadio;
    private javax.swing.JTextField estadio_texto;
    private javax.swing.JButton guardar_boton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrar;
    private javax.swing.JLabel nuevo_texto;
    private javax.swing.JLabel pichichi;
    private javax.swing.JTextField pichichi_texto;
    private javax.swing.JLabel presi;
    private javax.swing.JTextField presi_texto;
    private javax.swing.JTextArea texto;
    private javax.swing.JLabel thebest;
    private javax.swing.JTextField thebest_texto;
    private javax.swing.JLabel ultimo_fichaje;
    private javax.swing.JTextField ultimo_fichaje_texto;
    private javax.swing.JLabel €€;
    private javax.swing.JTextField €€_texto;
    // End of variables declaration//GEN-END:variables

}
