package maktab74.util;

import maktab74.repository.CompanyRepository;
import maktab74.repository.TicketRepository;
import maktab74.repository.UserRepository;
import maktab74.repository.UserTicketRepository;
import maktab74.repository.impl.CompanyRepositoryImpl;
import maktab74.repository.impl.TicketRepositoryImpl;
import maktab74.repository.impl.UserRepositoryImpl;
import maktab74.repository.impl.UserTicketRepositoryImpl;
import maktab74.security.CompanySecurity;
import maktab74.security.TicketSecurity;
import maktab74.security.UserSecurity;
import maktab74.service.CompanyService;
import maktab74.service.TicketService;
import maktab74.service.UserService;
import maktab74.service.UserTicketService;
import maktab74.service.impl.CompanyServiceImpl;
import maktab74.service.impl.TicketServiceImpl;
import maktab74.service.impl.UserServiceImpl;
import maktab74.service.impl.UserTicketServiceImpl;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class ApplicationContext {

    private static final EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();


    private static Scanner stringScanner;

    private static Scanner integerScanner;

    private static CompanyRepository companyRepository;

    private static CompanyService companyService;

    private static CompanySecurity securityCompany;

    private static TicketSecurity ticketSecurity;

    private static TicketRepository ticketRepository;

    private static TicketService ticketService;

    private static UserRepository userRepository;

    private static UserService userService;

    private static UserTicketRepository userTicketRepository;

    private static UserTicketService userTicketService;

    private static UserSecurity userSecurity;

    public static UserSecurity getUserSecurity() {
        if (userSecurity == null) {
            userSecurity = new UserSecurity();
        }
        return userSecurity;
    }

    public static TicketSecurity getTicketSecurity() {
        if (ticketSecurity == null) {
            ticketSecurity = new TicketSecurity();
        }
        return ticketSecurity;
    }

    public static UserTicketRepository getUserTicketRepository() {
        if (userTicketRepository == null) {
            userTicketRepository = new UserTicketRepositoryImpl(em);
        }
        return userTicketRepository;
    }

    public static UserTicketService getUserTicketService() {
        if (userTicketService == null) {
            userTicketService = new UserTicketServiceImpl(getUserTicketRepository());
        }
        return userTicketService;
    }

    public static UserRepository getUserRepository() {
        if (userRepository == null)
            userRepository = new UserRepositoryImpl(em);
        return userRepository;
    }

    public static UserService getUserService() {
        if (userService == null) {
            userService = new UserServiceImpl(getUserRepository());
        }

        return userService;
    }

    public static CompanySecurity getSecurityCompany() {
        if (securityCompany == null) {
            securityCompany = new CompanySecurity();
        }
        return securityCompany;
    }

    public static TicketRepository getTicketRepository() {
        if (ticketRepository == null) {
            ticketRepository = new TicketRepositoryImpl(em);
        }
        return ticketRepository;
    }

    public static TicketService getTicketService() {
        if (ticketService == null) {
            ticketService = new TicketServiceImpl(getTicketRepository());
        }
        return ticketService;
    }

    public Scanner getStringScanner() {

        if (stringScanner == null) {
            stringScanner = new Scanner(System.in);
        }
        return stringScanner;
    }

    public Scanner getIntegerScanner() {
        if (integerScanner == null) {
            integerScanner = new Scanner(System.in);
        }
        return integerScanner;
    }

    public CompanyRepository getCompanyRepository() {
        if (companyRepository == null) {
            companyRepository = new CompanyRepositoryImpl(em);
        }
        return companyRepository;
    }

    public CompanyService getCompanyService() {
        if (companyService == null) {
            companyService = new CompanyServiceImpl(getCompanyRepository());
        }
        return companyService;
    }
}


