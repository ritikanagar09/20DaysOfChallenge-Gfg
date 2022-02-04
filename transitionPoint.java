package arrays_questions;

public class transitionPoint {
	static int tPoint(int [] arr, int n) {   
	int i=0;
     int j=n-1;
     int mid=i+(j-i)/2;
     while(i<=j) {
    	 if(arr[mid]==0) {
    		 i=mid+1;
    	 }
    	 else {
    		 j=mid-1;
    	 }
    	 mid=i+(j-i)/2;
     }
     if(i==n) {
    	 return -1;
     }
     if(j==0) {
    	 return -1;
     }
     return i;
	}
       

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {0,0,0,1,1,1};
		System.out.println(tPoint(arr,arr.length));
	}

}
