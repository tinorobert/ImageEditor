
import acm.graphics.GImage;
import acm.program.*;
import acm.util.*;
import java.io.*;    // for File
import java.util.*;  // for Scanner
import acm.graphics.*;

//This programs DOESN'T do histograms, it FLIPS an image
public class Histograms extends GraphicsProgram {
	
	public void run() {
		
			String word;
			int [][] pixels;
			int factor = 2;
			//ArrayList<String> myArrayList = new ArrayList<>();
					

			//GImage img = new GImage ("res/courtney doucette.png");
			GImage img = new GImage ("res/smiley-face.png");
			
			pixels = img.getPixelArray();
			
			//int [][]pixels = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
			//int [][]pixels = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

			
			
			//add(img);
			
			//flipVertical(pixels);
			stretch(pixels,factor);
			
		
	}
	
	private void stretch(int [][]p, int factor) {
		
		int x = p.length;
		int y = p[0].length;
		int [][]bigger = new int [x][factor*y];
		
		for(int i=0; i<x; i++) {
			
			for(int j=0; j<y; j++) {
				bigger[i][factor*j] = p[i][j];
				bigger[i][factor*j+1] = p[i][j];

				//bigger[i][j] = -16777216;

				//print(p[i][j] + "-" + flip[i][j]+ " " );
			}
			print("OK");
		}
		
		GImage img2 = new GImage (bigger);
		add(img2);
		
	}
	
	private void flipVertical(int[][] p) {
		
		int x = p.length;
		int y = p[0].length;
		int [][]flip = new int [x][y];
		
		/*for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++)
				print(p[i][j]+ " ");
			println();
		}*/

		
		println();

		for(int i=0; i<x; i++) {
		
			for(int j=0; j<y; j++) {
				flip[i][j] = p[x-i-1][j];
				//print(p[i][j] + "-" + flip[i][j]+ " " );
			}
			println();
		}
		
		
		/*for(int i=x/2; i<x; i++) {
			
			for(int j=0; j<y; j++) {
				flip[i][j] = p[i][j];
				print(p[i][j] + "-" + flip[i][j]+ " " );
			}
			println();
		}*/
		
		
		
		GImage img2 = new GImage (flip);
		
		
		/*println();
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++)
				print(flip[i][j]+ " ");
			println();
		}*/
		
		add(img2);
		println();

		
	}
	
	
	

}
