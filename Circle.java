package eg.edu.alexu.cse.oop.draw;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
public class Circle implements Shape{
    private double radius;
    private Point position;
    private Color color;
    private Color fillColor;
    protected Map<String,Double>properties;

    public Circle() {
         properties = new HashMap<String,Double>();
            properties.put("X-axis" , 0.0);
            properties.put("Y-axis" , 0.0);
            properties.put("Radius" , 0.0);
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
                 this.radius=mp.get("Radius");
                 Point a=new Point((int)x,(int)y); 
                 this.setPosition(a);
  	}
    @Override
     public void draw(Graphics canvas){
        canvas.setColor(this.getColor());
       canvas.drawOval((int)position.getX(),(int) position.getY(), (int)this.radius, (int)this.radius);
        canvas.fillOval((int)position.getX(), (int) position.getY(), (int)this.radius, (int)this.radius);
    }
    @Override
     public Object clone() throws CloneNotSupportedException {
   Circle circle=new Circle();
    
    circle.radius =this.radius;
    circle.position=this.position;
    circle.color=this.color;
    circle.fillColor=this.color;
    circle.properties=this.properties;

    return circle;
}
}
