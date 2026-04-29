package Ej2;
import java.util.Scanner;

public class Main {
    void main() {
        Scanner sc = new Scanner(System.in);

        DocenteInvestigador d = new DocenteInvestigador();

        System.out.print("Código: ");
        d.setCodigo(sc.nextLine());

        System.out.print("Nombre: ");
        d.setNombre(sc.nextLine());

        System.out.print("Edad: ");
        d.setEdad(sc.nextInt());

        System.out.print("Horas clase: ");
        d.setHorasClase(sc.nextInt());

        System.out.print("Valor hora: ");
        d.setValorHora(sc.nextDouble());

        System.out.print("Publicaciones: ");
        d.setPublicaciones(sc.nextInt());;

        PersonaAcademica p = d;
        p.mostrarDatos();
        p.describirRol();

        System.out.println("Pago final: " + p.calcularPago());
        System.out.println("Pago con bono extra: " + d.calcularPago(50));
    }
}
