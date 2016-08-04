class Dog{
    int size;
    String name;

    void bark(int numOfBarks){
//        if (size > 60){
//            System.out.println("Woof!");
//        } else if (size > 14){
//            System.out.println("Ruff!");
//        } else{
//            System.out.println("Tip!");
//        }
        while (numOfBarks > 0) {
            System.out.println("ruff!");
            numOfBarks -= 1;
        }

    }
}
class DogTestDrive{
    public static void main (String[] args){
    Dog one = new Dog();
    one.size = 70;
    Dog two = new Dog();
    two.size = 12;
    Dog three = new Dog();
    three.size = 35;

    one.bark(2);
//    two.bark(3);
//    three.bark(4);
    }
}