#include <climits>
#include <iostream>
#include <vector>
#define ll long long

using namespace std;

void solve(){
    ll n;
    cin >> n;
    ll sumEven = 0;
    ll sumOdd = 0;
    ll even = 0, odd = 0;
    vector<ll> a(n);
    for(ll i = 0; i < n; i++){
        cin >> a[i];
        if (i & 1){
            odd++;
            sumOdd += a[i];
        }else {
            even++;
            sumEven += a[i];
        }

    }
    if ((sumEven / even == sumOdd / odd) && (sumEven % even == 0 && sumOdd % odd == 0)){
        cout << "YES" << endl;
    }else {
        cout << "NO" << endl;
    } 
}

int main(){
    ll tt;
    cin >> tt;
    while (tt--) {
        solve();
    }
    return 0;
}

