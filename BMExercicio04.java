public class BMExercicio04 {
    

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
