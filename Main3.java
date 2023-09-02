import java.util.Arrays;
 class main
{
    public static void main(String[] args)
    {
        String names[]={"ama_zum", "cis", "ham", "bec", "dec"};
       Arrays.sort(names);
int num[]={139, 278, 100, 573, 839, 143, 574};


       String key="cis";
       int item_num= Arrays.binarySearch(names, key);
       System.out.println(Arrays.toString(names));

        String arra[]= names;

        int num_am[]= Arrays.copyOf(num, num.length);
        Arrays.sort(num);

        System.out.println(Arrays.toString(arra));
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num_am));
        System.out.println();
        int i;
        for(i = 1; i == num.length; i++)
        {
            System.out.println(num[i]);
        }

    }
}