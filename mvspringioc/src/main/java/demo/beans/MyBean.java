package demo.beans;

public class MyBean {
	private String name="NA";	
	
	public MyBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyBean(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MyBean [name=" + name + "]";
	}	
}

