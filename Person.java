package Override;

public class Person {

    String name;
    int age;

    Person(String name, int age) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person with name: " + name + " has age: " + age;
    }

    public static void main(String[] args) {

        Person person = new Person("John", 20);

        System.out.println(person);
    }


}
