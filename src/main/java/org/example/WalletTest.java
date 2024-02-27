package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WalletTest {
    private Wallet wallet;

    @BeforeEach
    public void setUp() {
        wallet = new Wallet("John Doe");
    }

    @Test
    public void testAddAndWithdrawCash() {
        wallet.addCash(1000);
        assertTrue(wallet.withdrawCash(500)); // Should be successful
        assertEquals(500, wallet.getCash()); // Check remaining balance

        assertFalse(wallet.withdrawCash(1000)); // Should fail, not enough cash
    }

    @Test
    public void testAddAndRemoveCard() {
        wallet.addCard("Visa");
        wallet.addCard("MasterCard");
        assertTrue(wallet.removeCard("Visa")); // Should remove successfully
        assertFalse(wallet.getCards().contains("Visa")); // Visa should not be in the list
        assertTrue(wallet.getCards().contains("MasterCard")); // MasterCard should be in the list

        assertFalse(wallet.removeCard("American Express")); // Should fail, card not in wallet
    }

    @Test
    public void testDuplicateCard() {
        wallet.addCard("Visa");
        wallet.addCard("Visa");
        assertEquals(1, wallet.getCards().size()); // Should only have one Visa card
    }

    @Test
    public void testSetName() {
        wallet.setName("Jane Doe");
        assertEquals("Jane Doe", wallet.getName());
    }
}
