package Menu;

import Trabajadores.Ayudante;
import Trabajadores.Investigador;
import Trabajadores.Profesor;
import Trabajadores.PuestoAdministrativo;

import java.util.Scanner;

public class Registro {

    public static String verificaNombre() {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su nombre: ");
        nombre = sc.nextLine();
        nombre = nombre.replaceAll(" ", "");
        String primeraLetra = nombre.substring(0, 1);
        String segundaLetra = nombre.substring(1, nombre.length());
        primeraLetra = primeraLetra.toUpperCase();
        nombre = primeraLetra + segundaLetra;
        return nombre;
    }

    public static String verificarApellido(int i) {
        String apellido;
        Scanner sc = new Scanner(System.in);
        if (i == 1) {
            System.out.print("Inserte su apellido paterno: ");
        } else {
            System.out.print("Inserte su apellido materno: ");
        }
        System.out.print("Inserte su Apellido: ");
        apellido = sc.nextLine();
        apellido = apellido.replaceAll(" ", "");
        String primeraLetra = apellido.substring(0, 1);
        String segundaLetra = apellido.substring(1, apellido.length());
        primeraLetra = primeraLetra.toUpperCase();
        apellido = primeraLetra + segundaLetra;
        return apellido;
    }

    public static String verificarNumero() {
        String numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su numero de trabajador: "); // 8 digitos, no cambia... string
        do {
            numero = sc.nextLine();
        } while (numero.length() > 8 && numero.length() < 8);
        return numero;
    }

    public static String verificarCurp() {
        String curp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su curp: "); // 8 digitos, no cambia... string
        curp = sc.nextLine();
        return curp;
    }

    public static String verificaCurpDos(){
        boolean registroExitoso = false;
        String curp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba su CURP: ");


        do{
            try{
                curp = sc.nextLine();
                curp.toUpperCase();
            }catch(Exception e){
                System.out.println("	- No es una opción valida, intenta nuevamente");
                System.out.print("Mensaje de error con la primera e: ");
                curp = sc.nextLine();
            }

            if(curp.length() != 16) {
                System.out.println("El largo de tu cadena es de: " + curp.length());
                System.out.println("Mensaje error de largo, escribe 16:");
                registroExitoso = false;
            }else{
                registroExitoso = true;
            }

        }while(registroExitoso==false);


        return curp;




    }

    public static String verificarDireccion() {
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

        for (char i = 0; i < longitud; i++) {
            valor = correo.charAt(i);

            if (valor == '@' && i == 0) {
                System.out.println("El correo esta mal");
                esValido = false;
                break;
            }
            if (valor == '@') {
                System.out.println("Escribistes perfectamente el correo");
                esValido = true;
                break;
            } else if (i == longitud - 1) {
                System.out.println("El correo esta mal");
                break;

            }


        }

        return correo;
    }

    public static String verificarClase(){
        String horario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su clase: ");
        horario = sc.nextLine();
        return horario;
    }

    public static String verificarTitulo(){
        String título;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su título: ");
        título = sc.nextLine();
        return título;
    }

    public static String verificarHorario(){
        String horario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su horario: ");
        horario = sc.nextLine();
        return horario;
    }

    public static String verificarFacultad() {
        String facultad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su facultad: ");
        facultad = sc.nextLine();
        return facultad;

    }

    public static String verificarLuegarTrabajo(){
        String lugarTrabajo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su lugar de trabajo: ");
        lugarTrabajo = sc.nextLine();
        return lugarTrabajo;
    }

    public static String verificarPuesto(){
        String puesto;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su puesto: ");
        puesto = sc.nextLine();
        return puesto;
    }

    public static Double verificaSueldo() {
        double sueldo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su sueldo: ");
        sueldo = sc.nextDouble();
        return sueldo;
    }

    public static Double verificarPorcentaje() {
        double numCreditos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su porcentaje de creditos: ");
        numCreditos = sc.nextDouble();
        return numCreditos;
    }

    public static boolean verificarPasante(){
        boolean esPasante = false;
        return esPasante;
    }

    public static int verificaAntiguedad() {
        int antiguedad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su antiguedad: ");
        antiguedad = sc.nextInt();
        return antiguedad;
    }

    public static char verificarNivelProfesor() {
        char nivelProfesor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su nivel de profesor: ");
        nivelProfesor = sc.next().charAt(0);
        return nivelProfesor;
    }

    public static char verificarNivelSNI() {
        char nivelSNI;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su nivel de sni: ");
        nivelSNI = sc.next().charAt(0);
        return nivelSNI;
    }

    public static char verificarNivelAyudante(){
        char nivelAyudante;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su nivel de ayudante (a o b): ");
        nivelAyudante = sc.next().charAt(0);
        return nivelAyudante;

    }


    public static String[] agregarStringsBasicos(String nombre, String apellidoP, String apellidoM, String numTrabajador, String curp, String direccion, String correo) {
        String[] temporal = new String[10];
        temporal[0] = verificaNombre();
        temporal[1] = verificarApellido(1);
        temporal[2] = verificarApellido(0);
        temporal[3] = verificarNumero();
        temporal[4] = verificarCurp();
        temporal[5] = verificarDireccion();
        temporal[6] = verificaCorreo();
        return temporal;
    }

        public static Investigador crearInvestigador (){
            String nombre = "",apellidoP = "",apellidoM = "",numTrabajador = "",curp = "",direccion = "",correo = "";
            String[] temporal = agregarStringsBasicos(nombre, apellidoP, apellidoM, numTrabajador, curp, direccion, correo);
            Double sueldo = verificaSueldo();
            int antiguedad = verificaAntiguedad();
            String facultad = verificarFacultad();
            char nivelProfesor = verificarNivelProfesor();
            char nivelSNI = verificarNivelSNI();
            Investigador investigadorTemporal = new Investigador(temporal[0],temporal[1],temporal[2],temporal[3],temporal[4],temporal[5],sueldo,antiguedad,temporal[6],facultad, nivelProfesor,nivelSNI);
            return investigadorTemporal;
        }

        public static Profesor crearProfesor(){
            String nombre = "",apellidoP = "",apellidoM = "",numTrabajador = "",curp = "",direccion = "",correo = "";
            String[] temporal = agregarStringsBasicos(nombre, apellidoP, apellidoM, numTrabajador, curp, direccion, correo);
            Double sueldo = verificaSueldo();
            int antiguedad = verificaAntiguedad();
            // Propios de profesor
            String facultad = verificarFacultad();
            String clase = verificarClase();
            String horario = verificarHorario();
            char nivelProfesor = verificarNivelProfesor();
            String titulo = verificarTitulo();
            Profesor profesorTemporal = new Profesor(temporal[0],temporal[1],temporal[2],temporal[3],temporal[4],temporal[5],sueldo,antiguedad,temporal[6],facultad,clase,horario,nivelProfesor,titulo);
            return profesorTemporal;
        }

        public static Ayudante crearAyudante(){
            String nombre = "",apellidoP = "",apellidoM = "",numTrabajador = "",curp = "",direccion = "",correo = "";
            String[] temporal = agregarStringsBasicos(nombre, apellidoP, apellidoM, numTrabajador, curp, direccion, correo);
            Double sueldo = verificaSueldo();
            int antiguedad = verificaAntiguedad();
            // Propios de adjunto
            String facultad = verificarFacultad();
            Double porcentajeDeCreditos = verificarPorcentaje();
            char nivelAyudante = verificarNivelAyudante();
            boolean esPasante = verificarPasante();
            String clase = verificarClase();
            String horario = verificarHorario();

            Ayudante ayudanteTemporal = new Ayudante(temporal[0],temporal[1],temporal[2],temporal[3],temporal[4],temporal[5],sueldo,antiguedad,temporal[6],facultad,porcentajeDeCreditos,nivelAyudante,esPasante,clase,horario);
            return ayudanteTemporal;
        }

        public static PuestoAdministrativo crearAdministrativo(){
            String nombre = "",apellidoP = "",apellidoM = "",numTrabajador = "",curp = "",direccion = "",correo = "";
            String[] temporal = agregarStringsBasicos(nombre, apellidoP, apellidoM, numTrabajador, curp, direccion, correo);
            Double sueldo = verificaSueldo();
            int antiguedad = verificaAntiguedad();
            // Propios de Administrativo
            String lugarDeTrabajo = verificarLuegarTrabajo();
            String puesto = verificarPuesto();
            String horario = verificarHorario();

            PuestoAdministrativo administrativoTemporal = new PuestoAdministrativo(temporal[0],temporal[1],temporal[2],temporal[3],temporal[4],temporal[5],sueldo,antiguedad,temporal[6],lugarDeTrabajo,puesto,horario);
            return administrativoTemporal;
        }


}
