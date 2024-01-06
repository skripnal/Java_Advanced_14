package org.skripnal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;


public class App 
{
    public static void main( String[] args ){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Item item1 = new Item();
        item1.setTotal(50);

        Item item2 = new Item();
        item2.setTotal(75);

        Item item3 = new Item();
        item3.setTotal(30);

        Item item4 = new Item();
        item4.setTotal(20);

        Cart cart = new Cart();
        cart.setTotal(175);
        cart.setName("Shopping Cart");

        Set<Item> items = new HashSet<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        cart.setItems(items);

        session.save(cart);
        session.save(item1);
        session.save(item2);
        session.save(item3);
        session.save(item4);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
