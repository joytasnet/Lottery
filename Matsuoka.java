import java.util.*;
public class Matsuoka{
	public static void main(String[] args){
		int[] lotterys=new int[101];
		int winnum,buynum,lose=-1;
		String win="";
		System.out.print("何枚>>");
		buynum=new Scanner(System.in).nextInt();
		for(int i=0;i<lotterys.length;i++){
			lotterys[i]=i;
		}
		winnum=new Random().nextInt(lotterys.length);
		System.out.print("[");
		for(int i=0;i<buynum;i++){
			int random=new Random().nextInt(lotterys.length-i)+i;
			int tmp=lotterys[random];
			lotterys[random]=lotterys[i];
			lotterys[i]=tmp;
			if(winnum==lotterys[i]){
				lose=winnum;
			}if(i==buynum-1){
				System.out.printf("%d",lotterys[i]);
			}else{
				System.out.printf("%d,",lotterys[i]);
			}
		}
		if(lose!=-1){
			win="あたり";
		}else{
			win="はずれ";
		}
		System.out.printf("]\n当選番号:%d\n%s\n",winnum,win);
	}
}
