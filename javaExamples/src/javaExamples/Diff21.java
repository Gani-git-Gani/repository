package javaExamples;

public class Diff21 {
	    public int diff21(int n) {
	        return n <= 21 ? 21 - n : (n - 21) * 2;
	    }

	    public static void main(String[] args) {
	        Diff21 diff21 = new Diff21();
	        System.out.println(diff21.diff21(19));
	        System.out.println(diff21.diff21(10));
	        System.out.println(diff21.diff21(21));
	        System.out.println("--------------");
	    }
	    
	    public boolean sleepIn(boolean weekday, boolean vacation) {
	    	  if (!weekday || vacation) {
	    	    return true;
	    	  }
	    	  
	    	  return false;
	    	  System.out.println("Yes it is" + sleepIn);
	    	  System.out.println("-----------------");
	    	}

}
