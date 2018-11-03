import java.io.IOException;
public class Logic{
	public static void circul(String[] args){
		int line = 10;
		for(int x = 0;x < line;x++){
			for(int y = 0; y < line -x;y++){
				System.out.print(" ");
			}
			for(int z = 0;z < x;z++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void switchp(String [] args) throws IOException{//异常处理体系
		System.out.println("请输入一个字符:");
		char c = (char)System.in.read();
		switch(c){
			case 'a':{
				System.out.println(" hello a");
				break;
			}
			case 'b':{
				System.out.println(" hello b");
				break;
			}
			default :
				System.out.println(c);
		}
	}
	public static void main(String [] args){
		int count = 1;
		while(count < 10){
			System.out.print(count);
			count++;
		}
		do{
			System.out.println(count);
		count --;
		}while
			
}