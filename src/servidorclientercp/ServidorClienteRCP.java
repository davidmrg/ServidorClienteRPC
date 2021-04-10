/*
Lógica del server
Es indispensable descargar la librería xmlrpc-1.2-b1.jar
 */
package servidorclientercp;

import javax.swing.JOptionPane;
import org.apache.xmlrpc.WebServer;


public class ServidorClienteRCP {

    
    public static void main(String[] args) {
        try{ 
            System.out.println("Iniciando server...");
            // inicia obj server que es parte de xmlrpc
            WebServer server = new WebServer(8080);
            
            // inicia ob suma 
            Suma suma = new Suma();
            
            // método addHandler que es parte de server, asigna el nombre del server
            server.addHandler("miServidorRPC", suma);
            
            // inicializa server
            server.start();
            JOptionPane.showMessageDialog(null, "Servidor en línea");
        } catch (Exception ex) {
            System.out.println("Error en server " + ex.getMessage());
        }
            
    }
    
}
