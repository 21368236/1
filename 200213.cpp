// ConsoleApplication2.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
using namespace std;

int nP(int a) {
	a = a * 2;
	return a;
}
int P(int* a) {
	*a = *a * 2;
	return *a;
}


int main()
{
    std::cout << "Hello World!\n"; 
	int i = 100;
	int* p = &i;

	cout << "*i: " << i << endl;
	cout << "*value IN p: " << *p << endl;
	cout << "*value OF p: " << p << endl;
    cout << sizeof i << endl;
	cout << "*the addres of p is: " << &i << endl;
	cout << "*value IN p: " << endl;
	cout << "obia m'''pointer''" << endl;
	*p = 2222;
	cout << "*i: " << i << endl;
	cout << "*value IN p: " << *p << endl;
	cout << "*value OF p: " << p << endl;

	int x = 4;
	int result = nP(x)
		cout << "x: " << x << endl;
	 cout << "x: " << x << endl;
	 int intArray[] = { 1, 2, 3, 4, 5, 6 };
	 int intArray2[6];
	 cout << intArray[0] << endl;
	 char name[] = "Reiwa Child is the one the has the key to oneprofor";
	 cout << name << endl;
	 cout << "Size of char array: " << sizeof(name) << endl;
	 cout << "Size of char IN array: " << sizeof(name[0]) << endl;
	 cout << name[0] << endl;
	 cout << name[1] << endl;
	 cout << name[2] << endl;
	 cout << name[20] << endl;
	 //name[20] = "k";

}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
