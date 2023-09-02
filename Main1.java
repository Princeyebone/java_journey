import java.util.Arrays;

class main
{
    public static void main(String[] args) {
        int i;
        int j;
        int l;
        int num[]={1,2,3,4,5,9};
        for (i =0; i <=num.length; i++) {
        System.out.println();
        }

        /*for(i=0;i<=12;i++) {
           for(j=0;j<=12;j++){
              for(l=0;l<=12;l++){ System.out.printf("%d * %d  * %d = %d \n", i, j, l, j*i*l);}
              }
}*/
    for(i=0;i<=50;i++)
        if (isPrime(i)) {
            System.out.println(i);
        }

    }

    private static boolean isPrime(int i){
        return false;
    }


}