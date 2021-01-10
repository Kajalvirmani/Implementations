public class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        // TODO Auto-generated method stub
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectnagle();         
         }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
         }	 
         return null;
    }
    
}
