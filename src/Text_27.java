import java.util.Scanner;

public class Text_27 {
    public static void main(String[] args) {
        int[][] clazz = {{11,55,73},{44,23,66},{56,33,55}};

        for(int i=0; i<clazz.length;i++){
            float sum=0.0F;
            for(int j=0;j<clazz[i].length;j++){
                sum=sum+clazz[i][j];
            }

            System.out.println((i+1)+"班平均分="+sum/clazz[i].length);
        }



    }
}

