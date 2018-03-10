
import java.io.*;
import java.util.*;

public class Divide {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("C:/Users/hp/workspace/DividingIntegersFromFile/Input.txt");
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
