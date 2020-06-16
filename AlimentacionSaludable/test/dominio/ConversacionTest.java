package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversacionTest {

    public ConversacionTest() {
    }

    @Test
    public void testGetSetsNullUsuario() {
        Persona usuario = null;
        assertEquals(usuario, null);
    }

    @Test
    public void testGetSetsNullProfesional() {
        Persona profesional = null;
        assertEquals(profesional, null);
    }

    @Test
    public void testGetSetsNullLsitaMensajes() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes().size(), 0);
    }

    @Test
    public void testGetSetsNullToString() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.toString(), "No hay mensajes para mostrar");
    }

    @Test
    public void testGetSetsDatosVaciosProfesional() {
        //CAMBIAR NOMBRE SOLO A TEST NOMBRE VACIO Y CREAR CON RESTO DE LOS DATOS: 

        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        assertEquals(profesional.getNombre(), null);
    }

    @Test
    public void testGetSetsDatosVaciosListaMensajes() {
        Persona usuario = new Usuario(null, null, null, null, null, null, null, null);
        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes().size(), 0);
    }

    @Test
    public void testGetSetsDatosVaciosToString() {
        Persona usuario = new Usuario(null, null, null, null, null, null, null, null);
        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.toString(), "No hay mensajes para mostrar");
    }

    @Test
    public void testFueAtendida() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaAlimentos = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario profesional = new Usuario("Profesional", "Prueba", "14/08/1992", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        InformacionMensaje info = new InformacionMensaje("El usuario", "El destinatario", "El mensaje");
        ArrayList<InformacionMensaje> listaInformacion = new ArrayList();
        listaInformacion.add(info);
        Conversacion conversacion = new Conversacion(usuario, profesional, listaInformacion);
        assertEquals(false, conversacion.getFueAtendidaConsulta());
    }

    @Test
    public void testGetProfesional() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaAlimentos = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario profesional = new Usuario("Profesional", "Prueba", "14/08/1992", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        InformacionMensaje info = new InformacionMensaje("El usuario", "El destinatario", "El mensaje");
        ArrayList<InformacionMensaje> listaInformacion = new ArrayList();
        listaInformacion.add(info);
        Conversacion conversacion = new Conversacion(usuario, profesional, listaInformacion);
        assertEquals(profesional, conversacion.getProfesional());
    }

    @Test
    public void testGetUsuario() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaAlimentos = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario profesional = new Usuario("Profesional", "Prueba", "14/08/1992", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        InformacionMensaje info = new InformacionMensaje("El usuario", "El destinatario", "El mensaje");
        ArrayList<InformacionMensaje> listaInformacion = new ArrayList();
        listaInformacion.add(info);
        Conversacion conversacion = new Conversacion(usuario, profesional, listaInformacion);
        assertEquals(usuario, conversacion.getUsuario());
    }

    @Test
    public void testToString() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaAlimentos = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario profesional = new Usuario("Profesional", "Prueba", "14/08/1992", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        InformacionMensaje info = new InformacionMensaje("El usuario", "El destinatario", "El mensaje");
        ArrayList<InformacionMensaje> listaInformacion = new ArrayList();
        listaInformacion.add(info);
        Conversacion conversacion = new Conversacion(usuario, profesional, listaInformacion);
        String resultadoEsperado = conversacion.toString();
        assertEquals("\nEl usuario\nEl mensaje\n", resultadoEsperado);
    }

    @Test
    public void testEquals() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaAlimentos = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario usuario2 = new Usuario("Usuario2", "Prueba2", "14/08/92", null, "Argentino", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario profesional = new Usuario("Profesional", "Prueba", "14/08/1992", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario profesional2 = new Usuario("Profesional2", "Prueba2", "14/08/1992", null, "Argentino", listaPreferencias, listaRestricciones, listaAlimentos);

        InformacionMensaje info = new InformacionMensaje("El usuario", "El destinatario", "El mensaje");
        InformacionMensaje info2 = new InformacionMensaje("El usuario2", "El destinatario2", "El mensaje2");
        ArrayList<InformacionMensaje> listaInformacion = new ArrayList();
        ArrayList<InformacionMensaje> listaInformacion2 = new ArrayList();
        listaInformacion.add(info);
        listaInformacion2.add(info2);
        Conversacion conversacion = new Conversacion(usuario, profesional, listaInformacion);
        Conversacion conversacionNueva = new Conversacion(usuario2, profesional2, listaInformacion2);
        assertFalse(conversacion.equals(conversacionNueva));
    }

    @Test
    public void testEquals2() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaAlimentos = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario usuario2 = new Usuario("Usuario2", "Prueba2", "14/08/92", null, "Argentino", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario profesional = new Usuario("Profesional", "Prueba", "14/08/1992", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario profesional2 = new Usuario("Profesional2", "Prueba2", "14/08/1992", null, "Argentino", listaPreferencias, listaRestricciones, listaAlimentos);

        InformacionMensaje info = new InformacionMensaje("El usuario", "El destinatario", "El mensaje");
        InformacionMensaje info2 = new InformacionMensaje("El usuario2", "El destinatario2", "El mensaje2");
        ArrayList<InformacionMensaje> listaInformacion = new ArrayList();
        ArrayList<InformacionMensaje> listaInformacion2 = new ArrayList();
        listaInformacion.add(info);
        listaInformacion2.add(info2);
        Conversacion conversacion = new Conversacion(usuario, profesional, listaInformacion);
        Conversacion conversacionNueva = new Conversacion(usuario2, profesional, listaInformacion2);
        assertFalse(conversacion.equals(conversacionNueva));
    }

    @Test
    public void testEquals3() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaAlimentos = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario usuario2 = new Usuario("Usuario2", "Prueba2", "14/08/92", null, "Argentino", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario profesional = new Usuario("Profesional", "Prueba", "14/08/1992", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario profesional2 = new Usuario("Profesional2", "Prueba2", "14/08/1992", null, "Argentino", listaPreferencias, listaRestricciones, listaAlimentos);

        InformacionMensaje info = new InformacionMensaje("El usuario", "El destinatario", "El mensaje");
        InformacionMensaje info2 = new InformacionMensaje("El usuario2", "El destinatario2", "El mensaje2");
        ArrayList<InformacionMensaje> listaInformacion = new ArrayList();
        ArrayList<InformacionMensaje> listaInformacion2 = new ArrayList();
        listaInformacion.add(info);
        listaInformacion2.add(info2);
        Conversacion conversacion = new Conversacion(usuario, profesional, listaInformacion);
        Conversacion conversacionNueva = new Conversacion(usuario, profesional, listaInformacion2);
        assertTrue(conversacion.equals(conversacionNueva));
    }

    @Test
    public void testAgregarMensaje() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaAlimentos = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario profesional = new Usuario("Profesional", "Prueba", "14/08/1992", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        InformacionMensaje info = new InformacionMensaje("El usuario", "El destinatario", "El mensaje");
        ArrayList<InformacionMensaje> listaInformacion = new ArrayList();
        listaInformacion.add(info);
        Conversacion conversacion = new Conversacion(usuario, profesional, listaInformacion);
        conversacion.agregarMensaje("El nuevo mensaje", true);
        assertFalse(conversacion.getFueAtendidaConsulta());
    }
    
        @Test
    public void testAgregarMensaje2() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaAlimentos = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Usuario profesional = new Usuario("Profesional", "Prueba", "14/08/1992", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        InformacionMensaje info = new InformacionMensaje("El usuario", "El destinatario", "El mensaje");
        ArrayList<InformacionMensaje> listaInformacion = new ArrayList();
        listaInformacion.add(info);
        Conversacion conversacion = new Conversacion(usuario, profesional, listaInformacion);
        conversacion.agregarMensaje("El nuevo mensaje", false);
        assertFalse(conversacion.getFueAtendidaConsulta());
    }
}
