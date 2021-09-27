package Trabajadores;


public class Ayudante extends Trabajador {
    String facultad, clase,horario;
    double porcentajeCreditos;
    char nivelAyudante;
    boolean esPasante; // si es falso es titulado

    public Ayudante(String nombre, String apellidoP, String apellidoM, String numTrabajador, String curp, String direccion, Double sueldo, int antiguedad, String correo, String facultad, Double porcentajeCreditos, char nivelAyudante, boolean esPasante, String clase, String horario){
        super(nombre, apellidoP, apellidoM, numTrabajador, curp, direccion, sueldo, antiguedad, correo);
        this.facultad = facultad;
        this.porcentajeCreditos = porcentajeCreditos;
        this.nivelAyudante = nivelAyudante;
        this.esPasante = esPasante;
        this.clase = clase;
        this.horario = horario;

    }

    public void imprimirAyudante(){
        muestraDatosBasicos();
        System.out.println(" - Facultad: "+facultad);
        System.out.println(" - Clase: "+clase);
        System.out.println(" - Horario: "+horario);
        System.out.println(" - Porcentaje de creidtos: "+porcentajeCreditos);
        System.out.println(" - Nivel de ayudante: "+nivelAyudante);
        System.out.println(" - Es pasante: "+esPasante);
    }

}
