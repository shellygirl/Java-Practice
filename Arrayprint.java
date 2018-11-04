public class Arrayprint{
	public static int [] arraySub( int [] data ,int start,int end ){
		//实现数组截取,需要开始标志,结束标志,
		if(data == null){
			throw new IllegalArgumentException("data must be not null");
		}
			
		int len = end - start;
	    if(len < 0||start < 0||end < 0){
			throw new IllegalArgumentException(" len or start or end must greater than 0");
		}
		if (start > end){
			throw new IllegalArgumentException("end number must be greater than start number.");
		}
		if (start > data.length || end > data.length || len >data.length){
			throw new IllegalArgumentException("start or end or len must less than data's length");
		}
		int [] goal  = new int [len];
		for(int i = start;i < end ;i++){
			goal[i - start] = data[i];
		}
		return goal;
	}

	public static void subPrint( int [] goal){
		for(int i =0; i < goal.length;i++){
			int res = goal[i];
			System.out.println(res + " ");
		}
	}
		public static void main( String [] args){
			int [] data = new int [] {22,77,44,556,34,67};
			int [] goal = arraySub( data,-1,5);
			subPrint(goal);
		}
		}