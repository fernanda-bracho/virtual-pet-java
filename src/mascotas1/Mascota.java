
package mascotas1;

import java.util.Scanner;

public abstract class Mascota {
    private String nombre;
    private int hambre;
    private int energia;
    private int felicidad;
    private boolean vivo;
    private int peligrovecinos;
    private boolean sucio = false;
   Scanner teclado = new Scanner(System.in);
     public void setnombre(String anombre){
        nombre = anombre;
    }    
    
    public String getnombre(){
        return nombre;
    }

    public void setPeligrovecinos(int num){
        peligrovecinos = num;
    }

    public int getpeligrovecinos(){
         return peligrovecinos;
    }

    public void setSucio(boolean flag){
        sucio = flag;
    }

    public boolean getsucio(){
        return sucio;
    }



    public void comer(){
      
           hambre+=5;
       felicidad+=2;  
       System.out.println(getnombre() + " ha ganado 2 puntos de felicidad <3");
        System.out.println(getnombre() +" tiene menos hambre");
        
      
        }
    
    public void sethambre(int acomer){
        hambre = acomer;
    }    
    
    public int gethambre(){
        return hambre;
    }
    
    public void dormir(){
        System.out.println("Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        energia+=5;
        int randomnum = (int) (Math.random() * 5);
        hambre+=randomnum;
        System.out.println(getnombre()+" ha ganado 5 puntos de energia");
        System.out.println(getnombre() +" tiene mas hambre");
    }
    
     public void setenergia(int adormir){
        energia = adormir;
    }    
    
    public int getenergia(){
        return energia;
    }
    
    
    
    public void jugar(){
        felicidad+=5;
        energia-=3;
        hambre-=5;
        System.out.println(getnombre() +" ha ganado 5 puntos de felicidad <3");
        System.out.println(getnombre() +" ha perdido 3 puntos de energia");
        System.out.println(getnombre() +" tiene mas hambre");
    }
    
     public void setfelicidad(int afelicidad){
        felicidad = afelicidad;
    }    
    
    public int getfelicidad(){
        return felicidad;
    }

    public void setvivo(boolean vida){
        vivo = vida;
    }

    public boolean getvivo(){
        return vivo;
    }
    
    public void mostrar(){
        System.out.println("La felicidad de " + nombre + " es de: " + felicidad); 
         System.out.println("El hambre de " + nombre + " es de: " + hambre); 
        System.out.println("La energia de " + nombre + " es de: " + energia);
        System.out.println("El nivel del enojo de tus vecinos es de: " + peligrovecinos);
        if (sucio){
            System.out.println("Olaf esta sucio!!!!");
            System.out.println("Mientras este sucio perdera 2 puntos de felicidad por ronda");
        }
    
}
    
    public boolean checarstatus(){
       if (hambre <= 0 || energia <= 0 || !vivo){
           return false;       
    }
           return true;
         
}
    
    public void dificultad(){
        if(getsucio()) {
            System.out.println(getnombre() + " apesta y se siente incomodo (-2 felicidad por suciedad).");
            setfelicidad(getfelicidad() - 2);
        }
        sethambre(gethambre() - 2);
        System.out.println("El hambre de " + getnombre() + " Ha aumentado en dos puntos");


    }


    abstract void instrucciones();
    abstract void especial();


    public String getrespuesta(Scanner teclado) {
        String respuesta = teclado.next().toLowerCase();

        while (!respuesta.equals("si") && !respuesta.equals("no")) {
            System.out.println("Respuesta invalida, ingrese de nuevo (si/no)");
            respuesta = teclado.next().toLowerCase();
        }
        return respuesta;
    }

    public void bano(){
        System.out.println("Ya has tenido a " + getnombre() + "por un buen tiempo :)");
        System.out.println("De tanto jugar " + getnombre() + " huele un poquito mal....(HUELE MUY MAL)");
        System.out.println("Quieres bañarlo?(si/no)");
        String respuesta = getrespuesta(teclado);
        if (respuesta.equals("si")){
            System.out.println("Fue muy divertidoooo banar a " + getnombre());
            System.out.println("su felicidad a aumentado :)");
            setfelicidad(getfelicidad()+5);
            System.out.println("Pero su energia a bajado");
            setenergia(getenergia() - 5);
            setSucio(false);
            mostrar();
        }else {
            System.out.println("No has querido bañar a " + getnombre());
            System.out.println("Ahora esta sucio!!!!!!");
            setSucio(true);
        }


    }



}
