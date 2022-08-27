package maktab74.repository.impl;

import maktab74.base.repository.impl.BaseRepositoryImple;
import maktab74.domain.User;
import maktab74.repository.UserRepository;

import javax.persistence.EntityManager;

public class UserRepositoryImpl extends BaseRepositoryImple<User, Long> implements UserRepository {
    public UserRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public User findByUserNameAndPassword(String userName, String password) {
        return entityManager.createQuery("select u from User u where u.userName= :userName " +
                        "and u.password= :password", User.class).setParameter("userName", userName)
                .setParameter("password", password).getSingleResult();
    }

    @Override
    public Long countUser(String userName, String password) {
        return entityManager.createQuery("select count(id) from User u where u.userName=:username and" +
                        " u.password=:password", Long.class).setParameter("username", userName)
                .setParameter("password", password).getSingleResult();
    }
}
