
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = new Integer(125);
		Integer num2 = new Integer(20);

		int n1 = num1.intValue();
		int n2 = num2.intValue();
		
		System.out.println("suma de " + num1 + " y " + num2 + " vale " + (n1+n2));
		
		if(n1+n2>130){
			n1++;
		}else{
			n2--;	
			System.out.println(n1);
		}

	}

}
