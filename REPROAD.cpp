#include<iostream>
#include<conio.h>
using namespace std;


int main(){
	freopen("input.txt", "r", stdin);
	int T;
	cin>>T;
	for(int tc = 1; tc <= T; tc++){
		int n, k;
		cin>>n>>k;
		int a[10000];
		for (int i = 0; i < n; i++)
		{
			cin>>a[i];
		}
		
		int front = 0;
		int max_len = 0;
		int zeros = 0;

		for(int i = 0; i < n; i++)
		{
			if(a[i] == 0){
				zeros++;
			}
			if (zeros <= k)
			{
				max_len = max(i - front + 1, max_len);
			}else{
				while( zeros > k && front < i ) {
					if(a[front] == 0){
					    zeros--;
					}
					front++;
				}
			}
		}
		cout<<max_len<<endl;
	}
	
	_getch();
}
