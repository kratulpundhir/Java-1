import java.util.Scanner;

class FactorOperations
{
    public int n;

    FactorOperations()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        sc.close();
    }

    void Prime()
    {
        for(int i = 2; i<Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                System.out.println("Not Prime");
                break;
            }
            else if(i==Math.sqrt(n)-1)
                System.out.println("Prime");
        }
    }

    public static void main(String args[])
    {
        FactorOperations O = new FactorOperations();
        O.Prime();
    }
}