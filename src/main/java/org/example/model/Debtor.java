package org.example.model;

public class Debtor {
    private int id;
    private String name;
    private double debtAmount;
    private String status;

    public Debtor() {}

    public Debtor(int id, String name, double debtAmount, String status) {
        this.id = id;
        this.name = name;
        this.debtAmount = debtAmount;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(double debtAmount) {
        this.debtAmount = debtAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Debtor{id=" + id + ", name='" + name + "', debtAmount=" + debtAmount + ", status='" + status + "'}";
    }

}
