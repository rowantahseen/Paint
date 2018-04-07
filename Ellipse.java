package eg.edu.alexu.cse.oop.draw;




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
public class Ellipse implements Shape{
    private double length,width;
    private Point position;
    private Color color;
    private Color fillColor;
    protected Map<String,Double>properties;

    public Ellipse() {
        properties = new HashMap<String,Double>();
            properties.put("X-axis" , 0.0);
            properties.put("Y-axis" , 0.0);
            properties.put("Radius1" , 0.0);
            properties.put("Radius2" , 0.0);
            color=Color.black;
            fillColor=Color.white;
            position =new Point();
    }

   



    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public Map<String, Double> getProperties() {
        return properties;
    }

    @Override
   	public void setProperties(Map<String, Double> mp) {
                 this.properties=mp;
  		 double x=mp.get("X-axis").intValue();
                 double y=mp.get("Y-axis").intValue();
                 this.length=mp.get("Radius1");
                 this.width=mp.get("Radius2");
                 Point a=new Point((int)x,(int)y); 
                 this.setPosition(a);
  	}
    @Override
     public void draw(Graphics canvas){
        canvas.setColor(this.getColor());
       canvas.drawOval((int)position.getX(),(int) position.getY(), (int)this.length, (int)this.width);
        canvas.fillOval((int)position.getX(), (int) position.getY(), (int)this.length, (int)this.width);
    }
    @Override
     public Object clone() throws CloneNotSupportedException {
   Ellipse ellipse=new Ellipse();
    ellipse.length=this.length;
    ellipse.width =this.width;
    ellipse.position=this.position;
    ellipse.color=this.color;
    ellipse.fillColor=this.color;
    ellipse.properties=this.properties;

    return ellipse;
}
}
