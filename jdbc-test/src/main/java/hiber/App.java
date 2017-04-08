package hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.internal.CriteriaSubqueryImpl;

import javax.persistence.criteria.*;
import java.util.Date;
import java.util.List;

import static hiber.HibernateUtil.getSessionFactory;

/**
 * Created by java on 28.03.2017.
 */
public class App {

    public static void main(String[] args) {


//        Employee employee = new Employee();

try (         SessionFactory sessionFactory = getSessionFactory();
              Session session = sessionFactory.openSession();){


    Query<Department> departmentQuery = session.createQuery("from Department where id = :id", Department.class);
    departmentQuery.setParameter("id",1L);

    Query<Post> postQuery = session.createQuery("from Post where id = :id", Post.class);
    postQuery.setParameter("id", 1L);

    Post post = postQuery.uniqueResult();

    Department department = departmentQuery.uniqueResult();


    Employee employee = new Employee("Adolf", "Ivanov", "Robertovich", 55000, department, post);

//    employee.setSex(Sex.MALE);
//    employee.setCity("Dnepr");
//    employee.setStreetName("Krasnaya");
//    employee.setZipCode("49000");
//
//    Car car = new Car("BMV", 270);
//    employee.setCar(car);

//    PhoneNumber phoneNumber = new PhoneNumber("380930000000", employee);

    Yacht yacht =new Yacht("2247", 5, 10, 15);

    Transaction transaction = session.getTransaction();

    transaction.begin();
//    session.save(employee);
//    session.save(phoneNumber);
//    employee.setPhoneNumber(phoneNumber);
//    session.update(employee);

    session.save(yacht);
    transaction.commit();


//    Query<Employee> query = session.createQuery("from Employee", Employee.class);
//    List<Employee> list = query.list();
//
//    for(Employee e : list) {
//        System.out.println(e);
//    }

    CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
    CriteriaQuery<Yacht> criteriaQuery = session.getCriteriaBuilder().createQuery(Yacht.class);
    Root<Yacht> yachtRoot = criteriaQuery.from(Yacht.class);

    Predicate predicate = criteriaBuilder.equal(yachtRoot.get("model"), "2247");

    CriteriaQuery<Yacht> query = criteriaQuery.where(predicate);
//    query.get


}  finally {
            System.out.println("God bye");
        }

    }
}
