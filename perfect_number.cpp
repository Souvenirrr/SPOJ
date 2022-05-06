#include <iostream>
 
using namespace std;
 
bool checkPerfectNumber(int n) {
    int sum = 0;
    for(int i = 1; i <= n/2; i++){
        if(n % i == 0) 
            sum += i;
    }
    if (sum == n) return true;
    return false;
}
 
int main()
{
   if(checkPerfectNumber(6)) {
       cout<< "This is perfect number" << endl;
   } else {
       cout<< "This isn't perfect number" << endl;
   }
 
   return 0;
}
