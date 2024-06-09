public class Studente {
    // fields
    private String name;
    private int age;

    // constructor
    public Studente(String name,int age){
        this.name = name;
        this.age = age;
    }

    // the getter and setter
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

    // toString override
    @Override
    public String toString() {
        return "Studente{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + "\n";
    }
}
