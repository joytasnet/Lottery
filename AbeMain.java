import java.util.*;
public class AbeMain{
	public static void main(String[] args){
		int[] lotts=new int[101];	
		for(int i=0;i<lotts.length;i++){
			lotts[i]=i;		
		}
		System.out.print("何枚>>");
		int n = new Scanner(System.in).nextInt();

		for(int i=0;i<lotts.length;i++){
			int index = new Random().nextInt(lotts.length-i)+i;
			int temp = lotts[index];
			lotts[index] = lotts[i];
			lotts[i] = temp;
		}
		int[] myLotts = new int[n];
		for(int i=0;i<myLotts.length;i++){
			myLotts[i]=lotts[i];
		}
		int atari = new Random().nextInt(101);
		boolean isWin = false;
		for(int i=0;i<myLotts.length;i++){
			if(myLotts[i]==atari){
				isWin = true;	
			}
		}
		System.out.println(Arrays.toString(myLotts)); 
		System.out.println("当選番号: " + atari); 
		System.out.println(isWin?"あたり":"はずれ"); 
	}
}
