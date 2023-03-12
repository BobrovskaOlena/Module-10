public class User {
    private final String name;
    private final Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{ \"name\": \"" + name + "\", \"age\": " + age + " }";
    }
}
