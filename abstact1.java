abstract class Shape{
    abstract void draw();

    void info(){
        System.out.println("This is Shape");
    }
} 
class Circle extends Shape{
    void draw(){
        System.out.println("Draw the circle");
    }
}
class abstact1{
    public static void main(String args[]){
        Shape s=new Circle();
        s.draw();
        s.info();
    }
}