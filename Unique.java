public class Unique {
  public static void main(String[] args) {

    String word = "abecd";
    int count = 0;

    for (int i = 0; i < word.length(); i++) {
      for (int index = 0; index < word.length(); index++) {
        if (i != index) {
          if (word.charAt(i) == word.charAt(index)) {
            count++;
            break;
          }
        }
      }      if (count != 0) {
        //count = 0;
        System.out.print("*"+word.charAt(i)+"*");
        break;
      } else {
        System.out.print(word.charAt(i)+".");
      }

    }if(count==0){
    System.out.println("Unique");}
    else
    System.out.println("Not Unique");
  }
}
