package Serialization;

public interface Serialize <T>{
	void write(String fileName,T obj);
	T read(String fileName,T type);
}
