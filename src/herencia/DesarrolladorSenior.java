/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author nasry
 */
public class DesarrolladorSenior extends Desarrollador {

    private int aniosExperiencia;
    private int proyectosLiderados;
    private String especializacion;
    private boolean mentor;

    public DesarrolladorSenior(String nombre, int edad, int numid, String direccion, String numcontacto,
                               double salario, String idEmpleado, String fechaContratacion,
                               String tipoContrato, String area,
                               String lenguaje, String nivel, String herramientas, int proyectos,
                               int aniosExperiencia, int proyectosLiderados,
                               String especializacion, boolean mentor) {

        super(nombre, edad, numid, direccion, numcontacto,
              salario, idEmpleado, fechaContratacion, tipoContrato, area,
              lenguaje, nivel, herramientas, proyectos);

        this.aniosExperiencia = aniosExperiencia;
        this.proyectosLiderados = proyectosLiderados;
        this.especializacion = especializacion;
        this.mentor = mentor;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " desarrolla y lidera proyectos.");
    }
}