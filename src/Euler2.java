
public class Euler2 {

	/**
	 * @param args
	 */
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 1;
		int second = 2;
		int n = 0;
		int sum = 2;
		boolean bool =true;
		long limit = 4000000;
		while(bool == true ) {
			while(n < limit) {
				n = first + second;
				first = second;
				second = n;
				if(n % 2 == 0 && n < 4000000){
				sum += n;
				}
				else if(n < limit) {
					continue;
				}
				else {
					bool = false;
				}
				
			}
		}
		System.out.println(sum); 


	}

}
