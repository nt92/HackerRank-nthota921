//Checks to see how many total characters need to be deleted from two strings in order to make them anagrams of each other

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() 
{
    string a, b;
    cin >> a >> b;
    
    int arrA[26];
    int arrB[26];
    
    for(int i = 0; i < 26; i++)
    {
        arrA[i] = 0;
        arrB[i] = 0;
    }
    
    for(int i = 0; i < a.length(); i++)
        arrA[(int)a[i] - 97]++;
    
    for(int i = 0; i < b.length(); i++)
        arrB[(int)b[i] - 97]++;
    
    int sum = 0;
    
    for(int i = 0; i < 26; i++)
        sum += abs(arrA[i] - arrB[i]);
    
    cout << sum;
    
    return 0;
}