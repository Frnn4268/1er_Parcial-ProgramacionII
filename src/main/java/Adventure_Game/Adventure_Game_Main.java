package Adventure_Game;

import java.util.Scanner;

public class Adventure_Game_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int des;
        
        do {
            System.out.println("Bienvenido al Juego de Aventura");
            System.out.println("Elija una de las opciones:");
            System.out.println("1. Heroe");
            System.out.println("2. Enemigo");
            System.out.println("3. Objetos Muebles");
            System.out.println("4. Objetos Inmuebles"); 
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Heroe");
                    Heroe heroe = new Heroe();
                    heroe.Nivel_Energia();
                    heroe.Capacidad_Ofensiva();
                    heroe.X();
                    heroe.Y();
                    heroe.Numero_Vidas();
                    heroe.Agregar_Mochila();
                    break;

                case 2:
                    System.out.println("Enemigo");
                    Enemigo enemigo = new Enemigo();
                    enemigo.Nivel_Energia();
                    enemigo.Capacidad_Ofensiva();
                    enemigo.X();
                    enemigo.Y();
                    enemigo.Numero_Vidas();
                    break;

                case 3:
                    System.out.println("Objetos Muebles");
                    System.out.println("1. Armas");
                    System.out.println("2. Alimentos");
                    System.out.println("3. Proyectiles");
                    int op1 = sc.nextInt();
                    
                    switch (op1){
                        case 1:
                            System.out.println("Armas");
                            Armas armas = new Armas();
                            armas.NombreOM();
                            armas.Nivel_Energia();
                            armas.X();
                            armas.Y();
                            armas.Potenciador();
                            break;
                        
                        case 2:
                            System.out.println("Alimentos");
                            Alimentos alimento = new Alimentos();
                            alimento.NombreOM();
                            alimento.X();
                            alimento.Y();
                            break;
                            
                        case 3:
                            System.out.println("Proyectiles");
                            Proyectiles proyectil = new Proyectiles();
                            proyectil.NombreOM();
                            proyectil.X();
                            proyectil.Y();
                            break;
                            
                        default:
                            System.out.println("Bye");
                    }
                    
                    break;

                case 4:
                    System.out.println("Objetos Inmuebles");
                    System.out.println("1. Muros");
                    System.out.println("2. Torres");
                    System.out.println("3. Árboles");
                    int op2 = sc.nextInt();
                    
                    switch (op2){
                        case 1:
                            System.out.println("Muros");
                            Muros muro = new Muros();
                            muro.NombreOI();
                            muro.X();
                            muro.Y();
                            break;
                            
                        case 2:
                            System.out.println("Torres");
                            Torres torre = new Torres();
                            torre.NombreOI();
                            torre.X();
                            torre.Y();
                            break;
                            
                        case 3:
                            System.out.println("Árboles");
                            Arboles arbol = new Arboles();
                            arbol.NombreOI();
                            arbol.X();
                            arbol.Y();
                            break;
                        
                        default:
                            break;
                    }
                    break;

                default:
                    System.out.println("Bye");
            }

            System.out.println("1. Salir");
            System.out.println("2. Continuar");
            des = sc.nextInt();
        }while(des != 1);
    }
}