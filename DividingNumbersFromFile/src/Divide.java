
import java.io.*;
import java.util.*;

public class Divide {
	public static void main(String[] args) throws Exception {
		//Edit file path depending on where you keep your input.txt file
		FileReader file = new FileReader("https://github.com/smehreen/DividingNumbersFromFile-JavaCode-/blob/master/DividingNumbersFromFile/Input.txt");
		BufferedReader br = new BufferedReader(file);
		StreamTokenizer st = new StreamTokenizer(br);
    	double div=1,a = 1;
    	int counter =0;
    	while(st.nextToken() != st.TT_EOF){
    		if(counter > 1){
    		    div =( div/ st.nval);
		    }
    		else{
    		    div =( a/ st.nval);
    		    a = st.nval;
    		   
    		}
    		    counter ++;
    		    
    		    
    		
    	}
    	System.out.printf("Value after division: %d", div);
    	
	}
}
