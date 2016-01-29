package vista;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import controlador.ConexionCliente;
import controlador.ControlInterfazVentas;
import controlador.Validaciones;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import modelo.Producto;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import manejoXML.DaoVentasXml;
import modelo.Cliente;
import modelo.Empleado;
import modelo.ListaEmpleados;
import modelo.ListaProducto;
import modelo.TablaModeloFactura;
import modelo.TablaRenderizadorFactura;
import modelo.Ventas;
import modelo.VentasXML;
/**
 * @author DrowSoft
 */
public class PrincipalVentas extends javax.swing.JFrame {

    private DaoVentasXml ventasXml = new DaoVentasXml();
    private controlador.ControlInterfazVentas control;
    private int cont=0; String cargo;
    private ListaProducto productos = new ListaProducto();
    private ArrayList<Producto> productosVenta = new ArrayList<Producto>();
    private ArrayList<Producto> prodBasic = new ArrayList<Producto>();
    private ArrayList<Producto> prodCompl = new ArrayList<Producto>();
    private ArrayList<Producto> prodExtras = new ArrayList<Producto>();
    private ListaEmpleados empleados = new ListaEmpleados();
    private String rutaArchivo="",nombreArchivo="",empleado="";
    private double monto=0,total=0;
    private ConexionCliente conexion = new ConexionCliente();
    private Validaciones validar = new Validaciones();
    
    public PrincipalVentas(){}
    
    public PrincipalVentas(String cargo,String empleado) {
        initComponents();
        this.setLocationRelativeTo(null);
        ocultarPaneles();
        iniciarImagenes();
        iniciarPaneles();
        llenarListas();
        this.cargo=cargo; this.empleado=empleado;
        verificarInventario();
        jLabel1.getLocation();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVentas = new javax.swing.JPanel();
        panelProductos = new javax.swing.JPanel();
        panelPostresB = new javax.swing.JPanel();
        botonMerengada = new javax.swing.JButton();
        botonHelados = new javax.swing.JButton();
        botonBrownie = new javax.swing.JButton();
        botonCheesecake = new javax.swing.JButton();
        fondoPostres = new javax.swing.JLabel();
        panelPostresI = new javax.swing.JPanel();
        tituloPostres = new javax.swing.JLabel();
        labelPostresD = new javax.swing.JLabel();
        panelBebidaB = new javax.swing.JPanel();
        botonRefrescos = new javax.swing.JButton();
        botonNaturales = new javax.swing.JButton();
        botonCafe = new javax.swing.JButton();
        botonAgua = new javax.swing.JButton();
        botonYogurt = new javax.swing.JButton();
        botonJugos = new javax.swing.JButton();
        fondoBebidas = new javax.swing.JLabel();
        panelBebidaI = new javax.swing.JPanel();
        tituloBebidas = new javax.swing.JLabel();
        labelBebidasD = new javax.swing.JLabel();
        panelDesayunoB = new javax.swing.JPanel();
        botonBollitos = new javax.swing.JButton();
        botonEmpanadas = new javax.swing.JButton();
        botonTequeño = new javax.swing.JButton();
        botonArepa = new javax.swing.JButton();
        fondoDesayunos = new javax.swing.JLabel();
        panelDesayunoI = new javax.swing.JPanel();
        tituloDesayunos = new javax.swing.JLabel();
        labelDesayunoD = new javax.swing.JLabel();
        panelAlmuerzoB = new javax.swing.JPanel();
        botonPasta = new javax.swing.JButton();
        botonPerro = new javax.swing.JButton();
        botonHamburguesa = new javax.swing.JButton();
        botonArroz = new javax.swing.JButton();
        fondoAlmuerzos = new javax.swing.JLabel();
        panelAlmuerzoI = new javax.swing.JPanel();
        tituloAlmuerzo = new javax.swing.JLabel();
        labelAlmuerzoD = new javax.swing.JLabel();
        panelCombosB = new javax.swing.JPanel();
        botonCombo6 = new javax.swing.JButton();
        botonCombo3 = new javax.swing.JButton();
        botonCombo4 = new javax.swing.JButton();
        botonCombo5 = new javax.swing.JButton();
        botonCombo1 = new javax.swing.JButton();
        botonCombo2 = new javax.swing.JButton();
        fondoCombos = new javax.swing.JLabel();
        panelCombosI = new javax.swing.JPanel();
        tituloCombos = new javax.swing.JLabel();
        labelCombosD = new javax.swing.JLabel();
        panelChucheriaB = new javax.swing.JPanel();
        botonGalletas = new javax.swing.JButton();
        botonChoco = new javax.swing.JButton();
        botonBolsa = new javax.swing.JButton();
        botonMasticable = new javax.swing.JButton();
        fondoChucherias = new javax.swing.JLabel();
        panelChucheriaI = new javax.swing.JPanel();
        tituloChucherias = new javax.swing.JLabel();
        labelChucheriasD = new javax.swing.JLabel();
        panelFactura = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        separadorCliente = new javax.swing.JSeparator();
        labelCliente = new javax.swing.JLabel();
        labelCliente1 = new javax.swing.JLabel();
        panelPago = new javax.swing.JPanel();
        labelTarjeta = new javax.swing.JLabel();
        textTarjeta = new javax.swing.JTextField();
        labelClave = new javax.swing.JLabel();
        textClave = new javax.swing.JTextField();
        separadorPago = new javax.swing.JSeparator();
        checkTarjeta = new javax.swing.JCheckBox();
        checkEfectivo = new javax.swing.JCheckBox();
        panelCliente = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        labelCedula = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        textDireccion = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        textCedula = new javax.swing.JTextField();
        labelProductos = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        textTotal = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        botonBuscarProd = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        labelFondo1 = new javax.swing.JLabel();
        panelAyuda = new javax.swing.JPanel();
        botonManual = new javax.swing.JButton();
        comentario1 = new javax.swing.JLabel();
        comentario2 = new javax.swing.JLabel();
        comentario3 = new javax.swing.JLabel();
        panelBoton = new javax.swing.JPanel();
        botonCerrarAdjunto = new javax.swing.JButton();
        panelMensaje = new javax.swing.JPanel();
        labelPara = new javax.swing.JLabel();
        destinatario = new javax.swing.JTextField();
        labelAsunto = new javax.swing.JLabel();
        textAsunto = new javax.swing.JTextField();
        labelMensaje = new javax.swing.JLabel();
        mensajeAdjunto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMensaje = new javax.swing.JTextArea();
        botonAdjuntar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonEnviar = new javax.swing.JButton();
        labelFondo3 = new javax.swing.JLabel();
        panelReportes = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        labelFondo2 = new javax.swing.JLabel();
        panelConcretar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        fonfoConcretar = new javax.swing.JLabel();
        labelVentas = new javax.swing.JLabel();
        labelReportes = new javax.swing.JLabel();
        labelAyuda = new javax.swing.JLabel();
        labelCerrarSesion = new javax.swing.JLabel();
        separadorVer1 = new javax.swing.JSeparator();
        separadorVer2 = new javax.swing.JSeparator();
        separadorVer3 = new javax.swing.JSeparator();
        separadorCompleto = new javax.swing.JSeparator();
        separadorAyuda = new javax.swing.JSeparator();
        separadorReportes1 = new javax.swing.JSeparator();
        separadorReportes2 = new javax.swing.JSeparator();
        separadorVentas = new javax.swing.JSeparator();
        labelConexion = new javax.swing.JLabel();
        labelBarra = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelVentas.setOpaque(false);
        panelVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelProductos.setOpaque(false);
        panelProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelProductosMouseEntered(evt);
            }
        });
        panelProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPostresB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonMerengada.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonMerengada.setForeground(new java.awt.Color(255, 255, 255));
        botonMerengada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/merengada2.png"))); // NOI18N
        botonMerengada.setText("Merengada");
        botonMerengada.setBorder(null);
        botonMerengada.setContentAreaFilled(false);
        botonMerengada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMerengada.setEnabled(false);
        botonMerengada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMerengada.setIconTextGap(-4);
        botonMerengada.setMargin(new java.awt.Insets(2, 0, 2, 0));
        botonMerengada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonMerengada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMerengadaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMerengadaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMerengadaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonMerengadaMouseReleased(evt);
            }
        });
        botonMerengada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMerengadaActionPerformed(evt);
            }
        });
        panelPostresB.add(botonMerengada, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 85, 90, 85));

        botonHelados.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonHelados.setForeground(new java.awt.Color(255, 255, 255));
        botonHelados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/helado2.png"))); // NOI18N
        botonHelados.setText("Helados");
        botonHelados.setBorder(null);
        botonHelados.setContentAreaFilled(false);
        botonHelados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonHelados.setEnabled(false);
        botonHelados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonHelados.setIconTextGap(-5);
        botonHelados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonHelados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonHeladosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonHeladosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonHeladosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonHeladosMouseReleased(evt);
            }
        });
        botonHelados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHeladosActionPerformed(evt);
            }
        });
        panelPostresB.add(botonHelados, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 85));

        botonBrownie.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonBrownie.setForeground(new java.awt.Color(255, 255, 255));
        botonBrownie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/brownie2.png"))); // NOI18N
        botonBrownie.setText("Brownie");
        botonBrownie.setBorder(null);
        botonBrownie.setContentAreaFilled(false);
        botonBrownie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBrownie.setEnabled(false);
        botonBrownie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonBrownie.setIconTextGap(0);
        botonBrownie.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonBrownie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBrownieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBrownieMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBrownieMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonBrownieMouseReleased(evt);
            }
        });
        botonBrownie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBrownieActionPerformed(evt);
            }
        });
        panelPostresB.add(botonBrownie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 90, 85));

        botonCheesecake.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonCheesecake.setForeground(new java.awt.Color(255, 255, 255));
        botonCheesecake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/cheesecake2.png"))); // NOI18N
        botonCheesecake.setText("Cheesecake");
        botonCheesecake.setBorder(null);
        botonCheesecake.setContentAreaFilled(false);
        botonCheesecake.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCheesecake.setEnabled(false);
        botonCheesecake.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCheesecake.setIconTextGap(0);
        botonCheesecake.setMargin(new java.awt.Insets(0, 0, 2, 0));
        botonCheesecake.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCheesecake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCheesecakeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCheesecakeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCheesecakeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCheesecakeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonCheesecakeMouseReleased(evt);
            }
        });
        botonCheesecake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCheesecakeActionPerformed(evt);
            }
        });
        panelPostresB.add(botonCheesecake, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 85));

        fondoPostres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondoBotonesDesAlm.png"))); // NOI18N
        panelPostresB.add(fondoPostres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 170));

        panelProductos.add(panelPostresB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 170));

        panelPostresI.setBackground(new java.awt.Color(51, 51, 255));
        panelPostresI.setToolTipText("");
        panelPostresI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPostresIMouseEntered(evt);
            }
        });
        panelPostresI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloPostres.setBackground(new java.awt.Color(102, 51, 0));
        tituloPostres.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        tituloPostres.setForeground(new java.awt.Color(255, 255, 255));
        tituloPostres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPostres.setText("Postres");
        tituloPostres.setOpaque(true);
        panelPostresI.add(tituloPostres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 180, 20));

        labelPostresD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/postres4.jpg"))); // NOI18N
        labelPostresD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPostresDMouseEntered(evt);
            }
        });
        panelPostresI.add(labelPostresD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 150));

        panelProductos.add(panelPostresI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 170));

        panelBebidaB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRefrescos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonRefrescos.setForeground(new java.awt.Color(255, 255, 255));
        botonRefrescos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/refrescos2.png"))); // NOI18N
        botonRefrescos.setText("Refrescos");
        botonRefrescos.setBorder(null);
        botonRefrescos.setContentAreaFilled(false);
        botonRefrescos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRefrescos.setEnabled(false);
        botonRefrescos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRefrescos.setIconTextGap(-8);
        botonRefrescos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRefrescos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRefrescosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRefrescosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonRefrescosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonRefrescosMouseReleased(evt);
            }
        });
        botonRefrescos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRefrescosActionPerformed(evt);
            }
        });
        panelBebidaB.add(botonRefrescos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 104, 85));

        botonNaturales.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonNaturales.setForeground(new java.awt.Color(255, 255, 255));
        botonNaturales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/Naturales2.png"))); // NOI18N
        botonNaturales.setText("Naturales");
        botonNaturales.setBorder(null);
        botonNaturales.setContentAreaFilled(false);
        botonNaturales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonNaturales.setEnabled(false);
        botonNaturales.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNaturales.setIconTextGap(-8);
        botonNaturales.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonNaturales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonNaturalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonNaturalesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonNaturalesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonNaturalesMouseReleased(evt);
            }
        });
        botonNaturales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNaturalesActionPerformed(evt);
            }
        });
        panelBebidaB.add(botonNaturales, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 0, 103, 85));

        botonCafe.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonCafe.setForeground(new java.awt.Color(255, 255, 255));
        botonCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/Cafe2.png"))); // NOI18N
        botonCafe.setText("Café");
        botonCafe.setBorder(null);
        botonCafe.setContentAreaFilled(false);
        botonCafe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCafe.setEnabled(false);
        botonCafe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCafe.setIconTextGap(0);
        botonCafe.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonCafe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCafe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCafeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCafeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCafeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonCafeMouseReleased(evt);
            }
        });
        botonCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCafeActionPerformed(evt);
            }
        });
        panelBebidaB.add(botonCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 104, 85));

        botonAgua.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonAgua.setForeground(new java.awt.Color(255, 255, 255));
        botonAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/agua2.png"))); // NOI18N
        botonAgua.setText("Agua");
        botonAgua.setBorder(null);
        botonAgua.setContentAreaFilled(false);
        botonAgua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgua.setEnabled(false);
        botonAgua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAgua.setIconTextGap(-4);
        botonAgua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAgua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAguaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAguaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAguaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonAguaMouseReleased(evt);
            }
        });
        botonAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAguaActionPerformed(evt);
            }
        });
        panelBebidaB.add(botonAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 85, 103, 85));

        botonYogurt.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonYogurt.setForeground(new java.awt.Color(255, 255, 255));
        botonYogurt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/yogurt2.png"))); // NOI18N
        botonYogurt.setText("Yogurt");
        botonYogurt.setBorder(null);
        botonYogurt.setContentAreaFilled(false);
        botonYogurt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonYogurt.setEnabled(false);
        botonYogurt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonYogurt.setIconTextGap(-10);
        botonYogurt.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonYogurt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonYogurt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonYogurtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonYogurtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonYogurtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonYogurtMouseReleased(evt);
            }
        });
        botonYogurt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonYogurtActionPerformed(evt);
            }
        });
        panelBebidaB.add(botonYogurt, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 85, 104, 85));

        botonJugos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonJugos.setForeground(new java.awt.Color(255, 255, 255));
        botonJugos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/jugos2.png"))); // NOI18N
        botonJugos.setText("Jugos");
        botonJugos.setBorder(null);
        botonJugos.setContentAreaFilled(false);
        botonJugos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonJugos.setEnabled(false);
        botonJugos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonJugos.setIconTextGap(-8);
        botonJugos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonJugos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonJugosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonJugosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonJugosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonJugosMouseReleased(evt);
            }
        });
        botonJugos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugosActionPerformed(evt);
            }
        });
        panelBebidaB.add(botonJugos, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 0, 104, 85));

        fondoBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondoBotonesBebidas.png"))); // NOI18N
        panelBebidaB.add(fondoBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 170));

        panelProductos.add(panelBebidaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 310, 170));

        panelBebidaI.setBackground(new java.awt.Color(255, 255, 51));
        panelBebidaI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBebidaIMouseEntered(evt);
            }
        });
        panelBebidaI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloBebidas.setBackground(new java.awt.Color(102, 51, 0));
        tituloBebidas.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        tituloBebidas.setForeground(new java.awt.Color(255, 255, 255));
        tituloBebidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBebidas.setText("Bebidas");
        tituloBebidas.setOpaque(true);
        panelBebidaI.add(tituloBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 310, 20));

        labelBebidasD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/prueba4.jpg"))); // NOI18N
        labelBebidasD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelBebidasDMouseEntered(evt);
            }
        });
        panelBebidaI.add(labelBebidasD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 150));

        panelProductos.add(panelBebidaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 310, 170));

        panelDesayunoB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBollitos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonBollitos.setForeground(new java.awt.Color(255, 255, 255));
        botonBollitos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/bollitos2.png"))); // NOI18N
        botonBollitos.setText("Bollitos");
        botonBollitos.setBorder(null);
        botonBollitos.setContentAreaFilled(false);
        botonBollitos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBollitos.setEnabled(false);
        botonBollitos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonBollitos.setIconTextGap(0);
        botonBollitos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonBollitos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBollitosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBollitosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBollitosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonBollitosMouseReleased(evt);
            }
        });
        panelDesayunoB.add(botonBollitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 85, 123, 85));

        botonEmpanadas.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonEmpanadas.setForeground(new java.awt.Color(255, 255, 255));
        botonEmpanadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/empanadas2.png"))); // NOI18N
        botonEmpanadas.setText("Empanadas");
        botonEmpanadas.setBorder(null);
        botonEmpanadas.setContentAreaFilled(false);
        botonEmpanadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEmpanadas.setEnabled(false);
        botonEmpanadas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEmpanadas.setIconTextGap(0);
        botonEmpanadas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonEmpanadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEmpanadasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEmpanadasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEmpanadasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonEmpanadasMouseReleased(evt);
            }
        });
        botonEmpanadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpanadasActionPerformed(evt);
            }
        });
        panelDesayunoB.add(botonEmpanadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 85));

        botonTequeño.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonTequeño.setForeground(new java.awt.Color(255, 255, 255));
        botonTequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/tequeños2.png"))); // NOI18N
        botonTequeño.setText("Tequeño");
        botonTequeño.setBorder(null);
        botonTequeño.setContentAreaFilled(false);
        botonTequeño.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonTequeño.setEnabled(false);
        botonTequeño.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonTequeño.setIconTextGap(-5);
        botonTequeño.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonTequeño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonTequeñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonTequeñoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonTequeñoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonTequeñoMouseReleased(evt);
            }
        });
        panelDesayunoB.add(botonTequeño, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 120, 85));

        botonArepa.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonArepa.setForeground(new java.awt.Color(255, 255, 255));
        botonArepa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/arepa2.png"))); // NOI18N
        botonArepa.setText("Arepa");
        botonArepa.setBorder(null);
        botonArepa.setContentAreaFilled(false);
        botonArepa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonArepa.setEnabled(false);
        botonArepa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonArepa.setIconTextGap(-5);
        botonArepa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonArepa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonArepaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonArepaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonArepaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonArepaMouseReleased(evt);
            }
        });
        panelDesayunoB.add(botonArepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 120, 85));

        fondoDesayunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondoBotonesDesAlm.png"))); // NOI18N
        panelDesayunoB.add(fondoDesayunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 170));

        panelProductos.add(panelDesayunoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 245, 170));

        panelDesayunoI.setBackground(new java.awt.Color(255, 153, 153));
        panelDesayunoI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloDesayunos.setBackground(new java.awt.Color(102, 51, 0));
        tituloDesayunos.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        tituloDesayunos.setForeground(new java.awt.Color(255, 255, 255));
        tituloDesayunos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloDesayunos.setText("Desayunos");
        tituloDesayunos.setOpaque(true);
        panelDesayunoI.add(tituloDesayunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 245, 20));

        labelDesayunoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/desayuno4.jpg"))); // NOI18N
        labelDesayunoD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDesayunoDMouseEntered(evt);
            }
        });
        panelDesayunoI.add(labelDesayunoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 150));

        panelProductos.add(panelDesayunoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 245, 170));

        panelAlmuerzoB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonPasta.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonPasta.setForeground(new java.awt.Color(255, 255, 255));
        botonPasta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/pasta2.png"))); // NOI18N
        botonPasta.setText("Pasta");
        botonPasta.setBorder(null);
        botonPasta.setContentAreaFilled(false);
        botonPasta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPasta.setEnabled(false);
        botonPasta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPasta.setIconTextGap(-5);
        botonPasta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonPastaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonPastaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPastaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonPastaMouseReleased(evt);
            }
        });
        panelAlmuerzoB.add(botonPasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 85));

        botonPerro.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonPerro.setForeground(new java.awt.Color(255, 255, 255));
        botonPerro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/perroCaliente2.png"))); // NOI18N
        botonPerro.setText("Perro Caliente");
        botonPerro.setBorder(null);
        botonPerro.setContentAreaFilled(false);
        botonPerro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPerro.setEnabled(false);
        botonPerro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPerro.setIconTextGap(-5);
        botonPerro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPerro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonPerroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonPerroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPerroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonPerroMouseReleased(evt);
            }
        });
        panelAlmuerzoB.add(botonPerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 120, 85));

        botonHamburguesa.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonHamburguesa.setForeground(new java.awt.Color(255, 255, 255));
        botonHamburguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/hamburguesa2.png"))); // NOI18N
        botonHamburguesa.setText("Hamburguesa");
        botonHamburguesa.setBorder(null);
        botonHamburguesa.setContentAreaFilled(false);
        botonHamburguesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonHamburguesa.setEnabled(false);
        botonHamburguesa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonHamburguesa.setIconTextGap(-5);
        botonHamburguesa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonHamburguesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonHamburguesaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonHamburguesaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonHamburguesaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonHamburguesaMouseReleased(evt);
            }
        });
        botonHamburguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHamburguesaActionPerformed(evt);
            }
        });
        panelAlmuerzoB.add(botonHamburguesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 85, 120, 85));

        botonArroz.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonArroz.setForeground(new java.awt.Color(255, 255, 255));
        botonArroz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/arroz2.png"))); // NOI18N
        botonArroz.setText("Arroz");
        botonArroz.setBorder(null);
        botonArroz.setContentAreaFilled(false);
        botonArroz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonArroz.setEnabled(false);
        botonArroz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonArroz.setIconTextGap(-5);
        botonArroz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonArroz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonArrozMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonArrozMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonArrozMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonArrozMouseReleased(evt);
            }
        });
        panelAlmuerzoB.add(botonArroz, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 120, 85));

        fondoAlmuerzos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondoBotonesDesAlm.png"))); // NOI18N
        panelAlmuerzoB.add(fondoAlmuerzos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 170));

        panelProductos.add(panelAlmuerzoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 190, 245, 170));

        panelAlmuerzoI.setBackground(new java.awt.Color(0, 153, 51));
        panelAlmuerzoI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAlmuerzoIMouseEntered(evt);
            }
        });
        panelAlmuerzoI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloAlmuerzo.setBackground(new java.awt.Color(102, 51, 0));
        tituloAlmuerzo.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        tituloAlmuerzo.setForeground(new java.awt.Color(255, 255, 255));
        tituloAlmuerzo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAlmuerzo.setText("Almuerzos");
        tituloAlmuerzo.setOpaque(true);
        panelAlmuerzoI.add(tituloAlmuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 245, 20));

        labelAlmuerzoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/almuerzo4.jpg"))); // NOI18N
        labelAlmuerzoD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAlmuerzoDMouseEntered(evt);
            }
        });
        panelAlmuerzoI.add(labelAlmuerzoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 245, 150));

        panelProductos.add(panelAlmuerzoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 190, 245, 170));

        panelCombosB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCombo6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonCombo6.setForeground(new java.awt.Color(255, 255, 255));
        botonCombo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/combo1P.png"))); // NOI18N
        botonCombo6.setBorder(null);
        botonCombo6.setContentAreaFilled(false);
        botonCombo6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCombo6.setEnabled(false);
        botonCombo6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCombo6.setIconTextGap(-5);
        botonCombo6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCombo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCombo6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCombo6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCombo6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonCombo6MouseReleased(evt);
            }
        });
        panelCombosB.add(botonCombo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 110, 80));

        botonCombo3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonCombo3.setForeground(new java.awt.Color(255, 255, 255));
        botonCombo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/combo1P.png"))); // NOI18N
        botonCombo3.setBorder(null);
        botonCombo3.setContentAreaFilled(false);
        botonCombo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCombo3.setEnabled(false);
        botonCombo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCombo3.setIconTextGap(-5);
        botonCombo3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCombo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCombo3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCombo3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCombo3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonCombo3MouseReleased(evt);
            }
        });
        panelCombosB.add(botonCombo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 110, 90));

        botonCombo4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonCombo4.setForeground(new java.awt.Color(255, 255, 255));
        botonCombo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/combo1P.png"))); // NOI18N
        botonCombo4.setBorder(null);
        botonCombo4.setContentAreaFilled(false);
        botonCombo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCombo4.setEnabled(false);
        botonCombo4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCombo4.setIconTextGap(-5);
        botonCombo4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCombo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCombo4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCombo4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCombo4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonCombo4MouseReleased(evt);
            }
        });
        panelCombosB.add(botonCombo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 110, 80));

        botonCombo5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonCombo5.setForeground(new java.awt.Color(255, 255, 255));
        botonCombo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/combo1P.png"))); // NOI18N
        botonCombo5.setBorder(null);
        botonCombo5.setContentAreaFilled(false);
        botonCombo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCombo5.setEnabled(false);
        botonCombo5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCombo5.setIconTextGap(-5);
        botonCombo5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCombo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCombo5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCombo5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCombo5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonCombo5MouseReleased(evt);
            }
        });
        panelCombosB.add(botonCombo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 110, 80));

        botonCombo1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonCombo1.setForeground(new java.awt.Color(255, 255, 255));
        botonCombo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/combo1P.png"))); // NOI18N
        botonCombo1.setBorder(null);
        botonCombo1.setContentAreaFilled(false);
        botonCombo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCombo1.setEnabled(false);
        botonCombo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCombo1.setIconTextGap(0);
        botonCombo1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCombo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCombo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCombo1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCombo1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonCombo1MouseReleased(evt);
            }
        });
        panelCombosB.add(botonCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        botonCombo2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonCombo2.setForeground(new java.awt.Color(255, 255, 255));
        botonCombo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/combo1P.png"))); // NOI18N
        botonCombo2.setBorder(null);
        botonCombo2.setContentAreaFilled(false);
        botonCombo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCombo2.setEnabled(false);
        botonCombo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCombo2.setIconTextGap(-5);
        botonCombo2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCombo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCombo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCombo2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCombo2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonCombo2MouseReleased(evt);
            }
        });
        panelCombosB.add(botonCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 110, 90));

        fondoCombos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondoBotonesCombos.png"))); // NOI18N
        panelCombosB.add(fondoCombos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 170));

        panelProductos.add(panelCombosB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 330, 170));

        panelCombosI.setBackground(new java.awt.Color(0, 204, 204));
        panelCombosI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCombos.setBackground(new java.awt.Color(102, 51, 0));
        tituloCombos.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        tituloCombos.setForeground(new java.awt.Color(255, 255, 255));
        tituloCombos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCombos.setText("Combos");
        tituloCombos.setOpaque(true);
        panelCombosI.add(tituloCombos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 330, 20));

        labelCombosD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/combo4.jpg"))); // NOI18N
        labelCombosD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCombosDMouseEntered(evt);
            }
        });
        panelCombosI.add(labelCombosD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 150));

        panelProductos.add(panelCombosI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 330, 170));

        panelChucheriaB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonGalletas.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonGalletas.setForeground(new java.awt.Color(255, 255, 255));
        botonGalletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/galletas2.png"))); // NOI18N
        botonGalletas.setText("Galletas");
        botonGalletas.setBorder(null);
        botonGalletas.setContentAreaFilled(false);
        botonGalletas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGalletas.setEnabled(false);
        botonGalletas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonGalletas.setIconTextGap(-5);
        botonGalletas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonGalletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonGalletasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonGalletasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonGalletasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonGalletasMouseReleased(evt);
            }
        });
        panelChucheriaB.add(botonGalletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 80, 80));

        botonChoco.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonChoco.setForeground(new java.awt.Color(255, 255, 255));
        botonChoco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/chocolate2.png"))); // NOI18N
        botonChoco.setText("Chocolates");
        botonChoco.setBorder(null);
        botonChoco.setContentAreaFilled(false);
        botonChoco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChoco.setEnabled(false);
        botonChoco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonChoco.setIconTextGap(2);
        botonChoco.setMargin(new java.awt.Insets(10, 14, 10, 14));
        botonChoco.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonChoco.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonChoco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChocoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChocoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonChocoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonChocoMouseReleased(evt);
            }
        });
        panelChucheriaB.add(botonChoco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 90));

        botonBolsa.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonBolsa.setForeground(new java.awt.Color(255, 255, 255));
        botonBolsa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/bolsas2.png"))); // NOI18N
        botonBolsa.setText("Bolsa");
        botonBolsa.setBorder(null);
        botonBolsa.setContentAreaFilled(false);
        botonBolsa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBolsa.setEnabled(false);
        botonBolsa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonBolsa.setIconTextGap(0);
        botonBolsa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonBolsa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBolsaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBolsaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBolsaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonBolsaMouseReleased(evt);
            }
        });
        panelChucheriaB.add(botonBolsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 80, 90));

        botonMasticable.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonMasticable.setForeground(new java.awt.Color(255, 255, 255));
        botonMasticable.setText("Masticable");
        botonMasticable.setBorder(null);
        botonMasticable.setContentAreaFilled(false);
        botonMasticable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMasticable.setEnabled(false);
        botonMasticable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMasticable.setIconTextGap(-5);
        botonMasticable.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelChucheriaB.add(botonMasticable, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 80, 80));

        fondoChucherias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondoBotonesDesAlm.png"))); // NOI18N
        panelChucheriaB.add(fondoChucherias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 170));

        panelProductos.add(panelChucheriaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 160, 170));

        panelChucheriaI.setBackground(new java.awt.Color(51, 0, 204));
        panelChucheriaI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloChucherias.setBackground(new java.awt.Color(102, 51, 0));
        tituloChucherias.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        tituloChucherias.setForeground(new java.awt.Color(255, 255, 255));
        tituloChucherias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloChucherias.setText("Chucherias");
        tituloChucherias.setOpaque(true);
        panelChucheriaI.add(tituloChucherias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 160, 20));

        labelChucheriasD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/chucheria4.jpg"))); // NOI18N
        labelChucheriasD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelChucheriasDMouseEntered(evt);
            }
        });
        panelChucheriaI.add(labelChucheriasD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 150));

        panelProductos.add(panelChucheriaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 160, 170));

        panelVentas.add(panelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 550));

        panelFactura.setOpaque(false);
        panelFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelFacturaMouseEntered(evt);
            }
        });
        panelFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        panelFactura.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 470, 190));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelFactura.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 10, 180));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelFactura.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 10, 180));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelFactura.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 322, 10, 38));
        panelFactura.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 272, 30));
        panelFactura.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 270, 10));
        panelFactura.add(separadorCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 110, 10));

        labelCliente.setFont(new java.awt.Font("Vivaldi", 3, 24)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente.setText("Pago");
        labelCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelClienteMouseClicked(evt);
            }
        });
        panelFactura.add(labelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 110, 40));

        labelCliente1.setFont(new java.awt.Font("Vivaldi", 3, 24)); // NOI18N
        labelCliente1.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente1.setText("Datos del cliente");
        labelCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCliente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCliente1MouseClicked(evt);
            }
        });
        panelFactura.add(labelCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 160, 40));

        panelPago.setOpaque(false);
        panelPago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTarjeta.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        labelTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        labelTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTarjeta.setText("Tarjeta:");
        panelPago.add(labelTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 22));

        textTarjeta.setEditable(false);
        textTarjeta.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        textTarjeta.setText("345");
        textTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTarjetaKeyTyped(evt);
            }
        });
        panelPago.add(textTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 170, 22));

        labelClave.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        labelClave.setForeground(new java.awt.Color(255, 255, 255));
        labelClave.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelClave.setText("Clave:");
        panelPago.add(labelClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, 22));

        textClave.setEditable(false);
        textClave.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        textClave.setText("345");
        textClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textClaveKeyTyped(evt);
            }
        });
        panelPago.add(textClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 170, 22));
        panelPago.add(separadorPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 10));

        checkTarjeta.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        checkTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        checkTarjeta.setSelected(true);
        checkTarjeta.setText("Tarjeta");
        checkTarjeta.setOpaque(false);
        checkTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTarjetaActionPerformed(evt);
            }
        });
        panelPago.add(checkTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        checkEfectivo.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        checkEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        checkEfectivo.setText("Efectivo");
        checkEfectivo.setOpaque(false);
        checkEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEfectivoActionPerformed(evt);
            }
        });
        panelPago.add(checkEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        panelFactura.add(panelPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 270, 130));

        panelCliente.setOpaque(false);
        panelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelNombre.setText("Nombre:  ");
        panelCliente.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 22));

        textNombre.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        textNombre.setText("tyrty");
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNombreKeyTyped(evt);
            }
        });
        panelCliente.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 170, 22));

        labelCedula.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        labelCedula.setForeground(new java.awt.Color(255, 255, 255));
        labelCedula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCedula.setText("Cédula:  ");
        panelCliente.add(labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 22));

        labelTelefono.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTelefono.setText("Telefono:  ");
        panelCliente.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 22));

        labelDireccion.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        labelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        labelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDireccion.setText("Dirección:  ");
        panelCliente.add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 22));

        textDireccion.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        textDireccion.setText("rthfgh");
        textDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textDireccionKeyTyped(evt);
            }
        });
        panelCliente.add(textDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 170, 22));

        textTelefono.setText("456");
        textTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTelefonoKeyTyped(evt);
            }
        });
        panelCliente.add(textTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 170, -1));

        textCedula.setText("5654");
        textCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCedulaKeyTyped(evt);
            }
        });
        panelCliente.add(textCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 170, -1));

        panelFactura.add(panelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 270, 130));

        labelProductos.setFont(new java.awt.Font("Vivaldi", 3, 24)); // NOI18N
        labelProductos.setForeground(new java.awt.Color(255, 255, 255));
        labelProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelProductos.setText("Lista Productos");
        panelFactura.add(labelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        labelTotal.setBackground(new java.awt.Color(255, 255, 255));
        labelTotal.setFont(new java.awt.Font("Vivaldi", 3, 24)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(255, 255, 255));
        labelTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTotal.setText("Total:");
        panelFactura.add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 90, 25));

        textTotal.setEditable(false);
        panelFactura.add(textTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 120, 25));

        botonCancelar.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/botonX.png"))); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 23, 1, 1));
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonCancelar.setIconTextGap(14);
        botonCancelar.setMargin(new java.awt.Insets(2, 150, 2, 50));
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        panelFactura.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 190, 50));

        botonBuscarProd.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        botonBuscarProd.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/buscarProducto.png"))); // NOI18N
        botonBuscarProd.setText("Buscar Producto "); // NOI18N
        botonBuscarProd.setBorder(null);
        botonBuscarProd.setContentAreaFilled(false);
        botonBuscarProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarProdActionPerformed(evt);
            }
        });
        panelFactura.add(botonBuscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 190, 50));

        jButton3.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/vender.png"))); // NOI18N
        jButton3.setText("Procesar");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setIconTextGap(6);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelFactura.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 385, 190, 50));

        panelVentas.add(panelFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 550));

        labelFondo1.setForeground(new java.awt.Color(153, 153, 153));
        labelFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondoIngresar2.jpg"))); // NOI18N
        labelFondo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelVentas.add(labelFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        getContentPane().add(panelVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 560));

        panelAyuda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonManual.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        botonManual.setText("Manual de usuario (PDF)");
        panelAyuda.add(botonManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 350, 50));

        comentario1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        comentario1.setForeground(new java.awt.Color(255, 255, 255));
        comentario1.setText("¿Tuvo algún inconveniente o inquietud? Puede abrir el archivo pdf con el ");
        panelAyuda.add(comentario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 580, 20));

        comentario2.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        comentario2.setForeground(new java.awt.Color(255, 255, 255));
        comentario2.setText("manual de usuario o bien enviar un mensaje a los administradores del ");
        panelAyuda.add(comentario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 580, 20));

        comentario3.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        comentario3.setForeground(new java.awt.Color(255, 255, 255));
        comentario3.setText("sistema, y ellos se encargaran de ayudarlo.");
        panelAyuda.add(comentario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 580, 20));

        panelBoton.setOpaque(false);

        botonCerrarAdjunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/x.png"))); // NOI18N
        botonCerrarAdjunto.setBorder(null);
        botonCerrarAdjunto.setContentAreaFilled(false);
        botonCerrarAdjunto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrarAdjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarAdjuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonLayout.createSequentialGroup()
                .addComponent(botonCerrarAdjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonCerrarAdjunto, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelAyuda.add(panelBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 185, 40, 40));

        panelMensaje.setOpaque(false);
        panelMensaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPara.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        labelPara.setForeground(new java.awt.Color(255, 255, 255));
        labelPara.setText("Para:");
        panelMensaje.add(labelPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 42, -1));

        destinatario.setFont(new java.awt.Font("PMingLiU-ExtB", 2, 16)); // NOI18N
        destinatario.setText("Administradores");
        destinatario.setEnabled(false);
        panelMensaje.add(destinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 468, -1));

        labelAsunto.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        labelAsunto.setForeground(new java.awt.Color(255, 255, 255));
        labelAsunto.setText("Asunto:");
        panelMensaje.add(labelAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 44, -1, -1));

        textAsunto.setFont(new java.awt.Font("PMingLiU-ExtB", 2, 16)); // NOI18N
        textAsunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAsuntoActionPerformed(evt);
            }
        });
        panelMensaje.add(textAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 468, -1));

        labelMensaje.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        labelMensaje.setForeground(new java.awt.Color(255, 255, 255));
        labelMensaje.setText("Mensaje:");
        panelMensaje.add(labelMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        mensajeAdjunto.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        mensajeAdjunto.setForeground(new java.awt.Color(255, 255, 255));
        mensajeAdjunto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelMensaje.add(mensajeAdjunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 590, 18));

        areaMensaje.setColumns(20);
        areaMensaje.setLineWrap(true);
        areaMensaje.setRows(5);
        areaMensaje.setWrapStyleWord(true);
        jScrollPane1.setViewportView(areaMensaje);

        panelMensaje.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 770, 290));

        botonAdjuntar.setFont(new java.awt.Font("Comic Sans MS", 2, 10)); // NOI18N
        botonAdjuntar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/adjunto.png"))); // NOI18N
        botonAdjuntar.setBorder(null);
        botonAdjuntar.setBorderPainted(false);
        botonAdjuntar.setContentAreaFilled(false);
        botonAdjuntar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAdjuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdjuntarActionPerformed(evt);
            }
        });
        panelMensaje.add(botonAdjuntar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 20, 20));

        botonLimpiar.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        panelMensaje.add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 140, 50));

        botonEnviar.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 16)); // NOI18N
        botonEnviar.setText("Enviar");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });
        panelMensaje.add(botonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 140, 50));

        panelAyuda.add(panelMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 970, 430));

        labelFondo3.setForeground(new java.awt.Color(153, 153, 153));
        labelFondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondoIngresar2.jpg"))); // NOI18N
        labelFondo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelAyuda.add(labelFondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        getContentPane().add(panelAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 560));

        panelReportes.setOpaque(false);
        panelReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Panel Reportes sin hacer");
        panelReportes.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 560, 230));

        labelFondo2.setForeground(new java.awt.Color(153, 153, 153));
        labelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondoIngresar2.jpg"))); // NOI18N
        labelFondo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelReportes.add(labelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        getContentPane().add(panelReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 560));

        panelConcretar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vivaldi", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Factura:");
        panelConcretar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 60));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        panelConcretar.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 360, 360));

        jButton1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 14)); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelConcretar.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 110, 60));

        fonfoConcretar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondoIngresar2.jpg"))); // NOI18N
        fonfoConcretar.setOpaque(true);
        panelConcretar.add(fonfoConcretar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        getContentPane().add(panelConcretar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 560));

        labelVentas.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelVentas.setForeground(new java.awt.Color(255, 255, 255));
        labelVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVentas.setText("Ventas");
        labelVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelVentasMouseClicked(evt);
            }
        });
        getContentPane().add(labelVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 90, 30));

        labelReportes.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelReportes.setForeground(new java.awt.Color(153, 153, 153));
        labelReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReportes.setText("Reportes");
        labelReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelReportesMouseClicked(evt);
            }
        });
        getContentPane().add(labelReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 3, 99, 30));

        labelAyuda.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        labelAyuda.setForeground(new java.awt.Color(153, 153, 153));
        labelAyuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAyuda.setText("Ayuda");
        labelAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAyudaMouseClicked(evt);
            }
        });
        getContentPane().add(labelAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 3, 79, 30));

        labelCerrarSesion.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 12)); // NOI18N
        labelCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        labelCerrarSesion.setText("Cerrar sesión");
        labelCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCerrarSesionMouseClicked(evt);
            }
        });
        getContentPane().add(labelCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 80, -1));

        separadorVer1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(separadorVer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 10, 36));

        separadorVer2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(separadorVer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 10, 36));

        separadorVer3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(separadorVer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 10, 36));
        getContentPane().add(separadorCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 35, 730, 10));
        getContentPane().add(separadorAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 191, 10));
        getContentPane().add(separadorReportes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 91, 10));
        getContentPane().add(separadorReportes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 35, 80, 10));
        getContentPane().add(separadorVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 35, 180, 10));

        labelConexion.setFont(new java.awt.Font("Bookshelf Symbol 7", 0, 36)); // NOI18N
        labelConexion.setForeground(new java.awt.Color(0, 255, 102));
        labelConexion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConexion.setText("d");
        labelConexion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelConexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelConexionMouseClicked(evt);
            }
        });
        getContentPane().add(labelConexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 5, 20, 20));

        labelBarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondo.jpg"))); // NOI18N
        labelBarra.setText("jLabel23");
        getContentPane().add(labelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        labelFondo.setForeground(new java.awt.Color(153, 153, 153));
        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondo.jpg"))); // NOI18N
        labelFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelBebidaIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBebidaIMouseEntered
        panelBebidaB.setVisible(true); panelBebidaI.setVisible(false); 
        panelPostresB.setVisible(false); panelPostresI.setVisible(true);
    }//GEN-LAST:event_panelBebidaIMouseEntered

    private void panelPostresIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPostresIMouseEntered
        
    }//GEN-LAST:event_panelPostresIMouseEntered

    private void panelAlmuerzoIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAlmuerzoIMouseEntered
        panelBebidaI.setVisible(true); panelBebidaB.setVisible(false); 
    }//GEN-LAST:event_panelAlmuerzoIMouseEntered

    private void panelProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelProductosMouseEntered
       ocultarPaneles();
    }//GEN-LAST:event_panelProductosMouseEntered

    private void panelFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFacturaMouseEntered
        ocultarPaneles();
    }//GEN-LAST:event_panelFacturaMouseEntered

    private void botonRefrescosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRefrescosMouseEntered
        control.imagenBoton(botonRefrescos, "src/imagenes/botones/refrescos.png");
    }//GEN-LAST:event_botonRefrescosMouseEntered

    private void botonRefrescosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRefrescosMouseExited
      control.imagenBoton(botonRefrescos, "src/imagenes/botones/refrescos2.png");
    }//GEN-LAST:event_botonRefrescosMouseExited

    private void botonJugosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJugosMouseEntered
      control.imagenBoton(botonJugos, "src/imagenes/botones/jugos.png");
    }//GEN-LAST:event_botonJugosMouseEntered

    private void botonJugosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJugosMouseExited
        control.imagenBoton(botonJugos, "src/imagenes/botones/jugos2.png");
    }//GEN-LAST:event_botonJugosMouseExited

    private void botonNaturalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNaturalesMouseEntered
        control.imagenBoton(botonNaturales, "src/imagenes/botones/Naturales.png");
    }//GEN-LAST:event_botonNaturalesMouseEntered

    private void botonNaturalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNaturalesMouseExited
        control.imagenBoton(botonNaturales, "src/imagenes/botones/Naturales2.png");
    }//GEN-LAST:event_botonNaturalesMouseExited

    private void botonCafeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCafeMouseEntered
        control.imagenBoton(botonCafe, "src/imagenes/botones/Cafe.png");
    }//GEN-LAST:event_botonCafeMouseEntered

    private void botonCafeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCafeMouseExited
        control.imagenBoton(botonCafe, "src/imagenes/botones/Cafe2.png");
    }//GEN-LAST:event_botonCafeMouseExited

    private void botonYogurtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonYogurtMouseEntered
        control.imagenBoton(botonYogurt, "src/imagenes/botones/Yogurt.png");
    }//GEN-LAST:event_botonYogurtMouseEntered

    private void botonYogurtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonYogurtMouseExited
        control.imagenBoton(botonYogurt, "src/imagenes/botones/Yogurt2.png");
    }//GEN-LAST:event_botonYogurtMouseExited

    private void botonAguaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAguaMouseEntered
        control.imagenBoton(botonAgua, "src/imagenes/botones/agua.png");
    }//GEN-LAST:event_botonAguaMouseEntered

    private void botonAguaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAguaMouseExited
        control.imagenBoton(botonAgua, "src/imagenes/botones/agua2.png");
    }//GEN-LAST:event_botonAguaMouseExited

    private void botonRefrescosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRefrescosActionPerformed
        incluirProducto("Refrescos",botonRefrescos); sacarTotal();
    }//GEN-LAST:event_botonRefrescosActionPerformed

    private void botonHeladosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHeladosMouseEntered
        control.imagenBoton(botonHelados, "src/imagenes/botones/helado.png");
    }//GEN-LAST:event_botonHeladosMouseEntered

    private void botonHeladosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHeladosMouseExited
        control.imagenBoton(botonHelados, "src/imagenes/botones/helado2.png");
    }//GEN-LAST:event_botonHeladosMouseExited

    private void labelPostresDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPostresDMouseEntered
        panelPostresB.setVisible(true);    panelPostresI.setVisible(false);
        panelBebidaI.setVisible(true);     panelBebidaB.setVisible(false); 
        panelDesayunoI.setVisible(true);   panelDesayunoB.setVisible(false);
    }//GEN-LAST:event_labelPostresDMouseEntered

    private void labelBebidasDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBebidasDMouseEntered
        panelDesayunoI.setVisible(true);   panelDesayunoB.setVisible(false);
        panelPostresI.setVisible(true);    panelPostresB.setVisible(false);
        panelAlmuerzoI.setVisible(true);   panelAlmuerzoB.setVisible(false);
        panelBebidaB.setVisible(true);     panelBebidaI.setVisible(false);
    }//GEN-LAST:event_labelBebidasDMouseEntered

    private void labelDesayunoDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDesayunoDMouseEntered
         panelPostresI.setVisible(true);    panelPostresB.setVisible(false);
         panelBebidaI.setVisible(true);     panelBebidaB.setVisible(false);
         panelAlmuerzoI.setVisible(true);   panelAlmuerzoB.setVisible(false);
         panelCombosI.setVisible(true);     panelCombosB.setVisible(false);
         panelDesayunoB.setVisible(true);   panelDesayunoI.setVisible(false);
    }//GEN-LAST:event_labelDesayunoDMouseEntered

    private void labelAlmuerzoDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAlmuerzoDMouseEntered
        panelBebidaI.setVisible(true);     panelBebidaB.setVisible(false);
        panelDesayunoI.setVisible(true);   panelDesayunoB.setVisible(false);
        panelCombosI.setVisible(true);     panelCombosB.setVisible(false);
        panelChucheriaI.setVisible(true);  panelChucheriaB.setVisible(false);
        panelAlmuerzoB.setVisible(true);   panelAlmuerzoI.setVisible(false);
    }//GEN-LAST:event_labelAlmuerzoDMouseEntered

    private void labelCombosDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCombosDMouseEntered
        panelDesayunoI.setVisible(true);   panelDesayunoB.setVisible(false);
        panelAlmuerzoI.setVisible(true);   panelAlmuerzoB.setVisible(false);
        panelChucheriaI.setVisible(true);  panelChucheriaB.setVisible(false);
        panelCombosB.setVisible(true);     panelCombosI.setVisible(false);
    }//GEN-LAST:event_labelCombosDMouseEntered

    private void labelChucheriasDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelChucheriasDMouseEntered
        panelAlmuerzoI.setVisible(true);   panelAlmuerzoB.setVisible(false);
        panelCombosI.setVisible(true);     panelCombosB.setVisible(false);
        panelChucheriaB.setVisible(true);  panelChucheriaI.setVisible(false);
    }//GEN-LAST:event_labelChucheriasDMouseEntered

    private void botonCheesecakeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCheesecakeMouseEntered
        control.imagenBoton(botonCheesecake, "src/imagenes/botones/cheesecake.png");
    }//GEN-LAST:event_botonCheesecakeMouseEntered

    private void botonCheesecakeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCheesecakeMouseExited
        control.imagenBoton(botonCheesecake, "src/imagenes/botones/cheesecake2.png");
    }//GEN-LAST:event_botonCheesecakeMouseExited

    private void botonBrownieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBrownieMouseEntered
        control.imagenBoton(botonBrownie, "src/imagenes/botones/brownie.png");
    }//GEN-LAST:event_botonBrownieMouseEntered

    private void botonBrownieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBrownieMousePressed
        botonBrownie.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonBrownieMousePressed

    private void botonBrownieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBrownieMouseExited
        control.imagenBoton(botonBrownie, "src/imagenes/botones/brownie2.png");
    }//GEN-LAST:event_botonBrownieMouseExited

    private void botonMerengadaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMerengadaMouseEntered
       control.imagenBoton(botonMerengada, "src/imagenes/botones/merengada.png");
    }//GEN-LAST:event_botonMerengadaMouseEntered

    private void botonMerengadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMerengadaMouseExited
        control.imagenBoton(botonMerengada, "src/imagenes/botones/merengada2.png");
    }//GEN-LAST:event_botonMerengadaMouseExited

    private void botonEmpanadasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEmpanadasMouseEntered
        control.imagenBoton(botonEmpanadas, "src/imagenes/botones/empanadas.png");
    }//GEN-LAST:event_botonEmpanadasMouseEntered

    private void botonEmpanadasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEmpanadasMouseExited
        control.imagenBoton(botonEmpanadas, "src/imagenes/botones/empanadas2.png");
    }//GEN-LAST:event_botonEmpanadasMouseExited

    private void botonArepaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonArepaMouseEntered
        control.imagenBoton(botonArepa, "src/imagenes/botones/arepa.png");
    }//GEN-LAST:event_botonArepaMouseEntered

    private void botonArepaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonArepaMouseExited
        control.imagenBoton(botonArepa, "src/imagenes/botones/arepa2.png");
    }//GEN-LAST:event_botonArepaMouseExited

    private void botonTequeñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTequeñoMouseEntered
        control.imagenBoton(botonTequeño, "src/imagenes/botones/tequeños.png");
    }//GEN-LAST:event_botonTequeñoMouseEntered

    private void botonTequeñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTequeñoMouseExited
        control.imagenBoton(botonTequeño, "src/imagenes/botones/tequeños2.png");
    }//GEN-LAST:event_botonTequeñoMouseExited

    private void botonBollitosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBollitosMouseEntered
        control.imagenBoton(botonBollitos, "src/imagenes/botones/bollitos.png");
    }//GEN-LAST:event_botonBollitosMouseEntered

    private void botonBollitosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBollitosMouseExited
        control.imagenBoton(botonBollitos, "src/imagenes/botones/bollitos2.png");
    }//GEN-LAST:event_botonBollitosMouseExited

    private void botonPastaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPastaMouseEntered
        control.imagenBoton(botonPasta, "src/imagenes/botones/pasta.png");
    }//GEN-LAST:event_botonPastaMouseEntered

    private void botonPastaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPastaMouseExited
        control.imagenBoton(botonPasta, "src/imagenes/botones/pasta2.png");
    }//GEN-LAST:event_botonPastaMouseExited

    private void botonArrozMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonArrozMouseEntered
        control.imagenBoton(botonArroz, "src/imagenes/botones/arroz.png");
    }//GEN-LAST:event_botonArrozMouseEntered

    private void botonArrozMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonArrozMouseExited
        control.imagenBoton(botonArroz, "src/imagenes/botones/arroz2.png");
    }//GEN-LAST:event_botonArrozMouseExited

    private void botonPerroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPerroMouseEntered
        control.imagenBoton(botonPerro, "src/imagenes/botones/perroCaliente.png");
    }//GEN-LAST:event_botonPerroMouseEntered

    private void botonPerroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPerroMouseExited
        control.imagenBoton(botonPerro, "src/imagenes/botones/perroCaliente2.png");
    }//GEN-LAST:event_botonPerroMouseExited

    private void botonHamburguesaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHamburguesaMouseEntered
        control.imagenBoton(botonHamburguesa, "src/imagenes/botones/hamburguesa.png");
    }//GEN-LAST:event_botonHamburguesaMouseEntered

    private void botonHamburguesaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHamburguesaMouseExited
        control.imagenBoton(botonHamburguesa, "src/imagenes/botones/hamburguesa2.png");
    }//GEN-LAST:event_botonHamburguesaMouseExited

    private void botonCheesecakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCheesecakeMouseClicked
    }//GEN-LAST:event_botonCheesecakeMouseClicked

    private void botonCheesecakeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCheesecakeMousePressed
        botonCheesecake.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCheesecakeMousePressed

    private void botonCheesecakeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCheesecakeMouseReleased
        botonCheesecake.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCheesecakeMouseReleased

    private void botonHeladosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHeladosMousePressed
        botonHelados.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonHeladosMousePressed

    private void botonHeladosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHeladosMouseReleased
        botonHelados.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonHeladosMouseReleased

    private void botonBrownieMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBrownieMouseReleased
        botonBrownie.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonBrownieMouseReleased

    private void botonMerengadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMerengadaMousePressed
        botonMerengada.setContentAreaFilled(true);  labelFondo.requestFocus();
    }//GEN-LAST:event_botonMerengadaMousePressed

    private void botonMerengadaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMerengadaMouseReleased
        botonMerengada.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonMerengadaMouseReleased

    private void botonRefrescosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRefrescosMousePressed
        botonRefrescos.setContentAreaFilled(true);  labelFondo.requestFocus();
    }//GEN-LAST:event_botonRefrescosMousePressed

    private void botonRefrescosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRefrescosMouseReleased
        botonRefrescos.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonRefrescosMouseReleased

    private void botonJugosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJugosMousePressed
        botonJugos.setContentAreaFilled(true);  labelFondo.requestFocus();
    }//GEN-LAST:event_botonJugosMousePressed

    private void botonJugosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJugosMouseReleased
        botonJugos.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonJugosMouseReleased

    private void botonNaturalesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNaturalesMousePressed
        botonNaturales.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonNaturalesMousePressed

    private void botonNaturalesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNaturalesMouseReleased
        botonNaturales.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonNaturalesMouseReleased

    private void botonCafeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCafeMousePressed
        botonCafe.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCafeMousePressed

    private void botonCafeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCafeMouseReleased
        botonCafe.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCafeMouseReleased

    private void botonYogurtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonYogurtMousePressed
        botonYogurt.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonYogurtMousePressed

    private void botonYogurtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonYogurtMouseReleased
        botonYogurt.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonYogurtMouseReleased

    private void botonAguaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAguaMousePressed
        botonAgua.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonAguaMousePressed

    private void botonAguaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAguaMouseReleased
        botonAgua.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonAguaMouseReleased

    private void botonEmpanadasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEmpanadasMousePressed
        botonEmpanadas.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonEmpanadasMousePressed

    private void botonEmpanadasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEmpanadasMouseReleased
        botonEmpanadas.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonEmpanadasMouseReleased

    private void botonArepaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonArepaMousePressed
        botonArepa.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonArepaMousePressed

    private void botonArepaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonArepaMouseReleased
        botonArepa.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonArepaMouseReleased

    private void botonTequeñoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTequeñoMousePressed
        botonTequeño.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonTequeñoMousePressed

    private void botonTequeñoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTequeñoMouseReleased
        botonTequeño.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonTequeñoMouseReleased

    private void botonBollitosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBollitosMousePressed
        botonBollitos.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonBollitosMousePressed

    private void botonBollitosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBollitosMouseReleased
        botonBollitos.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonBollitosMouseReleased

    private void botonPastaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPastaMousePressed
        botonPasta.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonPastaMousePressed

    private void botonPastaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPastaMouseReleased
        botonPasta.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonPastaMouseReleased

    private void botonArrozMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonArrozMousePressed
        botonArroz.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonArrozMousePressed

    private void botonArrozMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonArrozMouseReleased
        botonArroz.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonArrozMouseReleased

    private void botonPerroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPerroMousePressed
        botonPerro.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonPerroMousePressed

    private void botonPerroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPerroMouseReleased
        botonPerro.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonPerroMouseReleased

    private void botonHamburguesaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHamburguesaMousePressed
        botonHamburguesa.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonHamburguesaMousePressed

    private void botonHamburguesaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHamburguesaMouseReleased
        botonHamburguesa.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonHamburguesaMouseReleased

    private void botonCombo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo1MouseEntered
        control.imagenBoton(botonCombo1, "src/imagenes/botones/combo1.png");
    }//GEN-LAST:event_botonCombo1MouseEntered

    private void botonCombo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo1MouseExited
        control.imagenBoton(botonCombo1, "src/imagenes/botones/combo1P.png");
    }//GEN-LAST:event_botonCombo1MouseExited

    private void botonCombo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo2MouseEntered
        control.imagenBoton(botonCombo2, "src/imagenes/botones/combo1.png");
    }//GEN-LAST:event_botonCombo2MouseEntered

    private void botonCombo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo2MouseExited
        control.imagenBoton(botonCombo2, "src/imagenes/botones/combo1P.png");
    }//GEN-LAST:event_botonCombo2MouseExited

    private void botonCombo3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo3MouseEntered
        control.imagenBoton(botonCombo3, "src/imagenes/botones/combo1.png");
    }//GEN-LAST:event_botonCombo3MouseEntered

    private void botonCombo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo3MouseExited
        control.imagenBoton(botonCombo3, "src/imagenes/botones/combo1P.png");
    }//GEN-LAST:event_botonCombo3MouseExited

    private void botonCombo4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo4MouseEntered
        control.imagenBoton(botonCombo4, "src/imagenes/botones/combo1.png");
    }//GEN-LAST:event_botonCombo4MouseEntered

    private void botonCombo4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo4MouseExited
        control.imagenBoton(botonCombo4, "src/imagenes/botones/combo1P.png");
    }//GEN-LAST:event_botonCombo4MouseExited

    private void botonCombo5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo5MouseExited
        control.imagenBoton(botonCombo5, "src/imagenes/botones/combo1P.png");
    }//GEN-LAST:event_botonCombo5MouseExited

    private void botonCombo5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo5MouseEntered
        control.imagenBoton(botonCombo5, "src/imagenes/botones/combo1.png");
    }//GEN-LAST:event_botonCombo5MouseEntered

    private void botonCombo6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo6MouseEntered
        control.imagenBoton(botonCombo6, "src/imagenes/botones/combo1.png");
    }//GEN-LAST:event_botonCombo6MouseEntered

    private void botonCombo6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo6MouseExited
        control.imagenBoton(botonCombo6, "src/imagenes/botones/combo1P.png");
    }//GEN-LAST:event_botonCombo6MouseExited

    private void botonCombo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo1MousePressed
        botonCombo1.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCombo1MousePressed

    private void botonCombo1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo1MouseReleased
        botonCombo1.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCombo1MouseReleased

    private void botonCombo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo2MousePressed
        botonCombo2.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCombo2MousePressed

    private void botonCombo2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo2MouseReleased
        botonCombo2.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCombo2MouseReleased

    private void botonCombo3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo3MousePressed
        botonCombo3.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCombo3MousePressed

    private void botonCombo3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo3MouseReleased
        botonCombo3.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCombo3MouseReleased

    private void botonCombo4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo4MousePressed
        botonCombo4.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCombo4MousePressed

    private void botonCombo4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo4MouseReleased
        botonCombo4.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCombo4MouseReleased

    private void botonCombo5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo5MousePressed
        botonCombo5.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCombo5MousePressed

    private void botonCombo5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo5MouseReleased
        botonCombo5.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCombo5MouseReleased

    private void botonCombo6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo6MousePressed
        botonCombo6.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCombo6MousePressed

    private void botonCombo6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCombo6MouseReleased
        botonCombo6.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonCombo6MouseReleased

    private void botonChocoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChocoMouseEntered
        control.imagenBoton(botonChoco, "src/imagenes/botones/chocolate.png");
    }//GEN-LAST:event_botonChocoMouseEntered

    private void botonChocoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChocoMouseExited
        control.imagenBoton(botonChoco, "src/imagenes/botones/chocolate2.png");
    }//GEN-LAST:event_botonChocoMouseExited

    private void botonChocoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChocoMousePressed
        botonChoco.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonChocoMousePressed

    private void botonChocoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChocoMouseReleased
        botonChoco.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonChocoMouseReleased

    private void botonBolsaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBolsaMouseEntered
        control.imagenBoton(botonBolsa, "src/imagenes/botones/bolsas.png");
    }//GEN-LAST:event_botonBolsaMouseEntered

    private void botonBolsaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBolsaMouseExited
        control.imagenBoton(botonBolsa, "src/imagenes/botones/bolsas2.png");
    }//GEN-LAST:event_botonBolsaMouseExited

    private void botonBolsaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBolsaMousePressed
        botonBolsa.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonBolsaMousePressed

    private void botonBolsaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBolsaMouseReleased
        botonBolsa.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonBolsaMouseReleased

    private void botonGalletasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGalletasMouseEntered
        control.imagenBoton(botonGalletas, "src/imagenes/botones/galletas.png");
    }//GEN-LAST:event_botonGalletasMouseEntered

    private void botonGalletasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGalletasMouseExited
        control.imagenBoton(botonGalletas, "src/imagenes/botones/galletas2.png");
    }//GEN-LAST:event_botonGalletasMouseExited

    private void botonGalletasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGalletasMousePressed
        botonGalletas.setContentAreaFilled(true); labelFondo.requestFocus();
    }//GEN-LAST:event_botonGalletasMousePressed

    private void botonGalletasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGalletasMouseReleased
        botonGalletas.setContentAreaFilled(false); labelFondo.requestFocus();
    }//GEN-LAST:event_botonGalletasMouseReleased

    private void botonHamburguesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHamburguesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonHamburguesaActionPerformed

    private void labelVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVentasMouseClicked
        labelAyuda.setForeground(new Color(153,153,153)); labelReportes.setForeground(new Color(153,153,153));
        separadorAyuda.setVisible(false); separadorReportes1.setVisible(false); separadorReportes2.setVisible(false);
        separadorVentas.setVisible(true);labelVentas.setForeground(new Color(255,255,255));
        panelVentas.setVisible(true); panelReportes.setVisible(false); panelAyuda.setVisible(false);
    }//GEN-LAST:event_labelVentasMouseClicked

    private void labelReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelReportesMouseClicked
        if (cargo.equals("Cajero"))
        {
            JOptionPane.showMessageDialog(null, "No tiene acceso a esta pestaña");
        }else{
            labelAyuda.setForeground(new Color(153,153,153)); labelVentas.setForeground(new Color(153,153,153));
            separadorAyuda.setVisible(false); separadorVentas.setVisible(false);
            separadorReportes1.setVisible(true); separadorReportes2.setVisible(true);
            labelReportes.setForeground(new Color(255,255,255));
            panelVentas.setVisible(false); panelReportes.setVisible(true); panelAyuda.setVisible(false);
        }
    }//GEN-LAST:event_labelReportesMouseClicked

    private void labelAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAyudaMouseClicked
        labelReportes.setForeground(new Color(153,153,153)); labelVentas.setForeground(new Color(153,153,153));
        separadorReportes1.setVisible(false); separadorReportes2.setVisible(false); separadorVentas.setVisible(false);
        separadorAyuda.setVisible(true);labelAyuda.setForeground(new Color(255,255,255));
        panelVentas.setVisible(false); panelReportes.setVisible(false); panelAyuda.setVisible(true);
    }//GEN-LAST:event_labelAyudaMouseClicked

    private void labelCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarSesionMouseClicked
        Ingreso obj = new Ingreso();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelCerrarSesionMouseClicked

    private void botonAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAguaActionPerformed
        incluirProducto("Agua",botonAgua);sacarTotal();
    }//GEN-LAST:event_botonAguaActionPerformed

    private void botonJugosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugosActionPerformed
        incluirProducto("Jugos",botonJugos);sacarTotal();
    }//GEN-LAST:event_botonJugosActionPerformed

    private void botonNaturalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNaturalesActionPerformed
        incluirProducto("Naturales",botonNaturales);sacarTotal();
    }//GEN-LAST:event_botonNaturalesActionPerformed

    private void botonCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCafeActionPerformed
        incluirProducto("Café",botonCafe);sacarTotal();
    }//GEN-LAST:event_botonCafeActionPerformed

    private void botonYogurtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonYogurtActionPerformed
        incluirProducto("Yogurt",botonYogurt);sacarTotal();
    }//GEN-LAST:event_botonYogurtActionPerformed

    private void botonCheesecakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCheesecakeActionPerformed
        incluirProducto("Cheesecake",botonCheesecake);sacarTotal();
    }//GEN-LAST:event_botonCheesecakeActionPerformed

    private void botonHeladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHeladosActionPerformed
        incluirProducto("Helados",botonHelados);sacarTotal();
    }//GEN-LAST:event_botonHeladosActionPerformed

    private void botonBrownieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBrownieActionPerformed
        incluirProducto("Brownie",botonBrownie);sacarTotal();
    }//GEN-LAST:event_botonBrownieActionPerformed

    private void botonMerengadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMerengadaActionPerformed
        incluirProducto("Merengada",botonMerengada);sacarTotal();
    }//GEN-LAST:event_botonMerengadaActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        vaciarCamposAyuda();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void textAsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAsuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAsuntoActionPerformed

    private void botonAdjuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdjuntarActionPerformed
        adjuntarArchivo();
    }//GEN-LAST:event_botonAdjuntarActionPerformed

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        if (textAsunto.getText().equals("")||areaMensaje.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe llenar los campos asunto y mensaje");
        }else{enviar();}
    }//GEN-LAST:event_botonEnviarActionPerformed

    private void botonCerrarAdjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarAdjuntoActionPerformed
        rutaArchivo="";
        nombreArchivo="";
        mensajeAdjunto.setText("");
        panelBoton.setVisible(false);
    }//GEN-LAST:event_botonCerrarAdjuntoActionPerformed

    private void labelConexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConexionMouseClicked
        if (labelConexion.getForeground().equals(new Color(255,0,0))){
            control.probarConexion();
        }
        
    }//GEN-LAST:event_labelConexionMouseClicked

    private void botonBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarProdActionPerformed
        JOptionPane.showMessageDialog(null, "Aun no se ha realizado");
    }//GEN-LAST:event_botonBuscarProdActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        cancelarCompra();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonEmpanadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpanadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEmpanadasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void labelCliente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCliente1MouseClicked
        panelCliente.setVisible(true); panelPago.setVisible(false); separadorPago.setVisible(false);separadorCliente.setVisible(true);
    }//GEN-LAST:event_labelCliente1MouseClicked

    private void labelClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelClienteMouseClicked
         panelCliente.setVisible(false); panelPago.setVisible(true); separadorPago.setVisible(true);separadorCliente.setVisible(false);
    }//GEN-LAST:event_labelClienteMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if (validarCampos()){
           if (productosVenta!=null){
               Cliente cliente = new Cliente(textNombre.getText(),textDireccion.getText(),textCedula.getText(),textTelefono.getText());
                if (cliente!=null){
                    ListaProducto lista = new ListaProducto();
                    lista.setLista(productosVenta);
                    Ventas venta = new Ventas(lista.getLista(),cliente,total,monto,12,Integer.parseInt(textTarjeta.getText()),
                                        Integer.parseInt(textClave.getText()),formaPago(),empleado, new Date());
                    if (venta!=null){
                        if (conexion.realizarVenta(venta).equals("Venta realizada")){
                            JOptionPane.showMessageDialog(null, "Venta realizada con exito!");
                            generarPdf(venta);
                            vaciarXml();                            
                        }else{JOptionPane.showMessageDialog(null, "No hay conexion, guardada en xml");
                            guardarEnXml(venta);
                            generarPdf(venta);
                        }
                    }
                }
           }else{
               JOptionPane.showMessageDialog(null, "No hay productos en la venta");
           }
       }else{JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void textNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNombreKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarNumero(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_textNombreKeyTyped

    private void textDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDireccionKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarNumero(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_textDireccionKeyTyped

    private void textCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCedulaKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarLetras(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_textCedulaKeyTyped

    private void textTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelefonoKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarLetras(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_textTelefonoKeyTyped

    private void textTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTarjetaKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarLetras(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_textTarjetaKeyTyped

    private void textClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textClaveKeyTyped
        if (validar.validarEspeciales(evt.getKeyChar()) || validar.validarLetras(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_textClaveKeyTyped

    private void checkEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEfectivoActionPerformed
        if (checkEfectivo.isSelected()){
            checkTarjeta.setSelected(false);
            textTarjeta.setEditable(false);
            textClave.setEditable(false);
        }else
            checkEfectivo.setSelected(true);
    }//GEN-LAST:event_checkEfectivoActionPerformed

    private void checkTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTarjetaActionPerformed
        if (checkTarjeta.isSelected()){
            checkEfectivo.setSelected(false);
            textTarjeta.setEditable(true);
            textClave.setEditable(true);
        }else
            checkTarjeta.setSelected(true);
    }//GEN-LAST:event_checkTarjetaActionPerformed
    
    private void vaciarXml(){
        if (ventasXml.todasLasVentas()!=null){
            ArrayList<VentasXML> lista = new ArrayList<VentasXML>();
            Iterator<VentasXML> it = ventasXml.todasLasVentas().iterator();
            while (it.hasNext())  {
                VentasXML venta = it.next();
                Ventas ventaRe = sacarDeXml(venta);
                if (!conexion.realizarVenta(ventaRe).equals("Venta realizada")){
                    lista.add(venta);
                }
            }
            ventasXml.borrarVentas();
            if (lista!=null){
                Iterator<VentasXML> it2 = lista.iterator();
                while (it2.hasNext())  {
                    VentasXML venta = it2.next();
                    ventasXml.agregarVenta(venta);
                }
            }
        }
    }
    
    private Ventas sacarDeXml(VentasXML venta){
        ArrayList<Producto> listaProducto = new ArrayList<Producto>();
        String[] productos = venta.getProductos().split(":");
        for (int i=0; true ;i++){
            try{
                String[] datosProd = productos[i].split("#");
                Producto prod = new Producto(datosProd[0],datosProd[1],datosProd[2],datosProd[3],datosProd[4],datosProd[5],"",datosProd[6]);
                listaProducto.add(prod);
            }catch(Exception e){break;}
        }
        
        String[] datosCliente = venta.getCliente().split(":");
        Cliente cliente = new Cliente(datosCliente[0], datosCliente[3], datosCliente[1], datosCliente[2]);
        
        String[] datosPago = venta.getPago().split(":");
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try { fecha = formato.parse(venta.getFecha());
        }catch (ParseException ex) {}
        
        Ventas ventaTrans = new Ventas(listaProducto, cliente, Double.parseDouble(datosPago[0]), Double.parseDouble(datosPago[1]),
                                       Integer.parseInt(datosPago[2]), Integer.parseInt(datosPago[3]), Integer.parseInt(datosPago[4]),
                                       datosPago[5], venta.getEmpleado(), fecha);
        return ventaTrans;
    }
    
    private void guardarEnXml(Ventas venta){
        String nProducto="",nCliente=venta.getCliente().getNombre()+":"+venta.getCliente().getCedula()+":"+
                        venta.getCliente().getTelefono()+":"+venta.getCliente().getDireccion();
        for (int i=0;i<venta.getProductos().size();i++){
            if (i==0){
                nProducto=venta.getProductos().get(i).getCodigo()+"&"+venta.getProductos().get(i).getNombre()+"&"+venta.getProductos().get(i).getFechaCaducidad()
                        +"&"+venta.getProductos().get(i).getCantidad()+"&"+venta.getProductos().get(i).getValor()+"&"+venta.getProductos().get(i).getTipo()
                        +"&"+venta.getProductos().get(i).getDescuento();
            }else{
                if (i==venta.getProductos().size()-1){
                    nProducto=nProducto+":"+venta.getProductos().get(i).getCodigo()+"&"+venta.getProductos().get(i).getNombre()+"&"+venta.getProductos().get(i).getFechaCaducidad()
                        +"&"+venta.getProductos().get(i).getCantidad()+"&"+venta.getProductos().get(i).getValor()+"&"+venta.getProductos().get(i).getTipo()
                        +"&"+venta.getProductos().get(i).getDescuento();
                }else{
                    nProducto=nProducto+":"+venta.getProductos().get(i).getCodigo()+"&"+venta.getProductos().get(i).getNombre()+"&"+venta.getProductos().get(i).getFechaCaducidad()
                        +"&"+venta.getProductos().get(i).getCantidad()+"&"+venta.getProductos().get(i).getValor()+"&"+venta.getProductos().get(i).getTipo()
                        +"&"+venta.getProductos().get(i).getDescuento();
                }
            }
        }
        String pago=String.valueOf(venta.getTotal()+":"+String.valueOf(venta.getMonto()+":")+"12"+":"+String.valueOf(venta.getTarjeta())
                    +":"+String.valueOf(venta.getClave())+":"+venta.getFormaPago());
        VentasXML nVenta = new VentasXML(nProducto, nCliente, pago, venta.getEmpleado(),
                                        String.valueOf(new SimpleDateFormat("dd/MM/yyyy").format(venta.getFecha())));
        ventasXml.agregarVenta(nVenta);
    }
    
    private String formaPago(){
        if (checkEfectivo.isSelected()){
            return "Efectivo";
        }else{
            return "Tarjeta";
        }
    }
    
    private boolean validarCampos(){
        if (textNombre.getText().equals("")||textCedula.getText().equals("")||textTelefono.getText().equals("")||textDireccion.getText().equals("")
            || textTarjeta.getText().equals("")||textClave.getText().equals("")){
            return false;
        }
        return true;
    }
    
    private void sacarTotal(){
        DecimalFormat decimales = new DecimalFormat("0.00");
        double total=0;
        double totalIva=0;
        
        for (int i=0;i < productosVenta.size();i++) {
            Producto aux = (Producto) productosVenta.get(i);
            double cantidad = Integer.parseInt(aux.getCantidad());
            double descuento = Integer.parseInt(aux.getDescuento());
            double valor = Integer.parseInt(aux.getValor());
            total=(total+(cantidad*valor)-((cantidad*valor)*(descuento/100)));
            
        }
        monto=0;
        monto=total;
        totalIva=total+(total*0.12);
        String monto= decimales.format(totalIva);
        this.total=totalIva;
        textTotal.setText(monto+" Bs");
    }
    
    private void cancelarCompra(){
        for (int i=0;i < productosVenta.size();i++) {
            Producto aux = (Producto) productosVenta.get(i);
            for (int j=0;j < productos.tamañoLista();j++) {
                Producto aux2 = (Producto) productos.getLista().get(j);
                if (aux.getNombre().equals(aux2.getNombre())){
                    aux2.setCantidad(String.valueOf(Integer.parseInt(aux2.getCantidad())+Integer.parseInt(aux.getCantidad())));
                }
            }
        }
        productosVenta.removeAll(productosVenta);
        llenarTabla();
        llenarListas();
        verificarInventario();
        checkEfectivo.setSelected(false);
        checkTarjeta.setSelected(false);
        textTarjeta.setEditable(false);
        textClave.setEditable(false);
        textTotal.setText("");
        
    }
   
    private void adjuntarArchivo(){
        int resultado;
        File fichero;

        CargarArchivo ventana = new CargarArchivo();            
//        resultado= ventana.JFCCargarFoto.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == ventana.JFCCargarFoto.showOpenDialog(null)){
            fichero = ventana.JFCCargarFoto.getSelectedFile();        
            if (fichero.exists()){
                rutaArchivo=fichero.getAbsolutePath();
                nombreArchivo=fichero.getName();
                mensajeAdjunto.setText("Archivo adjunto: "+nombreArchivo);
                panelBoton.setVisible(true);
            }
        }
    }
    
    public void enviar(){
        String clave = "ilzslzktcshaxxpc";
        for (int i=0;i < empleados.tamañoLista();i++) {
            Empleado aux = (Empleado) empleados.getLista().get(i);
            if(aux.getCargo().equals("Administrador")){
                modelo.Email obj= new modelo.Email("decelis002@gmail.com",clave,rutaArchivo,nombreArchivo,aux.getEmail(),textAsunto.getText().trim(),areaMensaje.getText());
                if (obj.sendMail()){
                    JOptionPane.showMessageDialog(null,"El email se mandó correctamente");
                    vaciarCamposAyuda();
                }else{
                    JOptionPane.showMessageDialog(null,"El email no pudo enviarse");
                }
            }
        }
        
    }
    
    private void vaciarCamposAyuda(){
        textAsunto.setText(""); areaMensaje.setText(""); panelBoton.setVisible(false);
        rutaArchivo="";  nombreArchivo=""; mensajeAdjunto.setText("");
    }
    
    private void incluirProducto(String nombre, JButton boton){
        String mensaje = verificarCantidad(nombre);
        if (!mensaje.equals("Cantidad suficiente")){
           JOptionPane.showMessageDialog(null,mensaje); boton.setContentAreaFilled(false);
        }
        if (!verificarEnVenta(nombre)){
            buscarProducto(nombre);
        }
        desactivarBotones();
        verificarInventario();
    }
    
    private void verificarInventario(){
        if (existeProducto("Cheesecake")){ botonCheesecake.setEnabled(true);}
        if (existeProducto("Helados")){ botonHelados.setEnabled(true);}
        if (existeProducto("Brownie")){ botonBrownie.setEnabled(true);}
        if (existeProducto("Merengada")){ botonMerengada.setEnabled(true);}
        if (existeProducto("Refrescos")){ botonRefrescos.setEnabled(true);}
        if (existeProducto("Jugos")){ botonJugos.setEnabled(true);}
        if (existeProducto("Naturales")){ botonNaturales.setEnabled(true);}
        if (existeProducto("Cafe")){ botonCafe.setEnabled(true);}
        if (existeProducto("Yogurt")){ botonYogurt.setEnabled(true);}
        if (existeProducto("Agua")){ botonAgua.setEnabled(true);}
    }
    
      private void desactivarBotones(){
        botonCheesecake.setEnabled(false);botonHelados.setEnabled(false); botonBrownie.setEnabled(false);
        botonMerengada.setEnabled(false); botonRefrescos.setEnabled(false); botonJugos.setEnabled(false);
        botonNaturales.setEnabled(false);botonCafe.setEnabled(false); botonYogurt.setEnabled(false);botonAgua.setEnabled(false);
    }

    //método para llenar el arrayList que se pasara a la ventana ventas
    private void llenarListas(){
        if (productos.getLista()!=null)productos.getLista().removeAll(productos.getLista());
        if (prodBasic!=null)prodBasic.removeAll(prodBasic);
        if (prodCompl!=null)prodCompl.removeAll(prodCompl);
        ConexionCliente conexion = new ConexionCliente();
        productos = conexion.listaProductos();
        if (productos==null){
            JOptionPane.showMessageDialog(null, "No hay inventario");
        }else{
            for (int i=0;i<productos.getLista().size();i++){
                if (productos.getLista().get(i).getNombre().equals("Cheesecake")||productos.getLista().get(i).getNombre().equals("Helados")||
                    productos.getLista().get(i).getNombre().equals("Brownie")||productos.getLista().get(i).getNombre().equals("Merengada")||
                    productos.getLista().get(i).getNombre().equals("Refrescos")||productos.getLista().get(i).getNombre().equals("Jugos")||
                    productos.getLista().get(i).getNombre().equals("Naturales")||productos.getLista().get(i).getNombre().equals("Café")||
                    productos.getLista().get(i).getNombre().equals("Yogurt")||productos.getLista().get(i).getNombre().equals("Agua")){
                    prodBasic.add(productos.getLista().get(i));
                }else{
                    if (productos.getLista().get(i).getNombre().equals("Empanadas")||productos.getLista().get(i).getNombre().equals("Arepa")||
                        productos.getLista().get(i).getNombre().equals("Tequeño")||productos.getLista().get(i).getNombre().equals("Bollitos")||
                        productos.getLista().get(i).getNombre().equals("Pasta")||productos.getLista().get(i).getNombre().equals("Arroz")||
                        productos.getLista().get(i).getNombre().equals("Perro Caliente")||productos.getLista().get(i).getNombre().equals("Hamburguesa")||
                        productos.getLista().get(i).getNombre().equals("Choco")||productos.getLista().get(i).getNombre().equals("Bolsa")||
                        productos.getLista().get(i).getNombre().equals("Galletas")||productos.getLista().get(i).getNombre().equals("Masticable")){
                    
                    }
                }
            }
        }
        empleados = conexion.listaEmpleados();
        if (empleados==null){
            JOptionPane.showMessageDialog(null, "No hay empleados");
        }
    }
    
    private void ocultarPaneles(){
        panelBebidaI.setVisible(true);    panelBebidaB.setVisible(false); 
        panelPostresI.setVisible(true);   panelPostresB.setVisible(false);
        panelAlmuerzoI.setVisible(true);  panelAlmuerzoB.setVisible(false);
        panelChucheriaI.setVisible(true); panelChucheriaB.setVisible(false);
        panelCombosI.setVisible(true);    panelCombosB.setVisible(false);
        panelDesayunoI.setVisible(true);  panelDesayunoB.setVisible(false);
    }
    
    private void iniciarImagenes(){
        control = new ControlInterfazVentas(this.labelBebidasD, this.labelDesayunoD, this.labelAlmuerzoD, this.labelPostresD, this.labelCombosD, this.labelChucheriasD,this.labelConexion);
        control.iniciarImagenes();
        control.probarConexion();
    }
    
    private void iniciarPaneles(){
        labelAyuda.setForeground(new Color(153,153,153)); labelReportes.setForeground(new Color(153,153,153));
        separadorAyuda.setVisible(false); separadorReportes1.setVisible(false); separadorReportes2.setVisible(false);
        separadorVentas.setVisible(true);labelVentas.setForeground(new Color(255,255,255)); panelConcretar.setVisible(false);
        panelReportes.setVisible(false); panelAyuda.setVisible(false); panelReportes.setVisible(false);panelBoton.setVisible(false);
        panelPago.setVisible(false); separadorPago.setVisible(false);
    }
    
    private String verificarCantidad(String nombre){
        for (int i=0;i < productos.tamañoLista();i++) {
            Producto aux = (Producto) productos.getLista().get(i);
            if(aux.getNombre().equals(nombre)) {
                if (Integer.parseInt(aux.getCantidad())<=5){
                    return "Advertencia: solo quedan "+(Integer.parseInt(aux.getCantidad())-1)+" "+nombre+" en el inventario";
                }else{
                    return "Cantidad suficiente";
                }
            }
        }
        return "el producto no se encontro";
    }
    private boolean existeProducto(String nombre){
        for (int i=0;i < productos.tamañoLista();i++) {
            Producto aux = (Producto) productos.getLista().get(i);
            if(aux.getNombre().equals(nombre)){
                if (Integer.parseInt(aux.getCantidad())!=0){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean verificarEnVenta(String nombre){
        for (int i=0;i < productosVenta.size();i++) {
            Producto aux = (Producto) productosVenta.get(i);
            if(aux.getNombre().equals(nombre)){
                int cantidad=Integer.parseInt(aux.getCantidad())+1;
                aux.setCantidad(String.valueOf(cantidad));
                quitarCantidad(nombre);
                llenarTabla();
                return true;
            }
        }
        return false;
    }
    
    private void quitarCantidad(String nombre){
        for (int i=0;i < productos.tamañoLista();i++) {
            Producto aux = (Producto) productos.getLista().get(i);
            if(aux.getNombre().equals(nombre)){
                int cantidad=Integer.parseInt(aux.getCantidad())-1;
                aux.setCantidad(String.valueOf(cantidad));
            }
        }
    }
    
    private Producto buscarProducto(String nombre){
        if (productos!=null){
        for (int i=0;i < productos.tamañoLista();i++) {
            Producto aux = (Producto) productos.getLista().get(i);
            if(aux.getNombre().equals(nombre)) {
                Producto aux2 = new Producto(aux.getCodigo(), aux.getNombre(),aux.getFechaCaducidad(), "1",
                                            aux.getValor(), aux.getTipo(), aux.getMotivo(), aux.getDescuento());
                productosVenta.add(aux2);
                quitarCantidad(nombre);
                llenarTabla();
                return aux2;
            }
        }
        // si no se encuentra el elemento en el stock:
        return null;
        }else{
            JOptionPane.showMessageDialog(null, "Sin inventario");
            return null;
        }
    }
    
    private void generarPdf(Ventas venta){
        JTextArea tex = new JTextArea(50,80);
        tex.setLineWrap(true);
        tex.setWrapStyleWord(true);
        
        tex.setText("****** UcabFetin ******\n"
            + "******* Factura *******\n");
    
            tex.setText(tex.getText()+"\n"
                    +"Cliente:\n"
                    + "Nombre: "+venta.getCliente().getNombre()+"\n"
                    + "Cédula: "+venta.getCliente().getCedula()+"\n"
                    + "Teléfono: "+venta.getCliente().getTelefono()+"\n"
                    + "Dirección: "+venta.getCliente().getDireccion()+"\n"
                    + "\n"
                    + "Cajero: "
                    + venta.getEmpleado()+"\n"
                    + "\n"
                    + "Forma de pago: "
                    + venta.getFormaPago()+"\n"
                    + "\n"
                    + "Productos: ");
                    
            
            
            for (int i= 0 ; i < venta.getProductos().size();i++){
                tex.setText(tex.getText()+"\n"
                        + venta.getProductos().get(i).getNombre()+"      "+venta.getProductos().get(i).getCantidad()
                        +" can..      "+String.valueOf(Double.parseDouble(venta.getProductos().get(i).getValor())*Double.parseDouble(venta.getProductos().get(i).getCantidad()))+" Bs"
                        );
            }
            
            tex.setText(tex.getText()+"\n"
                    + "\nMonto  "+venta.getMonto()+" Bs \n"
                    + "Iva   "+venta.getIva()+"% \n"
                    + "Total  "+venta.getTotal()+" Bs \n"
                    + "\n"
                    +"Fecha: "+String.valueOf(new SimpleDateFormat("dd/MM/yyyy").format(venta.getFecha()))
                    + "\n\n     Gracias por su compra!");
            
         String texto=tex.getText();
        try{
            FileOutputStream archivo = new FileOutputStream("D:\\escritorio\\Cliente\\facturas\\factura.pdf");
            Document doc = new Document();
            PdfWriter.getInstance(doc,archivo);
            doc.open();
            doc.add(new Paragraph (tex.getText()));
            doc.close();
            try {
                File path = new File ("D:\\escritorio\\Cliente\\facturas\\factura.pdf");
                Desktop.getDesktop().open(path);
            }catch (IOException ex) {
                ex.printStackTrace();
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error al generar pdf");
        }
        
    }
    
    
    public void llenarTabla(){
        TablaModeloFactura modelo = new TablaModeloFactura();
        TablaRenderizadorFactura renderizador = new TablaRenderizadorFactura();
        tabla.setModel(modelo);
        tabla.setDefaultRenderer(String.class, renderizador);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.setRowHeight(30);
        setAnchoColumnas(tabla);
        Iterator<Producto> it = productosVenta.iterator();
        while (it.hasNext())  {
            Producto objProducto = it.next();  
                modelo.agregarCliente(objProducto);
        }
    }
    
    public void setAnchoColumnas(JTable tabla) {
        JViewport scroll = (JViewport) tabla.getParent();
        int ancho = scroll.getWidth();
        int anchoColumna = 0;
        TableColumnModel modeloColumna = tabla.getColumnModel();
        TableColumn columnaTabla;
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            columnaTabla = modeloColumna.getColumn(i);
            switch (i) {
                case 0:
                    anchoColumna = 70;
                    break;
                case 1:
                    anchoColumna = 150;
                    break;
                case 2:
                    anchoColumna = 90;
                    break;
            }
            columnaTabla.setPreferredWidth(anchoColumna);
        }
    }
     
    private void añadirAFactura(String nombre){
    
    }
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
            java.util.logging.Logger.getLogger(PrincipalVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMensaje;
    private javax.swing.JButton botonAdjuntar;
    private javax.swing.JButton botonAgua;
    private javax.swing.JButton botonArepa;
    private javax.swing.JButton botonArroz;
    private javax.swing.JButton botonBollitos;
    private javax.swing.JButton botonBolsa;
    private javax.swing.JButton botonBrownie;
    private javax.swing.JButton botonBuscarProd;
    private javax.swing.JButton botonCafe;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCerrarAdjunto;
    private javax.swing.JButton botonCheesecake;
    private javax.swing.JButton botonChoco;
    private javax.swing.JButton botonCombo1;
    private javax.swing.JButton botonCombo2;
    private javax.swing.JButton botonCombo3;
    private javax.swing.JButton botonCombo4;
    private javax.swing.JButton botonCombo5;
    private javax.swing.JButton botonCombo6;
    private javax.swing.JButton botonEmpanadas;
    private javax.swing.JButton botonEnviar;
    private javax.swing.JButton botonGalletas;
    private javax.swing.JButton botonHamburguesa;
    private javax.swing.JButton botonHelados;
    private javax.swing.JButton botonJugos;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonManual;
    private javax.swing.JButton botonMasticable;
    private javax.swing.JButton botonMerengada;
    private javax.swing.JButton botonNaturales;
    private javax.swing.JButton botonPasta;
    private javax.swing.JButton botonPerro;
    private javax.swing.JButton botonRefrescos;
    private javax.swing.JButton botonTequeño;
    private javax.swing.JButton botonYogurt;
    private javax.swing.JCheckBox checkEfectivo;
    private javax.swing.JCheckBox checkTarjeta;
    private javax.swing.JLabel comentario1;
    private javax.swing.JLabel comentario2;
    private javax.swing.JLabel comentario3;
    private javax.swing.JTextField destinatario;
    private javax.swing.JLabel fondoAlmuerzos;
    private javax.swing.JLabel fondoBebidas;
    private javax.swing.JLabel fondoChucherias;
    private javax.swing.JLabel fondoCombos;
    private javax.swing.JLabel fondoDesayunos;
    private javax.swing.JLabel fondoPostres;
    private javax.swing.JLabel fonfoConcretar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelAlmuerzoD;
    private javax.swing.JLabel labelAsunto;
    private javax.swing.JLabel labelAyuda;
    private javax.swing.JLabel labelBarra;
    private javax.swing.JLabel labelBebidasD;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelCerrarSesion;
    private javax.swing.JLabel labelChucheriasD;
    private javax.swing.JLabel labelClave;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelCliente1;
    private javax.swing.JLabel labelCombosD;
    private javax.swing.JLabel labelConexion;
    private javax.swing.JLabel labelDesayunoD;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelFondo1;
    private javax.swing.JLabel labelFondo2;
    private javax.swing.JLabel labelFondo3;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPara;
    private javax.swing.JLabel labelPostresD;
    private javax.swing.JLabel labelProductos;
    private javax.swing.JLabel labelReportes;
    private javax.swing.JLabel labelTarjeta;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelVentas;
    private javax.swing.JLabel mensajeAdjunto;
    private javax.swing.JPanel panelAlmuerzoB;
    private javax.swing.JPanel panelAlmuerzoI;
    private javax.swing.JPanel panelAyuda;
    private javax.swing.JPanel panelBebidaB;
    private javax.swing.JPanel panelBebidaI;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelChucheriaB;
    private javax.swing.JPanel panelChucheriaI;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelCombosB;
    private javax.swing.JPanel panelCombosI;
    private javax.swing.JPanel panelConcretar;
    private javax.swing.JPanel panelDesayunoB;
    private javax.swing.JPanel panelDesayunoI;
    private javax.swing.JPanel panelFactura;
    private javax.swing.JPanel panelMensaje;
    private javax.swing.JPanel panelPago;
    private javax.swing.JPanel panelPostresB;
    private javax.swing.JPanel panelPostresI;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel panelReportes;
    private javax.swing.JPanel panelVentas;
    private javax.swing.JSeparator separadorAyuda;
    private javax.swing.JSeparator separadorCliente;
    private javax.swing.JSeparator separadorCompleto;
    private javax.swing.JSeparator separadorPago;
    private javax.swing.JSeparator separadorReportes1;
    private javax.swing.JSeparator separadorReportes2;
    private javax.swing.JSeparator separadorVentas;
    private javax.swing.JSeparator separadorVer1;
    private javax.swing.JSeparator separadorVer2;
    private javax.swing.JSeparator separadorVer3;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textAsunto;
    private javax.swing.JTextField textCedula;
    private javax.swing.JTextField textClave;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTarjeta;
    private javax.swing.JTextField textTelefono;
    private javax.swing.JTextField textTotal;
    private javax.swing.JLabel tituloAlmuerzo;
    private javax.swing.JLabel tituloBebidas;
    private javax.swing.JLabel tituloChucherias;
    private javax.swing.JLabel tituloCombos;
    private javax.swing.JLabel tituloDesayunos;
    private javax.swing.JLabel tituloPostres;
    // End of variables declaration//GEN-END:variables
}
