//Infinite recursion

public class practice_ques_rec {
   public static void print(int n)
   {
       System.out.println(n);
       print(n--);
   }


    public static void main(String[] args) {
       print(5);
    }
}


STACK OVERFLOW ERROR
output:
  5
  5
  5
  5
  5
  5
  5
  Stack Overflow Error
