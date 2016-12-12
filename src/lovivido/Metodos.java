/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Metodos {
    public void amosar (int meses,int dias,int horas,String nombre){
        JOptionPane.showMessageDialog(null, "Meses: " + meses + "\nDías:"+ dias + "\nHoras: " + horas, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
    }
}
