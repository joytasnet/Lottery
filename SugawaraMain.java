import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){
		int[] nums = new int[101];
//それぞれの要素に0～100まで割り当てるfor
		for(int i=0 ; i<nums.length ; i++){
			nums[i] = i;
		}
//購入数を聞く
		System.out.print("何枚購入しますか？1～101まで>>");
		int buy = new Scanner(System.in).nextInt();
		int[] tickets = new int[buy];

//購入した数だけ抽選forアルゴリズム
		for(int i=0 ; i<buy ; i++){
			int pickup = new Random().nextInt(nums.length-i)+i;
			int tmp = nums[pickup];
			nums[pickup] = nums[i];
			nums[i] = tmp;
			tickets[i] = nums[i];
		}
//購入したチケットの番号表示
		System.out.println(Arrays.toString(tickets));

//あたり番号抽選int Random
		int rnd= new Random().nextInt(101)+1;
		System.out.printf("あたり番号：%d%n",rnd);

//当たったかどうかの判定for in if
		boolean isWin = false;

		for(int n : tickets){
			if(n == rnd){
				isWin = true;
			}
		}
		System.out.println(isWin?"あたりです！":"はずれです");
	}
}
