#include <iostream>
#include <string>
#include <vector>
#define ll long long

using namespace std;

void solve(){
    ll n,m;
    cin >> n >> m;

    vector<string> words(n);
    for (ll i = 0; i< n; i++) {
        cin >> words[i];
    }

    ll total =0, x = 0;

    for(ll i = 0; i < n; i++){
        if (total + words[i].length() <= m){
            total += words[i].length();
            x++;
        }else {
            break;
        }
    }
    cout << x << endl;
}

int main(){
    ll tt;
    cin >> tt;
    while (tt--) {
        solve();
    }
    return 0;
}

