public class PuestoAdministrativo extends Trabajador{
    String  lugarTrabajo, puesto, horario;

    public PuestoAdministrativo(String nombre, String apellidoP, String apellidoM, String curp, String direccion, String correo, Double sueldo,Double numTrabajador,Double antiguedad, String lugarTrabajo, String puesto, String horario){
        super(nombre, apellidoP, apellidoM, curp, direccion, correo, sueldo, numTrabajador, antiguedad);
        this.lugarTrabajo = lugarTrabajo;
        this.puesto = puesto;
        this.horario = horario;
    }

    public void datosPuestoAdministrativo(){
        datosBasicos();
        System.out.println("Lugar de Trabajo: "+lugarTrabajo);
        System.out.println("Puesto: "+puesto);
        System.out.println("Horario: "+horario);
    }

}
