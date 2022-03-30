import java.util.*;
public class SasakiLottery{
	public static void main(String[] args){
		int[] lottery = new int[101];
		for(int i=0;i<lottery.length;i++){
			lottery[i] = i;
		}
		for(int i=0;i<lottery.length-1;i++){
			int index = new Random().nextInt(lottery.length-i)+i;
			int tmp = lottery[index];
			lottery[index] = lottery[i];
			lottery[i] = tmp;
		}
		System.out.print("何枚>>");
		int[] myLotts = new int[new Scanner(System.in).nextInt()];
		for(int i=0;i<myLotts.length;i++){
			myLotts[i] = lottery[i];
		}
		int win = new Random().nextInt(lottery.length)+1;
		System.out.println(Arrays.toString(myLotts));
		System.out.println("当選番号:"+win);
		boolean isWin = false;
		for(int n:myLotts){
			if(n == win){
				isWin = true;
			}
		}
		System.out.println(isWin?"当たり":"はずれ");
	}
}
