package com.argentinaprograma.portfoliobackend.bd;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String dni;
    private String nombre;
    private String apellido;
    private String estudios;

    @Column(name = "experiencia_laboral")
    private String experienciaLaboral;
    private String tecnologias;
    private int edad;
    private String provincia;

    private String imagen;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellido, String estudios, String experienciaLaboral, String tecnologias, int edad, String provincia, String imagen) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estudios = estudios;
        this.experienciaLaboral = experienciaLaboral;
        this.tecnologias = tecnologias;
        this.edad = edad;
        this.provincia = provincia;
        this.imagen = imagen;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(String experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
