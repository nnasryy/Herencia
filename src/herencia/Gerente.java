/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author nasry
 */
public class Gerente extends Empleado {

    protected String departamento;
    protected int personasACargo;
    protected double presupuesto;
    protected String frecuenciaReuniones;

    public Gerente(String nombre, int edad, int numid, String direccion, String numcontacto,
                   double salario, String idEmpleado, String fechaContratacion,
                   String tipoContrato, String area,
                   String departamento, int personasACargo,
                   double presupuesto, String frecuenciaReuniones) {

        super(nombre, edad, numid, direccion, numcontacto,
              salario, idEmpleado, fechaContratacion, tipoContrato, area);

        this.departamento = departamento;
        this.personasACargo = personasACargo;
        this.presupuesto = presupuesto;
        this.frecuenciaReuniones = frecuenciaReuniones;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está gestionando el equipo.");
    }
}