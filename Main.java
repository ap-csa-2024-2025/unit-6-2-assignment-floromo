import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    
    Scanner sc = new Scanner(System.in);

    // ----- Problem 1 ----- 
    System.out.println("Enter array length:");
    int len = sc.nextInt();

    int[] arr1 = new int[len];
    System.out.println("Enter values:");
    for (int i = 0; i < len; i++)
    {
      arr1[i] = sc.nextInt();
    }
    System.out.println("Contains negative: " + containsNeg(arr1));


    // ----- Problem 2 ----- 
    System.out.println("Enter array length:");
    len = sc.nextInt();

    int[] arr2 = new int[len];
    System.out.println("Enter values:");
    for (int i = 0; i < len; i++)
    {
      arr2[i] = sc.nextInt();
    }
    System.out.println("Numbers divisible by three: " + numDivisibleBy3(arr2));


    // ----- Problem 3 ----- 
    System.out.println("Enter a value for num:");
    int num = sc.nextInt();
    System.out.println("Enter array length:");
    len = sc.nextInt();

    int[] arr3 = new int[len];
    System.out.println("Enter values:");
    for (int i = 0; i < len; i++)
    {
      arr3[i] = sc.nextInt();
    }
    System.out.println("Numbers divisible by " + num + ": " + numDivisible(arr3, num));
  }

  // ----- Problem 1 -----
  public static boolean containsNeg(int[] array)
  {
    for (int i = 0; i < array.length; i++){
      if (array[i] < 0){
        return true;
      }
    }
    return false;
  }

  // ----- Problem 2 -----
  public static int numDivisibleBy3(int[] array)
  {
    int count = 0;
    for (int i = 0; i < array.length; i++){
      if ((array[i] % 3) == 0){
        count++;
      }
    }
    return count;
  }

  // ----- Problem 3 -----
  public static int numDivisible(int[] array, int num)
  {
    int count = 0;
    for (int i = 0; i < array.length; i++){
      if ((array[i] % num) == 0){
        count++;
      }
    }
    return count;
  }
}
