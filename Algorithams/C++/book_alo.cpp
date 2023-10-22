#include<iostream>
using namespace std;

void makearr(int arr[],int size){
    for (int i=0;i<size;i++){
        cin>>arr[i];
    }
}

void printarr(int arr[],int size){
    for (int i=0;i<size;i++){
        cout<<arr[i]<<" ";
    }
}

bool ispossible(int arr[],int size,int m,int mid){
    int studentcount=1;
    int pagesum=0;
    for (int i=0;i<size;i++){
        if (pagesum+arr[i]<=mid){
            pagesum+=arr[i];
        }
        else{
            studentcount++;
            if (studentcount>m || arr[i]>mid){
                return false;
            }
            pagesum=arr[i];
        }
    }
    return true;
}

int allobook(int arr[],int size,int m){
    int s=0,sum=0;
    for (int i=0;i<size-1;i++){
        sum+=arr[i];
    }
    int e=sum;
    int mid=s+(e-s)/2;
    int ans=-1;
    while(s<=e){
        if (ispossible(arr,size,m,mid)){
            ans=mid;
            e=mid-1;
        }
        else{
            s=mid+1;
        }
        mid=s+(e-s)/2;
    }
    return ans;
}

int main(){
    int a;
    cout<<"Enter the size of array: ";
    cin>>a;
    int arr[a];
    makearr(arr,a);
    int n;
    cout<<"Enter the number of the students: ";
    cin>>n;
    int ans=allobook(arr,a,n);
    cout<<ans;
}