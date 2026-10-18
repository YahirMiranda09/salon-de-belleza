package modelo;

import java.util.UUID;

import enumeradores.Rol;

// Clase que representa un usuario en el sistema
public class Usuario {
    // Atributos
    private UUID id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Rol rol;
    private String correoElectronico;
    private String contrasena;
    private String numeroTelefono;
    private String imagenPerfil;

    // Constructor vacio 
    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(
            UUID id,
            String nombre,
            String apellidoPaterno,
            String apellidoMaterno,
            Rol rol,
            String correoElectronico,
            String contrasena,
            String numeroTelefono,
            String imagenPerfil) {
                // Inicializa los atributos del usuario con los valores proporcionados
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rol = rol;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.numeroTelefono = numeroTelefono;
        this.imagenPerfil = imagenPerfil;
    }
    
    // Getters
    public UUID getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public Rol getRol() {
        return rol;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public String getContrasena() {
        return contrasena;
    }
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public String getImagenPerfil() {
        return imagenPerfil;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public void setImagenPerfil(String imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }
}