#include <iostream>
 
#define ll long long 
 
 
using namespace std;
 
 
 
void solve() {
    ll n, b, c;
    cin >> n >> b >> c;
 
    if (c>=n) {
        cout << n << endl;
        return;
    }
 
    if (b == 0) {
        if (c<n-2) {
            cout << -1 << endl;
            return;
        }
 
        if(c<n) {
            cout << n-1 << endl;
            return;
        } 
    }
 
   
    cout << n - ((n-c+(b-1))/b) << endl;
}
 
int main() {
    int t;
    cin >> t;
    while (t--) solve();
    return 0;
}
