package PatternPrograms;

public class top_full_pyramid_6
{
    static void main(String[] args) {
        int i ,j;

        // using while loop
        i = 1;

        while (i <= 5){
            // nested while loop
            j = 5;
            while (j >= i){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;

        }
    }
}
/*
 *****
 ****
 ***
 **
 *
 */
