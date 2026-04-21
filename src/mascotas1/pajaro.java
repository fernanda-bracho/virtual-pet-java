package mascotas1;

public class pajaro extends Mascota{
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
    }


}
