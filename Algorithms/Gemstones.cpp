//Checks a list of strings to see how many characters appear in every string

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int numGems;
    cin >> numGems;
    string gemList[numGems];
    for(int i = 0; i < numGems; i++)
        cin >> gemList[i];
       
    int numGE = 0;
    for(int i = 97; i < 123; i++)
    {
        int numIn = 0;
        for(int j = 0; j < numGems; j++)
        {
            for(int k = 0; k < gemList[j].length(); k++)
            {
                if(gemList[j][k] == i)
                {
                    numIn++;
                    break;
                }
            }
        }
        if(numIn == numGems)
            numGE++;
    }
    
    cout << numGE << endl;
    
    return 0;
}