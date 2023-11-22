class main { 
public static void main(String[] args) {
        PrepBytes pb= new PrepBytes();
        pb.test();
    }
}interface Car{
    default void test(){
        System.out.println("Testing a car");
    }
}
interface Bike{
    default void test(){
        System.out.println("Testing a bike");
    }
}
class PrepBytes implements Car,Bike{
    
    public void test(){
        Car.super.test();
        Bike.super.test();
    }
    
   