public class ProxyTest{
	public static void main(String []args){
		
		RealSubject realSubject = new RealSubject();
		ProxySubject proxySubject = new ProxySubject
	
}

interface Subject{
	
	void buyComputer();
	
}

class RealSubject implements Subject{
	
	public void buyComputer(){
		
		System.out.println("购买一台外星人的笔记本");
		
	}
}

class ProxySubject implements Subject{
	
	private final Subject target;
	public ProxySubject(Subject target){
		
		this.target = target;
	}
	
	
	public void buyComputer(){
		
		System.out.println("生产一台外星人的笔记本");
		this.target
		
	}
}