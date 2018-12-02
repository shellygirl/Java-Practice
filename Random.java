import java.util.GuessNum;
public class Random{
	
		
	public static void main(String [] args){
		//1.随机生成一个数字
		int random = rand() % 100;
		//2.提醒用户输入一个数字
		int num = 1;
		while(true){
			System.out.print("please input a num(0 - 100):");
			System.in.read(num);
		//3.将输入数字与随机数进行比较
		if(num == random){
			System.out.println("congratulastions!");
			break;
		} else {
			if(num > random){
				System.out.print("This num is greater,please input again:");
			}
			print("This num is smaller,please input again:");
		}
		//4.若相等,则打印猜对了,游戏结束.
		//5.若不相等,提示用户该数偏大或偏小,继续游戏.
		
	}
}

