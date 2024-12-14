import org.dev.module12.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TicketCrudTest {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure() // reads hibernate.cfg.xml
                .buildSessionFactory();


        ClientCrudService clientService = new ClientCrudService();
        PlanetCrudService planetService = new PlanetCrudService();
        TicketCrudService ticketService = new TicketCrudService(sessionFactory);


        Client client = clientService.create(new Client());
        Planet mars = planetService.create(new Planet("MARS", "Mars"));
        Planet venus = planetService.create(new Planet("VEN", "Venus"));

        // Create and save a ticket
        Ticket ticket = ticketService.create(new Ticket(client, mars, venus));
        System.out.println("Created ticket: " + ticket);

        // Read all tickets
        System.out.println("All tickets: " + ticketService.readAll());

        // Update ticket
        ticket.setToPlanet(mars); // Change destination to Mars
        ticketService.update(ticket);
        System.out.println("Updated ticket: " + ticketService.read(ticket.getId()));

        // Delete ticket
        ticketService.delete(ticket.getId());
        System.out.println("Deleted ticket. Remaining: " + ticketService.readAll());

        sessionFactory.close();
    }
}
