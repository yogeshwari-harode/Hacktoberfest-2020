#include <iostream>

using namespace std;

int main()
{
int n;
cout<<"enter number of elements \n";
cin>>n;
cout<<"\nenter elements\n";
int a[n];
for(int i=0;i<n;i++)
{
cin>>a[i];
}
int l=a[0];
for(int j=0;j<n;j++)
{
 if(l<a[j])
 {
 l=a[j];
 }
}
cout<<"\nlargest number is "<<l;



    return 0;
}
