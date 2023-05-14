import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Test {

	

	public static void main(String[] args) throws IOException 
	{
		int[] arr = new int[20000];
		
		Random rn = new Random();
		File fle = new File("array.txt");
		File fleII = new File("sort.txt");
		File fleIII = new File("results.txt");
		fle.createNewFile();
		fleII.createNewFile();
		fleIII.createNewFile();
		FileWriter myWriter = new FileWriter("array.txt");
		//FileWriter myWriterII = new FileWriter("sort.txt");
		FileWriter myWriterIII = new FileWriter("results.txt");
		
		for(int i = 0; i < arr.length; i++) 
		{
			arr[i] = rn.nextInt();
			myWriter.write("random number loop"+" "+i+" "+arr[i]+"\n");
		}
		
		System.out.println("sorting");
		for(int i = 0; i < (arr.length - 1); i++) 
		{
			
			for(int j = 0; j < (arr.length - 1); j++) 
			{
				int temp;
				if(arr[(int) j] > arr[(int) (j + 1)]) 
				{
					temp = arr[(int) j];
					arr[(int) j] = arr[(int) (j+1)];
					arr[(int) (j+1)] = temp;
				}
			}
						
		}
		
		System.out.println("Printing arry!");
		for (int p = 0; p < (arr.length); p++) 
		{
			
			myWriterIII.write("sorted loop"+" "+arr[p]+"\n");
			
		}
		System.out.println("complete!!");
		myWriter.close();
		myWriterIII.close();
	}
	
	

}
