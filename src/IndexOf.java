import acm.program.*;
import java.util.*;
import acm.graphics.*;


public class IndexOf extends ConsoleProgram {

	public void run() {
		
		//int [] a = new int;
		
		//int [] a = {42, 7, -9, 14, 8, 39, 42, 8, 19, 0};
		int[] list = {5, 7, 7, 7, 22, 22, 23, 35, 35, 40, 40, 40};
		//int[] list = {1, 2, 11, 17, 24, 25, 26, 31, 34, 37, 40, 41};
		//int[] list = {};
		
		//println(Index(a,2));
		
		/*String [] a1 = {"a", "c", "a", "z", "a", "a", "p", "j", "w"};
		String [] a2 = {"a", "p", "j"};
		
		for(int i =0; i<a1.length; i++)
			print(a1[i]+" ");
		println(" ");
		
		banish(a1, a2);
		
		for(int i =0; i<a1.length; i++)
			print(a1[i]+" ");*/
		
		//println(numUnique(list));
		
		//int [] m1 = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
		int [] m1 ={1, 2, 3, 4, 5};
		int [] m2 = collapse(m1);
		
		for(int i =0; i<m2.length; i++)
			print(m2[i]+" ");
		
	}
	
	private int[] collapse (int [] m1) {
		int [] m2;
		
		int l = m1.length/2 + m1.length%2;
		println(l);
		m2 = new int [l];
		
		for(int i=0; i<m1.length/2; i++)
			m2[i] = m1[2*i] + m1[2*i+1];
		
		if (m1.length%2 != 0)
			m2[l-1]=m1[m1.length-1];
		
		return m2;
		
	}
	
	private void banish(String []s1, String []s2) {
		
		for ( int i=0; i<1; i++) {
			for (int j = 0; j<s1.length; j++) {
				println(j);

				if (s2[i].equals(s1[j])) {
					println("y");
					for(int k=j; k<s1.length-1;k++)
						s1[k]=s1[k+1];
					s1[s1.length-1]=" ";
					
					
					for(int l =0; l<s1.length; l++)
						print(s1[l]+" ");
				}
			}
		}
		
		//return "";
	}
	
	private int numUnique(int []a) {
		int unique = 0;
		int last = 0;
		
		for (int val : a) {
			if(val!=last)
				unique++;
			last = val;
		}
		
		
		return unique;
	}
	
	public int Index(int []a,int val){
		
	int ind= -1;
	
	for (int i=0; i<a.length; i++) {
		if(a[i]==val)
			{
			ind = i;
			break;
			}
	}
	
	return ind;
	}
	
}
