public class Usuario {
//propiedades del objeto
     String nombre;
     String apellidos;
     int edad;
     int fechadenacimiento;

    //Metodo constructor
    public Usuario(String nombre,String apellidos,int edad,int fechadenacimiento){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechadenacimiento = fechadenacimiento;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("apellidos " + apellidos);
        System.out.println("edad " + edad);
        System.out.println("Fecha de Nacimiento " + fechadenacimiento);
        
    }
}