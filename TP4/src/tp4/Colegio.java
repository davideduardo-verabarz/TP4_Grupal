package tp4;

public class Colegio {

    public static void main(String[] args) {
        Materia Web2 = new Materia(1, "Web 2", 2);
        Materia Mate = new Materia(2, "Matematicas", 1);
        Materia Lab = new Materia(3, "Laboratorio 1", 1);
        
        Alumno alumno1 = new Alumno(1001, "Lopez", "Martin");
        Alumno alumno2 = new Alumno(1002, "Martinez", "Brenda");
        
        alumno1.agregarMateria(Lab);
        alumno1.agregarMateria(Web2);
        alumno1.agregarMateria(Mate);
        alumno2.agregarMateria(Lab);
        alumno2.agregarMateria(Mate);
        alumno2.agregarMateria(Web2);
        alumno2.agregarMateria(Lab);
        
        System.out.println(alumno1.cantidadMaterias());
        System.out.println(alumno2.cantidadMaterias());
        
    }
}

