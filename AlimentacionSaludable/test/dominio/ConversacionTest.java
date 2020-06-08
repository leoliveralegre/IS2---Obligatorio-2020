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


}
