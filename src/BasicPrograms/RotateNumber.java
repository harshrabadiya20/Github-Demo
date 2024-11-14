package BasicPrograms;

public class RotateNumber {
    public static void main(String[] args){
        int x = 123456789;
        int k = 240;
        int temp = x;
        int nod =0;
        while(temp>0){
            temp = temp / 10;
            nod++;
        }
        k = k % nod;
        int div = 1;
        int mul = 1;
        for(int i=1;i<=nod;i++){
            if(i<=k){
                div = div * 10;
            }else{
                mul = mul * 10;
            }
        }

        int q = x/div;
        int r = x % div;

        int rotate = (r * mul) + q;

        System.out.println(rotate);
    }
}
