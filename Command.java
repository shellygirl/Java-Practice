public class Command{
	public static void Command(String [] args){
		System.out.println("I am "+args[0]+" "+args[1]);
	}
	public static void trans(String [] args){
		int a = 10;
		byte b = (byte)a;
		System.out.println(b);
	}
	public static void main(String [] args){
		double d = 11.3;
		System.out.println(d * 2);
}