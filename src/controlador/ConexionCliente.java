package controlador;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ListaEmpleados;
import modelo.ListaProducto;
import modelo.Ventas;
/**
 * @author DrowSoft
 */
public class ConexionCliente {
    
    public String iniciarSesion(String usuario, String contraseña){
        try {
            String mensajeS="";
            Socket cliente = new Socket("localhost",1000);
            ObjectOutputStream mensaje = new ObjectOutputStream(cliente.getOutputStream());
            mensaje.writeObject("Login:"+usuario+":"+contraseña);
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            mensajeS=(String) entrada.readObject();
            cliente.close();
            return mensajeS;
        }catch (UnknownHostException ex){
         //en caso de que el servidor no se encuentre, es decir la ip o el localhost
          return "Servidor no se encuentra";
        }catch (IOException ex) {
            return "Servidor caido";
        }catch (ClassNotFoundException ex) {
                return "Error la clase no se encuentra";
         }
    }
    
    public String recuperarContraseña(String usuario, String pregunta,String respuesta){
        try {
            String mensajeS="";
            Socket cliente = new Socket("localhost",1000);
            ObjectOutputStream mensaje = new ObjectOutputStream(cliente.getOutputStream());
            mensaje.writeObject("recuperarContraseña:"+usuario+":"+pregunta+":"+respuesta);
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            try {
                mensajeS=(String) entrada.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConexionCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            cliente.close();
            return mensajeS;
        }catch (UnknownHostException ex){
         //en caso de que el servidor no se encuentre, es decir la ip o el localhost
          return "Servidor no se encuentra";
        }catch (IOException ex) {
            return "Servidor caido";
        }
        
    }
    
    public String modificarContraseña(String usuario,String contraseña){
        try {
            String mensajeS="";
            Socket cliente = new Socket("localhost",1000);
            ObjectOutputStream mensaje = new ObjectOutputStream(cliente.getOutputStream());
            mensaje.writeObject("modificarContraseña:"+usuario+":"+contraseña);
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            try {
                mensajeS=(String) entrada.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConexionCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            cliente.close();
            return mensajeS;
        }catch (UnknownHostException ex){
         //en caso de que el servidor no se encuentre, es decir la ip o el localhost
          return "Servidor no se encuentra";
        }catch (IOException ex) {
            return "Servidor caido";
        }
    }
    
    public String realizarVenta(Ventas venta){
        try {
            Socket cliente = new Socket("localhost",1000);
            ObjectOutputStream mensaje = new ObjectOutputStream(cliente.getOutputStream());
            mensaje.writeObject("Venta");
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            String  mensajeRecibido = (String)entrada.readObject();
            if (mensajeRecibido.equals("Envia objeto")){
                ObjectOutputStream mensaje2 = new ObjectOutputStream(cliente.getOutputStream());
                mensaje2.writeObject(venta);
                ObjectInputStream entrada2 = new ObjectInputStream(cliente.getInputStream());
                String  mensajeRecibido2 = (String)entrada2.readObject();
                cliente.close();
                return mensajeRecibido2;
            }else{
                cliente.close();
                return "Error al comunicarse";}
        } catch (IOException ex) {
                return "Error inesperado";
        }catch (ClassNotFoundException ex) {
                return "Error al leer el objeto";
         }
}
  
    public ListaProducto listaProductos(){
        try {
            Socket cliente = new Socket("localhost",1000);
            ObjectOutputStream mensaje = new ObjectOutputStream(cliente.getOutputStream());
            mensaje.writeObject("listaProductos");
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            ListaProducto  productos = (ListaProducto)entrada.readObject();
            cliente.close();
            return productos;
        }catch (UnknownHostException ex){
         //en caso de que el servidor no se encuentre, es decir la ip o el localhost
         System.out.println("servidor caido");
          return null;
        }catch (IOException ex) {
            System.out.println("No sabemos que error es "+ex);
            return null;
        }catch (ClassNotFoundException ex) {
                System.out.println("Error al leer el objeto");
                return null;
            }
    
    }
    
    public ListaEmpleados listaEmpleados(){
        try {
            Socket cliente = new Socket("localhost",1000);
            ObjectOutputStream mensaje = new ObjectOutputStream(cliente.getOutputStream());
            mensaje.writeObject("listaEmpleados");
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            ListaEmpleados  empleados = (ListaEmpleados)entrada.readObject();
            cliente.close();
            return empleados;
        }catch (UnknownHostException ex){
         //en caso de que el servidor no se encuentre, es decir la ip o el localhost
         System.out.println("servidor caido");
          return null;
        }catch (IOException ex) {
            System.out.println("No sabemos que error es "+ex);
            return null;
        }catch (ClassNotFoundException ex) {
                System.out.println("Error al leer el objeto");
                return null;
            }
    
    }
    
    public String probarConexion(){
        try {
            String mensajeS="";
            Socket cliente = new Socket("localhost",1000);
            ObjectOutputStream mensaje = new ObjectOutputStream(cliente.getOutputStream());
            mensaje.writeObject("Conexion");
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            mensajeS=(String) entrada.readObject();
            cliente.close();
            return mensajeS;
        }catch (UnknownHostException ex){
         //en caso de que el servidor no se encuentre, es decir la ip o el localhost
          return "Servidor no se encuentra";
        }catch (IOException ex) {
            return "Servidor caido";
        }catch (ClassNotFoundException ex) {
                return "Error la clase no se encuentra";
         }
    }
}
