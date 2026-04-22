package mascotas1;

import java.util.Scanner;

public class Perro extends Mascota implements jugueton{
    Scanner teclado = new Scanner(System.in);

    public Perro(){
         super();
         sethambre(10);
         setenergia(10);
         setfelicidad(10);
        setvivo(true);

    }


@Override
    public void especial(){
    System.out.println(getnombre() + " Ha hecho un truco!!" + getnombre() + "El se ha sentado :)");
    System.out.println(getnombre() + "Merece una galleta, Vas a darle la galleta? (Si/No)");
    getrespuesta(teclado);
     }


    @Override
    public void dificultad(){
    int hambre;
       hambre= gethambre() - 2;
        System.out.println(getnombre()+ " Su hambre ha aumentado ");


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
    public void romper(){

        System.out.println(getnombre()+ "Quiere jugar contigo, te trajo una pelota, vas a jugar con el?(si/no)");
        getrespuesta(teclado);
        if (getrespuesta(teclado).equals("si")){
            double probabilidad = Math.random();
            if (probabilidad <= 0.30) {
                System.out.println(getnombre() + " se emocionO de mAs y rompio un jarron. ¡Ups!");
            } else {
                System.out.println(getnombre() + " jugo un rato y todo sigue en su lugar.");
            }
        }else System.out.println(getnombre() + " se ha quedado muy triste");
        System.out.println(getnombre()+ "Ha perdido felicidad");
        setenergia(getenergia()-5);
    }


}
