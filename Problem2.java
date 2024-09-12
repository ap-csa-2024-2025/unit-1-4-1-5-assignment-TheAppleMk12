public class Problem2
{
  public static void main(String[] args)
  {
    int num1;
    num1 = 678;
    
    int hundreds;
    int tens;
    int ones;
    hundreds = num1/100;
    tens = (num1%100)/10;
    ones = (num1%10);

    System.out.println("Here are the digits: ");
    System.out.println(hundreds);
    System.out.println(tens);
    System.out.println(ones);
  }
}


