package BasicPrograms;

public class CountDigitsInNumber {
    public static void main(String[] args){
        int x = 1234567890;
        int temp = x;
        int count =0;
        while(temp>0){
           temp = temp/10;
           count++;
        }
        System.out.println(count);
    }
}
