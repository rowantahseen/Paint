package eg.edu.alexu.cse.oop.draw;




import eg.edu.alexu.cse.oop.draw.Shape;
/**
 *
 * @author first
 */import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;
import java.awt.geom.RectangularShape;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;
public class Square implements Shape{
    private double length;
    private Point position;
    private Color color;
    private Color fillColor;
    protected Map<String,Double>properties;

    public Square() {
             properties = new HashMap<>();
            properties.put("X-axis" , 0.0);
            properties.put("Y-axis" , 0.0);
            properties.put("Length" , 0.0);
            color=Color.black;
            fillColor=Color.white;
            position =new Point();
    }




    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public Map<String, Double> getProperties() {
        return properties;
    }

   	public void setProperties(Map<String, Double> mp) {
               this.properties=mp;
  		 double x=mp.get("X-axis").intValue();
                 double y=mp.get("Y-axis").intValue();
                 this.length=mp.get("Length");
                 Point a=new Point((int)x,(int)y); 
                 this.setPosition(a);
  	}
       public void setproperty(Map<String, Double> mp){
            this.length=mp.get("Length");
           this.properties. put("Length", mp.get("Length"));
       }
     public void draw(Graphics canvas){
        canvas.setColor(this.getColor());
       canvas.drawRect((int)position.getX(),(int) position.getY(), (int)this.length, (int)this.length);
        canvas.fillRect((int)position.getX(), (int) position.getY(), (int)this.length, (int)this.length);
    }
     public Object clone() {
   Square square=new Square();
    square.length=this.length;
    square.position=this.position;
    square.color=this.color;
    square.fillColor=this.color;
    square.properties=this.properties;
   
    return square;
}

    
    
}
