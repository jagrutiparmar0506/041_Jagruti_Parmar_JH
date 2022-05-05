import java.util.*;
class Sort{
		public static void main(String[] args){
		int a1[]={2,4,6,8,3};
		int n=a1.length;
		System.out.println("Before Insertion Sort: "+Arrays.toString(a1));
		for(int i=n-1;i>=0;i--){
			int k=a1[i];
			int j=i-1;
			int temp=0;
			while(j>=0 && a1[j]>=k)
			{
				temp=a1[j+1]=a1[j];
				a1[j]=a1[j+1];
				a1[j+1]=temp;
				j--;
				System.out.println(Arrays.toString(a1));
			}
			
				temp=a1[j+1];
				a1[j+1]=k;
				k=temp;
		}
		System.out.println("After Insertion Sort: ");
		System.out.println(Arrays.toString(a1));
		
	}
}













