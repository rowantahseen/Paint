package eg.edu.alexu.cse.oop.draw;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;
import java.awt.geom.RectangularShape;
import java.awt.geom.Rectangle2D;
import java.lang.NumberFormatException;
import java.util.HashMap;

public class Rectangle implements Shape{ //implements Shape {
    private Point xy;
    private double width;
    private double height;
    private Point center;
    private Color color,fillcolor;
    private Color fillColor;
    protected Map<String,Double>properties;
    private Object clone;
    
    
public Rectangle(){
    
    properties = new HashMap<String,Double>();
            properties.put("X-axis" , 0.0);
            properties.put("Y-axis" , 0.0);
            properties.put("Length" , 0.0);
            properties.put("Width" , 0.0);
            color=Color.black;
            fillColor=Color.white;
            xy =new Point();
}

@Override
   public void setProperties(Map<String, Double> mp) {
                 this.properties=mp;
  		 double x=mp.get("X-axis").intValue();
                 double y=mp.get("Y-axis").intValue();
                 this.width=mp.get("Width");
                 this.height=mp.get("Length");
                 Point a=new Point((int)x,(int)y); 
                 this.setPosition(a);
  	}

@Override
public void setPosition(Point xy){
    this.xy=xy;
    
}
@Override
public Point getPosition(){
    return this.xy;
    }


/* update shape specific properties (e.g., radius) */

/* colorize */
@Override
public void setColor(Color color){
   this.color=color;
    
}
@Override
public Color getColor(){
    return color;
    
}
@Override
public void setFillColor(Color color){
    this.fillColor=color;
    
}
@Override
public java.awt.Color getFillColor(){
    return fillColor;
    
}
/* redraw the shape on the canvas */

/* create a deep clone of the shape */
public Object clone() {
   Rectangle r=new Rectangle();
    r.xy=this.xy;
    r.width=this.width;
    r.height=this.height;
    r.center=this.center;
    r.color=this.color;
    r.fillColor=this.color;
    r.properties=this.properties;
   
    return r;
}
    
@Override
    public void draw(Graphics canvas){
        canvas.setColor(this.getColor());
        canvas.drawRect((int)xy.getX(),(int) xy.getY(), (int)this.width, (int)this.height);
        canvas.fillRect((int)xy.getX(), (int) xy.getY(), (int)this.width, (int)this.height);
    }

  @Override
  	public Map<String, Double> getProperties() {
	   return this.properties;
        }
}

