package Serialization;

public class Solution {
	public static void main(String[] args){
		SimpleClass simpleClass = new SimpleClass("someName",69);

		//JSON
		SerJSON serJSON = new SerJSON();
		serJSON.write("obj.json",simpleClass);
		System.out.println(serJSON.read("obj.json",simpleClass));

		//XML
		SerXML serXML = new SerXML();
		serXML.write("obj.xml",simpleClass);
		System.out.println(serXML.read("obj.xml",simpleClass));

		//TXT
		SerTXT serTXT = new SerTXT();
		serTXT.write("obj.txt", simpleClass);
		System.out.println(serTXT.read("obj.txt",simpleClass));
	}
}
