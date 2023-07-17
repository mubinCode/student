public class Factorial {

    static int fact(int a){
        if(a!= 0){
            return a*fact(a-1);
        }
        else
        return 1;
    }
    public static void main(String[] args) {
        int number = 6;
        int factorial = Factorial.fact(number);
        System.out.println(factorial);
    }
    
}
