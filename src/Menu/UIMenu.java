package Menu;


import Trabajadores.Investigador;

import static Menu.Registro.*;


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


                    break;

                case 4:
                    System.out.println("Numero cuatro");
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
