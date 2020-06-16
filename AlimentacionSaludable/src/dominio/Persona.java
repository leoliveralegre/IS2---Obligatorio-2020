package dominio;

import java.io.Serializable;
import java.util.Objects;
import javax.swing.ImageIcon;

public abstract class Persona implements Serializable {

    private static final String NOMBRE_NO_INGRESADO = "Nombre no ingresado";
    private static final String APELLIDO_NO_INGRESADO = "Apellido no ingresado";
    
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private ImageIcon fotoDePerfil;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String unApellido) {
        if (unApellido == null || unApellido.isEmpty()) {
            this.apellido = APELLIDO_NO_INGRESADO;
        } else {
            this.apellido = unApellido;
        }
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String unaFecha) {
        if (unaFecha == null || unaFecha.isEmpty()) {
            this.fechaNacimiento = "Fecha no ingresada";
        } else {
            this.fechaNacimiento = unaFecha;
        }
    }

    public ImageIcon getFotoDePerfil() {
        return this.fotoDePerfil;
    }

    public void setFotoDePerfil(ImageIcon foto) {
        if (foto == null) {
            this.fotoDePerfil = new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"));
        } else {
            this.fotoDePerfil = foto;
        }
    }

    public String getNombreCompleto() {
        String retorno;
        if (getNombre().equals(NOMBRE_NO_INGRESADO) && getApellido().equals(APELLIDO_NO_INGRESADO)) {
            retorno = NOMBRE_NO_INGRESADO;
        } else if (getNombre().equals(NOMBRE_NO_INGRESADO)) {
            retorno = getApellido();
        } else if (getApellido().equals(APELLIDO_NO_INGRESADO)) {
            retorno = getNombre();
        } else {
            retorno = getNombre() + " " + getApellido();
        }
        return retorno;
    }

    @Override
    public String toString() {
        return this.getNombreCompleto();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;
        final Persona otraPersona = (Persona) obj;
        return this.getNombreCompleto().equals(otraPersona.getNombreCompleto());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.apellido);
        hash = 37 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 37 * hash + Objects.hashCode(this.fotoDePerfil);
        return hash;
    }
}
