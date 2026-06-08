package PatternPrograms;

public class triangle_star_pattern_10 {
    static void main(String[] args) {
        int i ,j, k;
        int height = 5;

        i = 1;
        while (i <= height)
        {
            k = height - 1;
            while (k >= i){
                System.out.print(" ");
                k--;
            }
            j = 1;
            while (j<=i){
                System.out.print("* ");
                j++;

            }
            System.out.println();
            i++;

        }
    }
}
/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 */