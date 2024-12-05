#include <iostream>
#define ll long long

using namespace std;

void solve(){
    string num;
    cin >> num;
    ll quersumme = 0;
    ll zweier = 0; 
    ll dreier = 0;
    for (char c: num){
        ll x = c - '0';
        if (x == 2){
            zweier++;
        }
        if (x==3){
            dreier++;
        }
        quersumme += x;
    }
    if (quersumme % 9 == 0){
        cout << "YES" << endl; 
        return;
    }
    if (zweier == 0 && dreier == 0) {
        cout << "NO" << endl;
        return;
    }
    ll rest = quersumme % 9;
    for (ll i = 0; i <= zweier; i++){
        for (ll j = 0; j <= dreier; j++){
            if ((rest + 2*i + 6*j) % 9 == 0){
                cout << "YES" << endl;
                return;
            }
        }
    }
    cout << "NO" << endl;
}

int main(){
    ll tt;
    cin >> tt;
    while (tt--) {
        solve();
    }
    return 0;
}

