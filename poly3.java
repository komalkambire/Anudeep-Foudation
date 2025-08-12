class Print{

    String print(String msg){
       return "hello";
    }

    int print(int num){
        return num;
    }
    double print(double num){
        return num;
    }
}
class poly3{
    public static void main(String args[]){
        Print p=new Print();
        System.out.println(p.print("hello"));
        System.out.println(p.print(21));
        System.out.println(p.print(22.54));
    }

}