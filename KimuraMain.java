import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		int[] lotteries = new int[101];
		for(int i=0;i<lotteries.length;i++){
			lotteries[i] = i;
		}
		System.out.print("何枚>>");
		int n = new Scanner(System.in).nextInt();
		int[] my_numbers = new int[n];
		for(int i=0;i<n;i++){
			int select = new Random().nextInt(101-i)+i;
			my_numbers[i] = lotteries[select];
			int temp = lotteries[i];
			lotteries[i] = lotteries[select]; 
			lotteries[select] = temp;
		}
		System.out.println(Arrays.toString(my_numbers));
		int win = new Random().nextInt(101);
		System.out.printf("当選番号:%d%n",win);
		boolean judge = false;
		for(int i:my_numbers){
			if(i == win){
				judge = true;
			}
		}
		System.out.printf("%s%n",judge == true ? "あたり":"はずれ");
	}
}
