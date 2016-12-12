/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

public static void main(String[] args) {


int m;
int d;
int h;
int a;

String nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
int edad = Integer.parseInt(JOptionPane.showInputDialog ("Escriba su edad: "));
 

 
m = (a*12);
d = (a*365);
h = (d*24);
 
 JOptionPane.showMessageDialog(null,  "Meses: "  +m,"Numero de meses vividos de " +nombre,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Días: " +d,"Numero de días vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Horas: " +h,"Numero de horas vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);

   System.exit (0);

}
   

}
