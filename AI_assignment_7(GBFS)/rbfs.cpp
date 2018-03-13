#include<cstdio>
#include<iostream>
#include<vector>
#include<queue>
#include <string>
#include <string.h>
#include <stack>

using namespace std;

#define sz 100

int start, end, no_of_node, no_of_edge;
int nodeList[sz], hn[sz], parent[sz], dist[sz];
vector<int>edgeList[sz];
int weight[sz][sz];
bool color[sz];

void developer();
void getInput();
void pathPrint();
void greadyBestFirstSearch();

int main()
{
    cout<<"Enter number of Node : ";
    cin>>no_of_node;
    cout<<"Enter number of Edge : ";
    cin>>no_of_edge;
    getInput();
    cout<<"Enter source and Destination : ";
    cin>>start>>end;

    greadyBestFirstSearch();

    pathPrint();

    cout<<"Total Cost = "<<dist[end]<<endl<<endl;

    developer();

    return 0;
}

void getInput()
{
    cout<<"Enter node and their h(n)\n";
    for(int i=0; i<no_of_node; i++)
    {
        int nd, hr;
        cin>>nd>>hr;
        nodeList[i] = nd;
        hn[nd] = hr;
    }

    cout<<"Enter the edge list :\n";
    for(int i=0; i<no_of_edge; i++)
    {
        int s, d, w; //s=source and d=destination
        cin>>s>>d>>w;
        edgeList[s].push_back(d);
        edgeList[d].push_back(s);
        weight[s][d] = w;
        weight[d][s] = w;
    }
}


void greadyBestFirstSearch()
{
    queue<int>Q;
    memset(parent, -1, sizeof(parent));

    Q.push(start);
    parent[start] = -10;
    dist[start] = 0;
    color[start] = true;

    int now_visit, min_hn;

    while(!Q.empty())
    {
        min_hn = hn[start];
        int u, v;
        u = Q.front();
        Q.pop();

        for(int i=0; i<edgeList[u].size(); i++)
        {
            v = edgeList[u][i];
            if(hn[v] < min_hn)
            {
                min_hn = hn[v];
                now_visit = v;
            }
        }
        if(color[now_visit == false])
        {
            Q.push(now_visit);
            parent[now_visit] = u;
            dist[now_visit] = dist[u] + weight[u][now_visit];
            color[now_visit] = true;
        }
        if(now_visit == end)
            break;
    }
}


void pathPrint()
{
    int tempEnd = end;
    stack<int>S;
    S.push(tempEnd);
    while(true)
    {
        tempEnd  = parent[tempEnd ];
        if(start == tempEnd )
        {
            S.push(tempEnd);
            break;
        }
        S.push(tempEnd );
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
