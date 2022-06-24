#include<iostream>
using namespace std;

class consumer
{
	public:
		void display()
		{
			cout<<"consumer display";
		}
};
class transaction : public  consumer
{/*
	public:
		void display()
		{
			cout<<"transaction display";
		}*/
};
int main()
{
	transaction t;
	t.display();
	return 0;
}
