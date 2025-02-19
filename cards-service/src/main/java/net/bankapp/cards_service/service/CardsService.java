package net.bankapp.cards_service.service;

import net.bankapp.cards_service.dto.CardsDto;
import java.util.List;

public interface CardsService {
    List<CardsDto> getCardsByCustomerId(int customerId);
}