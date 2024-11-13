package BasicPrograms;
import java.util.*;
public class InputFromUser {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int x = Integer.parseInt(scn.nextLine());
        String str = scn.nextLine();

//        System.out.println("Hello world!");
        System.out.println(x);
        System.out.println(str);

    }
}

