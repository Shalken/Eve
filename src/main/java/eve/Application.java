package eve;


import eve.repository.AccountBalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner
{
    @Autowired
    AccountBalanceRepository accountBalanceRepository;

    public static void main(String args[])
    {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception
    {
        AccountBalance ab = new AccountBalance();
        ab.setAccountId(1);
        ab.setAccountKey(2);
        ab.setBalance(23);
        ab.setCorporationId(1234);

        accountBalanceRepository.save(ab);
    }
}
