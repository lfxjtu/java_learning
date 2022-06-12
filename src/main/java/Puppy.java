public class Puppy {
    int puppyAge;
    public Puppy(String name){
        System.out.println("Name chosen is: " + name);
    }
    public void setPuppyAge(int age){
        puppyAge = age;
    }
    public int getPuppyAge(){
        System.out.println("Puppy's age is: " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("Tommy");
        myPuppy.setPuppyAge(2);
        myPuppy.getPuppyAge();
        System.out.println("The variable value: " + myPuppy.puppyAge);

    }
}
