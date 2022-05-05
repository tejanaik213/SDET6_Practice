package githubPractice;

public class Armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=153,rem,arm=0;
        int str=num;
        while(num>0)
        {
        	rem=num%10;
        	num=num/10;
        	arm=arm+rem*rem*rem;
        }
        if(arm==str)
        {
        	System.out.println(str+ "is armstrong number");
        }
        else
        {
        	System.out.println(str + "is not armstrong number");
        	
        }
	}
}

