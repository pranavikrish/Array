public class MatrixAdd
{
//matrix add in an array
public static void main(String args[])
{
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int b[][]={{3,1,2},{6,4,5},{9,7,8}};
int c[][]=new int[a.length][a[0].length];
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}


}
}
