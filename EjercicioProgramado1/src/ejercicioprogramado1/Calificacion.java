/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioprogramado1;

import javax.swing.JOptionPane;

/**
 *
 * @author tloz
 */
public class Calificacion {
    
    //ATRIBUTOS
    
    private String nombreEstudiante, curso, nombreProfesor;
    private double calificacion;
    
    
    //CONSTRUCTORES
    public Calificacion (String pEstudiante){
        
        boolean aux=setNombreEstudiante(pEstudiante);
        while (aux==false) {
            aux=setNombreEstudiante(pEstudiante);
        }    
    }
    
    
    public Calificacion (String pEstudiante, String pProfesor, String pCurso, double pCalificacion){
        
        boolean aux=setNombreEstudiante(pEstudiante);
        while (aux==false) {
            aux=setNombreEstudiante(pEstudiante);
        }
        
        aux=setNombreProfesor(pProfesor);
        while (aux==false) {
            aux=setNombreProfesor(pProfesor);
        }
        
        
        aux=setCurso(pCurso);
        while (aux==false) {
            aux=setCurso(pCurso);
        }
        
        aux=setCalificacion(pCalificacion);
        while (aux==false) {
            aux=setCalificacion(pCalificacion);
        }
    }
    
    //SETTERS Y GETTERS
    
    //SET y GET Nombre Estudiante
    
    public boolean setNombreEstudiante (String pNombre){
        
        if (pNombre==null||pNombre.isEmpty()||pNombre.isBlank()) {
            return false;
        }
        
        nombreEstudiante=pNombre;
        return true;
    }
    
    public String getNombreEstudiante (){
        if (nombreEstudiante!=null) {
            return nombreEstudiante;
        } else {
            return "El campo nombre de estudiante esta vacio";
        }
    
    }
    
    //SET y GET Nombre Profesor
    
    public boolean setNombreProfesor (String pNombre){
        
        if (pNombre==null||pNombre.isEmpty()||pNombre.isBlank()) {
            return false;
        }
        nombreProfesor=pNombre;
        return true;
    }
    
    public String getNombreProfesor (){
        if (nombreProfesor!=null) {
            return nombreProfesor;
        } else {
            return "El campo nombre de Profesor esta vacio";
        }
    }
    
    
    //SET y GET Curso
    
    public boolean setCurso (String pCurso){
        
        if (pCurso==null||pCurso.isEmpty()||pCurso.isBlank()) {
            return false;
        }
        
        curso=pCurso;
        return true;
    }
    
    public String getCurso (){
        if (curso!=null) {
            return curso;
        } else {
            return "El campo nombre de curso esta vacio";
        }
    }
    
    
    //SET y GET Calificacion
    
    public boolean setCalificacion (double pCalificacion) {
        
        /*
        String aux = Double.toString(pCalificacion);
        for (int i = 0; i < aux.length(); i++) {
            if ((Character.isLetter(aux.charAt(i)))==true) {
                setCalificacion(Double.parseDouble(JOptionPane.showInputDialog("La nota solo debe contener numeros, favor ingresar la nota nuevamente,")));
            }
        }
        */
        
        calificacion=pCalificacion;
        return true;
    
    }
    
    public double getCalificacion () {
        return calificacion;    
    }
    
}
