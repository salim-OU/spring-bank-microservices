package net.bankapp.cards_service.web;

import lombok.extern.slf4j.Slf4j;
import net.bankapp.cards_service.dto.CardsDto;
import net.bankapp.cards_service.dto.CustomerRequest;
import net.bankapp.cards_service.service.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class CardsController {

    @Autowired
    private CardsService cardsService;

    @PostMapping("/myCards")
    public ResponseEntity<List<CardsDto>> getCardDetails(@RequestBody CustomerRequest request) {
        log.info("Fetching card details for customer ID: {}", request.getCustomerId());
        List<CardsDto> cards = cardsService.getCardsByCustomerId(request.getCustomerId());
        return ResponseEntity.ok(cards);
    }
}