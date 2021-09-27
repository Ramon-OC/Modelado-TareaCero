package Trabajadores;

import Trabajadores.Trabajador;

public class Investigador extends Trabajador {
    String  facultad;
    char nivelProfesor,nivelSNI;

    public  Investigador(String nombre, String apellidoP, String apellidoM, String numTrabajador, String curp, String direccion, Double sueldo, int antiguedad, String correo, String facultad, char nivelProfesor, char nivelSNI){
        super(nombre, apellidoP, apellidoM, numTrabajador, curp, direccion, sueldo, antiguedad, correo);
        this.facultad = facultad;
        this.nivelProfesor = nivelProfesor;
        this.nivelSNI = nivelSNI;
    }



    public void imprimirInvestigador(){
        datosBasicos();
        System.out.println("Facultad: "+facultad);
        System.out.println("Nivel: "+nivelProfesor);
        System.out.println("sni: "+nivelSNI);
    }

}
