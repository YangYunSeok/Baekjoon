#include <stdio.h>
#include <math.h>
#pragma warning(disable:4996)

int main() {

	//freopen("input.txt", "r", stdin);

	char array[1000];
	int num;

	gets(array);
	scanf("%d", &num);

	printf("%c", array[num-1]);
}