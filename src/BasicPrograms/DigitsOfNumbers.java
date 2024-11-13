package BasicPrograms;

public class DigitsOfNumbers {
    public static void main(String[] args){
        int x = 1234567890;
        int temp = x;
        int nod = 0;
        while(temp!=0){
           temp =  temp/10;
            nod++;
        }

        int div = (int)Math.pow(10,nod-1);

        while(div!=0){
            int q = x/div;
            System.out.println(q);
            x = x % div;
            div = div/10;

        }
    }
}
