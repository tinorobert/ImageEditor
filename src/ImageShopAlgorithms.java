/* 
 * Note: these methods are public in order for them to be used by other files
 * in this assignment; DO NOT change them to private.  You may add additional
 * private methods to implement required functionality if you would like.
 * 
 * You should remove the stub lines (TODO and return null) from each method
 * and replace them with your implementation that returns an updated image.
 */

// TODO: comment this file explaining its behavior

import java.util.*;
import acm.graphics.*;

public class ImageShopAlgorithms implements ImageShopAlgorithmsInterface {

	public GImage flipHorizontal(GImage source) {
		// TODO
		return null;
	}

	public GImage rotateLeft(GImage source) {
		
		int [][] pixels = source.getPixelArray();
		
		int x = pixels.length;
		int y = pixels[0].length;
		
		int [][] left = new int [y][x];
		

		for(int i=0; i<x; i++)
			for (int j=0; j<y; j++) {
				left[y-j-1][i] = pixels[i][j];
				
			}
		
		GImage img = new GImage(left);
		
		return img;
	}

	public GImage rotateRight(GImage source) {
		// TODO
		return null;
	}

	public GImage greenScreen(GImage source) {
		// TODO
		int [][] pixels = source.getPixelArray();
		int x = pixels.length, y = pixels[0].length;
		int [][]r = new int [x][y];
		int [][]g = new int [x][y];
		int [][]b = new int [x][y];
		int [][]a = new int [x][y];
		int [][]gscreen = new int [x][y];
		
		int max;
		GImage img;
		
		for (int i=0; i<x; i++)
			for(int j=0; j<y; j++)
			{
				r[i][j] = source.getRed(pixels[i][j]);
				g[i][j] = source.getGreen(pixels[i][j]);
				b[i][j] = source.getBlue(pixels[i][j]);
				
				max = Math.max(r[i][j], b[i][j]);
				if(g[i][j] < 2*max)
					a[i][j] = 255;
				
				gscreen[i][j] = GImage.createRGBPixel(r[i][j], g[i][j], b[i][j], a[i][j]);

					}
		
		
		img = new GImage(gscreen);
			
		return img;
	}

	public GImage equalize(GImage source) {
		// TODO
		return null;
	}

	public GImage negative(GImage source) {
		// TODO
		return null;
	}

	public GImage translate(GImage source, int dx, int dy) {
		
		int [][] pixels = source.getPixelArray();
		//int [][]pixels = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int x = pixels.length;
		int y= pixels[0].length;
		int ky=0, kx=0;
		dy = -dy;
		
		int [][]trans = new int [x][y];
		
		for(int i=0; i<x; i++)
			for( int j=0; j<y; j++)
				{
				if(j+dx>=y)
					ky = (j+dx) - y;	
				else 
					{
					if (j+dx<0)
					ky= y + (j+dx);
					else
						ky = j+dx;
					}
				
				if(i+dy>=x)
					//kx=i;
					kx = (i+dy) - x;	
				else 
					{
					if (i+dy<0)
					kx = x + (i+dy);

					else
						kx = i+dy;
					}
				
				trans[kx][ky] = pixels[i][j];
				}
		
		System.out.println();

		
		GImage img = new GImage(trans);
		
		return img;
	}

	public GImage blur(GImage source) {
		// TODO
		return null;
	}
}
