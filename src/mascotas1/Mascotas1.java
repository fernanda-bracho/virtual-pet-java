package mascotas1;

import java.util.Scanner;


public class Mascotas1 {
static boolean estado = true;
public static int llamadasvecinos = 0;
static jugador usuario = new jugador();
static  int controndas =1;

    public void main(String[] args) {
        int op,opm = 0;
        int a;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al juego de mascotas hechos por ferxxoo");
        System.out.println("Que tipo de mascota quieres? \n1.Gato \n2.Perro \n3.Pajaro");
        a = teclado.nextInt();
        Mascota uno = eleccion(a);
        System.out.println("Para iniciar,como se llamara tu mascota?");
        uno.setnombre(teclado.next());
        System.out.println("Awwwwwww,me gusta mucho el nombre de " + uno.getnombre());
        mostrarManual(uno);
        System.out.println("Este es el estado actual de " + uno.getnombre() + "\nTu mision es mantener vivo a tu mascota");
        uno.mostrar();

        while(uno.checarstatus() && usuario.checarstatus()){
            menuprincipal();
            op = teclado.nextInt();

            if (op == 1){
                opm = menumascota(uno, teclado);
                switch(opm){
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
                    case 5:
                        usuario.mostrar();
                        break;

                }
            }else if (op == 2){
               opm = menujugador(usuario,teclado);
                switch (opm){
                    case 1:
                        usuario.mostrar();
                        break;
                    case 2:
                        usuario.trabajar();
                        break;
                    case 3:
                        System.out.println("Tienda proximamente...");
                        break;
                }
            }

            eventonormal(uno);
            eventopeligro(uno);
            uno.dificultad();
            uno.checarstatus();
        if(controndas % 5 == 0){
            uno.bano();
        }

       controndas++;
    }
        System.out.println("GAMEEEE OVERRR :(");
        if(!uno.checarstatus()){
            System.out.println(uno.getnombre() + " ha muerto. Fuiste un dueño descuidado... :((");
        }else if (!usuario.checarstatus()){
            System.out.println("Has perdido la paciencia y has decidido regalar a tu querida mascota");

        }

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

    public static  void eventonormal(Mascota m) {
        double azar = Math.random();
        if (m instanceof jugueton && azar < 0.20) {
            ((jugueton) m).romper(usuario);
        }
        else if (m instanceof ruidoso && azar < 0.40) {
            ((ruidoso) m).grito();
        }else if (m instanceof calmado && azar < 0.60){
            ((calmado) m).dormido();
        }


    }

    public static  void eventopeligro(Mascota m) {
        double azar = Math.random();
        if (m instanceof jugueton && azar < 0.20) {
            ((jugueton) m).romper(usuario);
        }
        else if (m instanceof ruidoso && azar < 0.10) {
            ((ruidoso) m).gritoevento(llamadasvecinos);
        }else if (m instanceof calmado && azar < 0.10){
            ((calmado) m).quedarsedormido(llamadasvecinos);
        }


    }

    public static void mostrarManual(Mascota m) {
        System.out.println("GUIA DE CUIDADOS PARA: " + m.getnombre().toUpperCase());
        System.out.println("1. OBJETIVO: Mantén vivas tus estadísticas.");
        System.out.println("   Si el Hambre, Energía o Felicidad llegan a 0... ¡Game Over!");
        System.out.println("2. TURNOS: Cada accion consume tiempo y aumenta la dificultad.");
        System.out.println("3. EVENTOS: Tu mascota tiene una 'Naturaleza' única:");

        if (m instanceof jugueton) {
            System.out.println("   -> NATURALEZA JUGUETONA: Puede romper cosas si no juegas.");
        } else if (m instanceof ruidoso) {
            System.out.println("   -> NATURALEZA RUIDOSA: ¡Cuidado con los gritos! Los vecinos");
            System.out.println("      tienen poca paciencia y llamarán a la ley.");
        } else if (m instanceof calmado) {
            System.out.println("   -> NATURALEZA CALMADA: Se mete en problemas por dormir donde");
            System.out.println("      no debe. Manten un ojo en el jardin del vecino.");
        }

        System.out.println("4. PELIGRO: Si acumulas mas de 2 quejas de vecinos...");
        System.out.println("   ¡Hay riesgo de perder a tu mascota para siempre!");
        System.out.println("Como jugador tu tienes 2 estadisticas");
        System.out.println("1.PACIENCIA: Tus mascotas pueden sacarte de quicio y provocar consecuencias.....");
        System.out.println("2.DINERO: Puedes comprar objetos y cosas para tus mascotas");
        System.out.println("Puedes ir a TRABAJAR pero como todo, tendra consecuencias");
        System.out.println("Escoge bien....");
        System.out.println("====================================================\n");
        System.out.println("Presiona ENTER para comenzar el juego...");
        new Scanner(System.in).nextLine();
    }

    public static void menuprincipal(){
        System.out.println("Ronda: " + controndas);
        System.out.println("1.Acciones de mascota");
        System.out.println("2.Acciones del jugador");
        System.out.println("Selecciona que quieres hacer?");


    }

    public static int menumascota(Mascota m,Scanner teclado){
        System.out.println("Estas en la ronda: "+ controndas);
        System.out.println("1.Alimentat a " + m.getnombre());
        System.out.println("2.Jugar con " + m.getnombre());
        System.out.println("3.Dormir con " + m.getnombre());
        System.out.println("4.Mostrar estadisticas de " + m.getnombre());
        int opm = teclado.nextInt();
        return opm;
    }

    public static int menujugador(jugador j,Scanner teclado){
        System.out.println("1.Ver estadisticas del jugador(paciencia y dinero) ");
        System.out.println("2.Ir al trabajo");
        System.out.println("3.Ir a la tienda ");
        System.out.println("4.Ver inventario ");
        int opm = teclado.nextInt();
        return opm;
    }


}
