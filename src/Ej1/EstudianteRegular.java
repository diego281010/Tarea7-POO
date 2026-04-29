package Ej1;

public class EstudianteRegular extends Estudiante{
    private int numeroMaterias;

    public void setNumeroMaterias(int numeroMaterias) {
        if (numeroMaterias > 0) {
            this.numeroMaterias = numeroMaterias;
        }
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() + (numeroMaterias * 10);
    }
}
