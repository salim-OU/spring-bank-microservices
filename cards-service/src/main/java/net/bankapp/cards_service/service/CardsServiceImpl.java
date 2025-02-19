package net.bankapp.cards_service.service;

import lombok.extern.slf4j.Slf4j;
import net.bankapp.cards_service.dao.CardsRepository;
import net.bankapp.cards_service.dto.CardsDto;
import net.bankapp.cards_service.entity.Cards;
import net.bankapp.cards_service.exception.ResourceNotFoundException;
import net.bankapp.cards_service.mapper.CardsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CardsServiceImpl implements CardsService {

    @Autowired
    private CardsRepository cardsRepository;

    @Autowired
    private CardsMapper cardsMapper;

    @Override
    public List<CardsDto> getCardsByCustomerId(int customerId) {
        log.info("Fetching cards for customer ID: {}", customerId);
        List<Cards> cards = cardsRepository.findByCustomerId(customerId);

        if(cards.isEmpty()) {
            throw new ResourceNotFoundException(
                    "No cards found for customer ID: " + customerId);
        }

        return cards.stream()
                .map(cardsMapper::toDto)
                .collect(Collectors.toList());
    }
}