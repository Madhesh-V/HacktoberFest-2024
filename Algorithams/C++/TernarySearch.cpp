#include <bits/stdc++.h>
using namespace std;
// BY DIABLO
int ternarySearch(int l, int r, int key, vector<int> arr)
{
    if (arr.empty()) {
        return -1;
    }

    while (r >= l) {
        int mid1 = l + (r - l) / 3;
        int mid2 = r - (r - l) / 3;

        if (arr[mid1] == key) {
            return mid1;
        }
        if (arr[mid2] == key) {
            return mid2;
        }
        if (key < arr[mid1]) {
            r = mid1 - 1;
        }
        else if (key > arr[mid2]) {
            l = mid2 + 1;
        }
        else {
            l = mid1 + 1;
            r = mid2 - 1;
        }
    }
    return -1;
}

int main()
{
    int l, r, p, key;
    vector<int> arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    l = 0;
    r = arr.size()-1;
    key = 15;
    p = ternarySearch(l, r, key, arr);
    if (p == -1) {
        cout << "Key " << key << " is not found in the array." << endl;
    }
    else {
        cout << "Index of " << key << " is " << p << endl;
    }
}