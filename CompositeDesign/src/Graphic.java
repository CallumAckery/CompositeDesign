
public interface Graphic {


	public void draw();
	
	public void add(Graphic g);
	
	public void remove(Graphic g);
	
	public Graphic getChild(int index);
	
	
}
