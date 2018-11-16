import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double one = sc.nextDouble();
        double two = sc.nextDouble();
        double three = sc.nextDouble();
        double four = sc.nextDouble();
        double five = sc.nextDouble();
        double six = sc.nextDouble();

        int posCount = 0;
        double posSum = 0;
        if(one > 0){
            ++posCount;
            posSum += one;
        }
        if(two > 0){
            ++posCount;
            posSum += two;
        }
        if(three > 0){
            ++posCount;
            posSum += three;
        }
        if(four > 0){
            ++posCount;
            posSum += four;
        }
        if(five > 0){
            ++posCount;
            posSum += five;
        }
        if(six > 0){
            ++posCount;
            posSum += six;
        }
        System.out.printf("%d valores positivos\n", posCount);
        double average = posSum / posCount;
        System.out.printf("%.1f\n", average);

    }
}
