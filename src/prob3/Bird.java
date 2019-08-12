package prob3;

public abstract class Bird {
	protected String name;
	public Bird() {
		
	}
	public void setName(String name) {
		this.name = name;
		}
	
	public abstract void fly();

	public abstract void sing();
}
