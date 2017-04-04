package hiber;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by java on 31.03.2017.
 */

@Entity
@Table(name = "departments")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String title;
    @Column(name = "date_create")
    private Date createDate;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "departament")
    private List<Employee> employees;

    public Department(String title, Date createDate) {
        this.title = title;
        this.createDate = createDate;
    }
}
