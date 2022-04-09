package Unit_01;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		// write code here!
		for(int i=0;i<arr.length;i++)
		{
			int j=i-1,key=arr[i];
			while(j>0&&key<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();

	}

	void findTheDuplicateElements(int[] arr) {
		// write code here!
		int max=maximum(arr);
		int min=minimum(arr);
		for(int i=min;i<=max;i++)
		{
			if(frequency(arr,i)==1)
				System.out.println(i);
		}
	}
	int frequency(int arr[],int i)
	{
		int f=0;
		for(int a=0;a<arr.length;a++)
		{
			if(i==arr[a])
				f++;
			if(f>1)
				return 1;
		}
		return 0;
	}
	int maximum(int arr[])
	{
		int m=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>m)
				m=arr[i];
		}
		return m;
	}
	int minimum(int arr[])
	{
		int m=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<m)
				m=arr[i];
		}
		return m;

	}
	
	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!
		int max=maximum(arr);
		int m=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>m&&arr[i]<max)
				m=arr[i];
		}
		int min=minimum(arr);
		int m2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<m2&&arr[i]>min)
				m2=arr[i];
		}
		System.out.println(m);
		System.out.println(m2);
	}

	void leftRotationInAnArray(int[] arr) {
		// write code here!
		int t=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=t;
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	void removeElementInArray(int[] arr) {
		// write code here!

	}

}
