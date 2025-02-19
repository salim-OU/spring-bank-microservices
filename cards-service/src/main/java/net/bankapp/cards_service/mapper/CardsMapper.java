package net.bankapp.cards_service.mapper;

import net.bankapp.cards_service.dto.CardsDto;
import net.bankapp.cards_service.entity.Cards;
import org.springframework.stereotype.Component;

@Component
public class CardsMapper {

    public CardsDto toDto(Cards cards) {
        CardsDto dto = new CardsDto();
        dto.setCardId(cards.getCardId());
        dto.setCustomerId(cards.getCustomerId());
        dto.setCardNumber(cards.getCardNumber());
        dto.setCardType(cards.getCardType());
        dto.setTotalLimit(cards.getTotalLimit());
        dto.setAmountUsed(cards.getAmountUsed());
        dto.setAvailableAmount(cards.getAvailableAmount());
        dto.setCreateDt(cards.getCreateDt());
        return dto;
    }

    public Cards toEntity(CardsDto dto) {
        Cards cards = new Cards();
        cards.setCardId(dto.getCardId());
        cards.setCustomerId(dto.getCustomerId());
        cards.setCardNumber(dto.getCardNumber());
        cards.setCardType(dto.getCardType());
        cards.setTotalLimit(dto.getTotalLimit());
        cards.setAmountUsed(dto.getAmountUsed());
        cards.setAvailableAmount(dto.getAvailableAmount());
        cards.setCreateDt(dto.getCreateDt());
        return cards;
    }
}