package Serialization;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class SerXML implements Serialize{
	@Override
	public void write(String fileName,Object obj){
		try{
			XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.writeValue(new File(fileName),obj);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

	@Override
	public Object read(String fileName, Object type){
		try{
			XmlMapper xmlMapper = new XmlMapper();
			return xmlMapper.readValue(new File(fileName),type.getClass());
		}catch(IOException e){
			System.out.println(e.getMessage());
			return null;
		}
	}
}
