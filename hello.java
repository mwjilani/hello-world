class StringDemo{
	public static void main(String[] args)
	{
		String s1="A book on Java.";
		String s2=new String("I like it.");
		char arr[]={'D','r','e','a','m','t','e','c','h','p','r','e','s','s'};
		String s3=new String(arr);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("Length of s1:"+s1.length());
		System.out.println("Length of s2:"+s2.length());
		System.out.println("Length of s3:"+s3.length());
		
		System.out.println("s1 and s2 joined= "+s1.concat(s2));
		System.out.println(s1+" from "+s3);
		System.out.println("Uppercase s1= "+s1.toUpperCase());
		System.out.println("Lowercase s1= "+s1.toLowerCase());
		
		String p=s2.substring(0,7);
		System.out.println(p);
		
		String q=s3.substring(9);
		System.out.println(q);
		
		boolean x=s1.startsWith("B");
		if(x)
			System.out.println("s1 stsrts with \'B'");
		else System.out.println("s1 doesnot start witi\'B\'");
		
		System.out.println(p+q);
	}
}
