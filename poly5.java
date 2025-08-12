class Multiplication{
    int multiply(int a,int b){
        return a*b;
    }

    double multiply(double a,double b){
        return a*b;
    }
    int multiply(int a,int b,int c){
        return a+b+c;
    }

}
class poly5{
    public static void main(String args[]){
        Multiplication m=new Multiplication();
        System.out.println(m.multiply(5,5));
        System.out.println(m.multiply(5.5,5.5));
        System.out.println(m.multiply(5,5,5));

    }
}