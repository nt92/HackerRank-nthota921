//Calculates the minimum number of operations to convert a string into a palindrome. I basically subtracted the ascii values of each pair of corresponding characters

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() 
{
    int t;
    cin >> t;
    for(int test = 0; test < t; test++)
    {
        string s;
        cin >> s;
        
        int numChanges = 0;
        
        for(int i = 0, j = s.length() - 1; i < s.length()/2 && j >= s.length()/2; i++, j--)
            numChanges += (abs(s[i] - s[j]));
        
        cout << numChanges << endl;
    }
    return 0;
}
