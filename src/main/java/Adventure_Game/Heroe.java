package Adventure_Game;

import java.util.Scanner;

public class Heroe extends Personaje_Objeto{
    
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void Nivel_Energia() {
        System.out.println("Ingrese el nivel de energía: ");
        int NivelEH = sc.nextInt();
        System.out.println("El nivel de energía del heroe es: " + NivelEH);
        System.out.println("");
    }

    @Override
    public void Numero_Vidas() {
        System.out.println("Ingrese el número de vidas: ");
        int NumeroVH = sc.nextInt();
        System.out.println("El número de vidas del heroe es: " + NumeroVH);
        System.out.println("");
    }

    @Override
    public void Capacidad_Ofensiva() {
        System.out.println("Ingrese la capacidad ofensiva: ");
        int CapacidadOH = sc.nextInt();
        System.out.println("La capacidad ofensiva del heroe es: " + CapacidadOH);
        System.out.println("");
    } 

    public void Agregar_Mochila() {
        System.out.println("¿Cuantos objetos desea agregar a la mochila?");
        System.out.println("1. Armas 2. Alimento 3. Proyectiles");
        int AgregarM = sc.nextInt();
        
        if(AgregarM == 1){
            System.out.println("Objetos agregados a la mochila: Armas");
        }if (AgregarM == 2){
            System.out.println("Objetos agregados a la mochila: Armas, Alimento");
        } else {
            System.out.println("Objetos agregados a la mochila: Armas, Alimento, Proyectiles");
        }
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