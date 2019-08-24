 #include <stdio.h>
int main()
{
    int number, i;

    printf("");
    scanf("%d",&number);

    printf("", number);
    for(i=1; i <= number; ++i)
    {
        if (number%i == 0)
        {
            printf("%d\n",i);
        }
    }

    return 0;
}