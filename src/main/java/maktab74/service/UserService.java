package maktab74.service;

import maktab74.base.service.BaseService;
import maktab74.domain.User;

public interface UserService extends BaseService<User, Long> {
    User findByUserNameAndPassword(String userName, String password);

    Long countUser(String userName, String password);
}
