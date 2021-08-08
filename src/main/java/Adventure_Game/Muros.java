package Adventure_Game;

import java.util.Scanner;

public class Muros implements Objetos_Inmuebles{

    Scanner sc = new Scanner(System.in);
    
    @Override
    public void NombreOI() {
        System.out.println("Ingrese el nombre del muro: ");
        String NombreM = sc.nextLine();
        System.out.println("El nombre del muro es: " + NombreM);
        System.out.println("");
    }

    @Override
    public void X() {
        System.out.println("Ingrese la coordenada X: ");
        int CoordenadaX = sc.nextInt();
        System.out.println("La coordenada X es: " + CoordenadaX);
        System.out.println("");
    }

    @Override
    public void Y() {
        System.out.println("Ingrese la coordenada Y: ");
        int CoordenadaY = sc.nextInt();
        System.out.println("La coordenada Y es: " + CoordenadaY);
        System.out.println("");
    }
}