import java.util.Scanner;
class prog12
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int[][] a = new int[3][3];
System.out.println("Enter the 3x3 matrix:");  
for (int i = 0; i < 3; i++) 
{
for (int j = 0; j < 3; j++) 
{
a[i][j] = sc.nextInt();
}
}
int left = a[0][0] + a[1][1]+ a[2][2];
int right = a[2][0] + a[1][1] + a[0][2];
System.out.println("Left diagonal sum: " + left);
System.out.println("Right diagonal sum: " + right);
}
}