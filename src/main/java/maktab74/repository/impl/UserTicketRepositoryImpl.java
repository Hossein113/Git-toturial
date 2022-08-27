package maktab74.repository.impl;

import maktab74.base.repository.impl.BaseRepositoryImple;
import maktab74.domain.User;
import maktab74.domain.UserTicket;
import maktab74.repository.UserTicketRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class UserTicketRepositoryImpl extends BaseRepositoryImple<UserTicket, Long> implements UserTicketRepository {


    public UserTicketRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<UserTicket> getEntityClass() {
        return UserTicket.class;
    }

    @Override
    public List<UserTicket> findtickrtForUser(User user) {
        return entityManager.createQuery("select u from UserTicket u where u.user=:user", UserTicket.class)
                .setParameter("user", user).getResultList();
    }
}
