public class App{
	
	public static void main(String [] args){
		
		Person person  = new Person();
		person.name = "jack";
		person.age = 21;
		System.out.println(person.getSecret());
		//调用秘密
		System.out.println(person.getName());
		
	}
}