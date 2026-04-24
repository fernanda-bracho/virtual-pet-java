package mascotas1;

import java.util.Scanner;
//buffeado en energia nerfeado en hambre
//game over por energia
public class Perro extends Mascota implements jugueton{
    Scanner teclado = new Scanner(System.in);

    public Perro(){
         super();
         sethambre(8);
         setenergia(15);
         setfelicidad(10);
        setvivo(true);
        setPeligrovecinos(0);


    }




    @Override
    public void dificultad(){
        super.dificultad();
        sethambre(gethambre() - 1);
        setenergia(getenergia() - 1);
        System.out.println(getnombre() + " ha gastado energia extra jugando solo");

    }

    @Override
    public void instrucciones(){
        System.out.println("El tipo de mascota que escogiste es un perro, debes cuidar su alimentacion mucho para que no se enferme, ten mucho cuidado y suerte cuidando de " + getnombre());
    }

        @Override
     public void inicio() {
        System.out.println("Miraaa!!");
        System.out.println("tu mascota esta rebosando de energia!!!");
        System.out.println("Tu mascota es de naturaleza juguetona tiene mas energia de lo normal ");
        setenergia(15);
            System.out.println("su energia es de: 15 :) ");
    }

    @Override
    public void efecto(){

    }

    @Override
    public void romper(jugador j) {
        System.out.println(getnombre() + " quiere jugar contigo, te trajo una pelota. ¿Vas a jugar con él? (si/no)");
        String respuesta = getrespuesta(teclado);
        if (respuesta.equals("si")) {
            double probabilidad = Math.random();
            if (probabilidad <= 0.30) {
                System.out.println(getnombre() + " se emociono de mas y rompio un jarron de $50.¡Ups!");
                System.out.println("Tienes que reponerlo....");
                j.modificarDinero(-50);
                j.modificarPaciencia(-20);
                System.out.println("Tu paciencia ha bajado. Paciencia actual: " + j.getPaciencia());
                setfelicidad(getfelicidad() - 5);
            } else {
                System.out.println(getnombre() + " jugo un rato y todo sigue en su lugar. :)");
                setfelicidad(getfelicidad() + 10);
            }
        } else {
            System.out.println(getnombre() + " se ha quedado muy triste...");
            System.out.println(getnombre() + " ha perdido felicidad y energia.");
            setfelicidad(getfelicidad() - 5);
            setenergia(getenergia() - 5);
        }
    }

    @Override
    public void cuidado(int llamadasvecinos){
        double probabilidad = Math.random();
        if (probabilidad <= 0.30 && llamadasvecinos >= 2){
            System.out.println("--------------------------------------------------");
            System.out.println("¡TRAGEDIA! Tus vecinos han envenenado a " + getnombre());
            System.out.println("No pudiste cuidarlo de las quejas.");
            setvivo(false);
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println(getnombre() + " tuvo suerte, los vecinos solo gritaron un poco.");
        }
    }


    @Override
    public void gastarenergia(){
        double probabilidad = Math.random();
        System.out.println(getnombre() + "Te esta pidiendo un paseo...");
        System.out.println("Lo vas a llevar de paseo?(si/no)");
        String respuesta = getrespuesta(teclado);
        if (respuesta.equals("si")){
            if (probabilidad <= 0.30){
                System.out.println(getnombre() + "Ha ladrado a un niño a medio paseo...");
                System.out.println("Tus vecinos te han llamado la atencion... Ten cuidado");
                Mascotas1.llamadasvecinos++;
                setPeligrovecinos(getpeligrovecinos() + 1);
            }else System.out.println(getnombre() + " Se ha portado muy bien!!!!");
        }
    }


    @Override
    public void especial() { //ponerle detallado posterior con el sistema de objetos
        System.out.println(getnombre() + " ha hecho un truco!! Se ha sentado :)");
        System.out.println("¿Quieres darle una galleta? (si/no)");
        String respuesta = getrespuesta(teclado);
        if(respuesta.equals("si")) {
            System.out.println("¡" + getnombre() + " esta muy feliz con su galleta!");
            sethambre(gethambre() + 5);
        }
    }

}
