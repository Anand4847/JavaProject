package Day5;

public class ReverseWord {

	
	
	
	    public static void main(String[] args) {
//	        String input = "I am joining Capgemini";
//	        String[] words = input.split(" ");
//	        String output = "";
//	        for (int i = 0; i < words.length; i++) {
//	            String word = words[i];
//	            String reversedWord = "";
//	            for (int j = word.length() - 1; j >= 0; j--) {
//	                reversedWord += word.charAt(j);
//	            }
//	            output += reversedWord;
//	            if (i < words.length - 1) {
//	                output += " ";
//	            }
//	        }
//	        System.out.println(output);
	    	
	    	
//	    	String input = "I am joining Capgemini";
//	    	String[]words = input.split(" ");
//	    	
//	    	String output = "";
//	    	
//	    	for (int i=0 ; i<words.length; i++)
//
//	    		
//	    	{
//	    		
//	    		String word = words[i];
//
//	    		String reverseword = "";
//	    		
//	    		for (int j= word.length() - 1; j>=0; j--)
//	    			
//	    		{
//	    			
//	    			reverseword += word.charAt(j);
//	    		}
//	    	
//	    		output += reverseword;
//	    		
//	    		if(i<words.length - 1)
//	    		{
//	    			output+= " ";
//	    		}
//	    	}
//	   System.out.println(output);
	    	
	    	
	    	String input = "I am joining Capgemini";
	    	String[]  word = input.split(" ");
	    	String output = "";
	    	
	    	
	    	//get the length
	    	for (int i=0 ; i<word.length ; i++)
	    		
	    	{
	    		
	    		String words = word[i];
	    		
	    		String reverse = "";
	    		
	    		for (int j=words.length()-1 ; j>=0 ; j--)

	    			
	    		{
	    			
	    			reverse += words.charAt(j);
	    		}
	    		
	    		output += reverse;
	    	
	    	if(i<word.length - 1)
	    	{
	    		
	    		output += " ";
	    	}

	    	}
    		System.out.println(output);
	    }
	    
	}


