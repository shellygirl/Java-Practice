public class Change{
	String printInfo1(){
		return "调换前:\n"+"a = "+ a +"\n"+"b = "+b+"\n";
	}
	String printInfo2(){
		return "调换后\n"+"a = "+ a +"\n" + "b = "+b+"\n";
	}
	public static void main(String [] args){
		int a = 10;
		int b = 20;
		int c = 0;
		Change change1 = new Change(a,b);
		System.out.println(change1.printInfo1());
		c = a;
		a = b;
		b = c;
		Change change2 = new Change(a,b); 
		System.out.println(change2.printInfo2());
		
	}
}