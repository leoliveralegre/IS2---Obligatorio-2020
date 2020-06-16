package dominio;

import java.io.Serializable;
import java.util.Date;
        
public final class InformacionMensaje implements Serializable {

    private String mensaje;
    private String destinatario;
    private String remitente;

    public InformacionMensaje(String elRemitente, String dst, String elMensaje) {
        setRemitente(elRemitente);
        setDestinatario(dst);
        setMensaje(elMensaje);
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String elMensaje) {
        mensaje = elMensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String elDestinatario) {
        destinatario = elDestinatario;

    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String elRemitente) {
        this.remitente = elRemitente;
    }

    public void intercambiarRemitente() {
        String aux = destinatario;
        destinatario = remitente;
        remitente = aux;
    }

    @Override
    public String toString() {
        String lvRemitente = ""; 
        String lvMensaje = "";
        lvRemitente = this.getRemitente();
        lvMensaje = this.getMensaje();
        if (this.getRemitente().equals("")) {
            lvRemitente = "No hay remitente";
        }
        if (this.getMensaje().equals("")) {
            lvMensaje = "No hay mensaje";
        }        
        return lvRemitente + ": \n" + lvMensaje;
    }

}
