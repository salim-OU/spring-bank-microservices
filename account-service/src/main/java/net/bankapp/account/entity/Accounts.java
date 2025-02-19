package net.bankapp.account.entity;


import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Accounts {
    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "account_number")
    @Id
    private long accountNumber;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "branch_address")
    private String branchAddress;

    @Column(name = "create_dt")
    private LocalDate createDt;
}