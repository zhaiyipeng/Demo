import java.util.Arrays;

public class Review {
    public static void main(String[] args) {
        int[] a={14,33,22,5,7};
        for(int i=0;i<a.length;i++){
            int minIndex=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minIndex]>a[j]){
                    minIndex=j;
                }
            }
            if(minIndex !=i){
                int temp=a[i];
                a[i]=a[minIndex];
                a[minIndex]=temp;

            }
        }
        System.out.println(Arrays.toString(a));

    }
}
