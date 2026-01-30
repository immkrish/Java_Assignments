package increment_Decrement;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 11,b = 22, c;
       c = a+b + a++ + b++ + ++a + ++b; //33 + 12 + 23 + 12
        //int d = a++ + b++;
      //  System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
	}

}
