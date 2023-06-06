public class FirstnonRepeated
{
public static void main(String args[])
{
int a[]={12,4,12,7,4,9,5,9,};

abc: for(int i=0;i<a.length;i++)
{
int count=0;
for(int j=0;j<a.length;j++)
{
if(a[i]==a[j])
{
count++;
}

}

if(count==1)
{
System.out.println(a[i]);
break abc;
}

}


}
} 
