
public class Driver {
	public static void main(String[] args) {
//		Point p0 = new Point();
//		p0.print();
		Point p1 = new Point();
		p1.setX(2);
		p1.setY(3);
		System.out.println("(" + p1.getX()+ ","+ p1.getY()+ ")");
		System.out.println(p1);
		Point p2 = new Point();
		p2.setX(2);
		p2.setY(3);
		if(p1 == p2)
			System.out.println("same");
		else
			System.out.println("different");
	}
}
