package BasicPrograms;

public class InverseOfNumber {
    public static void main(String[] args){
        int x = 81456273;
        int op = 1;
        int inverse=0;
        while(x!=0){
            int od = x % 10;
            int id = op;
            int ip = od;
            inverse = inverse + id * ((int)Math.pow(10,ip-1));
            x/=10;
            op++;
        }
        System.out.println(inverse);
    }
}
