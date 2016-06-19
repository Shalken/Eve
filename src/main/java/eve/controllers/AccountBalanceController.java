package eve.controllers;

import eve.repository.AccountBalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountBalanceController
{
    @Autowired
    AccountBalanceRepository accountBalanceRepository;

    @RequestMapping(value = "/accountbalance", method = RequestMethod.GET)
    public String accountsList(Model model)
    {
        model.addAttribute("accountbalance", accountBalanceRepository.findAll());
        return "accountbalance";
    }

}
