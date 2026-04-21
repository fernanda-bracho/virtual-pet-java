package mascotas1;

public class Gato extends Mascota {
    @Override
    public void especial(){
        System.out.println(getnombre() + "Te trajo un regalito");
        System.out.println(getnombre() + "Merece una galleta, Vas a darle la galleta? (Si/No)");
        getrespuesta();
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



}
