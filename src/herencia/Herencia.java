/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nasry
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> lista = new ArrayList<>();

        int opcion;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Agregar Desarrollador");
            System.out.println("2. Agregar Gerente");
            System.out.println("3. Agregar Desarrollador Senior");
            System.out.println("4. Mostrar empleados trabajando");
            System.out.println("5. Mostrar salarios");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.println("\n--- Desarrollador ---");

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();

                    System.out.print("ID: ");
                    int numid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Direccion: ");
                    String direccion = sc.nextLine();

                    System.out.print("Telefono: ");
                    String telefono = sc.nextLine();

                    System.out.print("Salario: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("ID Empleado: ");
                    String idEmpleado = sc.nextLine();

                    System.out.print("Fecha Contratacion: ");
                    String fecha = sc.nextLine();

                    System.out.print("Tipo Contrato: ");
                    String tipo = sc.nextLine();

                    System.out.print("Area: ");
                    String area = sc.nextLine();

                    System.out.print("Lenguaje: ");
                    String lenguaje = sc.nextLine();

                    System.out.print("Nivel: ");
                    String nivel = sc.nextLine();

                    System.out.print("Herramientas: ");
                    String herramientas = sc.nextLine();

                    System.out.print("Proyectos: ");
                    int proyectos = sc.nextInt();

                    lista.add(new Desarrollador(
                            nombre, edad, numid, direccion, telefono,
                            salario, idEmpleado, fecha, tipo, area,
                            lenguaje, nivel, herramientas, proyectos));

                    break;

                case 2:
                    System.out.println("--- Gerente ---");

                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    edad = sc.nextInt();

                    System.out.print("ID: ");
                    numid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Direccion: ");
                    direccion = sc.nextLine();

                    System.out.print("Telefono: ");
                    telefono = sc.nextLine();

                    System.out.print("Salario: ");
                    salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("ID Empleado: ");
                    idEmpleado = sc.nextLine();

                    System.out.print("Fecha Contratacion: ");
                    fecha = sc.nextLine();

                    System.out.print("Tipo Contrato: ");
                    tipo = sc.nextLine();

                    System.out.print("Area: ");
                    area = sc.nextLine();

                    System.out.print("Departamento: ");
                    String departamento = sc.nextLine();

                    System.out.print("Personas a cargo: ");
                    int personas = sc.nextInt();

                    System.out.print("Presupuesto: ");
                    double presupuesto = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Frecuencia reuniones: ");
                    String frecuencia = sc.nextLine();

                    lista.add(new Gerente(
                            nombre, edad, numid, direccion, telefono,
                            salario, idEmpleado, fecha, tipo, area,
                            departamento, personas, presupuesto, frecuencia));

                    break;

                case 3:
                    System.out.println("--- Desarrollador Senior ---");

                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    edad = sc.nextInt();

                    System.out.print("ID: ");
                    numid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Direccion: ");
                    direccion = sc.nextLine();

                    System.out.print("Telefono: ");
                    telefono = sc.nextLine();

                    System.out.print("Salario: ");
                    salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("ID Empleado: ");
                    idEmpleado = sc.nextLine();

                    System.out.print("Fecha Contratacion: ");
                    fecha = sc.nextLine();

                    System.out.print("Tipo Contrato: ");
                    tipo = sc.nextLine();

                    System.out.print("Area: ");
                    area = sc.nextLine();

                    System.out.print("Lenguaje: ");
                    lenguaje = sc.nextLine();

                    System.out.print("Nivel: ");
                    nivel = sc.nextLine();

                    System.out.print("Herramientas: ");
                    herramientas = sc.nextLine();

                    System.out.print("Proyectos: ");
                    proyectos = sc.nextInt();

                    System.out.print("Años experiencia: ");
                    int anios = sc.nextInt();

                    System.out.print("Proyectos liderados: ");
                    int liderados = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Especializacion: ");
                    String especializacion = sc.nextLine();

                    System.out.print("Es mentor (true/false): ");
                    boolean mentor = sc.nextBoolean();

                    lista.add(new DesarrolladorSenior(
                            nombre, edad, numid, direccion, telefono,
                            salario, idEmpleado, fecha, tipo, area,
                            lenguaje, nivel, herramientas, proyectos,
                            anios, liderados, especializacion, mentor));

                    break;

                case 4:
                    System.out.println(" PRUEBA");
                    for (Empleado e : lista) {
                        e.trabajar(); 
                    }
    
                    break;

                case 5:
                    System.out.println(" SALARIOS");
                    for (Empleado e : lista) {
                        System.out.println(e.nombre + " gana: " + e.getSalario());
                    }
                    break;

            }

        } while (opcion != 0);
    }
}
    

