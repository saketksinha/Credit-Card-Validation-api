package com.creditcardvalidation.creditcardvalidation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creditcardvalidation.creditcardvalidation.entities.CreditCard;
import com.creditcardvalidation.creditcardvalidation.service.CreditCardValidationService;


@RestController
@RequestMapping("/validate")
public class CreditCardValidationController {
		
    @Autowired
    private CreditCardValidationService creditCardValidationService;
    @PostMapping
    public ResponseEntity<String> validateCreditCard(@RequestBody CreditCard creditCard) {
        boolean isValid = creditCardValidationService.validateCreditCard(creditCard);

        if (isValid) {
            return ResponseEntity.ok("Success!");
        } else {
            return ResponseEntity.badRequest().body("Invalid Credit Card information.");
        }
    }
}

