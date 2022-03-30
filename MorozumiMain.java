import java.util.*;
public class MorozumiMain{
	public static void main(String[] args){
		System.out.print("何枚>>");
		int num = new Scanner(System.in).nextInt();
		int [] lotts = new int[101];
		for(int i=0; i<lotts.length; i++){
			lotts[i] = i;



		}
		for(int i=0; i<lotts.length -1; i++){
			int index = new Random().nextInt(lotts.length -i) +i;
			int tmp = lotts[index];
			lotts[index] = lotts[i];
			lotts[i] = tmp;
		}
		int[] myLotts = new int [num];
		for(int i=0; num>i; i++){
			myLotts[i] = lotts[i]; 
		}
		System.out.println(Arrays.toString(myLotts));
		int hit = new Random().nextInt(100);
		System.out.println("当選番号:" + hit);
		boolean isWin = false;
		for(int n : myLotts){
			if(hit == n){
				isWin = true;
			}
		}
		System.out.println(isWin ? "当たり":"はずれ");

	}
}
