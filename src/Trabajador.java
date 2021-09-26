public class Trabajador {
    String nombre, apellidoP, apellidoM, curp, direccion, correo;
    Double sueldo, numTrabajador, antiguedad;

    public Trabajador(String nombre, String apellidoP, String apellidoM, String curp, String direccion, String correo, Double sueldo,Double numTrabajador,Double antiguedad){
        this.nombre=nombre;
        this.apellidoP=apellidoP;
        this.apellidoM=apellidoM;
        this.curp=curp;
        this.direccion=direccion;
        this.correo=correo;
        this.sueldo=sueldo;
        this.numTrabajador=numTrabajador;
        this.antiguedad=antiguedad;
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
