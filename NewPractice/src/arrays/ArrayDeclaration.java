package arrays;


public class ArrayDeclaration {

	public static void main(String[] args) {
		//One Dimentional Array
       int a[];
       //int []a;
       a =new int[5];
     
       
     a[0]=1;
     a[1]=10;
     a[2]=20;
     a[3]=30;
     a[4]=40;
     System.out.println(a.length);
    /* System.out.println(a[0]);
     System.out.println(a[1]);
     System.out.println(a[2]);
     System.out.println(a[3]);
     System.out.println(a[4]);
     */
     for(int i=0;i<a.length;i++) {
     System.out.println(a[i]);
     }
     //single line array declaration
     char vowel[] = new char[5];
     vowel[0]='a';
     vowel[1]='b';
     vowel[2]='c';
     vowel[3]='d';
     vowel[4]='e';
     System.out.println(vowel.length);
     for(int i=0;i<a.length;i++)
     {
    	 System.out.println(vowel[i]);
     }
     
   String selenium[]= {"webdriver","RC","Grid","IDE" };
   System.out.println(selenium.length);
   for(int i=0;i<selenium.length;i++)
   {
	   System.out.println(selenium[i]);
   }
   //Two Dimentional Array
   int c[][];
   c=new int[2][2];
   c[0][0]=10;
   c[0][1]=20 ; 
   c[1][0]=30;
   c[1][1]=40;
     System.out.println("total rows:" +c.length);
     System.out.println("total cols:"+c[0].length);
     /*System.out.println(c[0][0]);
     System.out.println(c[0][1]);
     System.out.println(c[1][0]);
     System.out.println(c[1][1]);*/
     for(int rowno=0;rowno<c.length;rowno++) {
    	 for(int colno=0;colno<c[rowno].length;colno++) {
    		// System.out.println(c[rowno][colno]);
    		 System.out.print(c[rowno][colno] + " ");
    
    	}
    	 System.out.println();
     }
     
	}

}
