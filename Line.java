package eg.edu.alexu.cse.oop.draw;




import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

public class Line implements Shape{

    protected int[] x,y;
    protected Map<String,Double>properties; 
    protected Color c,fillColor;
    protected Point center;
    Line(){
            properties = new HashMap<String,Double>();
            properties.put("X1" , 0.0);
            properties.put("Y1" , 0.0);
            properties.put("X2" , 0.0);
            properties.put("Y2" , 0.0);
            c=Color.black;
            fillColor=Color.black;
            x=new int[2];
            y=new int[2];
        }
	public void setPosition(Point center) {

       int a=(x[0]+x[1])/2;
       int b=(y[0]+y[1])/2;
       Point m=new Point(a,b);
       int mx=center.x-m.x;
       int my=center.y-m.y;
       x[0]=x[0]+mx;
       x[1]=x[1]+mx;
       y[0]=y[0]+my;
       y[1]=y[1]+my;
    
       
  	}
    
  	public Point getPosition() {
           
            return center;
  	}
  	

  	public void setProperties(Map<String, Double> mp) {
  	   this.properties=mp;
           this.x[0]=mp.get("X1").intValue();
           this.y[0]=mp.get("Y1").intValue();
           this.x[1]=mp.get("X2").intValue();
           this.y[1]=mp.get("Y2").intValue(); 
  	}
  	public Map<String, Double> getProperties() {
	   return this.properties;
  	}

  	public void setColor(Color color) {
	  this.c=color;
  	}

  	public Color getColor() {
  	  return this.c;
  	}

	public void setFillColor(Color color) {
	   this.fillColor=color;
	}

	public Color getFillColor() {
	   return this.fillColor;
	}

	public void draw(Graphics canvas) {
	   canvas.setColor(this.getFillColor());
          canvas.drawLine(x[0], y[0], x[1], y[1]);
           canvas.setColor(this.getFillColor());
           
	}
        
    @Override
    public Shape clone() {
      Shape line =new Line();
      line.setColor(this.getColor());
      line.setFillColor(this.getFillColor());
      line.setProperties(this.properties);
      return line;
    }
   
}
