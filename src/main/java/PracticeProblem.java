public class PracticeProblem {
	static boolean validIndex(int[] arr, int index){
		try{
			arr[index] = arr[index]; // ????
			return true;
		}catch(ArrayIndexOutOfBoundsException e){
			return false;
		}
	}

	static int divide(int num1, int num2){
		try{
			return num1/num2;
		}catch(ArithmeticException e){
			return 0;
		}
	}

	static int safeConvertStringtoInt(String str){
		try{
			return Integer.parseInt(str);
		}catch(NumberFormatException e){
			return 0;
		}
	}
	public static void main(String args[]){}
}
