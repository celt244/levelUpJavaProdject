package ua.dp.levelup.reflection;

/**
 * Created by java on 07.03.2017.
 */
public class Author {
    @ToXML
    private String firstName;
    @ToXML
    private String lasttName;
    @ToXML
    private int age;

    public Author(String firstName, String lasttName, int age) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.age = age;
    }
}
