package base;

/**
 * @author mizhuo
 */
public class User{
    public String name;
    public String age;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        User user = (User) o;
        return user.getName().equals(this.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
