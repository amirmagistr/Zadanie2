package org.example.service;


import org.example.model.Debtor;
import org.example.repository.DebtRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DefaultDebtService implements DebtService {
    private final DebtRepositoryImpl repository;
    @Autowired
    public DefaultDebtService(DebtRepositoryImpl repository){
        this.repository = repository;
    }
    @Override
    public void startCollectProcess(int debtorId){
        Debtor debtor  = repository.findById(debtorId);
        if(debtor != null){
            System.out.println("Standart collection of money for: " + debtor.getName());
        }else{
            System.out.println("Debtor with id " + debtorId + " not found!");
        }
    }
    @Override
    public void addDebtor(Debtor debtor){
        repository.save(debtor); //using save method from repository add debtor
    }
    @Override
    public Debtor findDebtorById(int id){
        return repository.findById(id); //returning debtor by id
    }
}
