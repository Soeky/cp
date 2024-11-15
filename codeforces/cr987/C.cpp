#include <iostream>

#define ll long long

using namespace std;

void solve() {
    int n;
    cin >> n;
    int start = 1;
    if (n%2==1){
        if(n < 27){
            cout << "-1" << endl;
            return;
        }
        ll num = 2;
        for (int i = 0; i < 27; i++) {
            if (i == 0 || i == 9 || i== 25) {
                cout << "1 ";
            }else if (i == 22 || i == 26){
                cout << "13 ";
            }else {
                cout << num << " " << num << " ";
                num ++; 
                i++;
            }
        }
        n-=27;
        start = 14;
    }
    for (int i = 0; i<n/2; i++) {
        cout << start << " " << start << " ";
        start++;
    }
    cout << endl;
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}
