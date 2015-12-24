#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    string s;
    getline(cin, s);
    int l = 97;
    int c = 65; 
    int p = 0;
    
    for(int i = 0; i < 26; i++)
    {
        for(int j = 0; j < s.length(); j++)
        {
            if((int)s[j] == l || (int)s[j] == c)
            {
                p++;
                break;
            }
        }
        l++;
        c++;
    }
    
    if(p == 26)
        cout << "pangram";
    else
        cout << "not pangram";
}