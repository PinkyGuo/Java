import java.util.*;
public class CarSystem {
	public static Carinfo[] cars={new Carinfo("奥迪A4",4,2,3,0,10),new Carinfo("大众一汽",10,5,3,0,5),
			        new Carinfo("宝马",6,5,3,0,12),new Carinfo("小货车",10,7,3,100,10),	
			        new Carinfo("中等货车",6,6,1,500,20),new Carinfo("大卡车",6,6,1,1000,40)};
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("欢迎使用答答租车系统：");
		int result = isNeed();
		while(result==1)
		{
			System.out.println("租车成功！1 继续租车，2 退出。请选择：");
			int rent = scan.nextInt();
			if(rent==1)
				result = isNeed();
		}
		System.out.println("谢谢使用答答租车系统，再见！");
	}
	public static int isNeed(){
		System.out.println("您是否要租车：1 是，2 否。请输入数字（1/2）:");
		int input = scan.nextInt();
		if(input==1)
		{
			System.out.println("您可租车的类型及其基本详情");
			System.out.println("序号"+'\t'+"租车类型"+'\t'+"可租数量"+'\t'+"可载人数"+'\t'+"载货量/吨"+'\t'+"单价/h"+'\t');
			for(int i=0;i<cars.length;i++){
				System.out.print(i+1);
				cars[i].ShowCarInfo();
			}
			System.out.println("请选择租车类型，请输入序号：");
			int type = scan.nextInt()-1;
			System.out.println("请选择租车数量，请输入数字：");
			int num = scan.nextInt();
			while(num>cars[type].RestNum)
			{
				System.out.println("不好意思，目前只有"+cars[type].RestNum+"辆车可租");
				System.out.println("1 重新选择，2 退出。请输入数字：");
				int choice= scan.nextInt();
				if(choice==1)
				{
					System.out.println("请选择租车类型，请输入序号：");
					type = scan.nextInt()-1;
					System.out.println("请选择租车数量，请输入数字：");
					num = scan.nextInt();
				}					
				else
					return 0;
			}
			System.out.println("您的租车信息如下：");
			System.out.println("租车类型"+'\t'+"数量"+'\t'+"可载人数"+'\t'+"载货量/吨"+'\t'+"应付金额"+'\t');
			System.out.println(cars[type].Name+'\t'+num+'\t'+cars[type].People*num+'\t'+cars[type].Goods*num+'\t'+cars[type].Price*num+'\t');
		    System.out.println("1 确定租车，2 不租退出。请选择：");
			int choice=scan.nextInt();
			if(choice==2)
				return 0;
			if(choice==1)
				cars[type].RestNum=cars[type].RestNum-num;
				
		}
		else if(input==2)
			  return 0;
		else
		{
			System.out.println("您的输入不正确，请重新输入：");
			isNeed();
		}
		return 1;
	}

}

