package eg.edu.alexu.cse.oop.draw;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import eg.edu.alexu.cse.oop.draw.DrawingEngine;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Rowan
 */
public class Engine implements DrawingEngine {
    Shape s[];
    Stack<Shape>stack;
    private int i;
    private static Engine engine;
    private List <Class<? extends Shape>> supportedShapes= new ArrayList<>();
    Engine(){
     s=new Shape[0];
     stack=new Stack<>();
    } 
    @Override
    public void addShape(Shape shape){
        s=Add(s,shape);
    }
    public int getSize(){
        return s.length;
    }
     public static Engine getInstance(){
        if (engine == null) {
            engine = new Engine();
            return engine;
        }
        else {return engine;}
    }
    public Shape[] Add(Shape s[],Shape element){/// copies the array into a new
        Shape ret[]=new  Shape[s.length+1];
        System.arraycopy(s, 0, ret, 0, s.length);
        ret[ret.length-1]=element;
        return ret;
    }

    @Override
    public void removeShape(Shape shape) {
  Shape ret[]=new  Shape[this.s.length-1];
           for(int i=0;i<ret.length;i++){
               if(shape!=ret[i])
                 ret[i]=this.s[i];
           }
       this.s=ret;    
    }

    @Override
    public Shape[] getShapes() {
       return this.s; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void refresh(Graphics canvas) {
        for(int i=0;i<this.s.length;i++){
          this.s[i].draw(canvas);
        }
         //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public List<Class<? extends Shape>> getSupportedShapes() {
        return supportedShapes;
    }

    @Override
    public void installPluginShape(Class<? extends Shape> shapeClass) {
        supportedShapes.add(shapeClass);
    }

    @Override
    public void undo() {
           if(this.s.length==0)return;
           Shape ret[]=new  Shape[this.s.length-1];
           for(int i=0;i<ret.length;i++)
               ret[i]=this.s[i];
           this.stack.add(this.s[s.length-1]);
           this.s=ret;
    }

    @Override
    public void redo() {
      if(!this.stack.isEmpty()){
          this.addShape(stack.lastElement());
          this.stack.pop();
      }
    }
}
