package reto.pkgfinal;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lalor
 */
public class RetoFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jugador_principal;
        String Respuesta = "exit";
        int mago_vida = 100;
        int jugador_vida = 100;
        int type = 0;
        int aleatorio1 = 0 ;
        int type2 = 0;
        int aleatorio3 = 0 ;
        int aleatorio2 = 0 ;
        System.out.println("Bienvenido al juego");
        System.out.println("");
        System.out.println("¿Cual es tu nombre? ");
        jugador_principal = sc.nextLine();
        System.out.println("");
        System.out.println("Okey "+jugador_principal+" Iniciemos el juego!");
        System.out.println(""); 
           do{
            Random aleatorio = new Random();
            aleatorio1 = aleatorio.nextInt(10);
            aleatorio2 = aleatorio.nextInt(10);
            aleatorio3 = aleatorio.nextInt(2);
            type = type + aleatorio1;
            System.out.println("El Mago consiguio "+aleatorio1+" hadas");
            type2 = type2 + aleatorio2;	
            System.out.println("El heroe consiguio "+aleatorio2+" hadas");
            jugador_vida = jugador_vida - aleatorio3; 
            System.out.println("El ogro se emputo y te ataco!, recibiste "+ aleatorio3+ " putazos, tu vida actual es de: "+jugador_vida);
            if(type >= 10){
                        System.out.println("El mago se chingo 10 hadas y su vida incrementa" );
                        mago_vida = mago_vida + 1;
                        System.out.println("La vida actual del mago es de: "+ mago_vida);
                        type = 0;
                    }
                    if(type2 >= 10){
                        System.out.println("El heroe se chingo 10 hadas");
                        System.out.println("El poder del mago baja y tu poder sube");
                        mago_vida = mago_vida - 1;
                        jugador_vida = jugador_vida + 1;
                        type2 = 0;
                        System.out.println("La vida del hereo es de: " + jugador_vida);
                        System.out.println("Y la del mago es: "+ jugador_vida);  
                    }
System.out.println("¿Quieres salvar mas hadas?");
Respuesta = sc.nextLine();
            
}while( jugador_vida > 0 && mago_vida > 0 && Respuesta.equals("si"));            
            
        }
}
