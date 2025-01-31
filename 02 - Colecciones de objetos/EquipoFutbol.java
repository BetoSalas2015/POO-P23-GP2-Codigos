public class EquipoFutbol {
    private String nombre;
    private String entrenador;
    private String equipo[];
    
    public EquipoFutbol(String nombre, String entrenador) {
        this.nombre = new String(nombre);
        this.entrenador = new String(entrenador);
        this.equipo = new String[11]; 
    }
    
    public String getNombre() {
        return new String(nombre);
    }
    
    public String getEntrenador() {
        return new String(entrenador); 
    }
    
    public void setEntrenador(String entrenador) {
        this.entrenador = new String(entrenador);
    }
    
    public void agregaJugador(int index, String jugador) {
        if( index >= 1 && index <= 11) {
            equipo[index - 1] = new String(jugador);
        }
    }
    
    public String getJugador(int index) {
        if((index >= 1 && index <= 11) && equipo[index -1] != null)
            return new String(equipo[index - 1]);
        else
            return null;
    }
    
    public static void main(String[] args) {
        EquipoFutbol miEquipo = new EquipoFutbol("Los Mazacotes de Chicontepec", "Horacio Cascarin");
        System.out.println(miEquipo.getNombre());
        System.out.println(miEquipo.getEntrenador());
        System.out.println(miEquipo.getJugador(3));
        miEquipo.agregaJugador(4, "El Jalapeño");
        System.out.println(miEquipo.getJugador(3));
        System.out.println(miEquipo.getJugador(4));
    }
}












