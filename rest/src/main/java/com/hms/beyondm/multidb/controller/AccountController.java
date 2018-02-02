package com.hms.beyondm.multidb.controller;

import com.hms.beyondm.multidb.model.dialog.DialogAccount;
import com.hms.beyondm.multidb.model.mobitel.MobitelAccount;
import com.hms.beyondm.multidb.service.dialog.DialogAccountService;
import com.hms.beyondm.multidb.service.mobitel.MobitelAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/createAccount")
public class AccountController {

    @Autowired
    MobitelAccountService mobitelAccountService;

    @Autowired
    DialogAccountService dialogAccountService;

    @RequestMapping(value = "/mobitel", method = RequestMethod.GET)
    public void createMobitelAccount(){

        System.out.println("################ Hit the Controller ##############");

        MobitelAccount mobitelAccount = new MobitelAccount();

        mobitelAccount.setMsisdn("0718143637");
        mobitelAccount.setName("Udara");

        mobitelAccountService.saveAccount(mobitelAccount);
    }

    @RequestMapping(value = "/dialog", method = RequestMethod.GET)
    public void createDialogAccount(){

        System.out.println("################ Hit the Controller ##############");

        DialogAccount dialogAccount = new DialogAccount();

        dialogAccount.setMsisdn("0778143637");
        dialogAccount.setName("Niroshan");

        dialogAccountService.saveAccount(dialogAccount);
    }
}
