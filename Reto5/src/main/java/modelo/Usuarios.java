/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alvaroguerrero
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuarios")
public class Usuarios {
    @Id
    @Column(name="id_username")
    String id_username;
    
    @Column(name="nombre")
    String nombre;
    
    @Column(name="apellido")
    String apellido;
    
    @Column(name="email")
    String email;
    
    @Column(name="password")
    String password;
    
    @Column(name="fecha_nacimiento")
    String fecha_nacimiento; 

    public String getId_username() {
        return id_username;
    }

    public void setId_username(String id_username) {
        this.id_username = id_username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id_username=" + id_username + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", password=" + password + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }
    
    
    
}


