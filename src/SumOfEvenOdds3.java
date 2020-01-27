import java.util.Scanner;

public class SumOfEvenOdds3 {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int Size, i, EvenSum = 0, OddSum = 0;
        sc = new Scanner(System.in);
        System.out.print(" Please Enter Number of elements in an array : ");
        Size = sc.nextInt();

        int [] a = new int[Size];
        System.out.print(" Please Enter " + Size + " elements of an Array  : ");
        for (i = 0; i < Size; i++)
        {
            a[i] = sc.nextInt();
        }
        EvenSum = SumOfEvensinArray(a, Size);
        OddSum = SumOfOddsinArray(a, Size);

        System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
        System.out.println(" The Sum of Odd  Numbers in this Array = " + OddSum);
    }
    public static int SumOfEvensinArray(int[] a, int Size)
    {
        int i, EvenSum = 0;
        for(i = 0; i < Size; i++)
        {
            if(a[i] % 2 == 0)
            {
                EvenSum = EvenSum + a[i];
            }
        }
        return EvenSum;
    }
    public static int SumOfOddsinArray(int[] a, int Size)
    {
        int i, OddSum = 0;
        for(i = 0; i < Size; i++)
        {
            if(a[i] % 2 != 0)
            {
                OddSum = OddSum + a[i];
            }
        }
        return OddSum;
    }
}