package mascotas1;

import java.util.Scanner;
// buffeado en felicidad pero nerfeado en energia
//game over por ser infeliz
public class Gato extends Mascota implements calmado {
Scanner teclado = new Scanner(System.in);
    public Gato (){
        setenergia(8);
        setfelicidad(15);
        sethambre(10);
        setvivo(true);
        setPeligrovecinos(0);
    }




    @Override
    public void instrucciones(){
        System.out.println("Escogiste un gato como mascota, debes cuidar su felicidad para que no se escape, mucha suerte y cuida bien de " + getnombre());
    }
    public void inicio() {
        System.out.println("Miraaa!!");
        System.out.println("tu mascota es muy tranquila... ZZZZZZZZZZZZZZZZZZZZZ");
        System.out.println("Tu mascota es de naturaleza tranquila por lo que su energia es mas baja, necesita dormir mas ");
        setenergia(8);
        System.out.println("su energia es de: 5");
    }

    @Override
    public void efecto(){

    }



    @Override
    public void especial(){
        System.out.println(getnombre() + " te trajo un regalito.");
        System.out.println("¿Quieres darle una galleta? (si/no)");
        String respuesta = getrespuesta(teclado);
        if(respuesta.equalsIgnoreCase("si")) {
            System.out.println(getnombre() + " ronronea feliz.");
            setfelicidad(getfelicidad() + 5);
        } else {
            System.out.println(getnombre() + " te mira con desprecio.");
            setfelicidad(getfelicidad() - 2);
        }
    }

    @Override
    public void dificultad(){
        super.dificultad();
        setfelicidad(getfelicidad() - 2);
        setenergia(getenergia() + 1);
        System.out.println(getnombre() + " está ignorandote... (Felicidad -2)");
    }

    @Override
    public void dormido(){
        System.out.println(getnombre() + " se ha quedado dormido en el jardin del vecino...");
        double probabilidad = Math.random();
        if (probabilidad <= 0.30) {
            System.out.println("¡Advertencia! Los vecinos devolvieron a " + getnombre() + " muy molestos.");
            Mascotas1.llamadasvecinos++;
            setPeligrovecinos(getpeligrovecinos() + 1);
        } else {
            System.out.println(getnombre() + " durmio tranquilo y volvio a casa solo.");
        }
    }

    @Override
    public void quedarsedormido(int llamadasvecinos){
        double probabilidad = Math.random();
        if (probabilidad <= 0.10 && llamadasvecinos >= 2){
            System.out.println("--------------------------------------------------");
            System.out.println("¡TRAGEDIA! Tus vecinos han envenenado a " + getnombre());
            System.out.println("No pudiste cuidarlo de las quejas.");
            setvivo(false);
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println(getnombre() + " tuvo suerte, los vecinos solo gritaron un poco.");
        }
    }

}

