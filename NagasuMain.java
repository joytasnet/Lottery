import java.util.*;
public class NagasuMain{
	public static void main(String[] args){
		int[] loto = new int[101];
		for(int i=0;i<loto.length;i++){     //番号の代入
			loto[i] = i;
		}
		for(int i=0;i<loto.length-1;i++){   //;loto内のシャッフル
			int index = new Random().nextInt(loto.length - i) + i;
			int temp = loto[index];
			loto[index] = loto[i];
			loto[i] = temp;
		}
		System.out.print("何枚 >>");
		int bay = new Scanner(System.in).nextInt();
		int[] bays = new int[bay];
		for(int i=0;i<bays.length;i++){    //枚数分lotoから抽出
			bays[i] = loto[i];
		}
		System.out.println(Arrays.toString(bays));
		int hit = new Random().nextInt(101);
		System.out.println("当選番号:" + hit);

		boolean tosen = false;
		for(int i=0;i<bays.length;i++){    //当選番号との比較
			if(bays[i] == hit){
				tosen = true;
			}
		}
		System.out.println(tosen ? "当たり！" : "はずれ");
	}
}
