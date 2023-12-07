#include <stdio.h>
#include <math.h>
#pragma warning(disable:4996)

int main() {

	//freopen("input.txt", "r", stdin);

	int arrNum, x;
	int num[10000] = {0};
	int printNum[10000] = {0};

	int index = 0;

	scanf("%d %d", &arrNum, &x);
	
	for (int i = 0; i < arrNum; i++) {
		scanf("%d", &num[i]);
	}

	for (int i = 0; i < arrNum; i++) {
		if (num[i] < x) {
			printNum[index] = num[i];
			index++;
		}
	}

	for (int i = 0; i < arrNum; i++) {
		if (printNum[i] == 0) {
			break;
		}
		printf("%d ", printNum[i]);
	}
}