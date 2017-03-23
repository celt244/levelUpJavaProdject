/**
 * Created by Arthur on 23.03.2017.
 */
public class User {

    private long id;
    private String usersname;
    private String email;
    private String pass;

    public User(String usersname, String email, String pass) {
        this.usersname = usersname;
        this.email = email;
        this.pass = pass;
    }

    public User(long id, String usersname, String email, String pass) {
        this.id = id;
        this.usersname = usersname;
        this.email = email;
        this.pass = pass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return usersname;
    }

    public void setUsersname(String usersname) {
        this.usersname = usersname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", usersname='" + usersname + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
