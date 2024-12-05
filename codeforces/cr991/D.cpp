#include <iostream>
#include <utility>
#define ll long long

using namespace std;

void solve() {
    string s;
    cin >> s; // Read the input string
    int n = s.length();

    for (int i = 1; i < n; i++) {
        while (i > 0 && s[i] > '0' && s[i - 1] < s[i] - 1) {
            // Reduce current digit by 1 and swap it with the left digit
            char new_digit = s[i] - 1;
            s[i] = s[i - 1];
            s[i - 1] = new_digit;

            i--; // Move to the left to check further swaps
        }
    }

    cout << s << endl; // Print the modified string
}

int main(){
    ll tt;
    cin >> tt;
    while (tt--) {
        solve();
    }
    return 0;
}

