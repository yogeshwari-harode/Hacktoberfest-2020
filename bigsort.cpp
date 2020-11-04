#include<bits/stdc++.h>
using namespace std;

long bigsort(long a[],long n){
    long temp;
    for(long i=0;i<n-1;i++){
        for(long j=0;j<n-i-1;j++){
             if(a[i]>a[i+1]){
                swap(a[i],a[i+1]);
             }

        }
        return a[i];
    }


}

int main(){
    long n;
    cin>>n;
    long a[n];
    for(long i=0;i<n;i++){
        cin>>a[i];
    }
    long ans=bigsort(a,n);
    cout<<ans;
}
