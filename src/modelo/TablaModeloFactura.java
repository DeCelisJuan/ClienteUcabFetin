package modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author DrowSoft
 */
public class TablaModeloFactura extends AbstractTableModel{
    private String[] columnNames = {"Nombre","Cantidad","Descuento","Costo","Quitar"};//Creamos las columnas necesarias
    private List<Producto> productos = new ArrayList<Producto>();//Cremos una lista de productos

    public void agregarCliente(Producto producto) {
        productos.add(producto);//Añadimos el producto a la lista
        fireTableDataChanged();//Actualizamos la tabla
    }

    public void eliminarCliente(int rowIndex) {
        productos.remove(rowIndex);//Eliminamos el producto de la lista
        fireTableDataChanged();//Actualizamos la tabla
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex]; //Retorna el nombre de la columna indicada
    }

    @Override
    public int getRowCount() {
        return productos.size();//Retorna cuantas filas hay
    }

    @Override
    public int getColumnCount() {
        return 5;//Retorna cuantas columnas hay
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return productos.get(rowIndex).getNombre();//Pasamos el nombre del producto
            case 1:
                return productos.get(rowIndex).getCantidad();//Pasamos la cantidad del producto
            case 2:
                return productos.get(rowIndex).getDescuento();//Pasamos el descuento del producto
            case 3:
                return valor(rowIndex,columnIndex);//Pasamos el valor del producto contando descuento y cantidad
            case 4:
                return "";
            default:
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
//        return getValueAt(0, columnIndex).getClass();
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex==5)
            return true;
        else
         return true;//Para que no se puedan modificar los datos de la tabla
    }

    @Override//Este procedimiento se usa por si se quiere modificar los datos de un producto desde la tabla, pero no lo usaremos...
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Producto producto = productos.get(rowIndex);
        switch (columnIndex) {
            case 0:
//                producto.setNombre((String) value); 
            case 1:
//                producto.setCantidad((String) value);
            case 2:
//                producto.setDescuento((String) value);
            case 3:
//                producto.setValor((String) value);
            case 4:
                if (Integer.parseInt(producto.getCantidad())>1){
                    producto.setCantidad(String .valueOf(Integer.parseInt(producto.getCantidad())-1));
                }else{
                    productos.remove(producto);
                }
                fireTableDataChanged();
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    private String valor(int rowIndex, int columnIndex){
        DecimalFormat decimales = new DecimalFormat("0.00");
        double cantidad = Double.valueOf(productos.get(rowIndex).getCantidad());
        double valor = Double.valueOf(productos.get(rowIndex).getValor());
        double descuento = Double.valueOf(productos.get(rowIndex).getDescuento());
        return decimales.format((cantidad*valor)-((cantidad*valor)*(descuento/100)));
    }
}
