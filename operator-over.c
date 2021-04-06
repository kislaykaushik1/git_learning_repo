#include<iostream>
using namespace std;
class Complex
{
int real, img;
 public:
 complex( ){
real=img=0;
}
complex (float r, float i)
{
real=r;
img=i;
}
friend Complex operator + (int x, Complex c2);
void display()
{
 cout<<real<<"+"<<img<<"i"<<"\n";
 }
};
Complex operator+(int x, Complex c1)
{
 Complex c;
 c.real=x +c1.real;
 c.img=x + c1.img;
 return c;
}
int main()
{
 Complex c1(7,8), sum;
 sum = 5+c1;
 operator +(5, c1);
 c1.display();
 sum.display();
 return 0;
}
