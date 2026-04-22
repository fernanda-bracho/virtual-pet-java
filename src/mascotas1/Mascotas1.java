package mascotas1;

import java.util.Scanner;


public class Mascotas1 {
static boolean estado = true;       

   
     static void main(String[] args) {
        int controndas =1;
        int op;
        int a;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido al juego de mascotas hechos por ferxxoo");
        System.out.println("Que tipo de mascota quieres? \n1.Gato \n2.Perro \n3.Pajaro");
        a = teclado.nextInt();
        Mascota uno = eleccion(a);
        System.out.println("Para iniciar,como se llamara tu mascota?");
        uno.setnombre(teclado.next());
        System.out.println("Awwwwwww,me gusta mucho el nombre de " + uno.getnombre());
        uno.instrucciones();
        System.out.println("Este es el estado actual de " + uno.getnombre() + "\nTu mision es mantener vivo a tu mascota");
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
                    break;
                case 2:
                    uno.jugar();
                    break;
                case 3:
                    uno.dormir();
                    break;
                case 4:
                    uno.mostrar();
                     break;
                
            }

            uno.dificultad();
            uno.checarstatus();
        
        
       controndas++; 
    }
        System.out.println(uno.getnombre() + " Ha muerto");
}
    
    
   public static Mascota eleccion(int a){
        Mascota seleccionada = null;
        if (a == 1){
           seleccionada = new Gato();
            System.out.println("Genial, entonces sera un gato");
        } else if (a == 2) {
            seleccionada = new Perro();
            System.out.println("Genial, entonces sera un perro");
        } else if (a == 3) {
            seleccionada = new pajaro();

        }else return seleccionada;

       if (seleccionada instanceof naturaleza) {
           ((naturaleza) seleccionada).inicio();
       }

    return seleccionada;
   }



    public void evento(Mascota m) {
        double azar = Math.random();
        if (m instanceof jugueton && azar < 0.20) {
            ((jugueton) m).romper();
        }
        else if (m instanceof ruidoso && azar < 0.40) {
            System.out.println(m.getnombre() + " hizo mucho ruido y los vecinos se quejaron, lo tuviste que reganar y" + m.getnombre() + "");
        }


    }
    
    
    
}
