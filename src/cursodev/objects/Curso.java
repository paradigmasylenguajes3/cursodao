/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursodev.objects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Curso {
    private Integer id;
    private String nombre;
    private Integer duracion;
    private List<Alumno> listadoAlumnos = new ArrayList<>();
    
    
    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public Curso() {

    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
   

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return this.nombre.toString();
    }

    public void addAlumno(Alumno alumno) {
        this.listadoAlumnos.add(alumno);
    }

    public List<Alumno> getListadoAlumnos() {
        return this.listadoAlumnos;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getIdCursos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
