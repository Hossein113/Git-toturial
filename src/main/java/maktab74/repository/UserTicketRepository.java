package maktab74.repository;

import maktab74.base.repository.BaseRepository;
import maktab74.domain.User;
import maktab74.domain.UserTicket;

import java.util.List;


public interface UserTicketRepository extends BaseRepository<UserTicket, Long> {

    List<UserTicket> findtickrtForUser(User user);


}
