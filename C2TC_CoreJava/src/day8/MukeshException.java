package day8;

public class MukeshException extends Exception {
	public MukeshException (String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		int a=1;
		int b=0;
		try {
			
			int c=a/b;
			if(c==0) {
				throw new MukeshException("mukesh here");

			}
			
		}catch(MukeshException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	

}
