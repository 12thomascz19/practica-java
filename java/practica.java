import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int numero = keyboard.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}