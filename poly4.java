class AreaCalculator{
    int area(int side){
        return side*side;
    }

    int area(int length,int breadth){
        return length*breadth;
    }
    double area(double radius){
        double pi=3.14f;
        return pi*radius*radius;
    }
}
class poly4{
    public static void main(String args[]){

    
    AreaCalculator a=new AreaCalculator();
    System.out.println("Area of square: "+a.area(3));
    System.out.println("Area of rectangle: "+a.area(3,5));
    System.out.println("Area of circle: "+a.area(3));

    }

}