package hms.beyondm.controller;

import beyondm.multidb.dao.mobitel.MobitelDao;
import beyondm.multidb.model.mobitel.MobitelAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/mobitel")
public class AccountController {

    @Autowired
    MobitelDao mobitelDao;

    @RequestMapping(value = "createAccount")
    public void createMobitelAccount(){
        MobitelAccount mobitelAccount = new MobitelAccount();

        mobitelAccount.setMsisdn("0718143637");
        mobitelAccount.setName("Udara");

        mobitelDao.save(mobitelAccount);
    }
}
