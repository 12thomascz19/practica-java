import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numero;
        
        do {
            System.out.println("Escribe un numero");
            numero = keyboard.nextInt();
            if(numero <= 0){
                System.out.println("EL numero es negativo");
            } else {
                System.out.println("EL numero es positivo");
            }
        } while(numero >= 0);
    }
}