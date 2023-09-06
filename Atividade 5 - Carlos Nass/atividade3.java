public class atividade3 {
    public static void main(String[] args) {  

        double quilogramas = 200;
        double metros = 200;

        System.out.println(converterMassaLunar(quilogramas));
        System.out.println(converterDistanciaMarte(metros));
        System.out.println(test_massaLunar());
        System.out.println(test_distanciaMarte());

    }

    // Função para converter quilogramas em unidades de massa lunar
    public static double converterMassaLunar(double quilogramas) {
        return quilogramas * 0.165;
    }

    // Função para converter metros em unidades de distância em Marte
    public static double converterDistanciaMarte(double metros) {
        return metros * 0.000107;
    }

    public static boolean test_massaLunar() {

        double quilogramas = 100;

        if (16.5 == converterMassaLunar(quilogramas)){
            System.out.println("O calculo foi realizado corretamente");
            return true;
        }else{
            System.out.println("O calculo não foi realizado corretamente");
            return false;
        }
    }

    public static boolean test_distanciaMarte() {

        double metros = 100;
        
        if (0.0107 == converterDistanciaMarte(metros)){
            System.out.println("O calculo foi realizado corretamente");
            return true;
        }else{
            System.out.println("O calculo não foi realizado corretamente");
            return false;
        }
    }
}