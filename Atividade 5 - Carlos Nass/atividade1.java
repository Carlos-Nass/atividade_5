import java.util.Random;

public class atividade1 {
    public static void main(String[] args) {
        int[] rand_value = random_values(20000);
        
        if (test_value(rand_value)) {
            System.out.println("Todos os valores estão dentro do intervalo");
        } else {
            System.out.println("Tem um valor que está abaixo do intervalo");
        }
    }
    
    public static int[] random_values(int n) {
        int[] values = new int[n];
        Random random = new Random();
        
        for (int i = 0; i < n; i++) {
            values[i] = random.nextInt(1999999) - 999999;
            System.out.println(values[i]);
        }
        
        return values;
    }
    
    public static boolean test_value(int[] values) {
        for (int value : values) {
            if (value < -999999 || value > 999999) {
                return false;
            }
        }
        return true;
    }
}