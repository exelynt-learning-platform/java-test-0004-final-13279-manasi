public class NumberPattern2 {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 1; j <= 2*n-1; j++) {

                int row = Math.abs(n - i);
                int col = Math.abs(n - j);

                int num = Math.max(row, col) + 1;

                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}