import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Persona p1;
    static Persona p2;
    static ArrayList<Persona> personas = new ArrayList<>();
    static ArrayList<Persona> listDosMenores = new ArrayList<>();
    static int n = 3;
    static double promedio = 0;
    static double promedi = 0;
    static Scanner scanner = new Scanner(System.in);

    static Persona mayor(){
        p1 = personas.get(0);
        for(int i = 1; i < personas.size(); i++){
            if(personas.get(i).edad() > p1.edad()){
                p1 = personas.get(i);
            }
        }
        return p1;
    }

    static ArrayList<Persona> menor(){
        ArrayList<Persona> temporal; //= new ArrayList<>();
        temporal = personas;
        p1 = temporal.get(0);
        for(int i = 1; i < temporal.size(); i++){
            if(temporal.get(i).edad() < p1.edad()){
                p1 = temporal.get(i);
            }
        }
        temporal.remove(p1);

        p2 = temporal.get(0);
        for(int i = 1; i < temporal.size(); i++){
            if(temporal.get(i).edad() < p2.edad()){
                p2 = temporal.get(i);
            }
        }
        listDosMenores.add(p1);
        listDosMenores.add(p2);

        return listDosMenores;
    }

    static double promedio(){
        for (int i = 0; i < personas.size(); i++){
            p1 = personas.get(i);
            promedi += p1.edad();
        }
        promedio = promedi / personas.size();
        return promedio;
    }

    public static void main(String[] args){
        String inputNombre = "";
        String inputFecha = "";
        Scanner inputEscaner = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Nombre?: ");
            inputNombre = inputEscaner.nextLine();
            System.out.print("Fecha de nacimiento?: ");
            inputFecha = inputEscaner.nextLine();
            p1 = new Persona(inputNombre,inputFecha);
            personas.add(p1);
        }

        p1 = mayor();
        System.out.println("La persona mayor es " + p1.nombre + " y tiene: " + p1.edad() + " años.");
        listDosMenores = menor();
        System.out.println("Los dos menores son " + p1.nombre + " y " + p2.nombre + ", y tienen " + p1.edad() + " y " + p2.edad() + " años.");
        promedio = promedio();
        System.out.print("Promedio de edad: " + promedio);

    }
}