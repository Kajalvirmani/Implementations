public class RoundedRectnagle implements Shape{
    double area=1;
    double perimeter=0;
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("inside rounded rectangle's draw() method");
    }

    @Override
    public void area(double... sidesMeasurement) {
        // TODO Auto-generated method stub
        for(double i : sidesMeasurement) {
            area*=i;
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
