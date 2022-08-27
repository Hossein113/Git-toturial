package maktab74.repository;

import maktab74.base.repository.BaseRepository;
import maktab74.domain.User;

public interface UserRepository extends BaseRepository<User, Long> {

    User findByUserNameAndPassword(String userName, String password);

    Long countUser(String userName, String password);
}
