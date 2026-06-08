package PatternPrograms;

public class left_angle_number_pattern_9
{
    static void main(String[] args) {
        int i ,j;
        i = 1;
        while (i<=5){
            j = 1;
            while(j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;

        }
    }
}
/*
1
22
333
4444
55555
 */
