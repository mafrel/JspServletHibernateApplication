package com.webapp.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.webapp.entities.Users;

public class UsersDaoImpl implements UsersDao {

	@Override
	public boolean registerUser(Users u) {
		Session session = sessionInfo();
		session.beginTransaction();
		long id = (long)session.save(u);
		session.close();
		
		if(id > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean loginUser(String userName, String password) {
		
		Session session = sessionInfo();
		Criteria criteria = session.createCriteria(Users.class);
		criteria.add(Restrictions.eq("email", userName));
		criteria.add(Restrictions.eq("password", password));
		List results = criteria.list();
		if(results.size() >= 1)
			return true;
		else
			return false;
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(Users u, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Session sessionInfo(){
		Configuration conf= new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		return session;
	}

}
