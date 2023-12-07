#include <stdio.h>
#include <math.h>
#pragma warning(disable:4996)

int main() {

	//freopen("input.txt", "r", stdin);

	int T;
	int num1, num2;

	scanf("%d", &T);

	for (int i = 0; i < T; i++) {
		scanf("%d %d", &num1, &num2);
		printf("%d\n", num1+num2);
	}
}