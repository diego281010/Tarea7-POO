package Ej2;

public class Docente extends PersonaAcademica{
    protected int horasClase;
    protected double valorHora;

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        if (horasClase >= 1 && horasClase <= 40) {
            this.horasClase = horasClase;
        }
    }

    public void setValorHora(double valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;
        }
    }

    @Override
    public double calcularPago() {
        return horasClase * valorHora;
    }

    @Override
    public void describirRol() {
        System.out.println("Docente.");
    }
}
