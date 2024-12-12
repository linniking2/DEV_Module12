import org.dev.module12.Client;
import org.dev.module12.ClientCrudService;

public class ClientCrudTest {
    public static void main(String[] args) {
        ClientCrudService clientService = new ClientCrudService();


        Client newClient = new Client();
        newClient.setName("New Client");
        clientService.save(newClient);


        Client foundClient = clientService.findById(newClient.getId());
        System.out.println("Found: " + foundClient.getName());


        foundClient.setName("Updated Name");
        clientService.update(foundClient);


        clientService.delete(foundClient.getId());
    }
}
