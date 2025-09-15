// simple_array.c
#include <stdio.h>

int main() {
    int n;
    printf("n: ");
    if (scanf("%d", &n) != 1 || n <= 0) return 0;
    int a[n];
    for (int i = 0; i < n; ++i) {
        scanf("%d", &a[i]);
    }

    long long sum = 0;
    printf("Array: ");
    for (int i = 0; i < n; ++i) {
        printf("%d ", a[i]);
        sum += a[i];
    }
    printf("\nSum = %lld\nAvg = %.2f\n", sum, (double)sum / n);
    return 0;
}