package interfaz;

import dominio.Ingesta;
import dominio.Sistema;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VentanaRegistrarUsuario extends javax.swing.JDialog {

    private Sistema sistema;
    private ImageIcon fotoDePerfilActual;
    private boolean primeraVez;

    public VentanaRegistrarUsuario(Sistema unSistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = unSistema;
        this.fotoDePerfilActual = new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"));
        this.primeraVez = true;
        ocultarEtiquetas();
        cargarListaPreferencias();
        cargarListaRestricciones();
        cargarListaPaises();
        Calendar fecha = new GregorianCalendar();
        this.dateChooserFechaNacimiento.setMaxDate(fecha);
        this.primeraVez = false;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    public ImageIcon getFotoDePerfilActual() {
        return fotoDePerfilActual;
    }

    public void setFotoDePerfilActual(ImageIcon unaFoto) {
        this.fotoDePerfilActual = unaFoto;
    }

    public boolean getPrimeraVezEnSistema() {
        return primeraVez;
    }

    public void setPrimeraVezEnSistema(boolean primera) {
        this.primeraVez = primera;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        lblTituloVentana = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        icono = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        lblNuevoUsuario = new javax.swing.JLabel();
        lblIconoNuevoUsuario = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblTxtPreferencias = new javax.swing.JLabel();
        rdBtnVerduras = new javax.swing.JRadioButton();
        rdBtnHarinas = new javax.swing.JRadioButton();
        rdBtnFrutas = new javax.swing.JRadioButton();
        rdBtnCarnesRojas = new javax.swing.JRadioButton();
        rdBtnCarnesBlancas = new javax.swing.JRadioButton();
        lblTxtRestricciones = new javax.swing.JLabel();
        rdBtnCeliaco = new javax.swing.JRadioButton();
        rdBtnDiabetes = new javax.swing.JRadioButton();
        rdBtnVegano = new javax.swing.JRadioButton();
        btnIngresarUsuarioASistema = new javax.swing.JButton();
        lblTxtNacionalidad = new javax.swing.JLabel();
        listaNacionalidad = new javax.swing.JComboBox<>();
        lblTxtFechaNac = new javax.swing.JLabel();
        rdBtnIntoleranteLactosa = new javax.swing.JRadioButton();
        dateChooserFechaNacimiento = new datechooser.beans.DateChooserCombo();
        btnIngresarFotoPerfil = new javax.swing.JButton();
        lblValidarNombre = new javax.swing.JLabel();
        lblValidarApellido = new javax.swing.JLabel();
        lblValidarNacionalidad = new javax.swing.JLabel();
        lblDatosIncorrectos = new javax.swing.JLabel();
        lblNombreVacio = new javax.swing.JLabel();
        lblApellidoVacio = new javax.swing.JLabel();
        lblPaisVacio = new javax.swing.JLabel();
        btnCerrarProfesional = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 800));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1060, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(164, 211, 249));
        panel1.setMaximumSize(new java.awt.Dimension(270, 800));

        lblTituloVentana.setFont(new java.awt.Font("Segoe Script", 1, 50)); // NOI18N
        lblTituloVentana.setForeground(new java.awt.Color(0, 51, 153));
        lblTituloVentana.setText("Broccoli");

        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoVolverAtras.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setFocusPainted(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBrocoli.png"))); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addGap(116, 116, 116)
                .addComponent(lblTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 270, 800);

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setForeground(new java.awt.Color(51, 51, 51));
        panel2.setMaximumSize(new java.awt.Dimension(800, 800));
        panel2.setMinimumSize(new java.awt.Dimension(800, 800));
        panel2.setPreferredSize(new java.awt.Dimension(800, 800));

        lblNuevoUsuario.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoUsuario.setText("Nuevo Usuario");

        lblIconoNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");

        lblApellido.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellido");

        txtNombre.setBackground(new java.awt.Color(227, 227, 227));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.setMaximumSize(new java.awt.Dimension(6, 26));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });

        txtApellido.setBackground(new java.awt.Color(227, 227, 227));
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtApellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellido.setMaximumSize(new java.awt.Dimension(6, 26));
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });

        lblTxtPreferencias.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTxtPreferencias.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtPreferencias.setText("Preferencias");

        rdBtnVerduras.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnVerduras.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnVerduras.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnVerduras.setText("Preferencia 3");

        rdBtnHarinas.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnHarinas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnHarinas.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnHarinas.setText("Preferencia 5");

        rdBtnFrutas.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnFrutas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnFrutas.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnFrutas.setText("Preferencia 4");

        rdBtnCarnesRojas.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnCarnesRojas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnCarnesRojas.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnCarnesRojas.setText("Preferencia 1");

        rdBtnCarnesBlancas.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnCarnesBlancas.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnCarnesBlancas.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnCarnesBlancas.setText("Preferencia 2");

        lblTxtRestricciones.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTxtRestricciones.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtRestricciones.setText("Restricciones");

        rdBtnCeliaco.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnCeliaco.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnCeliaco.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnCeliaco.setText("Restriccion 4");

        rdBtnDiabetes.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnDiabetes.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnDiabetes.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnDiabetes.setText("Restriccion 1");

        rdBtnVegano.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnVegano.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnVegano.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnVegano.setText("Restriccion 2");

        btnIngresarUsuarioASistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoConfirmar.png"))); // NOI18N
        btnIngresarUsuarioASistema.setBorderPainted(false);
        btnIngresarUsuarioASistema.setContentAreaFilled(false);
        btnIngresarUsuarioASistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarUsuarioASistemaActionPerformed(evt);
            }
        });

        lblTxtNacionalidad.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTxtNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtNacionalidad.setText("Nacionalidad");

        listaNacionalidad.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        listaNacionalidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaNacionalidadItemStateChanged(evt);
            }
        });

        lblTxtFechaNac.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTxtFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        lblTxtFechaNac.setText("Fecha de nacimiento");

        rdBtnIntoleranteLactosa.setBackground(new java.awt.Color(51, 51, 51));
        rdBtnIntoleranteLactosa.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdBtnIntoleranteLactosa.setForeground(new java.awt.Color(255, 255, 255));
        rdBtnIntoleranteLactosa.setText("Restriccion 3");
        rdBtnIntoleranteLactosa.setActionCommand("");

        dateChooserFechaNacimiento.setFieldFont(new java.awt.Font("Century Gothic", java.awt.Font.PLAIN, 19));
        dateChooserFechaNacimiento.setMaxDate(new java.util.GregorianCalendar(2017, 10, 9));
        dateChooserFechaNacimiento.setMinDate(new java.util.GregorianCalendar(1917, 10, 1));

        btnIngresarFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarFotoUsuario.png"))); // NOI18N
        btnIngresarFotoPerfil.setBorderPainted(false);
        btnIngresarFotoPerfil.setContentAreaFilled(false);
        btnIngresarFotoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarFotoPerfilActionPerformed(evt);
            }
        });

        lblValidarNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N

        lblValidarApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N

        lblValidarNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        lblValidarNacionalidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N

        lblDatosIncorrectos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDatosIncorrectos.setForeground(new java.awt.Color(255, 153, 153));
        lblDatosIncorrectos.setText("Aún quedan datos incorrectos");

        lblNombreVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblNombreVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblNombreVacio.setText("Dato vacío");

        lblApellidoVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblApellidoVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblApellidoVacio.setText("Dato vacío");

        lblPaisVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        lblPaisVacio.setForeground(new java.awt.Color(240, 128, 128));
        lblPaisVacio.setText("Dato vacío");

        btnCerrarProfesional.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarProfesional.setForeground(new java.awt.Color(51, 51, 51));
        btnCerrarProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarProfesional.setBorderPainted(false);
        btnCerrarProfesional.setContentAreaFilled(false);
        btnCerrarProfesional.setFocusPainted(false);
        btnCerrarProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarProfesionalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lblIconoNuevoUsuario)
                .addGap(18, 18, 18)
                .addComponent(lblNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnCerrarProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValidarNombre)
                    .addComponent(lblValidarApellido))
                .addGap(8, 8, 8)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidoVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(btnIngresarFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTxtNacionalidad)
                .addGap(26, 26, 26)
                .addComponent(listaNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblValidarNacionalidad)
                .addGap(8, 8, 8)
                .addComponent(lblPaisVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTxtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(dateChooserFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTxtPreferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(lblTxtRestricciones, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(rdBtnCarnesRojas, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220)
                .addComponent(rdBtnDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(rdBtnCarnesBlancas, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229)
                .addComponent(rdBtnVegano))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(rdBtnVerduras, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243)
                .addComponent(rdBtnIntoleranteLactosa, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(rdBtnFrutas)
                .addGap(285, 285, 285)
                .addComponent(rdBtnCeliaco))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(rdBtnHarinas))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(lblDatosIncorrectos, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnIngresarUsuarioASistema))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblIconoNuevoUsuario))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCerrarProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblNombre)
                        .addGap(11, 11, 11)
                        .addComponent(lblApellido))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblValidarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblValidarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblNombreVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblApellidoVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnIngresarFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTxtNacionalidad)
                    .addComponent(listaNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValidarNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaisVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTxtFechaNac)
                    .addComponent(dateChooserFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTxtPreferencias)
                    .addComponent(lblTxtRestricciones))
                .addGap(7, 7, 7)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdBtnCarnesRojas)
                    .addComponent(rdBtnDiabetes))
                .addGap(3, 3, 3)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdBtnCarnesBlancas)
                    .addComponent(rdBtnVegano))
                .addGap(3, 3, 3)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdBtnVerduras)
                    .addComponent(rdBtnIntoleranteLactosa))
                .addGap(3, 3, 3)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdBtnFrutas)
                    .addComponent(rdBtnCeliaco))
                .addGap(3, 3, 3)
                .addComponent(rdBtnHarinas)
                .addGap(2, 2, 2)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblDatosIncorrectos))
                    .addComponent(btnIngresarUsuarioASistema, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(panel2);
        panel2.setBounds(275, 0, 950, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        VentanaMenuPrincipal vPrincipal = new VentanaMenuPrincipal(sistema);
        this.setVisible(false);
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnIngresarUsuarioASistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarUsuarioASistemaActionPerformed
        String nombre = this.txtNombre.getText();
        String apellido = this.txtApellido.getText();
        ArrayList<String> preferencias = new ArrayList<>();
        ArrayList<String> restricciones = new ArrayList<>();
        ArrayList<Ingesta> alimentosIngeridosPorFecha = new ArrayList<>();
        String nacionalidad = (String) this.listaNacionalidad.getSelectedItem();
        String fechaNacimiento = this.dateChooserFechaNacimiento.getText();
        if (nombre.equals("") || apellido.equals("") || nacionalidad.equals("Seleccione...")) {
            this.lblDatosIncorrectos.setVisible(true);
            mostrarErrores(nombre, apellido, nacionalidad);
        } else {
            this.lblDatosIncorrectos.setVisible(false);
            agregarPreferenciasUsuario(preferencias);
            agregarRestriccionesUsuario(restricciones);
            boolean seAgregoUsuario = this.getSistema().crearUsuario(nombre, apellido, fechaNacimiento, this.fotoDePerfilActual, nacionalidad, preferencias, restricciones, alimentosIngeridosPorFecha);
            if (seAgregoUsuario) {
                this.txtNombre.setText("");
                this.txtApellido.setText("");
                VentanaMenuPrincipal vPrincipal = new VentanaMenuPrincipal(sistema);
                this.setVisible(false);
                vPrincipal.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnIngresarUsuarioASistemaActionPerformed

    private void btnIngresarFotoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarFotoPerfilActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file = new FileNameExtensionFilter("PNG", "png");
        fileChooser.setFileFilter(file);
        fileChooser.setAcceptAllFileFilterUsed(false);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            ImageIcon iconoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
            this.btnIngresarFotoPerfil.setIcon(iconoPerfil);
            this.fotoDePerfilActual = iconoPerfil;
        }
    }//GEN-LAST:event_btnIngresarFotoPerfilActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        String nombreIngresado = this.txtNombre.getText();
        if (nombreIngresado.equals("")) {
            this.lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(true);
        } else {
            this.lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(false);
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        String apellidoIngresado = this.txtApellido.getText();
        if (apellidoIngresado.equals("")) {
            this.lblValidarApellido.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarApellido.setVisible(true);
            this.lblApellidoVacio.setVisible(true);
        } else {
            this.lblValidarApellido.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarApellido.setVisible(true);
            this.lblApellidoVacio.setVisible(false);
        }
    }//GEN-LAST:event_txtApellidoFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema();
    }//GEN-LAST:event_formWindowClosing

    private void listaNacionalidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaNacionalidadItemStateChanged
        if (!this.primeraVez) {
            String nacionalidadIngresada = (String) listaNacionalidad.getSelectedItem();
            if (nacionalidadIngresada.equals("Seleccione...")) {
                this.lblValidarNacionalidad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
                this.lblValidarNacionalidad.setVisible(true);
                this.lblPaisVacio.setVisible(true);
            } else {
                this.lblValidarNacionalidad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
                this.lblValidarNacionalidad.setVisible(true);
                this.lblPaisVacio.setVisible(false);
            }
        }

    }//GEN-LAST:event_listaNacionalidadItemStateChanged

    private void btnCerrarProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarProfesionalActionPerformed
        this.sistema.guardarDatosSistema();
        System.exit(0);
    }//GEN-LAST:event_btnCerrarProfesionalActionPerformed

    void agregarRestriccionesUsuario(ArrayList<String> restricciones) {
        if (this.rdBtnCeliaco.isSelected()) {
            restricciones.add("Celíaco");
        }
        if (this.rdBtnDiabetes.isSelected()) {
            restricciones.add("Diabético");
        }
        if (this.rdBtnVegano.isSelected()) {
            restricciones.add("Veganismo");
        }
        if (this.rdBtnIntoleranteLactosa.isSelected()) {
            restricciones.add("Intolerancia a la lactosa");
        }
    }

    void agregarPreferenciasUsuario(ArrayList<String> preferencias) {
        if (this.rdBtnCarnesBlancas.isSelected()) {
            preferencias.add("Carnes Blancas");
        }
        if (this.rdBtnCarnesRojas.isSelected()) {
            preferencias.add("Carnes Rojas");
        }
        if (this.rdBtnFrutas.isSelected()) {
            preferencias.add("Frutas");
        }
        if (this.rdBtnVerduras.isSelected()) {
            preferencias.add("Verduras");
        }
        if (this.rdBtnHarinas.isSelected()) {
            preferencias.add("Harinas");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarProfesional;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIngresarFotoPerfil;
    private javax.swing.JButton btnIngresarUsuarioASistema;
    private datechooser.beans.DateChooserCombo dateChooserFechaNacimiento;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellidoVacio;
    private javax.swing.JLabel lblDatosIncorrectos;
    private javax.swing.JLabel lblIconoNuevoUsuario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreVacio;
    private javax.swing.JLabel lblNuevoUsuario;
    private javax.swing.JLabel lblPaisVacio;
    private javax.swing.JLabel lblTituloVentana;
    private javax.swing.JLabel lblTxtFechaNac;
    private javax.swing.JLabel lblTxtNacionalidad;
    private javax.swing.JLabel lblTxtPreferencias;
    private javax.swing.JLabel lblTxtRestricciones;
    private javax.swing.JLabel lblValidarApellido;
    private javax.swing.JLabel lblValidarNacionalidad;
    private javax.swing.JLabel lblValidarNombre;
    private javax.swing.JComboBox<String> listaNacionalidad;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JRadioButton rdBtnCarnesBlancas;
    private javax.swing.JRadioButton rdBtnCarnesRojas;
    private javax.swing.JRadioButton rdBtnCeliaco;
    private javax.swing.JRadioButton rdBtnDiabetes;
    private javax.swing.JRadioButton rdBtnFrutas;
    private javax.swing.JRadioButton rdBtnHarinas;
    private javax.swing.JRadioButton rdBtnIntoleranteLactosa;
    private javax.swing.JRadioButton rdBtnVegano;
    private javax.swing.JRadioButton rdBtnVerduras;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void ocultarEtiquetas() {
        this.lblValidarNombre.setVisible(false);
        this.lblValidarApellido.setVisible(false);
        this.lblValidarNacionalidad.setVisible(false);
        this.lblDatosIncorrectos.setVisible(false);
        this.lblNombreVacio.setVisible(false);
        this.lblApellidoVacio.setVisible(false);
        this.lblPaisVacio.setVisible(false);
    }

    private void cargarListaPreferencias() {
        Sistema.Preferencias[] listaPreferencias = new Sistema.Preferencias[5];
        listaPreferencias[0] = Sistema.Preferencias.CarnesBlancas;
        listaPreferencias[1] = Sistema.Preferencias.CarnesRojas;
        listaPreferencias[2] = Sistema.Preferencias.Frutas;
        listaPreferencias[3] = Sistema.Preferencias.Harinas;
        listaPreferencias[4] = Sistema.Preferencias.Verduras;
        for (int i = 0; i < listaPreferencias.length; i++) {
            if (i == 0) {
                this.rdBtnCarnesRojas.setText("Carnes Rojas");
            }
            if (i == 1) {
                this.rdBtnCarnesBlancas.setText("Carnes Blancas");
            }
            if (i == 2) {
                this.rdBtnFrutas.setText("Frutas");
            }
            if (i == 3) {
                this.rdBtnHarinas.setText("Harinas");
            }
            if (i == 4) {
                this.rdBtnVerduras.setText("Verduras");
            }
        }
    }

    private void cargarListaRestricciones() {
        Sistema.Restricciones[] listaRestricciones = new Sistema.Restricciones[4];
        listaRestricciones[0] = Sistema.Restricciones.Celiaquia;
        listaRestricciones[1] = Sistema.Restricciones.Diabetes;
        listaRestricciones[2] = Sistema.Restricciones.IntoleranciaLactosa;
        listaRestricciones[3] = Sistema.Restricciones.Veganismo;
        for (int i = 0; i < listaRestricciones.length; i++) {
            if (i == 0) {
                this.rdBtnCeliaco.setText("Celiaquía");
            }
            if (i == 1) {
                this.rdBtnDiabetes.setText("Diabetes");
            }
            if (i == 2) {
                this.rdBtnIntoleranteLactosa.setText("Intolerante a la lactosa");
            }
            if (i == 3) {
                this.rdBtnVegano.setText("Veganismo");
            }
        }
    }

    private void cargarListaPaises() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> nacionalidaesEnSistema = sistema.devolverListaPaises();
        this.listaNacionalidad.setModel(modelo);
        this.listaNacionalidad.addItem("Seleccione...");
        for (int i = 0; i < nacionalidaesEnSistema.size(); i++) {
            this.listaNacionalidad.addItem(nacionalidaesEnSistema.get(i));
        }
    }

    private void mostrarErrores(String nombre, String apellido, String nacionalidad) {
        if (nombre.equals("")) {
            this.lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(true);
        }
        if (apellido.equals("")) {
            this.lblValidarApellido.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarApellido.setVisible(true);
            this.lblApellidoVacio.setVisible(true);
        }
        if (nacionalidad.equals("Seleccione...")) {
            this.lblValidarNacionalidad.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNacionalidad.setVisible(true);
            this.lblPaisVacio.setVisible(true);
        }
    }

}
