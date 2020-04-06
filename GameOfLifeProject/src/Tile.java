
public abstract class Tile {

	
	protected String tileName;
	protected String type; 

	
	public Tile(String tN, String ty)
	{
		tileName = tN; 
		type = ty;
		
	}
	
	
 
	public String getTileName() {
		return tileName;
	}



	public void setTileName(String tileName) {
		this.tileName = tileName;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public abstract void landOnTile();
	
	public String getName()
	{
		return this.tileName;
	}
}
