package Adventure_Game;

import java.util.Scanner;

public class Armas implements Objetos_Muebles{
    
    Scanner sc = new Scanner(System.in);
    
    public void Nivel_Energia() {
        System.out.println("Ingrese el nivel de energia del arma: ");
        int NivelEA = sc.nextInt();
        System.out.println("El nivel de energía del arma es: " + NivelEA);
        System.out.println("");
    }

    @Override
    public void NombreOM() {
        System.out.println("Ingrese el nombre del arma: ");
        String NombreA = sc.nextLine();
        System.out.println("El nombre del arma es: " + NombreA);
        System.out.println("");
    }
    
    public void Potenciador(){
        System.out.println("Ingrese el nivel de potencia de : ");
        int PotenciadorA = sc.nextInt();
        System.out.println("El nivel de potencia es de: " + PotenciadorA);
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