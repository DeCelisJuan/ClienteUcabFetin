package manejoXML;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modelo.VentasXML;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class DaoVentasXml {
    private Element root;
    private String fileLocation = "src//archivosXML//ventas.xml";

    public DaoVentasXml() {
        try {
            SAXBuilder builder = new SAXBuilder(false);
            Document doc = null;
            doc = builder.build(fileLocation);
            root = doc.getRootElement();
        } catch (JDOMException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        }
    }
    
    private Element VentasXmlElement(VentasXML nVentas) {
        Element Ventastrans = new Element("Venta");
        Element productos = new Element("productos");
        productos.setText(nVentas.getProductos());
        Element cliente = new Element("cliente");
        cliente.setText(nVentas.getCliente());
        Element pago = new Element("pago");
        pago.setText(nVentas.getPago());
        Element empleado = new Element("empleado");
        empleado.setText(nVentas.getEmpleado());
        Element fecha = new Element("fecha");
        fecha.setText(nVentas.getFecha());
        Ventastrans.addContent(productos);
        Ventastrans.addContent(cliente);
        Ventastrans.addContent(pago);
        Ventastrans.addContent(empleado);
        Ventastrans.addContent(fecha);
        
        
        return Ventastrans;
    }

    private VentasXML VentasToObject(Element element){
        VentasXML nVentas = new VentasXML(element.getChildText("productos"),element.getChildText("cliente"),element.getChildText("pago")
                                            ,element.getChildText("empleado"),element.getChildText("fecha"));
        return nVentas;
    }

    private boolean updateDocument() {
        try {
            XMLOutputter out = new XMLOutputter(org.jdom.output.Format.getPrettyFormat());
            FileOutputStream file = new FileOutputStream(fileLocation);
            out.output(root, file);
            file.flush();
            file.close();
            return true;
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            return false;
        }
    }

    public static Element buscar(List raiz) {
        Iterator i = raiz.iterator();
        while (i.hasNext()) {
            Element e = (Element) i.next();
            return e;
        }
        return null;
    }
    
    public boolean agregarVenta(VentasXML nVentas) {
        boolean resultado = false;
        root.addContent(VentasXmlElement(nVentas));
        resultado = updateDocument();
        return resultado;
    }

    public boolean borrarVentas() {
        boolean resultado = false;
        Element aux = new Element("Ventas");
        List Ventas = this.root.getChildren("Venta");
        while (aux != null) {
            aux = DaoVentasXml.buscar(Ventas);
            if (aux != null) {
                Ventas.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }

    public ArrayList<VentasXML> todasLasVentas() {
        ArrayList<VentasXML> resultado = new ArrayList<VentasXML>();
        for (Object it : root.getChildren()) {
            Element xmlElem = (Element) it;
            resultado.add(VentasToObject(xmlElem));
        }
        return resultado;
    }
}

