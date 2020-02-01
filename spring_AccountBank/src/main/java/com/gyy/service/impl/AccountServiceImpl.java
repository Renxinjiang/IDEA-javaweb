package com.gyy.service.impl;

import com.gyy.dao.AccountDao;
import com.gyy.domain.Account;
import com.gyy.service.AccountService;
import com.gyy.utils.TransactionManager;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    private TransactionManager tx;

    public void setTx(TransactionManager tx) {
        this.tx = tx;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAccountById(int id) {
        //返回结果
        return accountDao.findAccountById(id);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void deleteAccount(int id) {
        accountDao.deleteAccount(id);
    }

    public void transfrom(String sourceName, String targetName, float money) {
        accountDao.transfrom(sourceName,targetName,money);
    }

    public Account findAccountByName(String name) {
        return accountDao.findAccountByName(name);
    }
}
