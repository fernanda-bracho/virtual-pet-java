
package mascotas1;
//falta mejorar metodos y logica para cuando este en numeros negativos

public class Mascota {
    private String nombre;
    private int hambre;
    private int energia;
    private int felicidad;
   
     public void setnombre(String anombre){
        nombre = anombre;
    }    
    
    public String getnombre(){
        return nombre;
    }
    
    public void comer(){
      
           hambre+=5;
       felicidad+=2;  
       System.out.println("Pino ha ganado 2 puntos de felicidad <3");
        System.out.println("Pino tiene menos hambre");
        
      
        }
    
    public void sethambre(int acomer){
        hambre = acomer;
    }    
    
    public int gethambre(){
        return hambre;
    }
    
    public void dormir(){
        System.out.println("Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        energia+=5;
        int randomnum = (int) (Math.random() * 5);
        hambre+=randomnum;
        System.out.println("Pino ha ganado 5 puntos de energia");
        System.out.println("Pino tiene mas hambre");   
    }
    
     public void setenergia(int adormir){
        energia = adormir;
    }    
    
    public int getenergia(){
        return energia;
    }
    
    
    
    public void jugar(){
        felicidad+=5;
        energia-=3;
        hambre-=5;
        System.out.println("Pino ha ganado 5 puntos de felicidad <3");
        System.out.println("Pino ha perdido 3 puntos de energia");
        System.out.println("Pino tiene mas hambre");
    }
    
     public void setfelicidad(int afelicidad){
        felicidad = afelicidad;
    }    
    
    public int getfelicidad(){
        return felicidad;
    }
    
    public void mostrar(){
        System.out.println("La felicidad de " + nombre + " es de: " + felicidad); 
         System.out.println("El hambre de " + nombre + " es de: " + hambre); 
        System.out.println("La energia de " + nombre + " es de: " + energia); 
   
    
}
    
    public boolean checarstatus(){
       if (felicidad >= 100 || hambre <= 0 || energia <= 0){
           return false;       
    }
           return true;
         
}
    
    public void dificultad(){
     int randomnumpos = (int) (Math.random() * 2);
     int randomnumneg = (int) (Math.random() * 2);

    hambre=  hambre - randomnumpos;
    
    }
    

}
