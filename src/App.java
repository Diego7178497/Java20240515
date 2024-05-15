public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, suma = 0, contador = 0;
        
        System.out.print("Ingresa el primer número: ");
        num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        num2 = scanner.nextInt();
        
        while (contador < num2) {
            suma += num1;
            contador++;
        }
        
        System.out.println("La suma de " + num1 + " repetida " + num2 + " veces es: " + suma);
    }
}
