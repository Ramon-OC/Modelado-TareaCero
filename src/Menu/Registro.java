package Menu;
import java.util.Scanner;

public class Registro {
    Scanner sc = new Scanner(System.in);
    public static void validacionDatosGenerales(String nombre, String apellidoP, String apellidoM, String numTrabajador, String curp, String direccón, Double sueldo, int antiguedad, String correo){
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte su nombre: ");
        nombre = sc.nextLine();
            nombre = nombre.replaceAll(" ","");
            String primeraLetra = nombre.substring(0, 1);
            String segundaLetra = nombre.substring(1, nombre.length());
            primeraLetra = primeraLetra.toUpperCase();
            nombre = primeraLetra + segundaLetra;
            System.out.println("El nombre registrado es: "+nombre+".");

       System.out.println("Inserte su apellido paterno: ");
       apellidoP = sc.nextLine();
            apellidoP = apellidoP.replaceAll(" ","");
            primeraLetra = apellidoP.substring(0, 1);
            segundaLetra = apellidoP.substring(1, apellidoP.length());
            primeraLetra = primeraLetra.toUpperCase();
            apellidoP = primeraLetra + segundaLetra;
            System.out.println("El apellido paterno registrado es: "+apellidoP+".");

       System.out.println("Inserte su apellido materno: ");
       apellidoM = sc.nextLine();
            apellidoM = apellidoM.replaceAll(" ","");
            primeraLetra = apellidoM.substring(0, 1);
            segundaLetra = apellidoM.substring(1, apellidoM.length());
            primeraLetra = primeraLetra.toUpperCase();
            apellidoM = primeraLetra + segundaLetra;
            System.out.println("El apellido materno registrado es: "+apellidoM+".");

       System.out.println("Inserte su numero de trabajador: "); // 8 digitos, no cambia... string
           do {
               numTrabajador = sc.nextLine();
           }while (numTrabajador.length()>8 && numTrabajador.length()<8);
           System.out.println("El numero de trabajador es: "+numTrabajador+" el largo es de: "+numTrabajador.length()+ " digitos");

        System.out.println("Inserte su CURP ");
        curp = sc.nextLine();






        System.out.println("Inserte un direccion: ");
        direccón = sc.nextLine();


        System.out.println("Inserte su sueldo: ");
        sueldo = sc.nextDouble();

        System.out.println("Inserte la antiguedad: ");
        antiguedad = sc.nextInt();

        System.out.println("Inserte su correo electronico");
        correo = sc.nextLine();
    }



    public static void validacionDatosInvestigador(String nombreM, String apellidoM, String apellidoMM, String numTrabajadorM, String curpM, String direccónM, Double sueldoM, int antiguedadM, String correoM, String facultadM, char nivelM, char sni){
        validacionDatosGenerales(nombreM, apellidoM, apellidoMM, numTrabajadorM, curpM, direccónM, sueldoM, antiguedadM, correoM);
        //Validar los datos propios de Investigador




    }

    public static void registroProfesor(String nombreM, String apellidoM, String apellidoMM, String numTrabajadorM, String curpM, String direccónM, Double sueldoM, int antiguedadM, String correoM){

    }

    public static void registroAyudante(String nombreM, String apellidoM, String apellidoMM, String numTrabajadorM, String curpM, String direccónM, Double sueldoM, int antiguedadM, String correoM){

    }

    public static void Administrativo(String nombreM, String apellidoM, String apellidoMM, String numTrabajadorM, String curpM, String direccónM, Double sueldoM, int antiguedadM, String correoM){

    }




}
