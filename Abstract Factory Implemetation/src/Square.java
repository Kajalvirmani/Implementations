public class Square implements Shape {
    double area=1;
    double perimeter=0;
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("inside square's draw() method");

    }

    @Override
    public void area(double... sidesMeasurement) {
        // TODO Auto-generated method stub
       
       for(double i:sidesMeasurement)
       {
           area=i*i;
       }
       System.out.println(area);
    }

    @Override
    public void perimeter(double... sidesMeasurement) {
        // TODO Auto-generated method stub
        for(double i:sidesMeasurement){
            perimeter=4*i;
        }
        System.out.println(perimeter);
    }
    
}
