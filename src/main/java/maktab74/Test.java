package maktab74;

import maktab74.domain.Ticket;
import maktab74.util.ApplicationContext;

import java.util.List;

public class Test {


    public static void main(String[] args) {

        //for test :
        System.out.println("Start");

        String origin = "tehran";
        String dist = "mashhad";
        String date = "2022-08-23";


        List<Ticket> showTickets = ApplicationContext.getTicketService().findByOriginAndDestAndDate(origin, dist, date);

        showTickets.forEach(System.out::println);


        System.out.println("Done");


    }
}