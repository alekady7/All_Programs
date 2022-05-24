public class fibonacci_recursion {
    static int n3=0, n1=0,n2=1;
    static void fibonacci(int count){
        if(count>0){
            int n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" " + n3);
            fibonacci(count-1);
        }
    }

    public static void main(String[] args){
        int count = 10;
        System.out.print(n1 +" "+ n2);
        fibonacci(count-2);    //as 2 no.s are already printed
    }
}
