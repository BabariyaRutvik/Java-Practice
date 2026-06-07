package PatternPrograms;

public class left_half_pyramid_2
{
    static void main(String[] args) {

        int i ,j;

        i = 1;
        while (i <= 5){
            j = 1 ;
            while (j <= i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
/*

 *
 **
 ***
 ****
 *****

 */
