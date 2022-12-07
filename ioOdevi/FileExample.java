package ioOdevi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileExample 
{
	
	
	public static void dosyaYarat(File file) throws Exception
	{
		//try {
			if(file.exists())
			{
			//	System.out.println("Dosya var");
				throw new Exception("dosya var");
			}
			else
			{
				if(!file.createNewFile())
				{
				//	System.out.println("dosya yaratılamadı");
					throw new Exception("dosya yaratılamadı");
				}
				else
				{
					System.out.println("dosya yaratıldı");
				}
			}
	//	}
	//	catch(Exception ex)
	//	{
	//		System.out.println(ex.getMessage());
	//	}
		
	}
	public static void dosyayaYaz(File file,String yazilacakYazi) throws Exception
	{
//		try 
//		{
			if(file.exists())
			{
				FileWriter filewriter = new FileWriter(file,true);
				BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
				bufferedWriter.write(yazilacakYazi);
				bufferedWriter.close();
				System.out.println("dosya yazma başarılı");
			}
			else {
				throw new Exception("dosya bulunamadı");
			}
		}
//		catch(Exception ex)
//		{
//			System.out.println(ex.getMessage());
//		}
		
//	}
	public static void dosyaOku(File file,String yazilacakYazi) throws Exception
	{
//		try
//		{
		if(file.exists())
		{
			FileReader filereader = new FileReader(file);
			BufferedReader bufferedreader = new BufferedReader(filereader);
			String line;
			while((line=bufferedreader.readLine())!=null)
			{
				System.out.println(line);
			}
		}
		else
		{
			throw new Exception("dosya bulunamadı");
		}
		}
	
//		catch(Exception ex)
//		{
//			System.out.println("dosya bulunamadı hatası");
//			System.out.println(ex.getMessage());
//		}
		
//	}
	
	
	
}
