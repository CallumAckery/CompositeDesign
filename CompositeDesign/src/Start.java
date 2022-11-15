
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graphic g = new Picture();
		Graphic tt = new Picture();
		Graphic f = new Rectangle();
		Graphic k = new Line();
		Graphic p = new Circle();
		g.add(p);
		g.add(f);
		g.add(tt);
		g.add(k);
		
		g.draw();
		
	}

}
