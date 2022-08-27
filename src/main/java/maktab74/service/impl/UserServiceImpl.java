package maktab74.service.impl;

import maktab74.base.service.impl.BaseServiceImpl;
import maktab74.domain.User;
import maktab74.repository.UserRepository;
import maktab74.service.UserService;

import javax.persistence.NoResultException;

public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public User findByUserNameAndPassword(String userName, String password) {
        try {
            return repository.findByUserNameAndPassword(userName, password);

        } catch (NoResultException e) {
            return null;
        }

    }

    @Override
    public Long countUser(String userName, String password) {
        return repository.countUser(userName, password);
    }
}


