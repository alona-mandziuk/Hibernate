package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setId(1);
        animal1.setType("dog");
        animal1.setName("Pepper");
        animal1.setAge(7);
        animal1.setTail(true);

        Animal animal2 = new Animal();
        animal2.setId(2);
        animal2.setType("cat");
        animal2.setName("Fluffy");
        animal2.setAge(3);
        animal2.setTail(true);

        Animal animal3 = new Animal();
        animal3.setId(3);
        animal3.setType("hamster");
        animal3.setName("Jerry");
        animal3.setAge(1);
        animal3.setTail(false);



        SessionFactory factory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();
        session.save(animal1);
        session.save(animal2);
        session.save(animal3);
        session.getTransaction().commit();
        session.close();



    }

}