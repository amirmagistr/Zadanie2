package org.example.main;

import org.example.config.ProjectConfig;
import org.example.model.Debtor;
import org.example.service.DebtService;
import org.example.singletonBeans.LazyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Context is created, now requesting LazyBean...");
        LazyBean lazyBean = context.getBean(LazyBean.class);

        //service work
        DebtService debtService = context.getBean(DebtService.class);
        Debtor debtor = new Debtor();
        debtor.setName("Leonardo Da Vinci");
        debtor.setDebtAmount(12000.0);

        //adding debtor
        debtService.addDebtor(debtor);

        //finding debtor by ID
        Debtor foundDebtor = debtService.findDebtorById(debtor.getId());
        if(foundDebtor != null){
            System.out.println("Debtor is found: " + foundDebtor.getName() + ", debt: " + foundDebtor.getDebtAmount());
        }
        //starting collect process
        debtService.startCollectProcess(debtor.getId());

    }
}