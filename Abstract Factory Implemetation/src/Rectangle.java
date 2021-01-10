public class Rectangle implements Shape{
    double perimeter=0;
    double area=1;
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("inside rectangle's draw() method");
    }

    @Override
    public void area(double... sidesMeasurement) {
        // TODO Auto-generated method stub
       
        for (double i:sidesMeasurement) {
            area=area*i;
        }
        System.out.println(area);
    }

    @Override
    public void perimeter(double... sidesMeasurement) {
        // TODO Auto-generated method stub
       
        for(double i : sidesMeasurement) {
            perimeter+=2*i;
        }
        System.out.println(perimeter);
    }
    
}
