//Calculates the minimum number of changes needed to made to a string of a set of two in order to make them anagrams of each other.

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
    
    for(int i = 0; i < t; i++)
    {
        string s;
        cin >> s;
        int strLen = s.length();
        if(strLen % 2 == 0)
        {
            string a, b;
            for(int i = 0; i < strLen/2; i++)
            {
                a += s[i];
                b += s[strLen/2+i];
            }
            
            int arrA[26];
            int arrB[26];

            for(int i = 0; i < 26; i++)
            {
                arrA[i] = 0;
                arrB[i] = 0;
            }

            for(int i = 0; i < strLen/2; i++)
                arrA[(int)a[i] - 97]++;

            for(int i = 0; i < strLen/2; i++)
                arrB[(int)b[i] - 97]++;

            int sum = 0;

            for(int i = 0; i < 26; i++)
                sum += abs(arrA[i] - arrB[i]);
            
            cout << sum/2 << endl;
        }
        else
            cout << -1 << endl;
    }
    
    return 0;
}