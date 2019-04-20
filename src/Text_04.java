import java.util.Scanner;

public class Text_04 {

    public static void main(String[] args ){
        System.out.println("请输入月份：");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        switch (m){
            case 2:
                System.out.println("28天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");

                break;
                default:
                System.out.println("31天");
        }



        }




    }




