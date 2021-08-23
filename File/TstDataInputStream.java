import java.io.*;
class TstDataInputStream{
	public static void main(String args[]){
	try{	
	FileInputStream file=new FileInputStream("createFile4.txt");
	//FileOutputStream file=new FileOutputStream("file.txt");
	
	DataInputStream in=new DataInputStream(file);
	
		byte a=in.readByte();
		short b=in.readShort();
		int c=in.readInt();
		long d=in.readLong();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		in.close();
	}catch(IOException e){e.printStackTrace();}
	}
}