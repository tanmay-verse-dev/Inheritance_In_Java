class A{
    void display(){
        System.out.println("Student is good");
    }
}
class B extends A{
    void demo(){
        System.err.println("Because he is scoring good marks");
    }
}

public class inherit {
    public static void main(String[] args){
        B b= new B();
        b.display();
        b.demo();
    }
    

    

}
