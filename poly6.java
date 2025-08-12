class Greeting{
    void sayHello(){
        System.out.println("Hello !");
    }
    void sayHello(String name){
        System.out.println("Hello,"+name);
    }
    void sayHello(String name,int age){
        System.out.println("Hello,"+name+"your age is: "+age);
    }
}
class poly6{
    public static void main(String args[]){
        Greeting g=new Greeting();
        g.sayHello();
        g.sayHello("komal");
        g.sayHello("komal",21);
    }
}