public class leap_year{
    public static void main(String[] args) {
        int year = 2016;
        if(year % 4 == 0){
            if (year % 400 == 0 && year % 100 != 0){
                System.out.println(year + " is a leap year");
            } else{
                System.out.println(year + " is not a leap year");
            }
        }else {
            System.out.println(year + " is not a leap year");
        }
    }
}