package maktab74.service;

import maktab74.base.service.BaseService;
import maktab74.domain.User;
import maktab74.domain.UserTicket;

import java.util.List;

public interface UserTicketService extends BaseService<UserTicket, Long> {
    List<UserTicket> findtickrtForUser(User user);

}
