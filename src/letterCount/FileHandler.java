package letterCount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

	public int[] alphaCount;
	public char[] alphabet;
	
	FileHandler()
	{
		alphaCount = new int[26];
		alphabet = new char[26];
		
		for(int i = 0; i < alphaCount.length; i++)
		{
			alphaCount[i] = 0;
		}
		for(char c = 65; c < (65+26); c++)
		{
			alphabet[c-65] = c;
		}
	}
	public void readFile() throws FileNotFoundException
	{
		FileReader filereader = new FileReader("alphaRand.txt");
		BufferedReader br = new BufferedReader(filereader);
		String line = null;
		
		try {
			while ((line = br.readLine()) != null)
			{
				countAlpha(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printAlphaCount();
	}
	
	public void countAlpha(String line)
	{
		int j;
		for(int i = 0; i < line.length(); i++)
		{
			for(j = 0; j < alphabet.length; j++)
			{
				if(line.charAt(i) == alphabet[j])
				{
					alphaCount[j]++;
				}
			}
		}
	}
	
	public void printAlphaCount()
	{
		for(int i = 0; i < alphaCount.length; i++)
		{
			System.out.println(alphabet[i] + ": " + alphaCount[i]);
			
		}
	}
	
}

