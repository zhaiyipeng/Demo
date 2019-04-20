public class Text_28 {
    public static void main(String[] args) {
        int [] a={11,44,-1,33,55,};
        int min=Integer.MAX_VALUE;
        for(int x:a){
            if(min > x){
                min =x;
            }

        }
        System.out.println(min);
    }
}
