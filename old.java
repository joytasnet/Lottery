import java.util.*;
public class NagatsuMain{
	public static void main{
		System.out.print("何枚？>>");
		int n = new Scanner(System.in).nextInt();
		int[] lots = new int[n];
		boolean isExists;
		int now;
		for(int i=0;i<n;i++){
			do{
				isExists=false;
				now=new Random().nextInt(100);
				for(int lot:lots){
					if(now == lot){
						isExists = true;
					}
				}
			}while(isExists);
			lots[i]=now;
		}
		System.out.println(Arrays.toString(lots));
		atari=new Random().nextInt(100);
		System.out.print("当選番号："+atari);
		boolean is
		for(int i=0;i<n;i++){
			lots[i]
		}
	}
}
