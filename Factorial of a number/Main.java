  #include <stdio.h>

int main()
{
    int i, num,fact=1;

    /* Input number from user */

    scanf("%d", &num);

    /* Run loop from 1 to num */
    for(i=1; i<=num; i++)
    {
        fact = fact * i;
    }

    printf("%d",fact);

    return 0;
}