package com.ayzekstudio.template.webtemplate.dao;

import com.ayzekstudio.template.webtemplate.entity.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

	// define field for entitymanager
	private EntityManager entityManager;

	// set up constructor injection
	@Autowired
	public UserDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	@Transactional
	public List<User> findAll() {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// create a query
		Query<User> theQuery =
				currentSession.createQuery("from User", User.class);
		
		// execute query and get result list
		List<User> users = theQuery.getResultList();
		
		// return the results		
		return users;
	}

}







