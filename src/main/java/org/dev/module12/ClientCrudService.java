package org.dev.module12;

import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.Transaction;

public class ClientCrudService {
    public ClientCrudService() {
    }

    public void save(Client client) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(client);
            tx.commit();
        }
    }
    public Client create(Client client) {
        SessionBuilder sessionFactory = null;
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(client);
            transaction.commit();
            return client;
        }
    }
    public Client findById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Client.class, id);
        }
    }

    public void update(Client client) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(client);
            tx.commit();
        }
    }

    public void delete(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Client client = session.get(Client.class, id);
            if (client != null) {
                session.delete(client);
            }
            tx.commit();
        }
    }
}
