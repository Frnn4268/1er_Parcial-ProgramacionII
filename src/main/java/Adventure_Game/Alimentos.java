package Adventure_Game;

import java.util.Scanner;

public class Alimentos implements Objetos_Muebles{
    
    Scanner sc = new Scanner(System.in);

    @Override
    public void NombreOM() {
        System.out.println("Ingrese el nombre del alimento: ");
        String NombreP = sc.nextLine();
        System.out.println("El nombre del alimento es: " + NombreP);
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