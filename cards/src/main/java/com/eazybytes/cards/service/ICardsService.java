package com.eazybytes.cards.service;

import com.eazybytes.cards.entity.Cards;
import com.eazybytes.cards.repository.CardsRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import java.util.Random;

public interface ICardsService {

     void createCard(String mobileNumber);
}
