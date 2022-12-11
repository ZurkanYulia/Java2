package Serialization;
import java.io.*;
import java.lang.reflect.Field;

public class SerTXT implements Serialize{
	@Override
	public void write(String fileName, Object obj){
		Field[] fields = obj.getClass().getDeclaredFields();
		try{
			FileWriter fileWriter = new FileWriter(fileName);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			for(int i = 0; i < fields.length; i++){
				Object value = fields[i].get(obj);
				printWriter.printf("%s: %s\n", fields[i].getName(), fields[i].get(obj));
			}
			printWriter.close();
		}catch(IOException | IllegalAccessException e){
			System.out.println(e);
		}

	}

	@Override
	public Object read(String fileName, Object type){
		try{
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String st, res = "";
			while ((st = br.readLine()) != null)
				res += st;
			return res;
		}catch(IOException e){
			System.out.println(e);
		}
		throw new RuntimeException();
	}


}

