class Animal{
    void sound(){
        System.out.println("Animal can make sound");
    }
}
class Dog extends Animal{
     void sound(){
        System.out.println("Dog Bark");
    }
}
class poly2{
    public static void main(String args[]){
       Animal a=new Dog();
        a.sound();
    }

}