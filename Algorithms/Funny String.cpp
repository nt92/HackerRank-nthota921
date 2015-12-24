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
    
        string reverseS = "";
        for(int i = s.length() - 1; i >= 0; i--)
        {
            reverseS += s[i];
        }
        
        bool isFunny = true;
        
        for(int i = 1; i < s.length(); i++)
        {
            if(!((abs(s[i] - s[i-1])) == abs(reverseS[i] - reverseS[i-1])))
            {
                isFunny = false;
                break;
            }
        }
        
        if(isFunny)
            cout << "Funny" << endl;
        else
            cout << "Not Funny" << endl;
    }
    
    return 0;
}