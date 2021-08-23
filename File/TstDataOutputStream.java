import java.io.*;
class TstDataOutputStream{
	public static void main(String args[]){
	try{	
	FileOutputStream file=new FileOutputStream("file.txt");
	
	DataOutputStream data=new DataOutputStream(file);
	byte a=1;
	
	do{
		a++;
		short b=1000;
		int c=100000;
		long d=10000000000L;
		
		data.writeByte(a);
		data.writeShort(b);
		data.writeInt(c);
		data.writeLong(d);
		a++;
	}while(a<=125);	
		data.close();
	}catch(IOException e){e.printStackTrace();}
	}
}