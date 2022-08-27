package maktab74.security;

import maktab74.base.domain.BaseEntity;
import maktab74.domain.Ticket;

public class TicketSecurity extends BaseEntity<Long> {
    private Ticket currenticket;

    public Ticket getCurrenticket() {
        return currenticket;
    }

    public void setCurrenticket(Ticket currenticket) {
        this.currenticket = currenticket;
    }

    public void logout() {
        this.currenticket = null;
    }
}
