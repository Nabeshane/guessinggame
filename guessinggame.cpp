#include <cstdlib>
#include <ctime>
#include <iostream>

using namespace std;

int  main () {
	int numberofguesses = 0;
	int guess;
	srand (time(NULL));
	int number = rand() % 100 + 1;
	do {
		numberofguesses++;
		cout << "Please guess a number between one and one-hundred" << endl;
		cin >> guess;
		if (guess == number) {
			cout << "You win!" << endl;
		}
		else if (guess < number) {
			cout << "Too low!" << endl;
		}
		else if (guess > number) {
			cout << "Too high!" << endl;
		}
		else {
			cout << "you have not entered a number, you must enter a number to win." << endl;
		}
	}while (guess != number);
	cout << numberofguesses << endl;
}
