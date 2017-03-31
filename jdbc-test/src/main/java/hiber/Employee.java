package hiber;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by java on 31.03.2017.
 */

@Entity
@Table (name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name_first")
    private String firstName;
    @Column(name = "name_last")
    private String lastName;
    @Column(name = "name_second")
    private String secondName;
    @Column
    private double salary;
    @Column
    @Type(type = "timestamp")
    private Date dateCreate;

    public Employee(String firstName, String lastName, String secondName, double salary, Date dateCreate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.salary = salary;
        this.dateCreate = dateCreate;
    }
}