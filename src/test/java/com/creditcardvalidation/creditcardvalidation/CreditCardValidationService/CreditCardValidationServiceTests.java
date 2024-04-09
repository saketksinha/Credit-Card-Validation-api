package com.creditcardvalidation.creditcardvalidation.CreditCardValidationService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.creditcardvalidation.creditcardvalidation.entities.CreditCard;
import com.creditcardvalidation.creditcardvalidation.service.CreditCardValidationService;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class CreditCardValidationServiceTests {
	 @Autowired
	    private CreditCardValidationService creditCardValidationService;
	    @Test
	    void testValidCreditCard() {
	        CreditCard validCreditCard = new CreditCard("4313323063496731", "02/27", "279");

	        boolean isValid = creditCardValidationService.validateCreditCard(validCreditCard);
	        assertTrue(isValid);
	    }

	    @Test
	    void testValidAmexCreditCard() {
	        CreditCard validCreditCard = new CreditCard("371507542109330", "02/27", "2794");

	        boolean isValid = creditCardValidationService.validateCreditCard(validCreditCard);
	        assertTrue(isValid);
	    }

	    @Test
	    void testInvalidAmexCreditCard() {
	        CreditCard validCreditCard = new CreditCard("340560875312483", "02/27", "555");

	        boolean isValid = creditCardValidationService.validateCreditCard(validCreditCard);
	        assertFalse(isValid);
	    }

	    @Test
	    void testInvalidCardNumber() {
	        CreditCard invalidCreditCard = new CreditCard("340845862098539", "02/25", "386");

	        boolean isValid = creditCardValidationService.validateCreditCard(invalidCreditCard);
	        assertFalse(isValid);
	    }

	    @Test
	    void testInvalidExpiryDate() {
	        CreditCard invalidCreditCard = new CreditCard("524687215875242", "02/22", "386");

	        boolean isValid = creditCardValidationService.validateCreditCard(invalidCreditCard);
	        assertFalse(isValid);
	    }

	    @Test
	    void testInvalidCvv() {
	        CreditCard invalidCreditCard = new CreditCard("340845845721360", "02/25", "28");

	        boolean isValid = creditCardValidationService.validateCreditCard(invalidCreditCard);
	        assertFalse(isValid);
	    }

}
