 #include<stdio.h>

int Calculte_Square(int Number);
 
int main()
{
  int number, Square;
 
 
  scanf("%d", &number);
  
  Square = Calculte_Square(number);
  
  printf("%d",Square); 
 
  return 0;
}

int Calculte_Square(int Number)
{
	return Number * Number;
}