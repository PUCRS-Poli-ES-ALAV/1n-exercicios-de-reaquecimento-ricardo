public class Recursao {
    
    // i
    public static int multiplicacao(int a, int b){
        if (b == 0){return 0;}
        return a + multiplicacao(a, b - 1);
    }

    // ii
    public static int soma(int a, int b) {
        if (b == 0){return a;}
        return soma(a + 1, b - 1);
    }

    // iii
    public static double somaHarmonica(int n) {
        if (n == 1){return 1.0;}
        return 1.0 / n + somaHarmonica(n - 1);
    }

    // iv
    public static String inverterString(String str) {
        if (str.isEmpty()){return str;}
        return inverterString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        int a = 6, b = 4;
        System.out.println(a + "x" + b + ": " + multiplicacao(a, b));
        
        int x = 3, y = 2;
        System.out.println(x + " + " + y + ": " + soma(x, y));

        int n = 6;
        System.out.println("Soma Harmônica de " + n + ": " + somaHarmonica(n));

        String str = "exemplo";
        System.out.println("Inversão da string '" + str + "': " + inverterString(str));
    }
}