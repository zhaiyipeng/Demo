import java.util.Scanner;

public class Text_26 {
    public static void main(String[] args) {
        //int []={};
        int [] a = {1,2,3,4};
        Scanner h = new Scanner(System.in);
        System.out.println("请输入");
        int x = h.nextInt();
        boolean flag = false;
       for(int b :a){
           if(x==b)

               System.out.println("包含");
           else
               System.out.println("不包含");
        }

    }
}
