public class Profesor extends Trabajador {
    String  facultad, clase, horario, titulo;
    char nivelProfesor;

    public Profesor(String nombre, String apellidoP, String apellidoM, String numTrabajador, String curp, String direccion, Double sueldo, int antiguedad, String correo, String  facultad, String clase, String horario, String titulo, char nivelProfesor){
        super(nombre, apellidoP, apellidoM, numTrabajador, curp, direccion, sueldo, antiguedad, correo);
        this.facultad = facultad;
        this.clase = clase;
        this.horario = horario;
        this.titulo = titulo;
        this.nivelProfesor = nivelProfesor;
    }

    public void datosProfesor(){
        datosBasicos();
        System.out.println("Facultad: "+facultad);
        System.out.println("Clase: "+clase);
        System.out.println("Horario: "+horario);
        System.out.println("Titulo: "+titulo);
        System.out.println("Nivel profesor: "+nivelProfesor);
    }



}
