package Ej1;

public class EstudianteBecado extends Estudiante{
    private double porcentajeBeca;

//    public EstudianteBecado(String codigo, String nombre, double promedio, double valorMatricula) {
//        super(codigo, nombre, promedio, valorMatricula);
//    }

    public void setPorcentajeBeca(double porcentajeBeca) {
        if (porcentajeBeca >= 0 && porcentajeBeca <= 100) {
            this.porcentajeBeca = porcentajeBeca;
        }
    }

    @Override
    public double calcularPagoFinal() {
        double descuento = getValorMatricula() * (porcentajeBeca / 100);
        return getValorMatricula() - descuento;
    }
}
