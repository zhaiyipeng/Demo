import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class shuangseqiu {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(getPool()));
        //系统选择6个红球和1个蓝球
        String[] pool = getPool();
        String[] sysRedBalls = getRedBalls(pool);
        Arrays.sort(sysRedBalls);
        System.out.println(Arrays.toString(sysRedBalls));
        Random r = new Random();
        String sysBlueBall = pool[r.nextInt(16)];//随机获取一个蓝球
        //用户买彩票
        System.out.println("请选择方式：1、机选  2、人选");
        Scanner sc = new Scanner(System.in);
        int method = sc.nextInt();
        String[] userRedBalls = new String[6];//用户随机选择红球
        String userBlueBall = "";//用户随机选择蓝球

        switch (method) {
            case 1:
                userRedBalls = getRedBalls(pool);
                userBlueBall = pool[r.nextInt(16)];
                break;
            case 2:
                System.out.println("请输入6个红球！01~33");
                for (int i = 0; i < userRedBalls.length; i++) {
                    userRedBalls[i] = sc.next();
                }
                userBlueBall = sc.next();
                break;
            default:
                System.out.println("请不要乱输入！");
                break;
        }
        System.out.println("系统蓝球" + sysBlueBall);
        System.out.println("用户蓝球" + userBlueBall);
        Arrays.sort(userRedBalls);
        System.out.println("用户红球" + Arrays.toString(userRedBalls));

        int count = 0;
        for (int i = 0; i < sysRedBalls.length; i++){
            for (int j = 0; j < userBlueBall.length(); j++) {
                if (sysRedBalls[i].equals(userRedBalls[j])) {
                    count++;
                }
            }
    }
      if(sysBlueBall.equals(userBlueBall)){
        System.out.println("六等奖！");
    }else if(count ==4){
        System.out.println("五等奖！");
    }else{
        System.out.println("很遗憾，未中奖！");
    }

}
    private static String[] getRedBalls(String[] pool) {
        String[] redBalls = new String[6];
        //去重
        boolean[] isUsed = new boolean[pool.length];
        int count = 0;
        Random r = new Random();
        while (true) {
            int index = r.nextInt(pool.length);
            if (isUsed[index])
                continue;
            isUsed[index] = true;
            redBalls[count++] = pool[index];
            if (count == redBalls.length)
                break;
        }
        return redBalls;
    }
    /**
     * 获取奖池
     */
    public static String[] getPool() {
        String[] pool = new String[33];
        for (int i = 1; i <= 33; i++) {
            if (i < 10) {
                pool[i - 1] = "0" + i;
            } else {
                pool[i - 1] = i + "";
            }
        }

        return pool;
    }
}