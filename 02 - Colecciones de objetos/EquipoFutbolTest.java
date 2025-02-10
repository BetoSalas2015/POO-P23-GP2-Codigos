import static org.junit.Assert.*;
import org.junit.*;

public class EquipoFutbolTest {
    EquipoFutbol miEquipo;

    @Before
    public void setup() {
        EquipoFutbol miEquipo = new EquipoFutbol("Los Mazacotes de Chicontepec", "Horacio Cascarín");
    }
    
    @Test
    public void testCase01() {  
        EquipoFutbol miEquipo = new EquipoFutbol("Los Mazacotes de Chicontepec", "Horacio Cascarín");
        assertEquals("Los Mazacotes de Chicontepec", miEquipo.getNombre());
    }

    @Test
    public void testGetJugador() {
        EquipoFutbol miEquipo = new EquipoFutbol("Los Mazacotes de Chicontepec", "Horacio Cascarín");
        miEquipo.agregaJugador(4, "El Jalapeño");
        assertNull(miEquipo.getJugador(3));
        assertEquals("El Jalapeño", miEquipo.getJugador(4));
    }

    @After
    public void teardown() {

    }
}
