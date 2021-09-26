import javax.jws.soap.SOAPBinding;
public class Investigador extends Trabajador{
    String  facultad;
    char nivelProfesor,nivelSNI;

    public  Investigador(String nombre, String apellidoP, String apellidoM, String curp, String direccion, String correo, Double sueldo,Double numTrabajador,Double antiguedad, String facultad, char nivelProfesor, char nivelSNI){
        super(nombre, apellidoP, apellidoM, curp, direccion, correo, sueldo, numTrabajador, antiguedad);
        this.facultad = facultad;
        this.nivelProfesor = nivelProfesor;
        this.nivelSNI = nivelSNI;
    }

    public void datosInvestigador(){
        datosBasicos();
        System.out.println("Facultad: "+facultad);
        System.out.println("Nivel: "+nivelProfesor);
        System.out.println("sni: "+nivelSNI);
    }

}
