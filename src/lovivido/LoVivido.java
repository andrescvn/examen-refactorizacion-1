/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {
    
    public static void main(String[] args) {
        Metodos met = new Metodos();
        int meses, dias, horas;
        
        String nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Escriba su edad: "));
        
        meses = (edad * 12);
        dias = (edad * 365);
        horas = (dias * 24);
        
        met.amosar(meses, dias, horas, nombre);
        
        System.exit(0);
        
    }
    
}
