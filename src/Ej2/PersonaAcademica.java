package Ej2;

public class PersonaAcademica {
    protected String codigo;
    protected String nombre;
    protected int edad;

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isEmpty()) {
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void describirRol() {
        System.out.println("Persona académica.");
    }

    public double calcularPago() {
        return 0;
    }
}
