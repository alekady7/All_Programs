public class total_days {
    static void total_days_in_august(){
        int total_days = 31;
        int total=0;
        for(int i=1;i<=total_days;i++){
            if(i % 2 == 0){
                total++;
            }
        }System.out.print("Total days are: "+total);
    }

    public static void main(String[] args){
        total_days_in_august();
    }
}
