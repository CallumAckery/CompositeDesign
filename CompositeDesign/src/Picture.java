import java.util.ArrayList;
import java.util.List;

public class Picture implements Graphic {

	List<Graphic> arr = new ArrayList<>();

	
	@Override
	public void draw() {
		System.out.println("Root: I am a picture");
		
		for(Graphic g: arr) {
			g.draw();
		}
		
	}

	@Override
	public void add(Graphic g) {
		arr.add(g);
	}

	@Override
	public void remove(Graphic g) {
		arr.remove(g);
		
	}

	@Override
	public Graphic getChild(int index) {
		// TODO Auto-generated method stub
		return arr.get(index);
	}

	
	
}
