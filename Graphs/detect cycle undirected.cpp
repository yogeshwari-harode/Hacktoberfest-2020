//DFS to detect cycle
#include<bits/stdc++.h>
#include<iostream>
using namespace std;
class graph{
	int V;
	list<int> *adj;
public:
	graph(int V);
	void addEdge(int v,int w);
	bool is_cyclicutil(int s,bool vis[],int parent);
	bool is_cyclic();
};
graph::graph(int V){
	this->V=V;
	adj=new list<int>[V];
}
void graph::addEdge(int v,int w){
	adj[v].push_back(w);
}
bool graph::is_cyclicutil(int s,bool vis[],int parent){
	vis[s]=true;
	//cout<<s<<" ";
	list<int>::iterator it;
	for(it=adj[s].begin();it!=adj[s].end();it++){
		if(vis[*it]==false){
			if(is_cyclicutil(*it,vis,s))
			return true;
		}
		else if(*it!=parent){
		
			return true;
		}
		
	}
	return false;
}
bool graph::is_cyclic(){
	int i;
	bool *vis=new bool[V];
    for(i=0;i<V;i++)
    vis[V]=false;
  
       for(i=0;i<V;i++)
       	if(vis[i]==false)
       		if(is_cyclicutil(i,vis,-1))
		   		return true;
		   	return false;
	   
	
}
int main(){
	 graph g1(5); 
    g1.addEdge(1,0); 
    g1.addEdge(0,2); 
    g1.addEdge(2,1); 
    g1.addEdge(0,3); 
    g1.addEdge(3,4); 
    g1.is_cyclic()? cout<<"Graph contains cycle\n": 
                   cout<<"Graph doesn't contain cycle\n"; 
  
    graph g2(3); 
    g2.addEdge(0,1); 
    g2.addEdge(1,2); 
    g2.is_cyclic()? cout<<"Graph contains cycle\n": 
                   cout<<"Graph doesn't contain cycle\n"; 
  
    return 0; 
	 
}
