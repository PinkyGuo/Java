
public class Carinfo {
	public String Name;
	public int AllNum;
    public int RestNum;
    public int People;
    public int Goods;
    public int Price;
    public Carinfo(String Name,int AllNum,int RestNum,int People,int Goods,int Price){
    	this.Name=Name;
    	this.AllNum=AllNum;
    	this.RestNum=RestNum;
    	this.People=People;
    	this.Goods=Goods;
    	this.Price=Price;
    };
    public void ShowCarInfo(){
    	System.out.print('\t'+Name+'\t');
    	System.out.print(RestNum);
    	System.out.print('\t');
    	System.out.print(People);
    	System.out.print('\t');
    	System.out.print(Goods);
    	System.out.print('\t');
    	System.out.println(Price);
    }
    public void SetCarInfo(String Name,int AllNum,int RestNum,int People,int Goods,int Price){
    	this.Name=Name;
    	this.AllNum=AllNum;
    	this.RestNum=RestNum;
    	this.People=People;
    	this.Goods=Goods;
    	this.Price=Price;
    }
    
}
