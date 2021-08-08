package Adventure_Game;

public class Personaje {
    
    private int Nivel_Energia;
    private int Numero_Vidas;
    private int Capacidad_Ofensiva;
    private int X;
    private int Y;

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
    public int getNivel_Energia() {
        return Nivel_Energia;
    }

    public void setNivel_Energia(int Nivel_Energia) {
        this.Nivel_Energia = Nivel_Energia;
    }

    public int getNumero_Vidas() {
        return Numero_Vidas;
    }

    public void setNumero_Vidas(int Numero_Vidas) {
        this.Numero_Vidas = Numero_Vidas;
    }

    public int getCapacidad_Ofensiva() {
        return Capacidad_Ofensiva;
    }

    public void setCapacidad_Ofensiva(int Capacidad_Ofensiva) {
        this.Capacidad_Ofensiva = Capacidad_Ofensiva;
    }
}