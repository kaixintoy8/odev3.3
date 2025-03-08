    //Abstract class1
    abstract class Animal{
        abstract void makeSound();

        void eat(){
            System.out.println("Bütün hayvanlar yemek yer! ");
        }
    }

    class Cat extends Animal{
        @Override
        void makeSound() {
            System.out.println("Kedi miyavlar");
        }
    }
    class Dog extends Animal{
    @Override
        void makeSound() {
        System.out.println("Köpek havlar");
        }
    }

    //Abstract class2

    abstract class Employee {
        String name;
        public Employee(String name) { this.name = name; }
        abstract void work();
    }

    interface Managerial { void manage(); }
    interface DeveloperSkills { void code(); }

    class Manager extends Employee implements Managerial {
        public Manager(String name) { super(name); }
        public void work() { System.out.println(name + " is managing the team."); }
        public void manage() { System.out.println(name + " is making strategic decisions."); }
    }

    class Developer extends Employee implements DeveloperSkills {
        public Developer(String name) { super(name); }
        public void work() { System.out.println(name + " is writing code."); }
        public void code() { System.out.println(name + " is debugging."); }
    }


    public class Main {
    public static void main(String[] args) {
        //Abstract class1

        Animal cat = new Cat();
        cat.eat();
        cat.makeSound();

        Animal dog = new Dog();
        dog.eat();
        dog.makeSound();

        //Abstract class1
        Manager manager = new Manager("Alice");
        manager.work(); manager.manage();

        Developer developer = new Developer("Bob");
        developer.work(); developer.code();

    }

}