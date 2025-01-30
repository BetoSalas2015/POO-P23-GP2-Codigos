public class EquipoFutbol {
    private String nombre;
    private String entrenador;
    private String equipo[];
    
    public EquipoFutbol(String nombre, String entrenador) {
        this.nombre = new String(nombre);
        this.entrenador = new String(entrenador);
        this.equipo = new String[11]; 
    }

    public static void main(String[] args) {
        EquipoFutbol pelusa = new EquipoFutbol("Los Mazacotes de Chicontepec", "Horacio Cascarin");
    }
}
