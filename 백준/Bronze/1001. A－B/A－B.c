#include <stdio.h>
#pragma warning(disable:4996)

int main() {

	int num1, num2, result = 0;

	scanf("%d %d", &num1, &num2);
	result = num1 - num2;

	printf("%d", result);
}