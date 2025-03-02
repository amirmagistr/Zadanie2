package org.example.repository;

import org.example.model.Debtor;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class DebtRepositoryImpl implements DebtRepository{
    private final Map<Integer, Debtor> debtors = new HashMap<>();
    private int nextId = 1;

    @Override
    public void save(Debtor debtor) {
        debtor.setId(nextId++);
        debtors.put(debtor.getId(), debtor);
    }

    @Override
    public Debtor findById(int id){
        return debtors.get(id);
    }

    @Override
    public List<Debtor> findAll(){
        return new ArrayList<>(debtors.values());
    }
}
