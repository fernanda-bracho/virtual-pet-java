package mascotas1;

import java.util.Scanner;

public class Gato extends Mascota implements calmado {
Scanner teclado = new Scanner(System.in);
    public Gato (){
        setenergia(5);
        setfelicidad(10);
        sethambre(10);
        setvivo(true);

    }


    @Override
    public void especial(){
        System.out.println(getnombre() + "Te trajo un regalito");
        System.out.println(getnombre() + "Merece una galleta, Vas a darle la galleta? (Si/No)");
        getrespuesta(teclado);
    }

    @Override
    public void dificultad(){
    int energia;
    energia = getenergia() -2;

    }

    @Override
    public void instrucciones(){
        System.out.println("Escogiste un gato como mascota, debes cuidar su felicidad para que no se escape, mucha suerte y cuida bien de " + getnombre());
    }
    public void inicio() {
        System.out.println("Miraaa!!");
        System.out.println("tu mascota es muy tranquila... ZZZZZZZZZZZZZZZZZZZZZ");
        System.out.println("Tu mascota es de naturaleza tranquila por lo que su energia es mas baja, necesita dormir mas ");
        setenergia(5);
        System.out.println("su energia es de: 5");
    }

    @Override
    public void efecto(){

    }


}
