import java.util.*;
class fact{
public static void main(String[] arg){
	int c=1;
	System.out.println("enter the no. whoes you want to find fact");
	Scanner sc =new Scanner(System.in);
	int n =sc.nextInt();
	for(int i=1;i<=n;i++){
	c=c*i;}
	System.out.println(+c);
	}}
