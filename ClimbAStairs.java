public class ClimbAStairs {
    public static void main(String[] args) {
        int n = 5;
        int a = 2, b= 3,c = 0;
        if(n<=3){
            System.out.println(n);
        }
        for(int i = 0 ; i < n-3;i++){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
