/*
(a) Name of the depositer
(b) Account number
(c) Type of account
(d) Balance amount
Write the following member functions as public methods:
(a) To assign initial values
(b) To deopsit an amount
(c) To withdraw an amount after checking the balance
(d) To display name and balance
*/

#include<iostream>
#include<cstring>
using namespace std;

class bank_acc
{ 
private:
	string name;
	int accno;
	string type;
	int balance;
public:
	bank_acc initvalue(bank_acc);
	bank_acc deposit(bank_acc);
	bank_acc widraw(bank_acc);
	void display(bank_acc);
};

bank_acc bank_acc :: initvalue(bank_acc acc)
{
    cout << "enter name" << endl;
    cin >> acc.name;
    cout << "enter accno" << endl;
    cin >> acc.accno;
    cout << "enter type" << endl;
    cin >> acc.type;
    cout << "enter balance" << endl;
    cin >> acc.balance;
    return acc;
}

bank_acc bank_acc :: deposit(bank_acc acc)
{
    int depo;
    cout << "enter amount to deposit" << endl;
    cin >> depo;
    acc.balance = acc.balance + depo;
    return acc;
}

bank_acc bank_acc :: widraw(bank_acc acc)
{
    int amt;
    cout << "curent balance - " << acc.balance <<endl;
    cout << "enter amount to widraw" << endl;
    cin >> amt;
    if(amt <= acc.balance)
        acc.balance = acc.balance - amt;
    else
        cout << "not enough balance";
    return acc;
}

void bank_acc :: display(bank_acc acc)
{
    cout << "username - " << acc.name << endl;
    cout << "balance - " << acc.balance << endl;
}

int main()
{
    bank_acc my_acc;
    my_acc = my_acc.initvalue(my_acc);
    my_acc = my_acc.deposit(my_acc);
    my_acc = my_acc.widraw(my_acc);
    my_acc.display(my_acc);
}

