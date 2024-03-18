public class Person {

    //public
    //protected
    //default
    //private
    public String name;
    public int age;
    public boolean sex;
    public String profession;

    public Person(String name, int age, boolean sex, String profession) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.profession = profession;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + (sex ? "male" : "female") +
                ", profession='" + profession + '\'' +
                '}';
    }
}
