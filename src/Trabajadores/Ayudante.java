package Trabajadores;


public class Ayudante extends Trabajador {
    String facultad, clase,horario;
    double porcentajeCreditos;
    char nivelAyudante;
    boolean esPasante; // si es falso es titulado

    public Ayudante(String nombre, String apellidoP, String apellidoM, String numTrabajador, String curp, String direccion, Double sueldo, int antiguedad, String correo, String  facultad, String clase, String horario, Double porcentajeCreditos, char nivelAyudante, boolean esPasante){
        super(nombre, apellidoP, apellidoM, numTrabajador, curp, direccion, sueldo, antiguedad, correo);
        this.facultad = facultad;
        this.clase = clase;
        this.horario = horario;
        this.porcentajeCreditos = porcentajeCreditos;
        this.nivelAyudante = nivelAyudante;
        this.esPasante = esPasante;
    }

    public void datosProfesor(){
        muestraDatosBasicos();
        System.out.println("Facultad: "+facultad);
        System.out.println("Clase: "+clase);
        System.out.println("Horario: "+horario);
        System.out.println("Porcentaje de creidtos: "+porcentajeCreditos);
        System.out.println("Nivel de ayudante: "+nivelAyudante);
        System.out.println("Es pasante: "+esPasante);
    }

}
