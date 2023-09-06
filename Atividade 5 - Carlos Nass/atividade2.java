import java.util.Random;

public class atividade2 {
    public static void main(String[] args) {
        int[] rand_value = random_value(20000);
        
        System.out.println("\nVetor ordenado:");
        order_values(rand_value);
        print_values(rand_value);

    }
    
    public static int[] random_value(int n) {
        int[] values = new int[n];
        Random random = new Random();
        
        for (int i = 0; i < n; i++) {
            values[i] = random.nextInt(1999999) - 999999;
        }
        
        return values;
    }
    
    public static void print_values(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public static void order_values(int[] values) {
        int n = values.length;
        boolean trocou;
        
        do {
            trocou = false;
            for (int i = 1; i < n; i++) {
                if (values[i - 1] > values[i]) {
                    int temp = values[i - 1];
                    values[i - 1] = values[i];
                    values[i] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }
}
