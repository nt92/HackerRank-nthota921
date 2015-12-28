//Compares two strings by seeing if they have the same substring within each of them (I just checked if theres a common character within the string)

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
        string a, b;
        cin >> a >> b;
        
        int strListA[26];
        int strListB[26];
        
        for(int i = 0; i < 26; i++)
        {
            strListA[i] = 0;
            strListB[i] = 0;
        }
        
        for(int i = 0; i < a.length(); i++)
            strListA[(int)a[i] - 97]++;
        
        for(int i = 0; i < b.length(); i++)
            strListB[(int)b[i] - 97]++;
        
        bool hasSub = false;
        
        for(int i = 0; i < 26; i++)
        {
            if(strListA[i] > 0 && strListB[i] > 0)
            {
                hasSub = true;
                break;
            }
        }
        
        if(hasSub)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
    
    return 0;
}