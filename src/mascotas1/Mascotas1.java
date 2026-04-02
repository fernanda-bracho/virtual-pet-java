package mascotas1;

import java.util.Scanner;
public class Mascotas1 {
static boolean estado = true;       

   
    public static void main(String[] args) {
        int controndas =1;
        int op;
        Mascota uno = new Mascota();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido al juego de mascotas hechos por ferxxoo");
        System.out.println("Para iniciar,como se llamara tu mascota?");
        uno.setnombre(teclado.next());
        System.out.println("Awwwwwww,me gusta mucho el nombre de " + uno.getnombre());
        
        uno.setenergia(10);
        uno.setfelicidad(10);
        uno.sethambre(10);
        System.out.println("Este es el estado actual de " + uno.getnombre() + "Tu mision es mantener vivo a tu mascota");
        uno.mostrar();
        
        while(uno.checarstatus()){
            System.out.println("Estas en la ronda: "+ controndas);
            System.out.println("1.Alimentat a " + uno.getnombre());
            System.out.println("2.Jugar con " + uno.getnombre());
            System.out.println("3.Dormir con " + uno.getnombre());
            System.out.println("4.Mostrar estadisticas de " + uno.getnombre());

            op = teclado.nextInt();
            switch(op){
                case 1:
                    uno.comer();
                    uno.checarstatus();
                    uno.dificultad();
                    break;
                case 2:
                    uno.jugar();
                    uno.checarstatus();
                    uno.dificultad();

                    break;
                case 3:
                    uno.dormir();
                    uno.checarstatus();
                    uno.dificultad();
                    break;
                case 4:
                    uno.mostrar();
                    uno.dificultad();
                    uno.checarstatus();
                     break;
                
            }
        
        
       controndas++; 
    }
        System.out.println(uno.getnombre() + " Ha muerto");
}
    
    
    
    
    
    
}
