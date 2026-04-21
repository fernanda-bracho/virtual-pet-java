package mascotas1;

public class Perro extends Mascota implements jugueton{

@Override
    public void especial(){
    System.out.println(getnombre() + " Ha hecho un truco!!" + getnombre() + "El se ha sentado :)");
    System.out.println(getnombre() + "Merece una galleta, Vas a darle la galleta? (Si/No)");
    getrespuesta();
     }


    @Override
    public void dificultad(){
    int hambre;
       hambre= gethambre() - 2;



    }

    @Override
    public void instrucciones(){
        System.out.println("El tipo de mascota que escogiste es un perro, debes cuidar su alimentacion mucho para que no se enferme, ten mucho cuidado y suerte cuidando de " + getnombre());
    }

}
