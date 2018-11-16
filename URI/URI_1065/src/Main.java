import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int four = sc.nextInt();
        int five = sc.nextInt();
        int evenCount = 0;
        if(one % 2 == 0){
            ++evenCount;
        }
        if(two % 2 == 0){
            ++evenCount;
        }
        if(three % 2 == 0){
            ++evenCount;
        }
        if(four % 2 == 0){
            ++evenCount;
        }
        if(five % 2 == 0){
            ++evenCount;
        }
        System.out.println(evenCount + " valores pares");
    }
}
