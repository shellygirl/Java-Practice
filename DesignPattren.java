public class DesignPattern{
	
	public static void main(String [] args){
		
		
	}
}

class Client{
	
	public void buy(Computer computer){
		computer.printComputer();
		
	}
}
interface Computer{
	
	void printComputer();
}
class SimpleComputerFactory(){
	
	public static Computer getInstance(String type){
		
		Computer computer = null;
		
		switch(type)
class MacbookProComputer implements Computer{
	
	public void printComputer(){
		
		System.out.println("这是一台 MacbookProComputer");
		
	}
}

class NacbookProComputer implements computer{
	
	public void printComputer();
	

}