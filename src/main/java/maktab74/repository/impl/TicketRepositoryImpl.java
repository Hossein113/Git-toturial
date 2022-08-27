package maktab74.repository.impl;

import maktab74.base.repository.impl.BaseRepositoryImple;
import maktab74.domain.Ticket;
import maktab74.repository.TicketRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class TicketRepositoryImpl extends BaseRepositoryImple<Ticket, Long> implements TicketRepository {

    public TicketRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Ticket> getEntityClass() {
        return Ticket.class;
    }


    @Override
    public Ticket findByIdWithQuri(Long id) {
        return entityManager.createQuery("select t from Ticket t where t.id=:id", Ticket.class)
                .setParameter("id", id).getSingleResult();
    }

    @Override
    public List<Ticket> findByAllfilter(String origin, String distion, String sortBy) {
        return entityManager.createQuery(
                        "from  Ticket t where t.origin=:origin and t.destination=:distion " +
                                "order by :bbbb asc", Ticket.class).setParameter("origin", origin)
                .setParameter("distion", distion).getResultList();

    }

    @Override
    public List<Ticket> findByAllfilter(String origin, String distion, String sortBy, String direction) {
        return null;
    }

    @Override
    public List<Ticket> findByOriginAndDestAndDate(String origin, String destion, String date) {
        return entityManager.createQuery("select t from Ticket t where t.origin= :origin and t.destination= :des " +
                                "and t.moveDate= :date order by t.moveTime asc"
                        , Ticket.class).setParameter("origin", origin).setParameter("des", destion)
                .setParameter("date", date).getResultList();
    }
}
