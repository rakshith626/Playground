#include<stdio.h>
int main()
{
  //Type your code here
  int length=6,breadth=9,peri,area;
  peri=2*(length+breadth);
  printf("The perimeter of the rectangle is: %d cm\n",peri);
  area=length*breadth;
  printf("The area of the rectangle is: %d sq cm",area);
  return 0;
}