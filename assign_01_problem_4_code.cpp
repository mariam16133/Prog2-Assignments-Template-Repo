//Mariam Mohamed
//20216133

#include <iostream>
using namespace std;
 
int main() {
    int A, B, C;
    cin >> A >> B >> C;
 
    int minnum = A;
    if (B < minnum) {
        minnum = B;
    }
    if (C < minnum) {
        minnum = C;
    }
 
    int maxnum = A;
    if (B > maxnum) {
        maxnum = B;
    }
    if (C > maxnum) {
        maxnum = C;
    }
 
    int midnum = A + B + C - minnum - maxnum;
 
    cout << minnum <<endl;
    cout << midnum <<endl;
    cout << maxnum << endl;
    cout<<endl; 
    cout << A <<endl; 
    cout<< B <<endl; 
    cout<<C << endl;
 
    return 0;}
