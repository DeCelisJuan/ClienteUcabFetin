package modelo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 * @author DrowSoft
 */
public class TablaRenderizadorFactura implements TableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel etiqueta = new JLabel(); //Creamos el label que se mostrará en la tabla
        etiqueta.setOpaque(true);// Colocamos el label opaco para poder colorearlo y mostrarlo del color deseado
        etiqueta.setBackground(new Color(204,204,255));// Coloriamos la label 
        //En este caso preguntamos si es la columna 1 ya que esa es la que contiene el nombre del empleado
        //y es en esta donde colocaremos la imagen
        
        if (column == 4){
            JButton boton = new JButton();
            ImageIcon imagen = new ImageIcon("src/imagenes/Botones/botonEliminar.png");//Creamos la imagen a mostrar con la direccion que recibimos del modelo 
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT));//Creamos el icono con la imagen a un tamaño de 20x20 
            boton.setIcon(icono);//Colocamos el icono creado en el label
//            boton.setCursor(new Cursor(HAND_CURSOR));
            boton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
//            boton.setText(value.toString());
        
        }else{
            etiqueta.setEnabled(false);
            etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            etiqueta.setText(value.toString());
        }

        if (isSelected) {etiqueta.setBackground(new Color(151, 193, 215));}
        return etiqueta;//retornamos el label...
    }
}
