public class Prime {

    public static void main(String[] args) {
        int m = 0 ,  n = 13, count = 0;
    
        for(int i =m; i<=n; i++){
            for(int j = 2; j<i-1; j++){
                if(i%j == 0){
                    count++;
                    break;
                }
            }
            if(count==0 && i>=2){
                System.out.println(i+" is a prime number");
                }
                else
                count=0;
        }
    }
}
