package Serialization;

public class SimpleClass {
	public String name;
	public int num;
	SimpleClass (String name, int num){
		this.name = name;
		this.num = num;
	}

	public SimpleClass(){
	}

	@Override
	public String toString(){
		return "SimpleClass{" + "name='" + name + '\'' + ", num=" + num + '}';
	}
}
