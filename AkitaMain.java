import java.util.*;
public class AkitaMain{
	public static void main(String[] args){
		int[] nums =new int[101];
		for(int i =0;i<nums.length;i++){
			nums[i] = i;
		}
		System.out.print("何枚？>>");
		int n = new Scanner(System.in).nextInt();
		int[] numsChois = new int[n];
		for(int i =0;i<numsChois.length;i++){
			int index = new Random().nextInt(nums.length-i)+i;
			numsChois[i] = nums[index];
			nums[index] = nums[i];
		}
		System.out.println(Arrays.toString(numsChois));
		int atari = new Random().nextInt(101);
		System.out.println("当選番号:"+atari);
		boolean isWin = false;
		for(int i =0;i<numsChois.length;i++){
			if(numsChois[i]==atari){
				isWin = true;
			}
		}
		System.out.println(isWin?"あたり！":"はずれ");
	}
}
