/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author nasry
 */
public class Desarrollador extends Empleado {
    protected String lenguaje;
    protected String nivel;
    protected String herramientas;
    protected int proyectos;

    public Desarrollador(String nombre, int edad, int numid, String direccion, String numcontacto,
                         double salario, String idEmpleado, String fechaContratacion,
                         String tipoContrato, String area,
                         String lenguaje, String nivel, String herramientas, int proyectos) {

        super(nombre, edad, numid, direccion, numcontacto,
              salario, idEmpleado, fechaContratacion, tipoContrato, area);

        this.lenguaje = lenguaje;
        this.nivel = nivel;
        this.herramientas = herramientas;
        this.proyectos = proyectos;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " programa en " + lenguaje);
    }
}