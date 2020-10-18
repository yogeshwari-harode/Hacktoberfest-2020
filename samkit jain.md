//problem REPLEX of codechef october long challenge

                    //Author -> Samkit Jain\\
                      
#include<bits/stdc++.h>
using namespace std;
#define ll long long int 

int sort(const void *a,const void *b) //qsort(x,n,sizeof(ll),sort);
{
    return(*(ll*)a - *(ll*)b);
}  
int gcd(ll a,ll b)          
{
    ll a1,b1;
    if(b!=0)
    {
        a1=b;
        b1=a%b;
        gcd(a1,b1);
    }
    else
    {return a;}
}
int binary(ll n)
{
    ll binary=0,temp=1;
    while(n>0)
    {
        binary=binary+((n%2)*temp);
        n=n/2;
        temp=temp*10;
    }
    return binary;
}
int no_of_bits(ll n)
{
    return (int)log2(n)+1;
}

int main() 
{
    ll t;
	cin>>t;
    for(ll test=1;test<=t;test++)
    {
        ll n,value,p,k;
        cin>>n>>value>>p>>k;
        ll x[n+2];
        x[0]=(pow(10,13))*(-1);
        x[n+1]=pow(10,13);
        
        for(ll i=1;i<=n;i++)
        {
            cin>>x[i];
        }
        sort(x,x+(n+2));
        //qsort(x,n+2,sizeof(ll),sort);
        /*for(ll i=0;i<=n+1;i++)
        {
            cout<<x[i]<<" ";
        }cout<<endl;*/
        ll count=0,sure=0;
        if(x[p]==value)
        {
            cout<<0<<endl;
            continue;
        }
        
        
        if(p<k)
        {
            if(x[p]>value)    //possible
            {
                for(ll i=p;i>=1;i--)
                {
                    if(x[i]>=value && x[i-1]<=value)
                    {
                        count++;
                        break;
                    }
                    else
                    {
                        count++;
                    }
                }
            }
            else
            {
                sure=1;
                cout<<-1<<endl;
                continue;
            }
        }
        else if(p>k)
        {
            if(x[p]<value)    //possible
            {
                for(ll i=p;i<=n;i++)
                {
                    if(x[i]<=value && x[i+1]>=value)
                    {
                        count++;
                        break;
                    }
                    else
                    {
                        count++;
                    }
                }
            }
            else
            {
                sure=1;
                cout<<-1<<endl;
                continue;
            }
        }
        else
        {
            if(value>x[k])  //value is grater than x[k] 
            {
                for(ll i=k+1;i<=n+1;i++)
                {
                    if(value<=x[i])
                    {
                        count++;
                        break;
                    }
                    else
                    {
                        count++;
                    }
                }
            }
            else
            {
                for(ll i=k-1;i>=0;i--)
                {
                    if(value>=x[i])
                    {
                        count++;
                        break;
                    }
                    else
                    {
                        count++;
                    }
                }
            }
        }
        
        
        
        
        
        
        
        
        if(sure==0)
        {
            cout<<count<<endl;
        }
    }
	return 0;
}




