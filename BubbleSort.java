class BubbleSort
{
    public static void main(String args[])
    {
	    int arr[]={25,1,6,30,10};
		for(int i=0; i<arr.length; i++)
		{
		    for(int j=0; j<arr.length-1; j++)
			{
			    if(arr[j]>arr[j+1])
				{
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				} 
			}

		}
        for(int i=0; i<arr.length; i++)
		{	
		     System.out.println(arr[i]+"  ");
	    }
		
		
	}	
}
