package Ej1;

public class BecadoExcelencia extends EstudianteBecado{
    private double bonoExcelencia;

    public void setBonoExcelencia(double bonoExcelencia) {
        this.bonoExcelencia = bonoExcelencia;
    }

    @Override
    public double calcularPagoFinal() {
        double pago = super.calcularPagoFinal() - bonoExcelencia;
        return pago;
    }
}
