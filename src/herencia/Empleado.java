/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author nasry
 */
public class Empleado extends Persona {
    protected double salario;
    protected String idEmpleado;
    protected String fechaContratacion;
    protected String tipoContrato;
    protected String area;

    public Empleado(String nombre, int edad, int numid, String direccion, String numcontacto,
                    double salario, String idEmpleado, String fechaContratacion,
                    String tipoContrato, String area) {

        super(nombre, edad, numid, direccion, numcontacto);

        this.salario = salario;
        this.idEmpleado = idEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.tipoContrato = tipoContrato;
        this.area = area;
    }

    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }

    public double getSalario() {
        return salario;
    }
}
    

