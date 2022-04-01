package com.atlant.budget.service;

import com.atlant.budget.model.Account;
import com.atlant.budget.repository.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private AccountDAO accountDAO;

    @Autowired
    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public String getAccountBalance(Long accountId) {
        Account account = accountDAO.findById(accountId).orElseThrow();
        System.out.println(account.getBalance());
        return account.getBalance();
    }
}
