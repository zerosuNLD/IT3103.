import java.util.Scanner;

class veSao
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n+1-i; j++)
            {
                System.out.print(" ");
            }
            
            for(int j = n+2-i; j< n+i; j++)
            {
                System.out.print("*");
            }
            System.out.print("*\n");
        }
    }
}