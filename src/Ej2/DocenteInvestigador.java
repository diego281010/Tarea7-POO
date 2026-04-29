package Ej2;

public class DocenteInvestigador extends Docente{
    private int publicaciones;

    public void setPublicaciones(int publicaciones) {
        if (publicaciones >= 0) {
            this.publicaciones = publicaciones;
        }
    }
    @Override
    public double calcularPago() {
        return super.calcularPago() + (publicaciones * 20);
    }

    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
    }

    @Override
    public void describirRol() {
        System.out.println("Docente investigador con producción académica.");
    }
}
