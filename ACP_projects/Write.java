import java.io.*;
public class Write {
public static void main(String gargs[])throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("\n\t\tJava Program: File Writing\n"); // Programme Heading
	System.out.print("Please Enter The File Name Without extension:"); //To enter a file name buy user
	String FWrite = br.readLine();
	FileWriter fw = new FileWriter(FWrite);
	PrintWriter pw = new PrintWriter(fw);
	System.out.print("\n\n Please Enter Data Using Keyboard:"); //Input from User
	char cr;
	int dh = 0;
	FileOutputStream fo = new FileOutputStream(FWrite);
	DataInputStream inp = new DataInputStream(System.in);
	do{
		String T = br.readLine();
		byte Ch[] = T.getBytes();
		for(int i=0; i<Ch.length; i++)
			pw.print((char)Ch[i]);
		pw.println(" ");
		dh = dh+Ch.length;
		System.out.print("Press the Key 'b' To Break or Press 'Spacebar' To Continue From the Keyboard:"); // Decide either user wants to continue with the file or terminate. 
		cr = (char)System.in.read();
	}
	while(cr!='b');
	System.out.println("Total Size of the file Is "+dh+" bytes");//Calculating the entire file size.
	System.out.println("Data Is Written In The File Named: "  +FWrite);
	//System.out.print("Press Any Key To Continue......");
	fw.close();	
	}
}
