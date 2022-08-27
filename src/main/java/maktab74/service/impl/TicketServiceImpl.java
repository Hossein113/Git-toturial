package maktab74.service.impl;

import maktab74.base.service.impl.BaseServiceImpl;
import maktab74.domain.Ticket;
import maktab74.repository.TicketRepository;
import maktab74.service.TicketService;

import javax.persistence.NoResultException;
import java.util.List;

public class TicketServiceImpl extends BaseServiceImpl<Ticket, Long, TicketRepository> implements TicketService {


    public TicketServiceImpl(TicketRepository repository) {
        super(repository);
    }


    @Override
    public List<Ticket> findByAllfilter(String origin, String distion, String sortBy) {
        return repository.findByAllfilter(origin, distion, sortBy);
    }


    @Override
    public List<Ticket> findByOriginAndDestAndDate(String origin, String destion, String date) {
        try {
            return repository.findByOriginAndDestAndDate(origin, destion, date);

        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Ticket findByIdWithQuri(Long id) {
        try {
            return repository.findByIdWithQuri(id);
        } catch (NoResultException e) {
            return null;
        }
    }
}