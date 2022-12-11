package Serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SerJSON implements Serialize{
	@Override
	public void write(String fileName,Object obj){
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.writeValue(new File(fileName),obj);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

	@Override
	public Object read(String fileName, Object type){
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.readValue(new File(fileName),type.getClass());
		}catch(IOException e){
			System.out.println(e.getMessage());
			return null;
		}
	}

}
