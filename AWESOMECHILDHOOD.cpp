#include<iostream>
using namespace std;

int main(){
	freopen("input.txt", "r", stdin);

	int T;
	cin>>T;
	for (int tc = 0; tc < T; tc++)
	{
		long long int G;
		cin>>G;
		cout<<(G/2)<<endl;
	}
	
	return 0;
}