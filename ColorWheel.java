import java.awt.*;   // for Graphics
import java.util.Random;

public class ColorWheel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrawingPanel panel = new DrawingPanel(512,512);
		Graphics g = panel.getGraphics();
		HSLColor color = new HSLColor( Color.YELLOW );

	    for (int i = 0; i < 360; i++)
	    {
	         g.setColor( color.adjustHue(i) );
	         g.fillArc( 5, 5, 500, 500, i, 1);
	    }
		
		/*
			//int i = 0;
		//int n = 11;
		
		Color color = new Color(242, 97, 97);
		g.setColor(color);
		g.fillArc(5, 5, 500, 500, n*(i+1), n);
		
		
		i++;
		
		color = new Color(242, 87, 87);
		g.setColor(color);
		g.fillArc(5, 5, 500, 500, n*(i+1), n);
		i++;
		
		color = new Color(242, 67, 67);
		g.setColor(color);
		g.fillArc(5, 5, 500, 500, n*(i+1), n);
		i++;
		
		color = new Color(242, 57, 57);
		g.setColor(color);
		g.fillArc(5, 5, 500, 500, n*(i+1), n);
		i++;
		
		color = new Color(242, 57, 57);
		g.setColor(color);
		g.fillArc(5, 5, 500, 500, n*(i+1), n);
		i++;
		
		color = new Color(242, 57, 57);
		g.setColor(color);
		g.fillArc(5, 5, 500, 500, n*(i+1), n);
		i++;
		
		color = new Color(242, 57, 57);
		g.setColor(color);
		g.fillArc(5, 5, 500, 500, n*(i+1), n);
		i++;
		
		color = new Color(242, 47, 47);
		g.setColor(color);
		g.fillArc(5, 5, 500, 500, n*(i+1), n);
		i++;
		
		
		
		*/
		
		/*
		final int ARRAY_SIZE = 32;
		double jump = 360.0 / (ARRAY_SIZE*1.0);
		int[] colors = new int[ARRAY_SIZE];
		*/
		
		//for (int i = 0; i < colors.length; i++) {
		
		//    colors[i] = Color.HSBtoRGB((float) (jump*i), 1.0f, 1.0f);
		//}
		
		
		
	//	for(int i = 0;i<32;i++) {
			
		//	int red = getRandomNumberInRange(0, 255);
		//	int green = getRandomNumberInRange(0, 255);
		//	int blue = getRandomNumberInRange(0, 255);
			
			//g.setColor(new Color(red, green, blue));
			//g.setColor(new Color(colors[i]));
			//g.fillArc(5, 5, 500, 500, n*(i+1), n);
			//System.out.println(n*i+" "+n*(i+1)+" "+red+" "+green+" "+blue);

			//if(i == 1) g.fillArc(5, 5, 500, 500, 0, 60);
			//if(i == 2) g.fillArc(5, 5, 500, 500, 60, 90);
			
	//	}

	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	
	
	
	
}
