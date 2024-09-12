public class Problem3
{
  public static void main(String[] args)
  {
    int num1;
    num1 = 467654;
    
    System.out.println("Here are the digits: ");
    while (num1 > 0) {
        int num2;
        num2 = num1 % 10;  
        System.out.println(num2);
        num1 = num1 / 10;  
    }

}
}



