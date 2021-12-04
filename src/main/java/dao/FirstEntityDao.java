package dao;

import base.BaseDao;
import entity.FirstEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class FirstEntityDao extends BaseDao {

    public List<FirstEntity> findAll(){

        Session session = sessionFactory.openSession();

        Query query = session.createQuery(" select firstEntity from FirstEntity firstEntity ");

        return query.list();
    }
}
