#include <stdio.h>
#pragma warning(disable:4996)

int main() {

	double num1, num2;
	double result = 0;

	//freopen("input.txt", "r", stdin);

	scanf("%lf %lf", &num1, &num2);
	
	result = num1 / num2;

	printf("%.9lf", result);
}