/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {

        int meses, dias, horas;

        String nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Escriba su edad: "));

        meses = (edad * 12);
        dias = (edad * 365);
        horas = (dias * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + meses + "\nDías:"+ dias + "\nHoras: " + horas, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
