
public class Circle extends Shape {
   private double r;
   public Circle(double r){
	   this.r = r;
   }
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
     System.out.println("圆形的周长是"+2*3.14*r);
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
     System.out.println("圆形的面积是"+2*3.14*r*r);
	}

}
