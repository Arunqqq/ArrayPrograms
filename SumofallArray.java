1.Find the minimum and maximum element in an array
Ans 1:class FirstExample
{
	public static void main(String[] args) 
	{
		int array[] = new int[]{10,23,90,86,67,89,43,76,68,31};
		int max = getMax(array);
		System.out.println("Maximum Value is: "+max);
		int min = getMin(array);
		System.out.println("Manimum Value is: "+min);

	}
	public static int getMax(int[] inputArray){
		int maxValue = inputArray[0];
		for(int i=1;i<inputArray.length;i++){
			if(inputArray[i]>maxValue){
				maxValue=inputArray[i];
       }
	}

		return maxValue;
}
    public static int getMin(int[] inputArray){
		int minValue = inputArray[0];
		for(int i=1;i<inputArray.length;i++){
			if(inputArray[i]<minValue){
				minValue=inputArray[i];
       }
	}

		return minValue;
}
}

2.Write a program to reverse the array?
Ans 2:class ReverseArray {
	static void reverse(int a[],int n) {
		int[] b = new int[n];
		int j = n;
		for(int i=0;i<n;i++) {
			b[j-1] = a[i];
			j=j-1;
		}
	  System.out.println("After Reverse array is:");
	  for(int k=0;k<n;k++) {
		  System.out.println(b[k]);
	  }
	}
  public static void main(String[] args) {
	  int [] arr = {10,20,30,40,50};
      reverse(arr, arr.length);  
	  }
  }

3.write a program to sort the given array?
Ans 3:class SortingArray {

	public static void main(String[] args) {
		int[] arr = new int[] {50,60,8,6,1};
		int temp=0;
		System.out.println("Elements of original array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
        
		System.out.println("Elements of array sorted in ascending order:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}

4.Find the occurence of an integer in the array?
Ans 4:class Occurence {
	static int countOccurences(int arr[],int n,int x) {
		int res=0;
		for(int i=0;i<n;i++)
			if(x==arr[i])
				res++;
		return res;
	}

	public static void main(String[] args) {
         	int arr[] = {5,8,5,7,4,5};
         	int n=arr.length;
         	int x=5;
         	System.out.println(countOccurences(arr,n,x));

	}
}

5.Move all negative elements to one side of the array?
Ans 5:class NegativeArray {
		static void rearrange(int arr[], int n) 
		{
			int j=0, temp;
			for(int i=0;i<n;i++) {
				if(arr[i]<0) {
					if(i!=j) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					j++;
				}
			}
		}
		static void printArray(int arr[], int n) {
			for(int i=0;i<n;i++)
				System.out.print(arr[i] + " ");
		}

		public static void main(String[] args) {
			int arr[] = {7,8,6,-4,-3,-1};
			int n=arr.length;
			rearrange(arr, n);
			printArray(arr, n);
	}
}

6.Find duplicates in an array?
Ans 6:class Duplicates {
      void printRepeating(int arr[], int size)
      {
    	  int i;
    	  System.out.println("The repeating elements are : ");
    	  
    	  for(i=0;i<size;i++) {
    		  int j = Math.abs(arr[i]);
    		  if(arr[j] >= 0)
    			  arr[j] = -arr[j];
    		  else
    			  System.out.print(j + " ");
    	  }
      }
	public static void main(String[] args) {
       Duplicates duplicate = new Duplicates();
       int arr[] = {1,2,3,1,3,6,6};
       int arr_size = arr.length;
       duplicate.printRepeating(arr, arr_size);

	}
}

7.Find the factorial of a large number?
Ans 7:class Factorial {
	static void factorial(int n)
	{
		int res[] = new int[500];
		res[0]=1;
		int res_size=1;
		for(int x=2;x<=n;x++)
			res_size = multiply(x, res, res_size);
		System.out.println("Factorial of given number is");
		for(int i=res_size-1;i>=0;i--)
			System.out.print(res[i]);
	}
	static int multiply(int x,int res[],int res_size)
	{
		int carry=0;
		for(int i=0;i<res_size;i++)
		{
			int prod = res[i] *x + carry;
			res[i] = prod % 10;
			carry = prod/10;
		}
		while(carry!=0)
		{
			res[res_size] = carry % 10;
			carry = carry/10;
			res_size++;
		}
		return res_size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        factorial(80);
	}
}

8.How to find common elements in three sorted array?
Ans 8:class CommonElement {
    void findCommon(int arr1[], int arr2[], int arr3[])
    {
    	int i=0, j=0, k=0;
    	while(i<arr1.length && j < arr2.length && k<arr3.length)
    	{
    		if(arr1[i] == arr2[j] && arr2[j] == arr3[k] )
    		{
    			System.out.print(arr1[i]+" "); i++; j++; k++; }
    		else if(arr1[i] < arr2[j])
    			i++;
    		else if(arr2[j]<arr3[k])
    			j++;
    		else
    			k++;
    		}
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          CommonElement ob = new CommonElement();
          int arr1[] = {1,4,6,7,8,9,10};
          int arr2[] = {6,7,11,12,14,15};
          int arr3[] = {3,5,4,6,7,50,40};
          System.out.print("Common elements are ");
          ob.findCommon(arr1, arr2, arr3);
	}
}

9.How to rearrange array in alternating positive and negative number?
Ans 9:class Alternate {
	
	void rightrotate(int arr[], int n, int outofplace, int cur)
	{
		int tmp=arr[cur];
		for(int i=cur;i>outofplace;i--)
			arr[i] = arr[i-1];
		arr[outofplace]=tmp;
	}
	void rearrange(int arr[], int n)
	{
		int outofplace = -1;
		for(int index=0;index<n;index++)
		{
			if(outofplace>=0)
			{
				if(((arr[index]>=0) && (arr[outofplace]<0)) || ((arr[index]<0) && (arr[outofplace]>=0))) {
					rightrotate(arr,n,outofplace,index);
				if(index-outofplace>=2)
					outofplace = outofplace + 2;
				else
					outofplace = -1;
				}
			}
			if(outofplace == -1)
			{
				if(((arr[index]>=0) && ((index & 0x01) == 0)) || ((arr[index]<0) && (index & 0x01) == 1))
					outofplace = index;
			}
		}
	}
	
	void printArray(int arr[], int n)
	{
         for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
         System.out.println(" ");
	}
	public static void main(String[] args) {
		Alternate rearrange = new Alternate();
		int arr[] = {-5,9,0,-7,8,-8,6,3};
		int n = arr.length;
		System.out.println("Given array is ");
		rearrange.printArray(arr, n);
		
		rearrange.rearrange(arr, n);
		
		System.out.println("Rearranged array is ");
		rearrange.printArray(arr, n);
	}

}

10.Write a program to find the sum and product of all elements of an array?
Ans 10:class SumofArray {
    int findProductSum(int A[], int n)
    {
    	int product=0;
    	for(int i=0;i<n;i++)
    		for(int j=i+1;j<n;j++)
    			product = product + A[i]*A[j];
    	return product;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int A[] = {3,5,4};
     int n=A.length;
     SumofArray a = new SumofArray();
     System.out.println("Sum of product of all pairs of array elements:");
     System.out.println(a.findProductSum(A, n));
	}

}



