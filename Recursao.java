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

    public static void main(String[] args) {
        int a = 6, b = 4;
        System.out.println(a + "x" + b + ": " + multiplicacao(a, b));
        
        int x = 3, y = 2;
        System.out.println(x + " + " + y + ": " + soma(x, y));
    }
}