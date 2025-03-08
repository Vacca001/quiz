import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("ingrese un numero entero postivo ");
        int Numero1 = Scanner.nextInt();

        System.out.println("ingrese el segundo numero entero postivo");
        int Numero2 = Scanner.nextInt();

        int contadorgemelos = 0;



        for (int i = 0; Numero1 <= Numero2 -2  ;i++){

          int total = Numero1 + Numero2 / 2;

          

          

             System.out.println("el total de pares primos encontrados es  " + i); 
        
        System.out.println("el total de pares primos encontrados es  " + total); 
        return;
        }
        


        






           

    }
}
