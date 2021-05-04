
public class firstProgram {

		 int a =10;
		 public String getData() {
			 return "hello";
		 }
	public static void main(String[] args) {
		System.out.println("Print my first revise program");
		firstProgram fn=new firstProgram();
		System.out.println(fn.getData());
		int b=fn.a;
		System.out.println(b);
		
		String c="Java/Training";
		String arr[]=c.split("/");
		System.out.println(arr[1]);
		

	}

}
