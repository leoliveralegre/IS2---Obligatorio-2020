package dominio;

import dominio.Sistema.DiasDeLaSemana;
import dominio.Sistema.IngestasPorDia;
import dominio.Sistema.Paises;
import dominio.Sistema.Preferencias;
import dominio.Sistema.Restricciones;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {

    public SistemaTest() {

    }

    @Test
    public void testGetsSetsNullListaAlimentos() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaAlimentos().size(), 0);
    }

    @Test
    public void testGetsSetsNullListaPlanes() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaPlanesAlimentacion().size(), 0);
    }

    @Test
    public void testGetsSetsNullListaConversaciones() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaConversaciones().size(), 0);
    }

    @Test
    public void testGetsSetsNullPersonaLogueada() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona personaLogueadaEsperada = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(null, sistemaATestear.getPersonaLogueada());
    }

    @Test
    public void testGetsSetsDatosVaciosListaUsuarios() {
        Sistema sistemaATestear = new Sistema();
        assertEquals(sistemaATestear.getListaUsuarios().size(), 0);
    }

    @Test
    public void testGetsSetsDatosVaciosListaAlimentos() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        Persona personaLogueada = new Usuario(null, null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaAlimentos().size(), 0);
    }

    @Test
    public void testAgregarMensajeConversacionListaVacia() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        boolean pudeAgregarMensaje = sistemaATestear.agregarMensajeConversacion("Martin", "Lucia", "aa", false, false);
        assertFalse(pudeAgregarMensaje);
    }

    @Test
    public void testAgregarMensajeConversacionNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        boolean pudeAgregarMensaje = sistemaATestear.agregarMensajeConversacion(null, null, "Segundo mensaje", false, false);
        assertFalse(pudeAgregarMensaje);
    }

    @Test
    public void testDevolverAlimentoNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Alimento alimentoEsperado = new Alimento(null, null, null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre(null), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Alimento alimentoEsperado = new Alimento("", "", null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre(""), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosCorrectos() {
        ArrayList listaAlimentos = new ArrayList<>();
        Alimento alimentoEsperado = new Alimento("Papa", "Verdura", null, null);
        listaAlimentos.add(alimentoEsperado);
        Sistema sistemaATestear = new Sistema(null, null, listaAlimentos, null, null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre("Papa"), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosErroneos() {
        ArrayList listaAlimentos = new ArrayList<>();
        Alimento alimentoEsperado = new Alimento("Papa", "Verdura", null, null);
        listaAlimentos.add(alimentoEsperado);
        Sistema sistemaATestear = new Sistema(null, null, listaAlimentos, null, null, null);
        assertNotEquals(sistemaATestear.devolverAlimentoDadoNombre("Luca"), alimentoEsperado);
    }

    @Test
    public void testUsuarioDevolverPorNombreNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        //Usuario usuarioEsperado = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals("Datos no ingresados", sistemaATestear.getProfesionalPorNombre(null).toString());
    }

    @Test
    public void testProfesionalDevolverPorNombreNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals("Datos no ingresados", sistemaATestear.getProfesionalPorNombre(null).toString());
    }

    @Test
    public void testDevolverProfesionalPorNombreDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals("Datos no ingresados", sistemaATestear.getProfesionalPorNombre("").toString());
    }

    @Test
    public void testDevolverProfesionalPorNombreDatosErroneos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional("Martin", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista(profesionalEsperado);
        assertEquals(sistemaATestear.getProfesionalPorNombre("Martin"), profesionalEsperado);
    }

    @Test
    public void testDevolverUsuarioPorNombreDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuarioEsperado = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals("Datos no ingresados", sistemaATestear.getProfesionalPorNombre("").toString());
    }

    @Test
    public void testDevolverUsuarioPorNombreDatosErroneos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista(usuario);
        //Usuario usuario2 = new Usuario("Martin", null, null, null, null, null, null, null);
        assertEquals(usuario, sistemaATestear.getUsuarioPorNombre("Martin"));
    }

    @Test
    public void testAgregarPlanAlimentacionUsuarioNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = null;
        Profesional profesional1 = new Profesional(null, null, null, null, null, null, null);
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1));
    }

    @Test
    public void testAgregarPlanAlimentacionProfesionalNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional1 = null;
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1));
    }

    @Test
    public void testAgregarPlanAlimentacionRepetidos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("", "", "", null, null, null, null, null);
        Profesional profesional1 = new Profesional("", "", "", null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1));
    }

    @Test
    public void testPlanesPendientes() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null, null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertEquals(sistemaATestear.getListaPlanesPendientes(profesional1).length, 1);
    }

    @Test
    public void testPlanesPendientes2() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null, null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        Profesional profesional2 = new Profesional("Joaquin", "Bardanca", null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertEquals(sistemaATestear.getListaPlanesPendientes(profesional2).length, 0);
    }

    @Test
    public void testPlanesPendientesNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null, null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertEquals(sistemaATestear.getListaPlanesPendientes(null).length, 0);
    }

    @Test
    public void testAgregarAListaConversacionesDatosErroneos() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        boolean agregoConversacionRepetida = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        assertFalse(agregoConversacionRepetida);
    }

    @Test
    public void testAgregarIngestaDatosCorrectos() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        Ingesta ingesta1 = new Ingesta("11/02/17", null);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/16", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testAgregarIngestaRepetida() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta("11/02/17", listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/17", "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), "11/02/16", "Papa");
        assertFalse(retorno);
    }

    @Test
    public void testAgregarIngestaFechaRepetida() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta("11/02/17", listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/17", "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), "11/02/17", "Papa");
        assertFalse(retorno);
    }

    @Test
    public void testAgregarIngestaFechaNull() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta(null, listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, null, "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), null, "Papa");
        assertFalse(retorno);
    }

    @Test
    public void testAgregarIngestaAlimentoRepetidoFechaDistinta() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), "11/02/16", "Papa");
        assertFalse(retorno);
    }

    @Test
    public void testDevolverPlanDadoNombreNull() {
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(null, sistemaATestear.devolverPlanDadoNombre(null).toString());
    }

    @Test
    public void testDevolverPlanDatosValidos() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombre("Plan"), plan1);
    }

    @Test
    public void testDevolverPlanNoPertenece() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(null, sistemaATestear.devolverPlanDadoNombre("Plan").getNombreDelPlan());
    }

    @Test
    public void testAtenderSolicitudPlan() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user1, plan1.getNombreDelPlan());
        assertTrue(fueAtendido);
    }

    @Test
    public void testAtenderSolicitudPlanAtendidoTrue() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, true, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user1, "Plan de alimentación");
        assertFalse(fueAtendido);
    }

    @Test
    public void testAtenderSolicitudPlanProfesionalDistinto() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        Profesional professional2 = new Profesional("Lautaro", null, null, null, null, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional2,
                user1, plan1.getNombreDelPlan());
        assertFalse(fueAtendido);
    }

    @Test
    public void testAtenderSolicitudPlanUsuarioDistinto() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        Usuario user2 = new Usuario("Martina", null, null, null, null, null, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user2, plan1.getNombreDelPlan());
        assertFalse(fueAtendido);
    }

    @Test
    public void testAtenderSolicitudPlanListaVacia() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user1, plan1.getNombreDelPlan());
        assertFalse(fueAtendido);
    }

    @Test
    public void testListaPlanesAtendidosDatosCorrectos() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user1, plan1.getNombreDelPlan());
        boolean sonIguales = sistemaATestear.planesAtendidosDelUsuario(user1)[0].equals(plan1.getNombreDelPlan());
        assertTrue(sonIguales);
    }

    @Test
    public void testListaPlanesAtendidosListaVacia() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.planesAtendidosDelUsuario(user1).length, 0);
    }

    @Test
    public void testEnumPreferenciasCarnesBlancas() {
        String resultadoEsperado = "CarnesBlancas";
        assertEquals(Preferencias.CARNES_BLANCAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasCarnesRojas() {
        String resultadoEsperado = "CarnesRojas";
        assertEquals(Preferencias.CARNES_ROJAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasVerduras() {
        String resultadoEsperado = "Verduras";
        assertEquals(Preferencias.VERDURAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasFrutas() {
        String resultadoEsperado = "Frutas";
        assertEquals(Preferencias.FRUTAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasHarinas() {
        String resultadoEsperado = "Harinas";
        assertEquals(Preferencias.HARINAS.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesDiabetes() {
        String resultadoEsperado = "Diabetes";
        assertEquals(Restricciones.Diabetes.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesVeganismo() {
        String resultadoEsperado = "Veganismo";
        assertEquals(Restricciones.Veganismo.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesIntoleranciaLactosa() {
        String resultadoEsperado = "IntoleranciaLactosa";
        assertEquals(Restricciones.IntoleranciaLactosa.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesHarinas() {
        String resultadoEsperado = "Celiaquia";
        assertEquals(Restricciones.Celiaquia.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaJueves() {
        String resultadoEsperado = "Jueves";
        assertEquals(DiasDeLaSemana.Jueves.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPaises() {
        String resultadoEsperado = "Argentina";
        assertEquals(resultadoEsperado, Paises.Argentina.name());
    }

    @Test
    public void testEnumDiasSemanaViernes() {
        String resultadoEsperado = "Viernes";
        assertEquals(DiasDeLaSemana.Viernes.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaSabado() {
        String resultadoEsperado = "Sabado";
        assertEquals(DiasDeLaSemana.Sabado.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaDomingo() {
        String resultadoEsperado = "Domingo";
        assertEquals(DiasDeLaSemana.Domingo.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaMiercoles() {
        String resultadoEsperado = "Miercoles";
        assertEquals(DiasDeLaSemana.Miercoles.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaMartes() {
        String resultadoEsperado = "Martes";
        assertEquals(DiasDeLaSemana.Martes.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaLunes() {
        String resultadoEsperado = "Lunes";
        assertEquals(DiasDeLaSemana.Lunes.name(), resultadoEsperado);
    }

    @Test
    public void testEnumIngestasDiaDesayuno() {
        String resultadoEsperado = "Desayuno";
        assertEquals(IngestasPorDia.Desayuno.name(), resultadoEsperado);
    }

    @Test
    public void testEnumIngestasDiaAlmuerzo() {
        String resultadoEsperado = "Almuerzo";
        assertEquals(IngestasPorDia.Almuerzo.name(), resultadoEsperado);
    }

    @Test
    public void testEnumIngestasDiaCena() {
        String resultadoEsperado = "Cena";
        assertEquals(IngestasPorDia.Cena.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDevolverListaIngestas() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaEsperada = new ArrayList<>();
        listaEsperada.add("Desayuno");
        listaEsperada.add("Almuerzo");
        listaEsperada.add("Cena");
        assertEquals(sistemaATestear.devolverListaIngestasDeLaSemana(), listaEsperada);
    }

    @Test
    public void testEnumDevolverListaDiasDeLaSemana() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaEsperada = new ArrayList<>();
        listaEsperada.add("Lunes");
        listaEsperada.add("Martes");
        listaEsperada.add("Miercoles");
        listaEsperada.add("Jueves");
        listaEsperada.add("Viernes");
        listaEsperada.add("Sabado");
        listaEsperada.add("Domingo");
        assertEquals(sistemaATestear.devolverListaDiasDeLaSemana(), listaEsperada);
    }

    @Test
    public void TestEnumDevolverListaPaises() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaPaises = new ArrayList<>();
        listaPaises.add(Paises.Argentina.toString());
        listaPaises.add(Paises.Bolivia.toString());
        listaPaises.add(Paises.Brasil.toString());
        listaPaises.add(Paises.Chile.toString());
        listaPaises.add(Paises.Colombia.toString());
        listaPaises.add("Costa Rica");
        listaPaises.add(Paises.Cuba.toString());
        listaPaises.add(Paises.Ecuador.toString());
        listaPaises.add("El Salvador");
        listaPaises.add("Guayana Francesa");
        listaPaises.add(Paises.Granada.toString());
        listaPaises.add(Paises.Guatemala.toString());
        listaPaises.add(Paises.Guayana.toString());
        listaPaises.add(Paises.Haití.toString());
        listaPaises.add(Paises.Honduras.toString());
        listaPaises.add(Paises.Jamaica.toString());
        listaPaises.add(Paises.México.toString());
        listaPaises.add(Paises.Nicaragua.toString());
        listaPaises.add(Paises.Paraguay.toString());
        listaPaises.add(Paises.Panamá.toString());
        listaPaises.add(Paises.Perú.toString());
        listaPaises.add("Puerto Rico");
        listaPaises.add("República Dominicana");
        listaPaises.add(Paises.Surinam.toString());
        listaPaises.add(Paises.Uruguay.toString());
        listaPaises.add(Paises.Venezuela.toString());
        assertEquals(listaPaises, sistemaATestear.devolverListaPaises());
    }

    @Test
    public void testCrearProfesional() {
        Sistema sistemaATestear = new Sistema();
        assertTrue(sistemaATestear.crearProfesional("Prueba", "Apellido", "14/08/92", null, "Estudiante", "16/06/2020", "Uruguay"));
    }

    @Test
    public void testCrearAlimento() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<ComposicionAlimento> listaNutrientesConProporcion = new ArrayList();
        assertTrue(sistemaATestear.crearAlimento("Nombre", "Alimento", listaNutrientesConProporcion, null));

    }

    @Test
    public void testGetConversacion() {
        Sistema sistemaATestear = new Sistema();
        assertEquals("No hay conversación disponible.", sistemaATestear.getConversacion(null, null));
    }

    @Test
    public void testGetConversacion2() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaAlimentos = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Profesional profesional = new Profesional("Profesional", "Prueba", "14/08/1992", null, "Estudiante", "16/06/2020", "Uruguay");
        sistemaATestear.agregarProfesionalALaLista(profesional);
        sistemaATestear.agregarUsuarioALaLista(usuario);

        InformacionMensaje info = new InformacionMensaje("Profesional Prueba", "Usuario Prueba", "El mensaje");
        ArrayList<InformacionMensaje> listaInformacion = new ArrayList();
        listaInformacion.add(info);
        Conversacion conversacion = new Conversacion(usuario, profesional, listaInformacion);
        ArrayList<Conversacion> unaListaConversaciones = new ArrayList();
        unaListaConversaciones.add(conversacion);
        sistemaATestear.setListaConversaciones(unaListaConversaciones);
        String aux = sistemaATestear.getConversacion("Profesional Prueba", "Usuario Prueba");
        assertEquals("\nProfesional Prueba\nEl mensaje\n", aux);
    }

    @Test
    public void testGetConversacion3() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaAlimentos = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Profesional profesional = new Profesional("Profesional", "Prueba", "14/08/1992", null, "Estudiante", "16/06/2020", "Uruguay");
        sistemaATestear.agregarProfesionalALaLista(profesional);
        sistemaATestear.agregarUsuarioALaLista(usuario);

        InformacionMensaje info = new InformacionMensaje("Profesional Prueba", "Usuario Prueba", "El mensaje");
        ArrayList<InformacionMensaje> listaInformacion = new ArrayList();
        listaInformacion.add(info);
        Conversacion conversacion = new Conversacion(usuario, profesional, listaInformacion);
        ArrayList<Conversacion> unaListaConversaciones = new ArrayList();
        unaListaConversaciones.add(conversacion);
        sistemaATestear.setListaConversaciones(unaListaConversaciones);
        String aux = sistemaATestear.getConversacion("Profesional2 Prueba", "Usuario Prueba");
        assertEquals("No hay conversación disponible.", aux);
    }

    @Test
    public void testGetConversacion4() {
        Sistema sistemaATestear = new Sistema();
        ArrayList<String> listaPreferencias = new ArrayList();
        ArrayList<String> listaRestricciones = new ArrayList();
        ArrayList<Ingesta> listaAlimentos = new ArrayList();
        String preferencia = "Probando preferencia";
        listaPreferencias.add(preferencia);
        Usuario usuario = new Usuario("Usuario", "Prueba", "14/08/92", null, "Uruguayo", listaPreferencias, listaRestricciones, listaAlimentos);
        Profesional profesional = new Profesional("Profesional", "Prueba", "14/08/1992", null, "Estudiante", "16/06/2020", "Uruguay");
        sistemaATestear.agregarProfesionalALaLista(profesional);
        sistemaATestear.agregarUsuarioALaLista(usuario);

        InformacionMensaje info = new InformacionMensaje("Profesional Prueba", "Usuario Prueba", "El mensaje");
        ArrayList<InformacionMensaje> listaInformacion = new ArrayList();
        listaInformacion.add(info);
        Conversacion conversacion = new Conversacion(usuario, profesional, listaInformacion);
        ArrayList<Conversacion> unaListaConversaciones = new ArrayList();
        unaListaConversaciones.add(conversacion);
        sistemaATestear.setListaConversaciones(unaListaConversaciones);
        String aux = sistemaATestear.getConversacion("Profesional Prueba", "Usuario2 Prueba");
        assertEquals("No hay conversación disponible.", aux);
    }
}
