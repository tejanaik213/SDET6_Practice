package githubPractice;

public class Palindromestring {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      String name="noon";
	      String rev="";
	      for(int i=name.length()-1;i>=0;i--)
	      {
	    	  rev=rev+name.charAt(i);
	      }
	      if(name.equals(rev))
	      {
	    	  System.out.println("given string is palimdrome");
	      }
	      else
	      {
	    	  System.out.println("given string is not palindrome");
	    	  
	      }
		}

	}
