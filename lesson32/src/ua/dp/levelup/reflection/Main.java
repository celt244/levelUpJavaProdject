package ua.dp.levelup.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by java on 07.03.2017.
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Book book = new Book(14);
        book.setAuthor("Pushkin");
        book.setBookName("Book1");
        book.setPageCount(35);

        Class aClass = book.getClass(); //получение экземпляра класса

        Class bookClass = Book.class; //получение экземпляра класса

        System.out.println("Book fields");
        Field[] fields = bookClass.getFields(); // возвращает поля с публичным доступом
        for (Field field : fields) System.out.println(field.getName());
        System.out.println();

        System.out.println("Book declared fields");
        Field[] declaredFields = bookClass.getDeclaredFields();// возвращает все поля
        for (Field field : declaredFields) System.out.println(field.getName());
        System.out.println();


        System.out.println("Book methods");
        Method[] methods = bookClass.getMethods();
        for(Method method : methods)
            System.out.println(method.getName());
        System.out.println();

        System.out.println("Book declared methods");
        Method[] declaredMethods = bookClass.getDeclaredMethods();
        for(Method declaredMethod : declaredMethods)
            System.out.println(declaredMethod.getName());
        System.out.println();


//        Field field = bookClass.getDeclaredField("author");
//        String author =  (String) field.get(book);
//        System.out.println(author);


            // изменить значение author
        Field rev = bookClass.getDeclaredField("author");
        rev.set(book, "Gogol");
        String author =  (String) rev.get(book);
        System.out.println(author);
        System.out.println();

        // изменить поле private final long id
        Field fieldId = bookClass.getDeclaredField("id");
        fieldId.setAccessible(true);
        fieldId.set(book, 15L);
        System.out.println(fieldId.get(book));
        System.out.println();



        XMLParser parser = new XMLParser();
        String bookAsXML = parser.toXML(book);
        System.out.println(bookAsXML);


        Author author1 = new Author("John", "Doe", 44);
        String authorAsXML = parser.toXML(author1);
        System.out.println(authorAsXML);


    }
}
