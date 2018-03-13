#include<stdio.h>
#include<iostream>
#include<queue>
#include<vector>
#include<algorithm>
#include<stack>

#define sz 100

using namespace std;

int n, e, start, end;
int hn[sz];
int weight[sz][sz];
int color[sz];
int par[sz];
int fn[sz];
int dis[sz];

vector<int>graph[sz];

void getInput();
void pathPrint();
void aStarAlgorithm();
void developer();

struct node
{
    int nd, h;
    bool operator<(const node& rhs) const
    {
        return h > rhs.h;
    }
};

int main()
{
    cout<<"Enter number of node : ";
    cin>>n;
    cout<<"Enter number of edge : ";
    cin>>e;

    getInput();

    aStarAlgorithm();

    pathPrint();

    cout<<"Total cost is : "<<dis[end]<<endl<<endl;

    developer();

    return 0;
}

void getInput()
{
    int s, d, w, h;
    cout<<"Enter value of node and their h(n) : \n";
    for(int i=0; i<n; i++)
    {
        cin>>s>>h;
        hn[s] = h;
    }

    cout<<"Enter the source, destination and weight : \n";
    for(int i=0; i<e; i++)
    {
        cin>>s>>d>>w;
        graph[s].push_back(d);
        graph[d].push_back(s);
        weight[s][d] = w;
        weight[d][s] = w;
    }

    cout<<"Enter the start and end : ";
    cin>>start>>end;
}

void aStarAlgorithm()
{
    for(int i=0; i<n; i++)
        par[i] = 0;

    priority_queue<node>pq;
    node Node;
    Node.nd = start;
    Node.h = hn[start];
    pq.push(Node);
    fn[start] = hn[start];
    par[start] = -10;
    dis[start] = 0;

    while(!pq.empty())
    {
        Node = pq.top();
        pq.pop();

        int v, u = Node.nd;

        for(int i=0; i<graph[u].size(); i++)
        {
            v = graph[u][i];

            if(par[u] != v)
                par[v] = u;

            dis[v] = dis[u] + weight[u][v];
            fn[v] = dis[v] + hn[v];
            Node.nd = v;
            Node.h = fn[v];
            pq.push(Node);

            if( (v == end) && (fn[v] == pq.top().h))
                return;
        }
    }
}

void pathPrint()
{
    //cout<<"1_pritom";
    int tempEnd = end;
    stack<int>S;
    S.push(tempEnd);
    while(true)
    {
        //cout<<"rahat_2\n";
        tempEnd  = par[tempEnd];
        if(start == tempEnd )
        {
            S.push(tempEnd);
            break;
        }
        S.push(tempEnd);
    }

    cout<<"\nThe Final Path is : ";
    while(!S.empty())
    {
        int temp = S.top();
        S.pop();
        cout<<temp;
        if(S.size() != 0)
            cout<<" -> ";
        else
            cout<<"\n\n";
    }
}

void developer()
{
    cout<<"Supervised By : Mahadi Hasan Nahid\n";
    cout<<"Developed By : Pritom & Rahat\n\n";
}

/*
sample input :
8
9
0 366
1 329
2 253
3 193
4 176
5 160
6 100
7 0
0 1 118
0 2 140
2 3 80
2 4 99
3 5 146
3 6 97
5 6 138
4 7 211
6 7 101
0 7
*/
