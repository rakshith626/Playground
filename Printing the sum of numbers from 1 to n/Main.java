  #include <stdio.h>
int main()
{
    int n, i, sum = 0;
    
    printf(" ");
    scanf("%d",&n);

    for(i=1; i <= n; ++i)
    {
        sum += i;   // sum = sum+i;
    }

    printf("    %d",sum);

    return 0;
}