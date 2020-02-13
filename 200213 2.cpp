// ConsoleApplication1.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include "pch.h"
#include <iostream>
#include <string>
using namespace std;
int main()
{
	typedef int weapon;
	const int gun = 1;
	const int rifle = 2;
	weapon myWeapon = gun;
	if (myWeapon == gun){
		std::cout << "  ###  ###\n  ###  ###\n ###  ### \n\n ###  ### \n###  ###  \n### ###\n\nDRILLAZ WITH THE SPINNERS\n" << endl;
}
	else if (myWeapon == rifle) {
		std::cout << "  ###  ###\n  ###  ###\n ###  ### \n\n ###  ### \n###  ###  \n### ###\n\nDRILLAZ WITH THE ******* SPINNERS\n" << endl;
	}
	int currentWeapon = 0;
	if (currentWeapon == 0) {
		cout << "iea swing fiyu fist pao Q" << endl;
	}
	else if (currentWeapon == 1){
		cout << "iea swing fiyu skeng pao Q" << endl;
}
	enum weapon { unarmed = "u", sword = "s" , axe = "a" , skeng = "k"};

	weapon cWeap = unarmed;

	if (cWeap == unarmed) {
		cout << /*name <<*/ " unarmed: actual value: " << char(cWeap) << endl;
	}
}
enum weaponType { axed, skeng, sword };
struct weapon {
	string name;
	int damage;
	weaponType wt;
}
	struct monster {
		string name;
		int hp, damage, armour;
	}
	weapon o1w;
	o1w.name = "it";
	o1w.damage = 23;
	o1w.wt = axe;

	monster orc;
	orc.name = "Orc";
	orc.hp = 20;
	orc.w = 01w;
	/*orc.armour = 5;*/

	cout << "the weopon of Orc1 is called " << o1w.name << endl;

	/*else (myColour == blue)
		std::cout << "Hello World!\n";*/

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
