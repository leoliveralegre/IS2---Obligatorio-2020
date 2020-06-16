package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {

    public UsuarioTest() {
    }

    @Test
    public void testGetsSetsVaciosListaAlimentos() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }

    @Test
    public void testGetsSetsVaciosRestricciones() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getRestricciones().size(), 0);
    }

    @Test
    public void testGetsSetsVaciosPreferencias() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getPreferencias().size(), 0);
    }

    @Test
    public void testGetsSetsNullNombre() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(null, usuario.getNombre());
    }

    @Test
    public void testGetsSetsNullApellido() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getApellido(), "Apellido no ingresado");
    }

    @Test
    public void testGetsSetsNullFechaNacimiento() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getFechaNacimiento(), "Fecha no ingresada");
    }

    @Test
    public void testGetsSetsNullNacionalidad() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getNacionalidad(), null);
    }

    @Test
    public void testGetsSetsNullListaAlimentos() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }

    @Test
    public void testGetsSetsNullRestricciones() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getRestricciones().size(), 0);
    }

    @Test
    public void testGetsSetsNullPreferencias() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getPreferencias().size(), 0);
    }

    @Test
    public void testListaPreferenciasNoNull() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaAlimentos = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        int cantPreferencias = 1;
        assertEquals(cantPreferencias, usuario.getPreferencias().size());
    }

    @Test
    public void testToString() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaAlimentos = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        listaRestricciones.add("Probando Restricciones");
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        assertEquals("Usuario Prueba", usuario.toString());
    }

    @Test
    public void testAlimentosIngeridos() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaIngesta = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        listaRestricciones.add("Probando Restricciones");
        Alimento alimento = new Alimento("Asado", "Carne", null, null);
        ArrayList<Alimento> listaAlimento = new ArrayList();
        listaAlimento.add(alimento);
        Ingesta ingesta = new Ingesta("Nueva Ingesta", listaAlimento);
        listaIngesta.add(ingesta);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaIngesta);
        String[] resultadoObtenido = usuario.getArrayAlimentosIngeridos();
        int resultadoEsperado = 1;
        assertEquals(resultadoEsperado, resultadoObtenido.length);
    }

    @Test
    public void testGetRestricciones() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaIngesta = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        listaRestricciones.add("Probando Restricciones");
        Alimento alimento = new Alimento("Asado", "Carne", null, null);
        ArrayList<Alimento> listaAlimento = new ArrayList();
        listaAlimento.add(alimento);
        Ingesta ingesta = new Ingesta("Nueva Ingesta", listaAlimento);
        listaIngesta.add(ingesta);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaIngesta);
        String[] resultadoObtenido = usuario.getArrayRestricciones();
        int resultadoEsperado = 1;
        assertEquals(resultadoEsperado, resultadoObtenido.length);
    }

    @Test
    public void testGetPreferencias() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaIngesta = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        listaRestricciones.add("Probando Restricciones");
        Alimento alimento = new Alimento("Asado", "Carne", null, null);
        ArrayList<Alimento> listaAlimento = new ArrayList();
        listaAlimento.add(alimento);
        Ingesta ingesta = new Ingesta("Nueva Ingesta", listaAlimento);
        listaIngesta.add(ingesta);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaIngesta);
        String[] resultadoObtenido = usuario.getArrayPreferencias();
        int resultadoEsperado = 1;
        assertEquals(resultadoEsperado, resultadoObtenido.length);
    }

    @Test
    public void testActualizarPreferenciasUsuario() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaPreferencias2 = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaIngesta = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        listaPreferencias2.add("Probando otra cosa");
        listaRestricciones.add("Probando Restricciones");
        Alimento alimento = new Alimento("Asado", "Carne", null, null);
        ArrayList<Alimento> listaAlimento = new ArrayList();
        listaAlimento.add(alimento);
        Ingesta ingesta = new Ingesta("Nueva Ingesta", listaAlimento);
        listaIngesta.add(ingesta);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaIngesta);
        usuario.actualizarPreferenciasUsuario(usuario, listaPreferencias2);
        String[] resultadoObtenido = usuario.getArrayPreferencias();
        int resultadoEsperado = 1;
        assertEquals(resultadoEsperado, resultadoObtenido.length);
    }
    
        @Test
    public void testActualizarRestriccionesUsuario() {
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones2 = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaIngesta = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        listaRestricciones2.add("Probando otra cosa");
        listaRestricciones.add("Probando Restricciones");
        Alimento alimento = new Alimento("Asado", "Carne", null, null);
        ArrayList<Alimento> listaAlimento = new ArrayList();
        listaAlimento.add(alimento);
        Ingesta ingesta = new Ingesta("Nueva Ingesta", listaAlimento);
        listaIngesta.add(ingesta);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaIngesta);
        usuario.actualizarRestriccionesUsuario(usuario, listaRestricciones2);
        String[] resultadoObtenido = usuario.getArrayRestricciones();
        int resultadoEsperado = 1;
        assertEquals(resultadoEsperado, resultadoObtenido.length);
    }
}
