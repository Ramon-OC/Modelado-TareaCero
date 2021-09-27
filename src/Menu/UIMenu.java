package Menu;
import static Menu.Registro.*;
import Trabajadores.Investigador;

import java.util.LinkedList; // Lista enlasada
import java.util.Scanner;

public class UIMenu {
    public static void mostrarMenu(){

        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Buscar a un trabajador");
            System.out.println("2. Registrar un trabajador nuevo");
            System.out.println("3. Dar de baja a un trabajador");
            System.out.println("4. Consultar cheques");
            System.out.println("5. Generar los pagos de la nomina");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    String nombre = "", apellidoP = "", apellidoM = "", numTrabajador = "", curp = "", direccion = "", correo = "";
                    Double sueldo = 0.0;
                    int antiguedad = 0;

                    System.out.println("Cual es el puesto que quieres registrar?");
                    System.out.println("1. Trabajadores.Investigador");
                    System.out.println("2. Trabajadores.Profesor");
                    System.out.println("3. Trabajadores.Ayudante");
                    System.out.println("4. Puesto Administrativo");

                    // Queremos un investigador
                    String  facultad = "";
                    char nivelProfesor =' ',nivelSNI = ' ';
                    validacionDatosInvestigador(nombre, apellidoP,  apellidoM, numTrabajador, curp, direccion, sueldo, antiguedad,  correo,  facultad,  nivelProfesor,  nivelSNI);
                    Investigador prueba = new Investigador(nombre, apellidoP,  apellidoM, numTrabajador, curp, direccion, sueldo, antiguedad,  correo,  facultad,  nivelProfesor,  nivelSNI);





                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

}
