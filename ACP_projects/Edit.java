
import java.io.*;
public class Edit {
public static void main(String args[])throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("\n\t\tJava Program: File Editing");
	String FRead;
	Loop1:
		for (;;){
			System.out.print("\nPlease Enter The Name Of The File Which To be Read:");
			FRead = br.readLine();
			if (FRead.equals("")){
				System.out.print("\nYou Did Not Enter Any Valid File Name. Try Again!");
				continue Loop1;
			}
			else break;
			
			}
			FileReader fr = new FileReader(FRead);
			BufferedReader in = new BufferedReader(fr);
			String FWrite;
			Loop2:
				for (;;)
			{
				System.out.print("\nPlease Enter The Name Of the file you want to Edit:");
				FWrite = br.readLine();
				if (FWrite.equals("")){
					System.out.print("\n You Did Not Enter Any Valid File Name. Try Again!");
					continue Loop2;
									
				}
				else break;
				
			}
			FileWriter frw = new FileWriter(FWrite);
			PrintWriter pr = new PrintWriter(frw);
			String line = null;
			while ((line = in.readLine())!=null){
				System.out.println(line);
				int age;
				String data1;
				for (;;){
					try 
					{
						System.out.print(line+"'s age>");
						data1 = br.readLine();
						age = Integer.parseInt(data1);
					}
					catch (NumberFormatException e){
						System.out.println("Invalid Number, Not integer.Please enter the age again!");
						continue;
						
					}
					if (age>100){
						System.out.println(" Invalid age!\n Please Enter a valid age");
						continue;
					}
					else break;
					
				}
				if (age==-5){
					System.out.print("New name>");
					String line1 = br.readLine();
					System.out.print(line1+" ‘s age>");
					String S4 = br.readLine();
					int age1 = Integer.parseInt(S4);
					pr.println(line1+"\t"+age1);
					System.out.println(line);
					System.out.print(line+"’s age>");
					data1 = br.readLine();
					age = Integer.parseInt(data1);
										
				}
				if (age==-1)
				{
				pr.print("\r");
				System.out.println(line+"IS Deleted");
				
				}
				else pr.println(line+"\t"+age);
				
			}
			frw.close();
			fr.close();
			System.out.println("\nEnd Of Input From Files:"+FRead);
			FileReader fr1 = new FileReader(FWrite);
			BufferedReader in1 = new BufferedReader(fr1);
			int Tot = 0;
			String line2;
			byte ch[];
			while ((line2=in1.readLine())!=null){
				ch = line2.getBytes();
				Tot = Tot+ch.length;
			}
			System.out.println("Updated File Size is "+Tot+" bytes.");
			System.out.println("Data Is Written To File: "+FWrite);
			DataInputStream ink = new DataInputStream(System.in);
			fr1.close();
			System.out.print("Do you want View The Updated file? (Enter y/n)?");
			char cr = (char)ink.read();
			FileReader fr3 = new FileReader(FWrite);
			BufferedReader in3 = new BufferedReader(fr3);
			if (cr=='y'){
				System.out.println("The Updated File Is The Following One: \n");
				String line3 = null;
				while((line3=in3.readLine())!=null)
				System.out.println(line3);
				System.out.print("\nEnd Of Data File:"+FWrite);
				}
			else
				System.out.print("Thats all for today");
			fr3.close();
			
			}
		
	}






