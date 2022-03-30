import java.util.*;
public class ShotaMain{
	public static void main(String[] args){
		System.out.println("何枚>>");
		int[] lott = new int[101];
		for(int j=0;j<lott.length;j++){
			lott[j]=j;
		}

		int mylott =new Scanner(System.in).nextInt();
		int[] myNum=new int[mylott]; 
		for(int i=0; i<mylott;i++){
			int index= new Random().nextInt(lott.length-i)+i;
			//myNum[i]=index;
			int tmp= lott[index];
			lott[index]=lott[i];
			lott[i]=tmp;
		}
		for(int i=0; i<myNum.length; i++){
			myNum[i]=lott[i];
		}
		System.out.println(Arrays.toString(myNum));


		int ran = new Random().nextInt(101);
		System.out.println("当選番号");
		System.out.println(ran);


		boolean ans = true;
		for(int i=0; i<mylott;i++){
			if(myNum[i]==ran){
				ans=true;

			}else{
				ans =false;
			}
		}
		System.out.print(ans==true?"あたり":"はずれ");
	}
}

