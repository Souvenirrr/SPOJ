#include <iostream> 
#include <stack> 
#include <string>
using namespace std; 
  
/*int main() 
{ 
	freopen("input.txt", "r", stdin);
	for(int tc = 1; tc <= 4; tc++){
		string s;
		cin>>s;
		//cout<<s;
		stack<int> mystack; 
		for(int i = 0; i < s.length(); i++){
			if(s[i] == '('){
				mystack.push(0);
			}else if(s[i] == ')'){
				int temp = 0;
				while(!mystack.empty() && mystack.top() != 0){
					temp += mystack.top();
					mystack.pop();
				}
				if(!mystack.empty() && mystack.top() == 0){
					mystack.pop();
					mystack.push(temp);
				}
			}
			else if(s[i] == 'C') {mystack.push(12);}
			else if(s[i] == 'H') {mystack.push(1);}
			else if(s[i] == 'O') {mystack.push(16);}
			else if(s[i] >= '0' && s[i] <= '9'){
				int number = s[i] - '0';
				if(!mystack.empty()){
					int temp = mystack.top();
					temp *= number;
					mystack.pop();
					mystack.push(temp);
				}else{}
			}	
		}
		int result = 0;
		while(!mystack.empty()){
			result += mystack.top();
			mystack.pop();
		}
		cout<<result;
		//cout<<"#"<<tc<<" "<<result<<endl;
	}
	//_getch();
}*/ 