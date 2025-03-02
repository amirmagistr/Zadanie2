package org.example.repository;

import org.example.model.Debtor;
import java.util.List;

public interface DebtRepository {
    void save(Debtor debtor);
    Debtor findById(int id);
    List<Debtor> findAll();
}
