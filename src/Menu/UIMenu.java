package Menu;

import Trabajadores.Investigador;

import static Menu.Registro.*;
import static Menu.Registro.verificaSueldo;
import static Trabajadores.Investigador.*;

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
            System.out.println("3. Dar de baja a un trabajador, temporalmente muestra");
            System.out.println("4. Consultar cheques");
            System.out.println("5. Generar los pagos de la nomina");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:



                    break;
                case 2:

                    break;



                case 3:

                    String nombre = verificaNombre();
                    String apellidoP = verificarApellido(1);
                    String apellidoM = verificarApellido(0);
                    String numTrabajador = verificarNumero();
                    String curp = verificarCurp();
                    String direccion = verificarDireccion();
                    String correo = verificaCorreo();
                    Double sueldo = verificaSueldo();
                    int antiguedad = verificaAntiguedad();

                    System.out.println("El nombre es "+nombre);
                    System.out.println("El apellido paterno es "+apellidoP);
                    System.out.println("El apellido materno es "+apellidoM);
                    System.out.println("El numero de trabajador es "+numTrabajador);
                    System.out.println("El curp es "+curp);
                    System.out.println("Su direccion es "+direccion);
                    System.out.println("El correo es "+correo);
                    System.out.println("El sueldo es "+sueldo);
                    System.out.println("La antiguedad es "+antiguedad);





                    break;

                case 4:

                    Investigador ayuda = crearInvestigador();
                    ayuda.imprimirInvestigador();
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
