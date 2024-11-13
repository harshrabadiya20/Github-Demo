package BasicPrograms;

public class ReverseTheNumber {
    public static void main(String[] args){
        int x = 102;
        int temp = x;
        int digit = 0;
        while(temp!=0){
            temp = temp / 10;
            digit++;
        }

        int reverse = 0;

        int div = (int) Math.pow(10,digit-1);

        while(div!=0){
            int rem = x % 10;
            x = x/10;
            reverse = reverse + (rem * div);
            div=div/10;
        }
        System.out.println(reverse);
    }
}
