
 class Reverse {
	public static void reverse(char str[])
	{
		int r= str.length -1;
		int l=0;
		while(l<r)
		{
			if(!Character.isAlphabetic(str[l]))
			{
				l++;
			}
			else if(!Character.isAlphabetic(str[r]))
			{
				r--;
			}
			else
			{
				char temp = str[l];
				str[l]= str[r];
				str[r]=temp;
				l++;
				r--;
			}
		}
	}
   public static void main(String args[])
   {
	   String str ="abc!e$";
	   char[] a = str.toCharArray();
	   System.out.println("Input String is "+ str);
	   reverse(a);
	   String b = new String(a);
	   System.out.println("After reversing "+  b);
   }
}
