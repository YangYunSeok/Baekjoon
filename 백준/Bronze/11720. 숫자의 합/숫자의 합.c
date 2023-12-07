#include <stdio.h>
#include <math.h>
#pragma warning(disable:4996)

int main() {

	//freopen("input.txt", "r", stdin);

	int T;
	int num, sum = 0;
	int nums[100];

	scanf("%d", &T);

	for (int i = 0; i < T; i++) {
		scanf("%1d", &nums[i]);
	}

	for (int i = 0; i < T; i++) {
		sum += nums[i];
	}

	printf("%d", sum);
}