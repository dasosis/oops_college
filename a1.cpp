/*
create bass class figure
2 derived closed and open 
2 classes polygon and ellipse derived from closed 
class Line from open class
objects p e l
all classes got contructor and destr...
destroy the objects
*/

#include<iostream>
using namespace std;
class figure {
	public:
		figure()
		{
			cout<<"figure constructor called"<<endl;
		}
		~figure()
		{
			cout<<"figure destructor called"<<endl;
		}
}; 
class open : public figure {
	public:
		open()
                {
                        cout<<"open constructor called"<<endl;
                }
                ~open()
                {
                        cout<<"open destructor called"<<endl;
                }

};
class closed : public figure {
	public:	
		closed()
                {
                        cout<<"closed constructor called"<<endl;
                }
                ~closed()
                {
                        cout<<"closed destructor called"<<endl;
                }

};
class polygon : public closed {
	public:		
		polygon()
                {
                        cout<<"polygon constructor called"<<endl;
                }
                ~polygon()
                {
                        cout<<"polygon destructor called"<<endl;
                }

};
class ellipse : public closed {
	public:
		ellipse()
                {
                        cout<<"ellipse constructor called"<<endl;
                }
                ~ellipse()
                {
                        cout<<"ellipse destructor called"<<endl;
                }

};
class line : public open {
	public:
		line()
                {
                        cout<<"line constructor called"<<endl;
                }
                ~line()
                {
                        cout<<"line destructor called"<<endl;
                }
};

int main() {
	polygon p;
	ellipse e;
	line l;
}
