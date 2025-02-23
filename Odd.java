class Odd
{
static void pro()
{
int count=0;
String res=" ";
String a="programming";
for(int i=0;i<a.length();i++)
{
if(!(i%2==0))
{
res=res+a.charAt(i);
}
} 
System.out.println(res);
}
public static void main(String[] args)
{
pro();
}
}