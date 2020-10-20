#include<iostream>
using namespace std;
int main()
{
    int a[5][5],b[5][5],c[5][5],m,n,p,q,i,j,k,count = 0;
    cout<<"Enter rows and columns of first matrix:";
    cin>>m>>n;
    count++;
    cout<<"Enter rows and columns of second matrix:";
    cin>>p>>q;
	count++;
    if(n==p)
    {
        cout<<"\nEnter first matrix:\n";
        for(i=0;i<m;++i){
            for(j=0;j<n;++j){
				count++;
                cin>>a[i][j];
		}
	}
        cout<<"\nEnter second matrix:\n";
        for(i=0;i<p;++i){
            for(j=0;j<q;++j){
				count++;
                cin>>b[i][j];
			}
		}
        cout<<"\nThe new matrix is:\n";
        for(i=0;i<m;++i)
        {
            for(j=0;j<q;++j)
            {
                c[i][j]=0;
                for(k=0;k<n;++k)
                    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                cout<<c[i][j]<<" ";
                count++;
        }
            cout<<"\n";
        }
    }
    else
        cout<<"\n Matrix multiplication can't be done";
cout<<"number of instructions: "<<count;
    return 0;
}

