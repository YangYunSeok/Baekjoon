#include <stdio.h>
#pragma warning(disable:4996)

int main() {

	//freopen("input.txt", "r", stdin);

	int koi[5] = {0};
	int sum = 0;

	for (int i = 0; i < 5; i++) {
		scanf(" %d", &koi[i]);
	}

	for (int i = 0; i < 5; i++) {
		sum += koi[i] * koi[i];
	}
	
	int final = 0;

	final = sum % 10;

	printf("%d", final);

}