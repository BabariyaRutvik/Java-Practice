package PatternPrograms;

public class right_half_pyramid_3
{
    public static void main(String[] args) {
        int i, j;
        int n = 5;

        i = 1;
        while (i <= n) {
            j = n - 1;
            while (j >= i) {
                System.out.print(" ");
                j--;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}

