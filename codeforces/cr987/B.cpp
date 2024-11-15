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

    for (int i = 0; i < n; i++){
        if(abs(i+1-p[i]) >= 2){
            cout << "NO" << endl;
            return;
        }

    }
    cout << "YES" << endl;
}

int main(){
    ll tt;
    cin >> tt;
    while (tt--) {
        solve();
    }
    return 0;
}

