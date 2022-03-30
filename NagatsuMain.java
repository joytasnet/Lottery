import java.util.*;
public class NagatsuMain{
	public static void main(String[] args){
		int[] lotts = new int[101];
		for(int i=0;i<lotts.length;i++){
			lotts[i]=i;
		}
		for(int i=0;i<lotts.length;i++){
			int index = new java.util.Random().nextInt(lotts.length-i)+i;
			int tmp = lotts[index];
			lotts[index] = lotts[i];
			lotts[i] = tmp;
		}
		System.out.print("何枚？>>");
		int n = new Scanner(System.in).nextInt();
		int[] myLotts = new int[n];
		for(int i=0;i<myLotts.length;i++){
			myLotts[i] = lotts[i];
		}
		System.out.println(Arrays.toString(myLotts));
		int tousen = new Random().nextInt(101);
		System.out.print("当選番号：");
		System.out.println(tousen);
		boolean isAtari = false;
		for(int i=0;i<myLotts.length;i++){
			if(myLotts[i]==tousen){
				isAtari = true;
			}
		}
		if(isAtari){
			System.out.println("あたり");
		}else{
			System.out.println("はずれ");
		}
	}
}
