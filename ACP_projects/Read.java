
import java.io.*;
public class Read {
	public static void main(String args[])throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("\n\t\tJava Program: File Reading");
String FRead;
		Loop1:
			for(;;){
				System.out.print("\nPlease Enter The Name Of The File Which You Want To Read: ");
					FRead = br.readLine();
		if(FRead.equals("")){
					System.out.print("\nYou Did Not Enter Any Valid File Name. Try Again!");
					continue Loop1;
						}
		else break;
	
				}
				try{
				FileReader fr = new FileReader(FRead);
				BufferedReader in = new BufferedReader(fr);
				String line = null;
				while((line = in.readLine())!=null)
				System.out.println(line);
				System.out.print("\nEnd Of Data File.");
				fr.close();		
				}
				catch(FileNotFoundException e)
				{
				System.out.print("Error: File Not Found"+e);
	
				}
	}
}
