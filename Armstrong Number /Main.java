 #include <stdio.h>
int main()
{
    int num, originalNumber, remainder, result = 0;

    
    scanf("%d", &num);

    originalNumber = num;

    while (originalNumber != 0)
    {
        remainder = originalNumber%10;
        result += remainder*remainder*remainder;
        originalNumber /= 10;
    }

    if(result == num)
        printf("Armstrong Number",num);
    else
        printf("Not an Armstrong Number",num);

    return 0;
}