public class Mutiply{
	public static void MutiTable(String[] args){
		int line = 1;
		int col = 1;
		for (col = 1;col < 10;col++){
			for(line = 1;line < col;line++){
				System.out.print(line+"*" + col +"=" + line*col+"\t");
				
			}
			System.out.println();
		}
	}
	public static int Add(int x,int y ){
		return x + y;
	}
	public static int sum(int num){
		if (num == 1){
			return 1;
		}else{
			return num + sum (num - 1);
		}
	}
		
		
	public static void main(String [] args){
		//MutiTable();
		//MutiTable();
		//System.out.println(Add(4,5));
		int num = sum (100);
		System.out.println(num);
	}
}