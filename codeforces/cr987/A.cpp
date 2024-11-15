#include <algorithm>
#include <climits>
#include <iostream>
#include <vector>
#define ll long long

using namespace std;

void solve(){
    ll n;
    cin >> n;
    vector<ll> p(n);
    for (ll i = 0; i < n; i++) {
        cin >> p[i];
    }
    ll op = LONG_MAX;
    for (ll i = 0; i < n; i++){
        ll b = 0;
        for (ll j = 0; j<i; j++){
            if(p[j] > p[i]) b++;
        }
        int s = 0;
        for (ll j = i+1; j<n; j++){
            if(p[j]<p[i]) s++;
        }
        op = min(op, b+s);
    }

    cout << op << endl;
}

int main(){
    ll tt;
    cin >> tt;
    while (tt--) {
        solve();
    }
    return 0;
}

