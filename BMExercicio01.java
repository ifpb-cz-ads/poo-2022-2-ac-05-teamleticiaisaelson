public class BMExercicio01 {

    private String EstadoLampada = "Desligada";

    public void acender() {
        EstadoLampada = "Ligada";
    }

    public void apagar() {
        EstadoLampada = "Desligada";
    }

    public String mostrarEstado() {
        return EstadoLampada;
    }

}
