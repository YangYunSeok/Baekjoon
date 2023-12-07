#include <stdio.h>
#include <math.h>
#pragma warning(disable:4996)

int main() {

	//freopen("input.txt", "r", stdin);

	int hour, min;
	int Phour = 0, Pmin = 0;

	scanf("%d %d", &hour, &min);

	Pmin = min - 45;
	Phour = hour;

	if (Phour == 0 && Pmin > 0) {
		Phour = 0;
	}else if (Phour == 0 && Pmin < 0) {
		Pmin = 60 + min - 45;
		Phour = 23;
	}
	else if(Pmin < 0) {
		Pmin = 60 + min - 45;
		Phour = hour - 1;
	}

	printf("%d %d", Phour, Pmin);
}