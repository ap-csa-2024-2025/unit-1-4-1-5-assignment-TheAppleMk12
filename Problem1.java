public class Problem1
{
  public static void main(String[] args)
  {
    int num1;
    num1 = 24;
    int initialValue;
    initialValue = num1;
    System.out.println("Initial Value: " + initialValue);

    while (num1 < initialValue + 4) {
        num1++;
        System.out.println("Number is now " + num1);
    }
    while (num1 > initialValue) {
        num1--;
        System.out.println("Number is now " + num1);
    }
  }
}

