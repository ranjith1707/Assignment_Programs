import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
class ReadMyJavaFile{
	public static void main(String[] args){
       ReadMyJavaFile readJava=new ReadMyJavaFile();
       readJava.readAndWrite();
	}
	void readAndWrite(){
		int numberOfLine=0;
         int numberOfCharacter=0;
         File creatFile=new File("E:\\Java\\projects\\CopyOfReadMyJavaFile.java");
	   try{
	   	creatFile.createNewFile();
	   	File file=new File("E:\\Java\\projects\\CopyOfReadMyJavaFile.java");
         FileReader fileRead=new FileReader("E:\\Java\\projects\\ReadMyJavaFile.java");
         BufferedReader bufread=new BufferedReader(fileRead);
         FileWriter fileWrite=new FileWriter(file);
         BufferedWriter writer=new BufferedWriter(fileWrite);
         String line=bufread.readLine();
         while(line!=null){
         	writer.write(line);
          numberOfLine++;
          numberOfCharacter+=line.length();
          writer.newLine();
          line=bufread.readLine();
         }
           writer.close();
        
	   }catch(Exception e){

	   }
	   System.out.println("Number of lines in a File = "+ numberOfLine);
	   System.out.println("Number of Character in a File = "+ numberOfCharacter);
	   System.out.println(" New File Path is = E:\\Java\\projects\\CopyOfReadMyJavaFile.java");
	}
}