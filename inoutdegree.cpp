//This program is to accept a directed graph G from the user and compute the indegree and outdegree of each of its vertex.
#include<iostream>
using namespace std;
int main()
{int v,d=0,o=0,c,b,i,j;
 cout<<"Enter the number of vertices";
 cin>>v;
 int a[v][v];
 for(i=0;i<v;i++)
     {for(j=0;j<v;j++)
          {cout<<"Enter the number of edges from vertex "<<i+1<<" to vertex "<<j+1<<"  ";
           cin>>a[i][j];
          }
     }
 cout<<"The adjacency matrix of directed graph is displayed below"<<'\n';
 for(i=0;i<v;i++)
    {for(j=0;j<v;j++)
        cout<<a[i][j]<<"  ";
        cout<<'\n';
    }
for(i=1;i<=v;i++)
   {for(j=1;j<=v;j++)
       {cout<<"Enter the number of edges from vertex "<<i<<" to vertex "<<j<<"  ";
        cin>>b;
        o+=b;
        cout<<"Enter the number of edges from vertex "<<j<<" to vertex "<<i<<"  ";
        cin>>c;
        d+=c;
        }
        cout<<"The indegree of vertex "<<i<<" is "<<d<<'\n';
        cout<<"The outdegree of vertex "<<i<<" is "<<o<<'\n';
        o=0;
        d=0;
   }
system("pause");
}   
