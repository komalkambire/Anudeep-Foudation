class Animal{
    void makeSound(){
        System.out.println("animal make a sound");
    }

}
class dog extends Animal{
    void makeSound(){
        System.out.println("bho");
    }
}
class cat extends Animal{
    void makeSound(){
         System.out.println("meo");
    }
}
class poly7{
    public static void main(String args[]){
        Animal a=new dog();
        a.makeSound();
        Animal B=new cat();
        B.makeSound();
    }
}