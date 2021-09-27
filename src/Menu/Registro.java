package Menu;

import Trabajadores.Investigador;
import Trabajadores.Profesor;

import java.util.Scanner;

public class Registro {


    public static String verificaNombre(){
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su nombre: ");
        nombre = sc.nextLine();
        nombre = nombre.replaceAll(" ","");
        String primeraLetra = nombre.substring(0, 1);
        String segundaLetra = nombre.substring(1, nombre.length());
        primeraLetra = primeraLetra.toUpperCase();
        nombre = primeraLetra + segundaLetra;
        return nombre;
    }

    public static String verificarApellido(int i){
        String apellido;
        Scanner sc = new Scanner(System.in);
        if(i==1){
            System.out.print("Inserte su apellido paterno: ");
        }else{
            System.out.print("Inserte su apellido materno: ");
        }
        System.out.print("Inserte su Apellido: ");
        apellido = sc.nextLine();
        apellido = apellido.replaceAll(" ","");
        String primeraLetra = apellido.substring(0, 1);
        String segundaLetra = apellido.substring(1, apellido.length());
        primeraLetra = primeraLetra.toUpperCase();
        apellido = primeraLetra + segundaLetra;
        return apellido;
    }

    public static String verificarNumero(){
        String numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su numero de trabajador: "); // 8 digitos, no cambia... string
        do {
            numero = sc.nextLine();
        }while (numero.length()>8 && numero.length()<8);
        return numero;
    }

    public static String verificarCurp(){
        String curp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su curp: "); // 8 digitos, no cambia... string
        curp = sc.nextLine();
        return curp;
    }

    public static String verificarDireccion(){
        String direccion;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su direccion: "); // 8 digitos, no cambia... string
        direccion = sc.nextLine();
        return direccion;
    }

    public static String verificaCorreo() {
        String correo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su correo elctronico: ");
        correo = sc.nextLine();

        int longitud = correo.length();
        char valor;
        boolean esValido = false;

        for(char i = 0; i < longitud; i++) {
            valor = correo.charAt(i);

            if(valor == '@' && i == 0){
                System.out.println("El correo esta mal");
                esValido = false;
                break;
            }
            if(valor == '@'){
                System.out.println("Escribistes perfectamente el correo");
                esValido = true;
                break;
            }
                    else if(i == longitud-1){
                        System.out.println("El correo esta mal");
                        break;

                    }


                }

        return correo;
    }

    public static Double verificaSueldo(){
        double sueldo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su sueldo: ");
        sueldo = sc.nextDouble();
        return sueldo;
    }

    public static int verificaAntiguedad(){
        int antiguedad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su antiguedad: ");
        antiguedad = sc.nextInt();
        return antiguedad;
    }

    public static String verificarFacultad(){
        String facultad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su facultad: ");
        facultad = sc.nextLine();
        return facultad;

    }

    public static char verificarNivelProfesor(){
        char nivelProfesor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su nivel de profesor: ");
        nivelProfesor = sc.next().charAt(0);
        return nivelProfesor;
    }

    public static char verificarNivelSNI(){
        char nivelSNI;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su nivel de sni: ");
        nivelSNI = sc.next().charAt(0);
        return nivelSNI;
    }


    public static Investigador crearInvestigador(){
        // Basicos
        String nombre = verificaNombre();
        String apellidoP = verificarApellido(1);
        String apellidoM = verificarApellido(0);
        String numTrabajador = verificarNumero();
        String curp = verificarCurp();
        String direccion = verificarDireccion();
        Double sueldo = verificaSueldo();
        int antiguedad = verificaAntiguedad();
        String correo = verificaCorreo();

        // Investigador
        String facultad = verificarFacultad();

        char nivelProfesor = verificarNivelProfesor();
        char nivelSNI = verificarNivelSNI();


        Investigador investigadorFalso = new Investigador(nombre,apellidoP,apellidoM,numTrabajador,curp,direccion,sueldo,antiguedad,correo,facultad, nivelProfesor,nivelSNI);

        return investigadorFalso;

    }


}
