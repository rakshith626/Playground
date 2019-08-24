#include<stdio.h>
int main()
{
  //Type your code here
  int divident=365,divisor=4,quotient,remainder;
  quotient=divident/divisor;
  remainder=divident%divisor;
  printf("Quotient: %d\n",quotient);
  printf("Remainder: %d",remainder);
  return 0;
}