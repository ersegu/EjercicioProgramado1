/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioprogramado1;

import javax.swing.JOptionPane;

/**
 *
 * @author tloz
 */
public class EjercicioProgramado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variables
        
        boolean respuesta;
         
        //Creacion de Objetos
        
        Calificacion calif1 = new Calificacion ("Fulanito", "Manuel Torres", "Matematicas", 0);
        
        Calificacion calif2 = new Calificacion ("Menganito");
        
        //Llamado de Getters y Setters.
        
        //OBJETO 1
              
        
        respuesta=calif1.setNombreEstudiante("");
        
        if (respuesta==true) {
            JOptionPane.showMessageDialog(null, "Nombre del estudiante ingresado con exito.");
        }
        
        JOptionPane.showMessageDialog(null, calif1.getNombreEstudiante());
        
        respuesta=calif1.setNombreProfesor("");
        
        if (respuesta==true) {
            JOptionPane.showMessageDialog(null, "Nombre del profesor ingresado con exito.");
        }
        
        JOptionPane.showMessageDialog(null, calif1.getNombreProfesor());
        
        respuesta=calif1.setCurso("");
        
        if (respuesta==true) {
            JOptionPane.showMessageDialog(null, "Curso ingresado con exito.");
        }
        
        JOptionPane.showMessageDialog(null, calif1.getCurso());
        
        respuesta=calif1.setCalificacion(85);
        
        if (respuesta==true) {
            JOptionPane.showMessageDialog(null, "Nota ingresada con exito.");
        }
        
        JOptionPane.showMessageDialog(null, calif1.getNombreEstudiante());
        
        //OBJETO 2
        
        respuesta=calif2.setNombreEstudiante("");
        
        if (respuesta==true) {
            JOptionPane.showMessageDialog(null, "Nombre del estudiante ingresado con exito.");
        }
        
        JOptionPane.showMessageDialog(null, calif2.getNombreEstudiante());
        
        respuesta=calif2.setNombreProfesor("");
        
        if (respuesta==true) {
            JOptionPane.showMessageDialog(null, "Nombre del profesor ingresado con exito.");
        }
        
        JOptionPane.showMessageDialog(null, calif2.getNombreProfesor());
        
        respuesta=calif2.setCurso("");
        
        if (respuesta==true) {
            JOptionPane.showMessageDialog(null, "Curso ingresado con exito.");
        }
        
        JOptionPane.showMessageDialog(null, calif2.getCurso());
        
        respuesta=calif2.setCalificacion(85);
        
        if (respuesta==true) {
            JOptionPane.showMessageDialog(null, "Nota ingresada con exito.");
        }
        
        JOptionPane.showMessageDialog(null, calif2.getNombreEstudiante());
        
        
    }
    
}
