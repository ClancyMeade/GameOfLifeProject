public class Tile 
{
	private String type; 
	private int index; 
	
	public Tile(String t, int i)
	{ 
		type = t; 
		index = i; 
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
