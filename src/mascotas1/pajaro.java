package mascotas1;

import java.util.Scanner;

public class pajaro extends Mascota implements ruidoso{
Scanner teclado = new Scanner(System.in);
    public pajaro(){
        setenergia(10);
        setfelicidad(10);
        sethambre(5);
        setvivo(true);
    }


    @Override
    public void especial(){
        System.out.println(getnombre() + "Esta cantando <3");

    }

    @Override
    public void dificultad(){
        int felicidad;
        felicidad = getfelicidad() -2;

    }

    @Override
    public void instrucciones(){
        System.out.println("Escogiste un pajarito como mascota, debes cuidar su energia para que no se ponga triste, mucha suerte y cuida bien de " + getnombre());
    } public void inicio() {
        System.out.println("Miraaa!!");
        System.out.println("tu mascota es muy ruidosa!!!");
        System.out.println("Tu mascota es ruidosa por lo que siempre esta hambrienta ");
        setenergia(15);
        System.out.println("su hambre es de solo 5 :(");
    }

    @Override
    public void efecto(){

    }

    @Override
    public void grito(){
        int llamadasvecinos = 0;
        System.out.println(getnombre()+ " HA ESTADO GRITANDO Y HACIENDO MUCHO RUIDOOO");
            double probabilidad = Math.random();
            if (probabilidad <= 0.30) { // 30% de probabilidad
                System.out.println(getnombre() + " Los vecinos llamaron a tu puerta, te lanzaron una advertencia, ten cuidado...");
                llamadasvecinos++;
            } else {
                System.out.println(getnombre() + " se calmo ");
            }
        }

        @Override
    public void gritoevento(int llamadasvecinos ){
        double probabilidad = Math.random();
        if (probabilidad <= 0.10 && llamadasvecinos >= 2  ){
            System.out.println("TUS VECINOS HAN LLAMADO A LA GUARDIA ANIMAL Y TE HAN QUITADO A TU QUERIDO" + getnombre());
            setvivo(false);
        }else System.out.println("Solo ha sido un enojo... ya se les pasasra");
    }

    }

