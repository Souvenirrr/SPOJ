// Hydro.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
using namespace std;

int main() {
	int tc;
	int N;
	cin >> tc;
	int a[10000];



	for (int t = 0; t < tc; t++) {
		cin >> N;
		int max = 0;
		int result = 0;
		for (int j = 0; j < N; j++)
		{
			cin >> a[j];
			if (a[j] > a[max]) max = j;
		}

		for (int i = 0; i <= max - 1; i++) {
			if (a[i] > a[i + 1]) {
				result += a[i] - a[i + 1];
				a[i + 1] = a[i];
			}
		}
		for (int i = N - 1; i >= max + 1; i--) {
			if (a[i] > a[i - 1]) {
				result += a[i] - a[i - 1];
				a[i - 1] = a[i];
			}
		}
		cout << result << " ";
	}

	return 0;
}
