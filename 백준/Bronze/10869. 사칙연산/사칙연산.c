#include <stdio.h>
#pragma warning(disable:4996)

int main() {

	//freopen("input.txt", "r", stdin);

	int num1, num2, result=0;

	scanf("%d %d", &num1, &num2);

	printf("%d\n", num1 + num2);
	printf("%d\n", num1 - num2);
	printf("%d\n", num1 * num2);
	printf("%d\n", num1 / num2);
	printf("%d\n", num1 % num2);
}