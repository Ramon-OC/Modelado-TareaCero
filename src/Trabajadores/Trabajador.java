package Trabajadores;

public class Trabajador {
    String nombre, apellidoP, apellidoM, numTrabajador, curp, direccion, correo;
    Double sueldo;
    int antiguedad;

    public Trabajador(String nombre, String apellidoP, String apellidoM, String numTrabajador, String curp, String direccion, Double sueldo, int antiguedad, String correo){
        this.nombre=nombre;
        this.apellidoP=apellidoP;
        this.apellidoM=apellidoM;
        this.numTrabajador=numTrabajador;
        this.curp=curp;
        this.direccion=direccion;
        this.sueldo=sueldo;
        this.antiguedad=antiguedad;
        this.correo=correo;
    }

    public void datosBasicos() {
        System.out.println("Aqui estan los datos de: " + nombre + " " + apellidoP + " " + apellidoM);
        System.out.println("CURP: " + curp);
        System.out.println("Direccion: " + direccion);
        System.out.println("Correo: " + correo);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Numero de trabajador: " + numTrabajador);
        System.out.println("Antiguedad: " + antiguedad);
    }

}
