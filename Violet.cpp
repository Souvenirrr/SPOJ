// ConsoleApplication1.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <conio.h>
#include <iostream>
#include <string>
using namespace std;

int main()
{
	string a;
	cin >> a;

	if (a == "Monday") {
		cout << "Macaroon";
	}
	else if (a == "Saturday") {
		cout << "Sandwich";
	}
	else if (a == "Sunday") {
		cout << "Soup";
	}
	else if (a == "Tuesday") {
		cout << "Toffee";
	}
	else if (a == "Wednesday") {
		cout << "Waffles";
	}
	else if (a == "Thursday") {
		cout << "Taco";
	}
	else if (a == "Friday") {
		cout << "French Fries";
	}
	system("pause");
	return 0;
	
}


