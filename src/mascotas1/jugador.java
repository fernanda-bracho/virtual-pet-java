package mascotas1;

public class jugador {
    private int paciencia;
    private int dinero;

    public jugador(){
        setDinero(100);
        setPaciencia(100);
    }

    public void setPaciencia(int paciencia) {
        this.paciencia = paciencia;
    }

    public int getPaciencia() {
        return paciencia;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }

    public void modificarDinero(int cantidad) {
        this.dinero += cantidad;
    }

    public void modificarPaciencia(int cantidad) {
        this.paciencia += cantidad;
    }

    public void trabajar(){
        System.out.println("Fuiste a trabajar duro...");
        System.out.println("¡Ganaste 50 pesos!");
        modificarDinero(50);
        modificarPaciencia(-5);
    }


    public void mostrar(){
        System.out.println("\nESTADISTICAS DEL JUGADOR");
        System.out.println("DINERO: $" + getDinero());
        System.out.println("NIVEL DE PACIENCIA: " + getPaciencia());
        System.out.println("----------------------------------\n");
    }

    public boolean checarstatus(){
        if (this.getPaciencia() <= 0){
            return false;
        }
        return true;
    }


}