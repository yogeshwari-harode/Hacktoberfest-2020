//program to convert the no. of any base to any other base lower than 32
//Enter the no.
//Enter the base1
//Enter the base2 
#include<iostream>
#include<cstring>
#include<cmath>
using namespace std;
class Solution
{
public:
void convert(string n,int base1, int base2)
{
    int a[100];
    char s[100];
    char ans[100];
    int r=0;
    int remainder[100],count=0,count1=0;
    for(int i=0;i<n.length();i++)
    {
        char c=n[i];
        s[i]=tolower(c);
        count1++;//for keeping track of size of filled array(s)
    }
    //string for reference
    string noref="0123456789abcdefghijklmnopqrstuvwxyz";
    for(int i=0;i<count1;i++)
    {
        
        a[i]=noref.find(s[i]);
    }
    //calculating the value of no. from given base1 to the base of 10
    for(int i=count1-1,j=0;i>=0;i--,j++)
    {
        r=r+pow(base1,j)*a[i];
    }
    //calculating the value of no. from base of 10 to  given base2
    for(int i=0;base2<=r;i++)
    {
        remainder[i]=r%base2;
        r=r/base2;
        ++count;//keeping track of size of filled array(remainder)
    }
    remainder[count]=r;
    char nans[100];
    //formatting the output
    for(int i=0,j=count;i<=count;i++,j--)
    {
        if(remainder[j]>base2 )
        {
            nans[i]=noref[remainder[j]-base2];
        }
        else
        {
            nans[i]=noref[remainder[j]];
        }
        char c=nans[i];
        ans[i]=toupper(c);
    }
    //print the output
    cout<<"\nThe no. in base "<<base1<<" is "<<n;
    cout<<"\nThe no. in base "<<base2<<" is ";
    for(int i=0;i<=count;i++)
    {
        cout<<ans[i];
    }
}
};
int main()
{
    string n;
    cout<<"\nEnter the no. :: ";
	cin>>n;
    int base1=0,base2=0;
    cout<<"\nEnter the base of no. :: ";
    cin>>base1;
    cout<<"\nEnter the second base :: ";
    cin>>base2;
    Solution ob;
    ob.convert(n,base1,base2);//called the function convert of class A 
return 0;
}

