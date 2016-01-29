package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * @author DrowSoft
 */
public class ControlInterfazVentas {
    
    private int cont=0;
    Timer timerImagenes;
    Timer conexion;
    JLabel label0, label1, label2, label3, label4;

   public void iniciarImagenes(){       
        timerImagenes.start();
    }
   
   public void probarConexion(){
       conexion.start();
   }
   
    public ControlInterfazVentas(JLabel label0, JLabel label1, JLabel label2, JLabel label3, JLabel label4, JLabel label5,JLabel label6) {      
        this.label0 = label0;
        this.label1 = label1;
        this.label2 = label2;
        this.label3 = label3;
        this.label4 = label4;
        
        this.timerImagenes = new Timer (1500, new ActionListener () 
        {
            public void actionPerformed(ActionEvent e)
            {
                    ImageIcon icon = new ImageIcon("src/imagenes/fondos/prueba"+String.valueOf(cont+1)+".jpg");
                    Icon icono = new ImageIcon(icon.getImage()); 
                    label0.setIcon(icono); 
                    ImageIcon icon1 = new ImageIcon("src/imagenes/fondos/desayuno"+String.valueOf(cont+1)+".jpg");
                    Icon icono1 = new ImageIcon(icon1.getImage()); 
                    label1.setIcon(icono1);
                    ImageIcon icon2 = new ImageIcon("src/imagenes/fondos/almuerzo"+String.valueOf(cont+1)+".jpg");
                    Icon icono2 = new ImageIcon(icon2.getImage()); 
                    label2.setIcon(icono2);
                    ImageIcon icon3 = new ImageIcon("src/imagenes/fondos/postres"+String.valueOf(cont+1)+".jpg");
                    Icon icono3 = new ImageIcon(icon3.getImage());
                    label3.setIcon(icono3);
                    ImageIcon icon4 = new ImageIcon("src/imagenes/fondos/combo"+String.valueOf(cont+1)+".jpg");
                    Icon icono4 = new ImageIcon(icon4.getImage());
                    label4.setIcon(icono4);
                    ImageIcon icon5 = new ImageIcon("src/imagenes/fondos/chucheria"+String.valueOf(cont+1)+".jpg");
                    Icon icono5 = new ImageIcon(icon5.getImage());
                    label5.setIcon(icono5);
                    if(cont==3){cont=0;}else{cont++;}
            }
        });
        
        this.conexion = new Timer (1500, new ActionListener () 
        {
            public void actionPerformed(ActionEvent e)
            {
                  ConexionCliente obj = new ConexionCliente();
                  String mensaje = obj.probarConexion();
                  if (mensaje.equals("Si hay conexion")){
                      label6.setForeground(new Color(0,255,102));
                  }else{
                      label6.setForeground(new Color(255,0,0));
                      conexion.stop();
                  }
            }
        });
    }
    
    public void imagenBoton(JButton boton,String ruta){
        ImageIcon icon = new ImageIcon(ruta);
        Icon icono = new ImageIcon(icon.getImage()); 
        boton.setIcon(icono);
    }
}
