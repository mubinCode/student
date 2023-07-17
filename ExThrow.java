public class ExThrow extends RuntimeException{
    
    ExThrow (String m){
        super(m);
        System.out.println("What");
    }

}

class Test{

    public static void main(String[] args) {
        int age = 16;
        if(age<18){
            throw new ExThrow("Please try later !");

        }
    }
}
