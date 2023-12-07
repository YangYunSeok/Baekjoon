#include <stdio.h>
#include <math.h>
#pragma warning(disable:4996)

int main() {

	//freopen("input.txt", "r", stdin);

	int num;

	scanf("%d", &num);

	for (int i = 1; i <= num; i++) {
		for (int j = num; j > i; j--) {
			printf(" ");
		}
		for (int s = 1; s <= i; s++) {
			printf("*");
		}
		printf("\n");
	}
}