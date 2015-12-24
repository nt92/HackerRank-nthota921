#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;

bool comp(char temp)
{
    return ((temp < 91 && temp > 64) || (temp < 123 && temp > 96));    
}

int main(){
    int n;
    cin >> n;
    string s;
    cin >> s;
    int k;
    cin >> k;
    
    for(int i = 0; i < n; i++)
    {
        int temp = s[i];
        if(temp < 91 && temp > 64)
            s[i] = (65 + ((temp - 65 + k) % 26)); 
        else if(temp < 123 && temp > 96)
            s[i] = (97 + ((temp - 97 + k) % 26));        
    }
    cout << s;
    return 0;
}