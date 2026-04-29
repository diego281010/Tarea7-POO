package Ej1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> lista = new ArrayList<>();

        BecadoExcelencia b = new BecadoExcelencia();
        System.out.print("Código: ");
        b.setCodigo(sc.nextLine());
        System.out.print("Nombre: ");
        b.setNombre(sc.nextLine());
        System.out.print("Promedio: ");
        b.setPromedio(sc.nextDouble());
        System.out.print("Matrícula: ");
        b.setValorMatricula(sc.nextDouble());
        System.out.print("Beca (%): ");
        b.setPorcentajeBeca(sc.nextDouble());
        System.out.print("Bono excelencia: ");
        b.setBonoExcelencia(sc.nextDouble());

        lista.add(b);

        sc.nextLine();

        RegularConRecargo r = new RegularConRecargo();
        System.out.print("Código: ");
        r.setCodigo(sc.nextLine());
        System.out.print("Nombre: ");
        r.setNombre(sc.nextLine());
        System.out.print("Promedio: ");
        r.setPromedio(sc.nextDouble());
        System.out.print("Matrícula: ");
        r.setValorMatricula(sc.nextDouble());
        System.out.print("Número materias: ");
        r.setNumeroMaterias(sc.nextInt());
        System.out.print("Recargo: ");
        r.setRecargoPendiente(sc.nextDouble());

        lista.add(r);

        for (Estudiante e : lista) {
            e.mostrarDatos();
            System.out.println("Pago final: " + e.calcularPagoFinal());
            System.out.println("------------------------------------");
        }
    }
}
