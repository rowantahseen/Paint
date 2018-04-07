package eg.edu.alexu.cse.oop.draw;


 


/**
 *
 * @author SZakaria
 */
import eg.edu.alexu.cse.oop.draw.Shape;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

public class Triangle implements Shape{
    protected int[] x,y;
    protected Map<String,Double>properties; 
    protected Color color,fillColor;
    protected Point Position;
	Triangle(){
            properties = new HashMap<String,Double>();
            properties.put("X1" , 0.0);
            properties.put("Y1" , 0.0);
            properties.put("X2" , 0.0);
            properties.put("Y2" , 0.0);
            properties.put("Y3" , 0.0);
            properties.put("X3" , 0.0);
            this.color=Color.black;
            fillColor=Color.white;
            x=new int[3];
            y=new int[3];
        }

    public Point getPosition() {
        return Position;
    }

  
   public void setPosition(Point center) {
       int a=(x[0]+x[1])/2;
       int b=(y[0]+y[1])/2;
       Point m=new Point(a,b);
       int u=((x[2]-m.x)/3)+m.x;
       int v=((y[2]-m.y)/3)+m.y;
       Point cc=new Point(u,v);
       int mx=center.x-cc.x;
       int my=center.y-cc.y;
       x[0]=x[0]+mx;
       x[1]=x[1]+mx;
       x[2]=x[2]+mx;
       y[0]=y[0]+my;
       y[1]=y[1]+my;
       y[2]=y[2]+my;
       
       
       
       
       
       
       

    
    }
   
  	

    @Override
    public void setProperties(Map<String, Double> mp) {
  	   this.properties=mp;
           this.x[0]=mp.get("X1").intValue();
           this.y[0]=mp.get("Y1").intValue();
           this.x[1]=mp.get("X2").intValue();
           this.y[1]=mp.get("Y2").intValue();
           this.x[2]=mp.get("X3").intValue();
           this.y[2]=mp.get("Y3").intValue();  
  	}
    @Override
  	public Map<String, Double> getProperties() {
	   return this.properties;
  	}
@Override
  	public void setColor(Color color) {
	  this.color=color;
  	}
@Override
  	public Color getColor() {
  	  return this.color;
  	}
@Override
	public void setFillColor(Color color) {
	   this.fillColor=color;
	}
@Override
	public Color getFillColor() {
	   return this.fillColor;
	}
@Override
	public void draw(Graphics canvas) {
	   canvas.setColor(this.getColor());
           canvas.drawPolygon(this.x, this.y, 3);
           canvas.setColor(this.getFillColor());
           canvas.fillPolygon(this.x, this.y, 3);
	}
   
    @Override
    public Object clone() {
       Triangle t=new Triangle();
    t.Position=this.Position;
    for(int i =0;i<3;i++){
        t.x[i]= this.x[i];
       t.y[i]= this.y[i];
    }
    t.color = this.color;
    t.fillColor=this.color;
    t.properties=this.properties;
   
    return t;
    }
}
