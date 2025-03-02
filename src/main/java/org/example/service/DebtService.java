package org.example.service;

import org.example.model.Debtor;

public interface DebtService {

    //adding new debtor into a system
    void addDebtor(Debtor debtor);

    //starting process of collect by ID of debtor
    void startCollectProcess(int debtorId);

    //find debtor by ID
    Debtor findDebtorById(int id);
}
