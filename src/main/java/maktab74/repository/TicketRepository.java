package maktab74.repository;

import maktab74.base.repository.BaseRepository;
import maktab74.domain.Ticket;

import java.util.List;

public interface TicketRepository extends BaseRepository<Ticket, Long> {

    Ticket findByIdWithQuri(Long id);

    List<Ticket> findByAllfilter(String origin, String distion, String sortBy);

    List<Ticket> findByAllfilter(String origin, String distion, String sortBy, String direction);

    List<Ticket> findByOriginAndDestAndDate(String origin, String destion, String date);

}