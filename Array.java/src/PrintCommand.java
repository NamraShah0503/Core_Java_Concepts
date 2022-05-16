
public class PrintCommand {

	public static void main(String[] args) {
		
		System.out.println("Length:"+ args.length);
		String sum = null ;
		for(int i=0;i<args.length;i++) {
		sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("Sum ="+sum);

	}
}
