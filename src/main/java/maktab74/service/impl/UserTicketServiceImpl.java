package maktab74.service.impl;

import maktab74.base.service.impl.BaseServiceImpl;
import maktab74.domain.User;
import maktab74.domain.UserTicket;
import maktab74.repository.UserTicketRepository;
import maktab74.service.UserTicketService;

import javax.persistence.NoResultException;
import java.util.List;

public class UserTicketServiceImpl extends BaseServiceImpl<UserTicket, Long, UserTicketRepository> implements UserTicketService {
    public UserTicketServiceImpl(UserTicketRepository repository) {
        super(repository);
    }

    @Override
    public List<UserTicket> findtickrtForUser(User user) {
        try {
            return repository.findtickrtForUser(user);
        } catch (NoResultException e) {
            return null;
        }
    }
}
