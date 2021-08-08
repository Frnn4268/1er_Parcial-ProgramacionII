package Adventure_Game;

import java.util.Scanner;

public class Enemigo extends Personaje_Objeto{

    Scanner sc = new Scanner(System.in);
     
    @Override
    public void Nivel_Energia() {
        System.out.println("Ingrese el nivel de energía: ");
        int NivelEE = sc.nextInt();
        System.out.println("El nivel de energía del enemigo es: " + NivelEE);
        System.out.println("");
    }

    @Override
    public void Numero_Vidas() {
        System.out.println("Ingrese el número de vidas: ");
        int NumeroVE = sc.nextInt();
        System.out.println("El número de vidas del enemigo es: " + NumeroVE);
        System.out.println("");
    }

    @Override
    public void Capacidad_Ofensiva() {
        System.out.println("Ingrese la capacidad ofensiva: ");
        int CapacidadOE = sc.nextInt();
        System.out.println("La capacidad ofensiva del enemigo es: " + CapacidadOE);
        System.out.println("");
    }

    @Override
    public void X() {
        System.out.println("Ingrese la coordenada X: ");
        int CapacidadOH = sc.nextInt();
        System.out.println("La coordenada X es: " + CapacidadOH);
        System.out.println("");
    }

    @Override
    public void Y() {
        System.out.println("Ingrese la coordenada Y: ");
        int CapacidadOH = sc.nextInt();
        System.out.println("La coordenada Y es: " + CapacidadOH);
        System.out.println("");
    }
}