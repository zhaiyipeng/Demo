public class Text_15 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        do{
            int num = 1;
            int j=i;
            do{
                num*=j;
                j--;
            }while(j>0);
            i++;
            sum+=num;
        }while(i<=10);
        System.out.println(sum);
    }
}
/**
 *
 * 文档注释
 *
 */