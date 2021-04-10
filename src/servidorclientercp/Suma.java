/*
Lógica de la función suma que se ejecutará en el server
 */
package servidorclientercp;

/**
 *
 * @author davidramirez
 */
public class Suma {
    // 
    // método público para recibir los numeros y validaros.
    
    public String suma(String n1,  String n2){
        return String.valueOf(Integer.parseInt(n1) + Integer.parseInt(n2));
    }
    
    
}
