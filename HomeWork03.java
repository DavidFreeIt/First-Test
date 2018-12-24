package HomeWork;
/**猜拳游戏,输入n结束
**/
import java.util.Scanner;

public class HomeWork03{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String choose = "n";
		String choose2 = "n";
		String role = "a";
		String quan = "n";
		int i = 0; //和局次数
		int m = 0; //循环次数
		int e = 0; //胜利次数
		
		int r = 0;//失败次数
		String result;
		
		do{
			System.out.println("*******************");
			System.out.println("*****猜拳,开始*****");
			System.out.println("*******************");
			
			do{
				System.out.println("请选择你想和谁对战:1.刘备 2.孙权 3.曹操");
				int num = input.nextInt();
				
				switch(num){
				case 1:
					role = "刘备";
					break;
				case 2:
					role = "孙权";
					break;
				case 3:
					role = "曹操";
					break;
				}
			
				System.out.println("要开始吗?(y/n)");
				choose2 = input.next();
				
			}while(choose2.equals("n"));
			
			System.out.println("请出拳:1.剪刀 2.石头 3.布(输入相应数字)");
			int chooseQuan = input.nextInt();
			
			int random =  (int)(Math.random()*3)+1;
			String AiQuan = "a";
			switch(random){
			case 1:
				AiQuan = "剪刀";
				break;
			case 2:
				AiQuan = "石头";
				break;
			case 3:
				AiQuan = "布";
				break;
			}			
			switch(chooseQuan){
			case 1:
				quan = "剪刀";
				break;
			case 2:
				quan = "石头";
				break;
			case 3:
				quan = "布";
				break;
			}
			System.out.println("你出拳:"+quan);
			System.out.println(role+"出拳:"+AiQuan);
			
			if((chooseQuan == 1 && random == 3)
					|| (chooseQuan == 2 && random == 1)
					|| (chooseQuan == 3 && random == 2)){
				
				System.out.println("胜");
				e++;
			}else if((chooseQuan == 3 && random == 1)
				|| (chooseQuan == 1 && random == 2)
				|| (chooseQuan == 2 && random == 3)){
				
				System.out.println("败");
				r++;
				}else{
					System.out.println("和");
					i++;				
				}
				m++;
				
			System.out.println("是否开始下一局(y/n)");
			choose = input.next();
		}while(choose.equals("y"));
		
		if(e>r){
			result = "胜";
		}else if(e<r){
			result = "败";
		}else{
			result = "和";
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("游戏结束");
		System.out.println(role+" vs 玩家");
		System.out.print("对战次数:"+m);
		System.out.println("出拳相同次数:"+i);
		System.out.print("结果:"+result);
	}
}