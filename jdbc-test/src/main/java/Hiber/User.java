package hiber;

import javax.persistence.*;

/**
 * Created by java on 21.03.2017.
 */
@Entity
@Table(name = "USER", indexes = {
        @Index(columnList = "email", name = "email_idx")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    private long id;
    @Column(name = "full_name")
    private String name;
    @Column(unique = true)
    private String email;
    @Column
    private String password;
    @Column
    private boolean blocked;

    public User() {
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
