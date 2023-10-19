import java.util.*;

class test {
    public static void main(String[] args) {
        int[][] a = new int[1000][1000];
        int[][] b = new int[1000][1000];
        Scanner scanner = new Scanner(System.in);
        int n, m;

        System.out.print("Nhap kich thuong mang: ");
        n = scanner.nextInt();
        m = scanner.nextInt();
        System.out.println("Nhap cac phan tu mang 1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhap cac phan tu mang 2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = scanner.nextInt();
            }
        }
        int[][] temp = new int[1000][1000];
        temp = sumOfTwoArray(a, b, n, m);
        printOfArray(temp, n, m);
        System.exit(0);
    }

    public static void printOfArray(int[][] a, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
    }

    public static int[][] sumOfTwoArray(int[][] a, int[][] b, int n, int m) {
        int[][] temp = new int[1000][1000];
        System.out.println("Tong hai mang: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[i][j] = a[i][j] + b[i][j];
            }
        }
        return temp;
    }
}