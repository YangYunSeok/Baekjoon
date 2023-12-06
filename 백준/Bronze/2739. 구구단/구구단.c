#include <stdio.h>
#pragma warning(disable:4996)

int main() {

	//freopen("input.txt", "r", stdin);

	int dan;

	scanf("%d", &dan);

	for (int j = 1; j <= 9; j++) {
		printf("%d * %d = %d", dan, j, dan * j);
		printf("\n");
	}

}