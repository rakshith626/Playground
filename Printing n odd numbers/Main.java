    #include<stdio.h>
 
int main()
{
  	int i, number;
 
  	printf("");
  	scanf("%d", &number);
  
  	printf("",number);
  	for(i = 1; i <= number*2; i++)
  	{
    	if ( i % 2 != 0 ) 
    	{
  			printf("%d\n",i);
    	}
  	}
 
  	return 0;
}