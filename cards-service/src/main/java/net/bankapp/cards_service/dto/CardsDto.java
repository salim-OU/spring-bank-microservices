package net.bankapp.cards_service.dto;


import lombok.Data;
import java.util.Date;

@Data
public class CardsDto {
    private int cardId;
    private int customerId;
    private String cardNumber;
    private String cardType;
    private int totalLimit;
    private int amountUsed;
    private int availableAmount;
    private Date createDt;
}