package com.hms.beyondm.multidb.controller;

import com.hms.beyondm.multidb.model.dialog.DialogAccount;
import com.hms.beyondm.multidb.model.mobitel.MobitelAccount;
import com.hms.beyondm.multidb.service.dialog.DialogAccountService;
import com.hms.beyondm.multidb.service.mobitel.MobitelAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/retrieveAccount")
public class AccountRetreiveController {
    @Autowired
    MobitelAccountService mobitelAccountService;

    @Autowired
    DialogAccountService dialogAccountService;

    @RequestMapping(value = "/mobitel", method = RequestMethod.GET)
    public void createMobitelAccount(@RequestParam("accId") long accId){

        System.out.println("################ Hit the Mobitel Controller ##############");

        MobitelAccount mobitelAccount;

        mobitelAccount = mobitelAccountService.findAccountById(accId);
        System.out.println("######## : " + mobitelAccount.getMsisdn());

    }

    @RequestMapping(value = "/dialog", method = RequestMethod.GET)
    public void createDialogAccount(@RequestParam("accId") long accId){

        System.out.println("################ Hit the Dialog Controller ##############");

        DialogAccount dialogAccount;

        dialogAccount = dialogAccountService.findAccountById(accId);

        System.out.println("################ : " + dialogAccount.getMsisdn());
    }
}
