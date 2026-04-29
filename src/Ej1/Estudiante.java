package Ej1;

import java.nio.file.FileAlreadyExistsException;

public  class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

//    protected Estudiante(String codigo, String nombre, double promedio, double valorMatricula) {
//        setCodigo(codigo);
//        setNombre(nombre);
//        setPromedio(promedio);
//        setValorMatricula(valorMatricula);
//    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            System.out.println("Código vacío.");
        } else {
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Nombre vacío.");
        } else {
            this.nombre = nombre;
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio fuera de rango.");
        }
    }

    public void setValorMatricula(double valorMatricula) {
        if (valorMatricula > 0) {
            this.valorMatricula = valorMatricula;
        } else {
            System.out.println("Valor fuera de rango.");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matrícula: " + valorMatricula);
    }

    public boolean validarPromedio() {
        return promedio >= 0 && promedio <= 10;
    }

    public double calcularPagoFinal() {
        return valorMatricula;
    }

    public double calcularPagoFInal(double descuentoExtra) {
        return calcularPagoFinal() - descuentoExtra;
    }
}
