package Cks_Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextReader {

	public static void main(String[] args) {
		System.out.println("Welcome");
		String fileName= "/Users/chandrashekharsingh/Desktop/Ckss1.txt";
		try {
			FileWriter fileWriter= new FileWriter(fileName);
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			bufferedWriter.write("Hello, There");
			bufferedWriter.write("Here is same text");
			bufferedWriter.newLine();
			bufferedWriter.write("We are writting");
			bufferedWriter.newLine();
			bufferedWriter.write(" Welcome Bangalore");
			bufferedWriter.close();
			
		} 
		catch (IOException ex)
		{
			System.out.println("Error witing to file");
			
		}
		System.out.println("Welcome");

	}

}
