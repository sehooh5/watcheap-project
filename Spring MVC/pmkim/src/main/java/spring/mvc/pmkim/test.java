package spring.mvc.pmkim;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) {
	       FileReader reader = null;
	       try {
	           reader = new FileReader("C:/SEHO/Rstudy/cu.html");
	           while (true) {
	               int data = reader.read();
	               if (data == -1)
	                   break;
	               char ch = (char) data;	//한문자씩 읽어서 출력
	               System.out.print(ch);
	           }
	       } catch (FileNotFoundException fnfe) {
	           System.out.println("파일이 존재하지 않습니다.");
	       } catch (IOException ioe) {
	           System.out.println("파일을 읽을 수 없습니다.");
	       } finally {
	          try {
	        	  if(reader!=null)	//이걸 붙여줘야 Null exception 이 안발생함
	               reader.close();
	          } catch (Exception e) {
	        	  e.printStackTrace();
	          }
	       }
	    }
		

	

}
