package Trabajadores;

public class PuestoAdministrativo extends Trabajador {
    String  lugarTrabajo, puesto, horario;

    public PuestoAdministrativo(String nombre, String apellidoP, String apellidoM, String numTrabajador, String curp, String direccion, Double sueldo, int antiguedad, String correo, String lugarTrabajo, String puesto, String horario){
        super(nombre, apellidoP, apellidoM, numTrabajador, curp, direccion, sueldo, antiguedad, correo);
        this.lugarTrabajo = lugarTrabajo;
        this.puesto = puesto;
        this.horario = horario;
    }

    public void imprimirAdministrativo(){
        muestraDatosBasicos();
        System.out.println(" - Lugar de Trabajo: "+lugarTrabajo);
        System.out.println(" - Puesto: "+puesto);
        System.out.println(" - Horario: "+horario);
    }

}
