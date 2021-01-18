//Implementation of facade pattern
 interface Shape {
     //every shape is being drawn
    void draw();
 }


//Create concrete classes implementing the same interface.
/*Qectangle, sqaure and Circle have their own implementations but we need not show this to client*/
class Rectangle implements Shape {

    @Override
    public void draw() {
       System.out.println("Rectangle::draw()");
    }
 }


 class Square implements Shape {

    @Override
    public void draw() {
       System.out.println("Square::draw()");
    }
 }

 class Circle implements Shape {

    @Override
    public void draw() {
       System.out.println("Circle::draw()");
    }
 }
//Facade Class will call whatever the client has asked for
  class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
 
    public ShapeMaker() {
       circle = new Circle();
       rectangle = new Rectangle();
       square = new Square();
    }
 
    public void drawCircle(){
       circle.draw();
    }
    public void drawRectangle(){
       rectangle.draw();
    }
    public void drawSquare(){
       square.draw();
    }
 }
 //Use the facade to draw various types of shapes.
public class Facade 
{ 
    public static void main (String[] args) 
    { 
        ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();	
  
    } 
} 

