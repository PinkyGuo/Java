
public class Rectangle extends Shape {
	private double l;
	private double w;
    public Rectangle(double l,double w){
    	this.l =l;
    	this.w =w;
    }
    
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
        System.out.println("�������ܳ���"+2*(l+w));
	}
	public void area() {
		// TODO Auto-generated method stub
        System.out.println("�����������"+l*w);
	}
}
