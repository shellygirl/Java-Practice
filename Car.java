public class Car{
	
	private String number;
	
	private String color;
	
	private int highestspeed;
	
	private int price;
	
	private String brand;
	
	public Car(String number){
		this.number = number;
	}
	public Car(String number,String color){
		this(number);
		this.color = color;
	}
	public Car(String number,String color,int highestspeed){
		this(number,color);
		this.highestspeed = highestspeed;
	}
	public Car(String number,String color,int highestspeed,int price){
		this(number,color,highestspeed);
		this.price = price;
	}
	public Car(String number,String color,int highestspeed,int price,String brand){
		this(number,color,highestspeed,price);
		this.brand = brand;
	}
	String printInfo(){
		return ("车牌号: "+number+"颜色: "+color+"最高时速: "
		+highestspeed+"价格: "+price+"品牌: "+brand);
	}
	
		
		
	public static void main(String [] args){
		Car car = new Car("BJ219\n","黄色\n",210, 2100000,"宝马");
		
		System.out.println(car.printInfo());
	
	}
}