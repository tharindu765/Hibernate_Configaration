package lk.ijse;

import lk.ijse.embed.FullName;
import lk.ijse.entity.Student;
import lk.ijse.entity.Teacher;
import org.hibernate.Session;
import lk.ijse.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        FullName fullName=new FullName("tharindu","randika");
        FullName TeacherfullName=new FullName("san","sin");
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.setId(1);
        student.setName(fullName);
        student.setAddress("serupita");

        teacher.setId(1);
        teacher.setName(TeacherfullName);
        teacher.setAddress("kalutara");

        Transaction transaction = session.beginTransaction();

        session.save(teacher);
        //delete.get,another table

        //session.save(student);

        //session.delete(student);
//
//        Student student1 = session.get(Student.class, 1);
//        System.out.println(student1.getName().getFirstName());
//        System.out.println(student1.getName().getLastName());


        transaction.commit();
        session.close();

    }
}