package hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
<<<<<<< HEAD
import java.util.Arrays;
=======
import java.awt.*;
import java.util.Arrays;
import java.util.Date;
>>>>>>> 0285f28a35d73acd24aa24432fae652a6fe507bb
import java.util.List;

import static hiber.HibernateUtil.getSessionFactory;

/**
 * Created by java on 28.03.2017.
 */
public class App {

    public static void main(String[] args) {
        try (SessionFactory sessionFactory = getSessionFactory(); Session session = sessionFactory.openSession();) {

<<<<<<< HEAD
        try (SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();) {

            Query<Department> departmentQuery = session.createQuery("from Department where id = :id", Department.class);
            departmentQuery.setParameter("id", 1L);

            Department department = departmentQuery.uniqueResult();

            Query<Post> postQuery = session.createQuery("from Post where id = :id", Post.class);
            postQuery.setParameter("id", 1L);

            Post post = postQuery.uniqueResult();

//            Employee employee = new Employee("Adolf", "Ivanov", "Robertovich", 55000, department, post);
//
//            employee.setSex(Sex.MALE);
//            employee.setCity("Dnepr");
//            employee.setStreetName("Krasnaya");
//            employee.setZipCode("49000");
//
//            Car car = new Car("BMW", 270);
//            employee.setCar(car);

//            Yacht yacht = new Yacht("2247", 5, 10, 15);

            List<Yacht> list = Arrays.asList(
                    new Yacht("3567", 12, 15, 25),
                    new Yacht("4357", 12, 20, 25),
                    new Yacht("4387", 17, 20, 25),
                    new Yacht("4399", 17, 20, 25),
                    new Yacht("5504", 20, 25, 30),
                    new Yacht("2243", 4, 10, 25),
                    new Yacht("5522", 17, 25, 30),
                    new Yacht("5524", 17, 25, 30),
                    new Yacht("5547", 17, 25, 30),
                    new Yacht("1313", 2, 7, 15),
                    new Yacht("7766", 22, 35, 35),
                    new Yacht("2247", 5, 10, 15),
                    new Yacht("1248", 14, 100, 5),
                    new Yacht("2247", 55, 15, 25),
                    new Yacht("4347", 15, 10, 25),
                    new Yacht("4377", 12, 15, 35),
                    new Yacht("5508", 10, 16, 45),
                    new Yacht("2197", 11, 20, 25),
                    new Yacht("2241", 99, 100, 115),
                    new Yacht("2242", 17, 60, 115),
                    new Yacht("2233", 18, 7, 145),
                    new Yacht("2948", 22, 35, 25),
                    new Yacht("1248", 14, 100, 5)
            );


//            PhoneNumber phoneNumber = new PhoneNumber("380930000000", employee);

            Transaction transaction = session.getTransaction();

            transaction.begin();
//            employee.setPhoneNumber(phoneNumber);
//            session.save(employee);
//            session.save(phoneNumber);

//            session.update(employee);

//            for (Boat b : list) {
//                session.save(b);
//            }

//            session.save(yacht);
            transaction.commit();

//            Query<Employee> query = session.createQuery("from Employee", Employee.class);
//            List<Employee> list = query.list();
//
//            for (Employee e : list) {
//                System.out.println(e);
//            }

            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//
            CriteriaQuery<Yacht> criteriaQuery = criteriaBuilder.createQuery(Yacht.class);
            Root<Yacht> yachtRoot = criteriaQuery.from(Yacht.class);

//            selectAllBoatsOrderBySpeed(criteriaBuilder, criteriaQuery, yachtRoot, sessionFactory);
//            selectOneBoatByMaxSpeed(criteriaBuilder, criteriaQuery, yachtRoot, sessionFactory);
//            selectOneBoatByMin(criteriaBuilder, criteriaQuery, yachtRoot, sessionFactory);
        } finally {
            System.out.println("Good bye!");
        }
    }

    private static void selectOneBoatByMin(CriteriaBuilder criteriaBuilder,
                                           CriteriaQuery<Yacht> criteriaQuery,
                                           Root<Yacht> yachtRoot,
                                           SessionFactory sessionFactory) {
        criteriaQuery.select(yachtRoot);
        criteriaQuery.orderBy(criteriaBuilder.asc(yachtRoot.get("maxPassengers")));


        EntityManager entityManager = sessionFactory.createEntityManager();
        Yacht yacht = entityManager.createQuery(criteriaQuery).setMaxResults(1).getSingleResult();

        System.out.println(yacht);
    }

    private static void selectOneBoatByMaxSpeed(CriteriaBuilder criteriaBuilder,
                                                CriteriaQuery<Yacht> criteriaQuery,
                                                Root<Yacht> yachtRoot,
                                                SessionFactory sessionFactory) {
        criteriaQuery.select(yachtRoot);
        criteriaQuery.orderBy(criteriaBuilder.desc(yachtRoot.get("maxSpeed")));


        EntityManager entityManager = sessionFactory.createEntityManager();
        Yacht yacht = entityManager.createQuery(criteriaQuery).setMaxResults(1).getSingleResult();

        System.out.println(yacht);
    }

    private static void selectAllBoatsOrderBySpeed(CriteriaBuilder criteriaBuilder,
                                                   CriteriaQuery<Yacht> criteriaQuery,
                                                   Root<Yacht> yachtRoot,
                                                   SessionFactory sessionFactory) {
        criteriaQuery.select(yachtRoot);
        criteriaQuery.orderBy(criteriaBuilder.asc(yachtRoot.get("maxSpeed")));

        EntityManager entityManager = sessionFactory.createEntityManager();
        List<Yacht> resultList = entityManager.createQuery(criteriaQuery).getResultList();

=======
            Query<Department> departmentQuery = session.createQuery("from Department where id = :id", Department.class);
            departmentQuery.setParameter("id", 1L);

            Department department = departmentQuery.uniqueResult();

            Query<Post> postQuery = session.createQuery("from Post where id = :id", Post.class);
            postQuery.setParameter("id", 1L);

            Post post = postQuery.uniqueResult();

//            Employee employee = new Employee("Adolf", "Ivanov", "Robertovich", 55000, department, post);
//
//            employee.setSex(Sex.MALE);
//            employee.setCity("Dnepr");
//            employee.setStreetName("Krasnaya");
//            employee.setZipCode("49000");
//
//            Car car = new Car("BMW", 270);
//            employee.setCar(car);

//            Yacht yacht = new Yacht("2247", 5, 10, 15);

            List<Yacht> list = Arrays.asList(
                    new Yacht("3567", 12, 15, 25),
                    new Yacht("4357", 12, 20, 25),
                    new Yacht("4387", 17, 20, 25),
                    new Yacht("4399", 17, 20, 25),
                    new Yacht("5504", 20, 25, 30),
                    new Yacht("2243", 4, 10, 25),
                    new Yacht("5522", 17, 25, 30),
                    new Yacht("5524", 17, 25, 30),
                    new Yacht("5547", 17, 25, 30),
                    new Yacht("1313", 2, 7, 15),
                    new Yacht("7766", 22, 35, 35),
                    new Yacht("2247", 5, 10, 15),
                    new Yacht("1248", 14, 100, 5),
                    new Yacht("2247", 55, 15, 25),
                    new Yacht("4347", 15, 10, 25),
                    new Yacht("4377", 12, 15, 35),
                    new Yacht("5508", 10, 16, 45),
                    new Yacht("2197", 11, 20, 25),
                    new Yacht("2241", 99, 100, 115),
                    new Yacht("2242", 17, 60, 115),
                    new Yacht("2233", 18, 7, 145),
                    new Yacht("2948", 22, 35, 25),
                    new Yacht("1248", 14, 100, 5)
            );



//            PhoneNumber phoneNumber = new PhoneNumber("380930000000", employee);

            Transaction transaction = session.getTransaction();

            transaction.begin();
//            employee.setPhoneNumber(phoneNumber);
//            session.save(employee);
//            session.save(phoneNumber);

//            session.update(employee);

            for(Boat b : list) {
                session.save(b);
            }

//            session.save(yacht);
            transaction.commit();

//            Query<Employee> query = session.createQuery("from Employee", Employee.class);
//            List<Employee> list = query.list();
//
//            for (Employee e : list) {
//                System.out.println(e);
//            }

            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

            CriteriaQuery<Yacht> criteriaQuery = criteriaBuilder.createQuery(Yacht.class);
            Root<Yacht> yachtRoot = criteriaQuery.from(Yacht.class);

//            criteriaQuery.select(yachtRoot);

//            selectAllBoatsOrderBuSpeed(criteriaBuilder, criteriaQuery, yachtRoot, sessionFactory);
//            selectOneByMaxSpeed(criteriaBuilder, criteriaQuery, yachtRoot, sessionFactory);
            selectOneBoatByMin(criteriaBuilder, criteriaQuery, yachtRoot, sessionFactory);


//            criteriaQuery.where(criteriaBuilder.equal(yachtRoot.get("model"), "2247"));
//
//            EntityManager entityManager = sessionFactory.createEntityManager();
//            Yacht yacht1 = entityManager.createQuery(criteriaQuery).getSingleResult();

//            System.out.println(yacht1);
        } finally {
            System.out.println("Good bye!");
        }

}

    private static void selectOneBoatByMin(CriteriaBuilder criteriaBuilder,
                                           CriteriaQuery<Yacht> criteriaQuery,
                                           Root<Yacht> yachtRoot,
                                           SessionFactory sessionFactory) {

        criteriaQuery.select(yachtRoot);
        criteriaQuery.orderBy(criteriaBuilder.asc(yachtRoot.get("maxPassengers")));

        EntityManager entityManager = sessionFactory.createEntityManager();
        Yacht yacht = entityManager.createQuery(criteriaQuery).setMaxResults(1).getSingleResult();

        System.out.println(yacht);
    }


    private static void selectOneByMaxSpeed(CriteriaBuilder criteriaBuilder,
                                            CriteriaQuery<Yacht> criteriaQuery,
                                            Root<Yacht> yachtRoot,
                                            SessionFactory sessionFactory) {

        criteriaQuery.select(yachtRoot);
        criteriaQuery.orderBy(criteriaBuilder.desc(yachtRoot.get("maxSpeed")));

        EntityManager entityManager = sessionFactory.createEntityManager();
        Yacht yacht = entityManager.createQuery(criteriaQuery).setMaxResults(1).getSingleResult();

        System.out.println(yacht);
    }


    private static void selectAllBoatsOrderBuSpeed(CriteriaBuilder criteriaBuilder,
                                                   CriteriaQuery<Yacht> criteriaQuery,
                                                   Root<Yacht> yachtRoot,
                                                   SessionFactory sessionFactory) {
        criteriaQuery.select(yachtRoot);
        criteriaQuery.orderBy(criteriaBuilder.asc(yachtRoot.get("maxSpeed")));
        EntityManager entityManager = sessionFactory.createEntityManager();
        List<Yacht> resultList = entityManager.createQuery(criteriaQuery).getResultList();

>>>>>>> 0285f28a35d73acd24aa24432fae652a6fe507bb
        for (Yacht y : resultList) {
            System.out.println(y);
        }
    }
}
